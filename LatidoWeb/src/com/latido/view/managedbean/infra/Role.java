package com.latido.view.managedbean.infra;

import java.util.List;

import javax.faces.event.ActionEvent;

import com.latido.model.LatidoFacade;
import com.latido.model.entities.Rol;
import com.latido.model.entities.Sistema;
import com.latido.view.managedbean.utils.CommonManagedBean;
import com.latido.view.managedbean.utils.JsfUtils;

public class Role extends CommonManagedBean{
	
	public Role() {
		super("Catalogo de Roles");
	}

	public List<Rol> getRoles(){
		return getFacade().getFindAllList(Rol.class.getName());
	}
	
	public Rol getRole() {
		return (Rol)getFacade().getEjb(Rol.class.getName());
	}
	
	public void onSelect(Rol row, String typeOfSelection, String indexes) {
		getFacade().setEjb(Rol.class.getName(), row );
		JsfUtils.resfreshComponentById("formPanel");
	}
	
	public void saveAction(ActionEvent ae) {
		Rol r = (Rol)getFacade().getEjb(Rol.class.getName());
		if (r.getIdRol() == 0) {
			getFacade().persistEjb(Rol.class.getName());
		} else {
			getFacade().mergeEjb(Rol.class.getName());
		}
		JsfUtils.sendMessageToView_INFO("Guardado Exitoso.");
		JsfUtils.resfreshComponentById("formPanel");
	}
	
	public void clearAction(ActionEvent ae) {
		getFacade().setEjb(Rol.class.getName(), new Rol() );
		JsfUtils.resfreshComponentById("formPanel");
	}
	
	public List<Sistema> getSistemas(){
		return getFacade().getFindAllList(Sistema.class.getName());
	}
}
