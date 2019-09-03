package lto.healthwell.model.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Query;

import com.latido.model.utils.Parameter;
import com.latido.security.LatidoSecurityManager;

import lto.healthwell.model.LtoHealthwellFacade;
import lto.healthwell.model.entities.Multivaluada;
import lto.healthwell.model.entities.UsuarioPermiso;

public class LtoController {
	private LtoHealthwellFacade lhf;
	private String keyMem;
	private Long grupoOrganizacionalForUser;
	
	private Map<String, Object> variables;

	protected LtoController (String keyMem) {
		LtoHealthwellFacade facade = LtoHealthwellFacade.getInstance(keyMem);
		this.lhf = facade;
		this.keyMem = keyMem;
		this.grupoOrganizacionalForUser = this.getGrupoOrganizacionalByUsuario(LatidoSecurityManager.getUserInLine());
	}
	
	public LtoHealthwellFacade getLtoHealthwellFacade() {
		return lhf;
	}
	
	public String getKeyMem() {
		return this.keyMem;
	}

	public void setNewValueVariable(String name, Object value) {
		if(this.variables == null) {
			this.variables = new HashMap<String,Object>();
		}
		this.variables.put(name, value);
	}
	
	public Object getVariable(String name) {
		if (name != null && this.variables != null) {
			return this.variables.get(name);
		} else {
			return null;
		}
			
	}
	
	public String getUserLevelAccess(String process) {
		String userLevel = "";
		String user = LatidoSecurityManager.getUserInLine() == null ? "anonymous" : LatidoSecurityManager.getUserInLine();
		Parameter[] params = new Parameter[] {
			new Parameter("usu_clave", user),
			new Parameter("proceso", process),
			new Parameter("estatus", 1)
		};
		List<UsuarioPermiso> lup = this.getLtoHealthwellFacade().getListFromParameters(UsuarioPermiso.class, params);
		if( lup != null && !lup.isEmpty() ) {
			Long currentDate = System.currentTimeMillis();
			for(UsuarioPermiso up : lup) {
				if(up.getD_fecha_inicio().getTime() < currentDate && up.getD_fecha_fin() != null && up.getD_fecha_fin().getTime() > currentDate) {
					userLevel += up.isB_permiso_creacion() 		? "C" : "";
					userLevel += up.isB_permiso_lectura() 		? "R" : "";
					userLevel += up.isB_permiso_actualizacion() ? "U" : "";
					userLevel += up.isB_permiso_borrado() 		? "D" : "";
				} else {
					if(up.getD_fecha_inicio().getTime() < currentDate && up.getD_fecha_fin() == null ) {
						userLevel += up.isB_permiso_creacion() 		? "C" : "";
						userLevel += up.isB_permiso_lectura() 		? "R" : "";
						userLevel += up.isB_permiso_actualizacion() ? "U" : "";
						userLevel += up.isB_permiso_borrado() 		? "D" : "";
					}
				}
				
			}
		}
		return userLevel;
	}
	
	private Long getGrupoOrganizacionalByUsuario(String usuCve) {
		Long go = null;
		String query = "Select distinct go.idgo" + 
						"	from persona per" + 
						"	join persona_rol pro on pro.idpersona = per.idpersona" + 
						"   join rol rol on rol.idrol = pro.rol_idrol and rol.idarea = pro.rol_idarea and rol.idgo = pro.rol_idgo" + 
						"   join grupo_organizacional go on go.idgo = rol.idgo and go.estatus = 1 " + 
						"Where per.correo like ?";
		try {
			Query q = this.getLtoHealthwellFacade().getEM().createNativeQuery(query);
			q.setParameter(1, usuCve);
			go = (Long)q.getSingleResult();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return go;
	}
	
	public long getNextPK(String table, String column, Parameter...params) {
		Long pk = null;
		String query = "Select max("+column+") from "+table;
		if(params != null) {
			String append = "";
			Boolean isFirst = Boolean.TRUE;
			for(Parameter p : params) {
				if(isFirst) {
					append += " where "+p.getParamName()+" = "+p.getParamValue();
				} else {
					append += " and "+p.getParamName()+" = "+p.getParamValue();
				}
				isFirst = Boolean.FALSE;
			}
			query += append;
		}
		try {
			Query q = this.getLtoHealthwellFacade().getEM().createNativeQuery(query);
			pk = Long.valueOf( ((Integer)q.getSingleResult()).toString() );
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if(pk == null)
				pk = 0L;
			pk = pk + 1L;
		}
		return pk;
	}
	
	public List<Multivaluada> getMultivaluada(String clave, String tabla, String columna){
		Parameter[] params = null;
		if(clave != null) {
			if(tabla != null && columna != null) {
				params = new Parameter[] { 
					new Parameter("clave", clave),
					new Parameter("tabla", tabla),
					new Parameter("columna", columna)
				};	
			} else {
				params = new Parameter[] { 
					new Parameter("clave", clave)
				};	
			}
		} 
		if(tabla != null && columna != null) {
			params = new Parameter[] { 
				new Parameter("tabla", tabla),
				new Parameter("columna", columna)
			};	
		}else {
			return null;
		}
		return this.getLtoHealthwellFacade().getListFromParameters(Multivaluada.class, params);
	}

	public Long getGrupoOrganizacionalForUser() {
		return grupoOrganizacionalForUser;
	}

	public void setGrupoOrganizacionalForUser(Long grupoOrganizacionalForUser) {
		this.grupoOrganizacionalForUser = grupoOrganizacionalForUser;
	}
	
}
