package com.latido.view.managedbean.infra;

import java.util.List;

import javax.faces.event.ActionEvent;

import com.latido.model.LatidoFacade;
import com.latido.model.entities.Rol;
import com.latido.model.entities.Sistema;
import com.latido.view.managedbean.utils.JsfUtils;

public class Role {

	public List<Rol> getRoles(){
		return LatidoFacade.getInstance().getFindAllList(Rol.class.getName());
	}
	
	public Rol getRole() {
		return (Rol)LatidoFacade.getInstance().getEjb(Rol.class.getName());
	}
	
	public void onSelect(Rol row, String typeOfSelection, String indexes) {
		LatidoFacade.getInstance().setEjb(Rol.class.getName(), row );
		JsfUtils.resfreshComponentById("formPanel");
	}
	
	public void saveAction(ActionEvent ae) {
		Rol r = (Rol)LatidoFacade.getInstance().getEjb(Rol.class.getName());
		if (r.getIdRol() == 0) {
			LatidoFacade.getInstance().persistEjb(Rol.class.getName());
		} else {
			LatidoFacade.getInstance().mergeEjb(Rol.class.getName());
		}
		JsfUtils.sendMessageToView_INFO("Guardado Exitoso.");
		JsfUtils.resfreshComponentById("formPanel");
	}
	
	public void clearAction(ActionEvent ae) {
		LatidoFacade.getInstance().setEjb(Rol.class.getName(), new Rol() );
		JsfUtils.resfreshComponentById("formPanel");
	}
	
	public List<Sistema> getSistemas(){
		return LatidoFacade.getInstance().getFindAllList(Sistema.class.getName());
	}
}
