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

	public GrupoOrganizacionalController(String keyMem) {
		super(keyMem);
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
					this.getLtoHealthwellFacade().mergeEjb(go);
				} else {
					//Insert
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
	
	public List<GrupoOrganizacional> getGrupoOrganizacionalByParams(Boolean fetchChildren, Parameter... params){
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
	/*******************************************************************************/

	
}
