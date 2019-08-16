package lto.healthwell.model.controllers;

import java.util.HashMap;
import java.util.Map;

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
	
}
