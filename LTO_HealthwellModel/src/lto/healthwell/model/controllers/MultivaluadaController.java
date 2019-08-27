package lto.healthwell.model.controllers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import com.latido.model.utils.Parameter;
import com.latido.security.LatidoSecurityManager;

import lto.healthwell.model.entities.Multivaluada;

public class MultivaluadaController extends LtoController{

	public MultivaluadaController(String keyMem) {
		super(keyMem);
	}
	
	public Multivaluada getCurrentMultivaluada() {
		return (Multivaluada) this.getLtoHealthwellFacade().getEjb(Multivaluada.class.getName());
	}
	
	public List<Multivaluada> getFilteredMultivaluadas(Parameter...params){
		return this.getLtoHealthwellFacade().getListFromParameters(Multivaluada.class, params);
	}

	public String guardarMultivaluada(Multivaluada mul) {
		String result = "success";
		if(mul != null) {
			boolean isRequiredAttributes = Boolean.TRUE;
			if(mul.getClave() == null || mul.getClave().trim().equalsIgnoreCase("")) {
				result = "No es posible guardar una multivaluada sin su clave, favor de verificar";
				isRequiredAttributes = Boolean.FALSE;
			}
			if(mul.getDescripcion() == null || mul.getDescripcion().trim().equalsIgnoreCase("")) {
				result = "No es posible guardar una multivaluada sin su descripcion, favor de verificar";
				isRequiredAttributes = Boolean.FALSE;
			}
			if(mul.getValor() == null || mul.getValor().trim().equalsIgnoreCase("")) {
				result = "No es posible guardar una multivaluada sin su valor, favor de verificar";
				isRequiredAttributes = Boolean.FALSE;
			}
			if(isRequiredAttributes) {
				mul.setFec_mod(new Date(System.currentTimeMillis()));
				mul.setUsu_cve(LatidoSecurityManager.getUserInLine() == null ? "anonymous" : LatidoSecurityManager.getUserInLine());
				if(mul.getIdmultivaluada() != 0L) {
					//Update
					this.getLtoHealthwellFacade().mergeEjb(mul);
				} else {
					//Insert
					Long nextPk = this.getNextPK("multivaluada", "idmultivaluada");
					mul.setIdmultivaluada(nextPk);
					this.getLtoHealthwellFacade().persistEjb(mul);
				}
			} 
		} else {
			result = "[ERROR_INTERNO] La entidad no puede ser nula al guardar.";
		}
		return result;
	}
	
	public List<String> getTablas(){
		List<String> lt = null;
		String query = "SELECT table_name FROM information_schema.tables WHERE table_schema = 'lto_healthwell' and table_name not like 'multivaluada'";
		try {
			Query q = this.getLtoHealthwellFacade().getEM().createNativeQuery(query);
			List<Object> results = q.getResultList();
			for(Object result : results) {
				if(lt == null) 
					lt = new ArrayList<String>();
				lt.add(result.toString());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
		return lt;
	}
	
	public List<String> getColumnas(String tabla){
		List<String> lc = null;
		String query = "SELECT COLUMN_NAME FROM information_schema.columns WHERE table_schema='lto_healthwell' AND table_name=?";
		try {
			Query q = this.getLtoHealthwellFacade().getEM().createNativeQuery(query);
			q.setParameter(1, tabla);
			List<Object> results = q.getResultList();
			for(Object result : results) {
				if(lc == null) 
					lc = new ArrayList<String>();
				lc.add(result.toString());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
		return lc;
	}
	
}
