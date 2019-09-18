package lto.healthwell.model.controllers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.latido.model.LatidoFacade;
import com.latido.model.utils.Parameter;
import com.latido.security.LatidoSecurityManager;

import lto.healthwell.model.entities.UsuarioPermiso;

public class UsuarioPermisoController extends LtoController {

	public UsuarioPermisoController(String keyMem) {
		super(keyMem);
	}
	
	public UsuarioPermiso getCurrentUsuarioPermiso() {
		return (UsuarioPermiso) this.getLtoHealthwellFacade().getEjb(UsuarioPermiso.class.getName());
	}

	public List<UsuarioPermiso> getFilteredUsuarioPermiso(Boolean isEagerType, Parameter...params){
		// Agregar el permiso de solo un grupo por usuario
		Long GOUsuario = this.getGrupoOrganizacionalForUser();
		if(GOUsuario == null) {
			return null;
		}
		if(params == null) {
			params = new Parameter[1];
		}
		params[params.length] = new Parameter("p_idgo", GOUsuario); // Siempre verificar que tenga este parametro la consulta
		
		return this.getLtoHealthwellFacade().getListFromParameters(UsuarioPermiso.class, "findByGO", isEagerType, params);
	}
	
	public String guardarUsuarioPermiso(UsuarioPermiso up) {
		String result = "success";
		if(up != null) {
			
			up.setFec_mod(new Date(System.currentTimeMillis()));
			up.setUsu_cve(LatidoSecurityManager.getUserInLine() == null ? "anonymous" : LatidoSecurityManager.getUserInLine());
			
			this.getLtoHealthwellFacade().mergeEjb(up);
	
		} else {
			result = "[ERROR_INTERNO] No es posible guadar una instancia nula.";
		}
		return result;
	}
	
	public void mapearUsuariosNuevos() {
		//Lista con los usuarios filtrados restantes
		List<String> lusucve = null;
		//Query para buscar los usuarios ya dados de alta
		String queryUsuarioPermiso = "Select * from lto_healthwell.usuario_permiso " + 
									 "Where upper(usu_clave) like upper(?)";
		EntityManager ltoHealthwellEM = this.getLtoHealthwellFacade().getEM();
		
		//Obtenemos los usuarios registrados en el sistema 
		String queryUsuariosSistema = "Select usu.clave " + 
									  "from latido.usuario usu " + 
									  "    join latido.sistema sis on sis.idSistema = usu.idSistema " + 
									  "Where upper(sis.nombre) like 'HEALTHWELL'";
		EntityManager latidoEM = LatidoFacade.getInstance(this.getKeyMem()).getEM();
		Query queryUsuSis = latidoEM.createNativeQuery(queryUsuariosSistema);
		List<Object[]> usuarios = queryUsuSis.getResultList();
		for (Object usu : usuarios) {
			String usuCve = (String) usu;
			Query queryUsuPer = ltoHealthwellEM.createNativeQuery(queryUsuarioPermiso);
			queryUsuPer.setParameter(1, usuCve);
			Boolean exists = queryUsuPer.getResultList().size() > 0;
			if(!exists) {
				if(lusucve == null)
					lusucve = new ArrayList<String>();
				lusucve.add(usuCve);
			}
		}	
		//Insertamos los usuarios filtrados restantes
		if(lusucve != null) {
			for(String usuCve : lusucve) {
				UUID uuid = UUID.randomUUID();
				UsuarioPermiso up = new UsuarioPermiso();
				up.setIdusuario_permiso(uuid.toString());
				up.setProceso("0");
				up.setUsu_clave(usuCve);
				up.setPermiso_creacion(0);
				up.setPermiso_lectura(0);
				up.setPermiso_actualizacion(0);
				up.setPermiso_borrado(0);
				up.setFecha_inicio(new Date(System.currentTimeMillis()));
				up.setEstatus(1);
				up.setFec_mod(new Date(System.currentTimeMillis()));
				up.setUsu_cve(LatidoSecurityManager.getUserInLine() == null ? "anonymous" : LatidoSecurityManager.getUserInLine());
				
				this.getLtoHealthwellFacade().persistEjb(up);
			}
		}
		//Resfrescamos la lista de usuarios en pantalla
		this.getFilteredUsuarioPermiso(true);
	}
}
