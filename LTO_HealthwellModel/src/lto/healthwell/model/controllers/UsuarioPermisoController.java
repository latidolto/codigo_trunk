package lto.healthwell.model.controllers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

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

	public List<UsuarioPermiso> getFilteredUsuarioPermiso(Parameter...params){
		return this.getLtoHealthwellFacade().getListFromParameters(UsuarioPermiso.class, params);
	}
	
	public String guardarUsuarioPermiso(UsuarioPermiso up) {
		String result = "";
		if(up != null) {
			boolean isRequiredAttributes = Boolean.TRUE;
			if(up.getUsuPerPK().getProceso() == 0L) {
				result = "No es posible guardar un permiso sin su proceso, favor de verificar";
				isRequiredAttributes = Boolean.FALSE;
			}
			if(up.getUsuPerPK().getUsu_clave() == null || up.getUsuPerPK().getUsu_clave().trim().equalsIgnoreCase("")) {
				result = "No es posible guardar un permiso sin su usuario, favor de verificar";
				isRequiredAttributes = Boolean.FALSE;
			}
			if(up.getUsuPerPK().getPermiso() == null || up.getUsuPerPK().getPermiso().trim().equalsIgnoreCase("")) {
				result = "No es posible guardar un permiso sin su clave de permiso, favor de verificar";
				isRequiredAttributes = Boolean.FALSE;
			}
			if(up.getUsuPerPK().getFecha_inicio() == null ) {
				result = "No es posible guardar un permiso sin su fecha de inicio, favor de verificar";
				isRequiredAttributes = Boolean.FALSE;
			}
			if(isRequiredAttributes) {
				Boolean isUpdate = Boolean.TRUE;
				Parameter[] params = new Parameter[] {
						new Parameter("proceso",up.getUsuPerPK().getProceso()),
						new Parameter("usu_clave",up.getUsuPerPK().getUsu_clave()),
						new Parameter("permiso",up.getUsuPerPK().getPermiso()),
						new Parameter("fecha_incio",up.getUsuPerPK().getFecha_inicio())
				};
				List<UsuarioPermiso> lup = this.getFilteredUsuarioPermiso(params);
				if(lup!= null) {
					isUpdate = lup.size() > 0;
				}
				up.setFec_mod(new Date(System.currentTimeMillis()));
				up.setUsu_cve(LatidoSecurityManager.getUserInLine() == null ? "anonymous" : LatidoSecurityManager.getUserInLine());
				
				if(isUpdate) {
					this.getLtoHealthwellFacade().mergeEjb(up);
				} else {
					up.setEstatus(1);
					this.getLtoHealthwellFacade().persistEjb(up);
				}	
			}
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
		for (Object[] usu : usuarios) {
			String usuCve = (String) usu[0];
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
				UsuarioPermiso up = new UsuarioPermiso();
				up.setUsuPerPK(0L, usuCve, "0", new Date(System.currentTimeMillis()));
				up.setEstatus(0);
				up.setFec_mod(new Date(System.currentTimeMillis()));
				up.setUsu_cve(LatidoSecurityManager.getUserInLine() == null ? "anonymous" : LatidoSecurityManager.getUserInLine());
				
				this.getLtoHealthwellFacade().persistEjb(up);
			}
		}
		
	}
}
