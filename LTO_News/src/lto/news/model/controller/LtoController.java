package lto.news.model.controller;

import lto.news.model.LtoNewsFacade;

public class LtoController {
	private LtoNewsFacade lsf;
	private String keyMem;

	protected LtoController (String keyMem) {
		LtoNewsFacade ltoServicesFacade = LtoNewsFacade.getInstance(keyMem);
		this.lsf = ltoServicesFacade;
		this.keyMem = keyMem;
	}
	
	public LtoNewsFacade getLtoServicesFacade() {
		return lsf;
	}
	
	public String getKeyMem() {
		return this.keyMem;
	}
	/**Metodos genericos para el controlador*/
	
}
