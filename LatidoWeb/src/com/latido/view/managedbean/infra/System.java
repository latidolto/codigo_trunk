package com.latido.view.managedbean.infra;

import java.util.Date;
import java.util.List;

import javax.faces.event.ActionEvent;

import com.latido.model.LatidoFacade;
import com.latido.model.entities.Sistema;
import com.latido.security.LatidoSecurityManager;
import com.latido.view.managedbean.utils.JsfUtils;

public class System {

	public Sistema getSystem() {
		return (Sistema)LatidoFacade.getInstance().getEjb(Sistema.class.getName());
	}
	
	public List<Sistema> getSystems() {
		return LatidoFacade.getInstance().getListFromParameters(Sistema.class.getName(),"findAllSis",null);
	}
	
	public void onSelect(Sistema row, String typeOfSelection, String indexes) {
		LatidoFacade.getInstance().setEjb(Sistema.class.getName(), row );
		JsfUtils.resfreshComponentById("formPanel");
	}
	
	public void newAction(ActionEvent ae) {
		LatidoFacade.getInstance().setEjb(Sistema.class.getName(), new Sistema());
		JsfUtils.resfreshComponentById("formPanel");
	}
	
	public void saveAction(ActionEvent ae) {
		Sistema sis = (Sistema)LatidoFacade.getInstance().getEjb(Sistema.class.getName());
		sis.setFecMod(new Date());
		sis.setUsuCve(LatidoSecurityManager.getUserInLine() == null ? "anonymous" : LatidoSecurityManager.getUserInLine());
		if(sis.getIdSistema() == 0) {
			LatidoFacade.getInstance().persistEjb(Sistema.class.getName());
		} else {
			LatidoFacade.getInstance().mergeEjb(Sistema.class.getName());
		}
		LatidoFacade.getInstance().setEjb(Sistema.class.getName(), new Sistema());
		JsfUtils.sendMessageToView_INFO("Guardado Exitoso.");
		JsfUtils.resfreshComponentById("mainForm");
	}
	
	public void clearAction(ActionEvent ae) {
		LatidoFacade.getInstance().setEjb(Sistema.class.getName(), new Sistema());
		JsfUtils.resfreshComponentById("mainForm");
	}	
}
