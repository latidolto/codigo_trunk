package lto.actmanager.model.controllers;

import lto.actmanager.model.LtoActmanagerFacade;

public class LtoController {
	private LtoActmanagerFacade lamf;
	private String keyMem;

	protected LtoController (String keyMem) {
		LtoActmanagerFacade ltoActManagerFacade = LtoActmanagerFacade.getInstance(keyMem);
		this.lamf = ltoActManagerFacade;
		this.keyMem = keyMem;
	}
	
	public LtoActmanagerFacade getLtoActManagerFacade() {
		return lamf;
	}
	
	public String getKeyMem() {
		return this.keyMem;
	}
	/**Metodos genericos para el controlador*/
	
}
