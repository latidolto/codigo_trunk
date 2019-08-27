package lto.healthwell.model.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Query;

import com.latido.model.utils.Parameter;

import lto.healthwell.model.LtoHealthwellFacade;

public class LtoController {
	private LtoHealthwellFacade lhf;
	private String keyMem;
	
	private Map<String, Object> variables;

	protected LtoController (String keyMem) {
		LtoHealthwellFacade facade = LtoHealthwellFacade.getInstance(keyMem);
		this.lhf = facade;
		this.keyMem = keyMem;
	}
	
	public LtoHealthwellFacade getLtoHealthwellFacade() {
		return lhf;
	}
	
	public String getKeyMem() {
		return this.keyMem;
	}
	/**Metodos genericos para el controlador*/

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
	
}
