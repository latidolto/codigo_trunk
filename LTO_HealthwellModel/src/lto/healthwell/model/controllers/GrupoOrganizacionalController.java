package lto.healthwell.model.controllers;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.persistence.Query;

import com.latido.model.utils.Parameter;
import com.latido.security.LatidoSecurityManager;

import lto.healthwell.model.entities.Area;
import lto.healthwell.model.entities.AvisoPrivacidad;
import lto.healthwell.model.entities.GoDomicilio;
import lto.healthwell.model.entities.GrupoOrganizacional;

/**
 * Controlador para la logica de negocios de los objetos relacionados con el grupo organizacional.
 * 
 * @author Everardo
 *
 * */
public class GrupoOrganizacionalController extends LtoController{
	private static final String PROCESS = "GO";

	public GrupoOrganizacionalController(String keyMem) {
		super(keyMem);
	}
	
	private Boolean validateUserLevel(String action) {
		String userLevelProcess = this.getUserLevelAccess(PROCESS);
		return userLevelProcess.contains(action);
	}
	
	/*Logica de negocios para los objetos relacionados con el Grupo Organizacional*/
	public GrupoOrganizacional getCurrentGrupoOrganizacional() {
		return (GrupoOrganizacional) this.getLtoHealthwellFacade().getEjb(GrupoOrganizacional.class.getName());
	}
	
	public void setCurrentGrupoOrganizacional(GrupoOrganizacional go) {
		this.getLtoHealthwellFacade().setEjb(GrupoOrganizacional.class.getName(),go);
	}
	
	public String guardarGrupoOrganizacional(GrupoOrganizacional go) {
		String exErrMsg = "success";
		if(go != null) {
			boolean isRequiredAttributes = Boolean.TRUE;
			if(go.getNombre() == null || go.getNombre().trim().equalsIgnoreCase("")) {
				exErrMsg = "No es posible guardar un Grupo Organizacional sin su Nombre, favor de verificar";
				isRequiredAttributes = Boolean.FALSE;
			}
			if(go.getRfc() == null || go.getRfc().trim().equalsIgnoreCase("")) {
				exErrMsg = "No es posible guardar un Grupo Organizacional sin su RFC, favor de verificar";
				isRequiredAttributes = Boolean.FALSE;
			}
			if(isRequiredAttributes) {
				go.setFec_mod(new Date(System.currentTimeMillis()));
				go.setUsu_cve(LatidoSecurityManager.getUserInLine() == null ? "anonymous" : LatidoSecurityManager.getUserInLine());
				if(go.getIdgo() != 0L) {
					//Update
					if(!validateUserLevel("U"))
						return "[ERROR] Su usuario no tiene permisos para actualizar un Grupo Organizacional.";
					this.getLtoHealthwellFacade().mergeEjb(go);
				} else {
					//Insert
					if(!validateUserLevel("C"))
						return "[ERROR] Su usuario no tiene permisos para crear un Grupo Organizacional.";
					go.setIdgo(this.getNextPKGrupo());
					go.setEstatus(1);
					this.getLtoHealthwellFacade().persistEjb(go);
				}
			}
		} else {
			exErrMsg = "[ERROR_INTERNO] No se puede guardar una entidad nula, favor de verificar";
		}
		return exErrMsg;
	}
	
	private long getNextPKGrupo() {
		Long pk = null;
		String query = "Select max(idgo) from grupo_organizacional";
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
	
	public List<GrupoOrganizacional> getGrupoOrganizacionalByParams(Boolean domicilios, Boolean areas, Boolean avisos,  Parameter... params){
		if(!validateUserLevel("R"))
			return null;
		
		// Agregar el permiso de solo un grupo por usuario
		Long GOUsuario = this.getGrupoOrganizacionalForUser();
		if(GOUsuario == null) {
			return null;
		}
		if(params == null) {
			params = new Parameter[] {};
		}
		params[params.length] = new Parameter("idgo", GOUsuario); // Siempre verificar que tenga este parametro la consulta
		
		List<GrupoOrganizacional> lgo = this.getLtoHealthwellFacade().getListFromParameters(GrupoOrganizacional.class, params);
		if(lgo != null) {
			if (areas) {
				for(GrupoOrganizacional go : lgo) {
					Parameter[] param = new Parameter[] { new Parameter("idgo", go.getIdgo()) };
					List<Area> lare = this.getLtoHealthwellFacade().getListFromParameters(Area.class, param);
					go.setAreaChildren(lare);
				}
			}
			if(avisos) {
				for(GrupoOrganizacional go : lgo) {
					Parameter[] param = new Parameter[] { new Parameter("idgo", go.getIdgo()) };
					List<AvisoPrivacidad> lap = this.getLtoHealthwellFacade().getListFromParameters(AvisoPrivacidad.class, param);
					go.setAvisoPrivacidadChildren(lap);
				}
			}	
			if(domicilios) {
				for(GrupoOrganizacional go : lgo) {
					Parameter[] param = new Parameter[] { new Parameter("idgo", go.getIdgo()) };
					List<GoDomicilio> lgod = this.getLtoHealthwellFacade().getListFromParameters(GoDomicilio.class, param);
					go.setGoDomicilioChildren(lgod);
				}
			}
		}
		return lgo;
	}
	
	public List<GrupoOrganizacional> getGrupoOrganizacionalByParams(Boolean fetchChildren, Parameter... params){
		if(!validateUserLevel("R"))
			return null;
		List<GrupoOrganizacional> lgo = this.getLtoHealthwellFacade().getListFromParameters(GrupoOrganizacional.class, params);
		if(fetchChildren && lgo != null) { 
			for(GrupoOrganizacional go : lgo) {
				Parameter[] param = new Parameter[] { new Parameter("idgo", go.getIdgo()) };
				
				List<GoDomicilio> lgod = this.getLtoHealthwellFacade().getListFromParameters(GoDomicilio.class, param);
				List<AvisoPrivacidad> lap = this.getLtoHealthwellFacade().getListFromParameters(AvisoPrivacidad.class, param);
				List<Area> lare = this.getLtoHealthwellFacade().getListFromParameters(Area.class, param);
				
				go.setGoDomicilioChildren(lgod);
				go.setAvisoPrivacidadChildren(lap);
				go.setAreaChildren(lare);
			}
		}
		return lgo;
	}
	
	public AvisoPrivacidad getCurrentAvisoPrivacidad() {
		return (AvisoPrivacidad) this.getLtoHealthwellFacade().getEjb(AvisoPrivacidad.class.getName());
	}
	
	public String guardarAvisoPrivacidad(AvisoPrivacidad ap) {
		String result = "success";
		if(ap != null && this.getCurrentGrupoOrganizacional() != null) {
			boolean isRequiredAttributes = Boolean.TRUE;
			if(ap.getContenido() == null || ap.getContenido().trim().equalsIgnoreCase("")) {
				result = "No es posible guardar un Aviso de Privacidad sin su Contenido, favor de verificar";
				isRequiredAttributes = Boolean.FALSE;
			}
			if(isRequiredAttributes) {
				ap.setFec_mod(new Date(System.currentTimeMillis()));
				ap.setUsu_cve(LatidoSecurityManager.getUserInLine() == null ? "anonymous" : LatidoSecurityManager.getUserInLine());
				if(ap.getIdap() != 0L) {
					//Update
					if(!validateUserLevel("U"))
						return "[ERROR] Su usuario no tiene permisos para actualizar un Grupo Organizacional.";
					this.getLtoHealthwellFacade().mergeEjb(ap);
				} else {
					if(!validateUserLevel("C"))
						return "[ERROR] Su usuario no tiene permisos para crear un Grupo Organizacional.";
					Long idgo = this.getCurrentGrupoOrganizacional().getIdgo();
					//Inactivar todos los avisos posteriores
					Parameter[] param = new Parameter[] { new Parameter("idgo", idgo) };
					List<AvisoPrivacidad> lap = this.getLtoHealthwellFacade().getListFromParameters(AvisoPrivacidad.class, param);
					for(AvisoPrivacidad apI : lap) {
						apI.setEstatus(0);
						apI.setFec_mod(new Date(System.currentTimeMillis()));
						apI.setUsu_cve(LatidoSecurityManager.getUserInLine() == null ? "anonymous" : LatidoSecurityManager.getUserInLine());
						this.getLtoHealthwellFacade().mergeEjb(apI);
					}
					//Insert
					ap.setIdgo(idgo);
					ap.setIdap(this.getNextPKAvisoPrivacidad());
					ap.setEstatus(1);
					this.getLtoHealthwellFacade().persistEjb(ap);
				}
			}
		} else {
			result = "[ERROR_INTERNO] No se puede guardar una entidad nula o el grupo es nulo, favor de verificar";
		}
		return result;
	}
	
	private long getNextPKAvisoPrivacidad() {
		Long pk = null;
		String query = "Select max(idap) from aviso_privacidad";
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
	/*******************************************************************************/

	
}
