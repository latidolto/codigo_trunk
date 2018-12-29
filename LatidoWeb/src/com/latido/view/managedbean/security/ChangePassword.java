package com.latido.view.managedbean.security;

import javax.faces.event.ActionEvent;

import com.latido.model.entities.Usuario;
import com.latido.security.LatidoSecurityManager;
import com.latido.view.managedbean.utils.CommonManagedBean;
import com.latido.view.utils.UtilsWeb;

public class ChangePassword extends CommonManagedBean {

	public ChangePassword() {
		super(CommonManagedBean.CHANGE_PASS_RESOURCE);
	}
	
	public Usuario getUsuario() {
		return (Usuario)getFacade().getEjb(Usuario.class.getName());
	}
	
	public void continuar(ActionEvent ae) {
		try {
			Usuario usu = this.getUsuario();
			usu.setPassword(UtilsWeb.convertSimpleMD5(usu.getPassword()));
			usu.setEstatus(1);
			getFacade().mergeEjb(usu);
			LatidoSecurityManager.registerUserInSession(usu.getClave());
			redirectView(CommonManagedBean.INDEX);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
