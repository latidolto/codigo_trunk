package lto.services.model.controllers;

import lto.services.model.LtoServicesFacade;

public class LtoController {
	private LtoServicesFacade lsf;
	private String keyMem;

	protected LtoController (String keyMem) {
		LtoServicesFacade ltoServicesFacade = LtoServicesFacade.getInstance(keyMem);
		this.lsf = ltoServicesFacade;
		this.keyMem = keyMem;
	}
	
	public LtoServicesFacade getLtoServicesFacade() {
		return lsf;
	}
	
	public String getKeyMem() {
		return this.keyMem;
	}
	/**Metodos genericos para el controlador*/
	
}
