package com.latido.view.managedbean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.event.ActionEvent;
import javax.faces.event.AjaxBehaviorEvent;

import com.latido.model.LatidoFacade;
import com.latido.model.entities.Usuario;
import com.latido.security.LatidoSecurityManager;
import com.latido.view.managedbean.utils.CommonManagedBean;
import com.latido.view.utils.UtilsWeb;

public class Login extends CommonManagedBean{
	
	public Login() {
		super(CommonManagedBean.LOGIN_RESOURCE);
	}
	
	public Usuario getUsuario() {
		return (Usuario)LatidoFacade.getInstance().getEjb(Usuario.class.getName());
	}
	
	
	public void entrar(ActionEvent ae) {
		Usuario usu = this.getUsuario();
		Map params = new HashMap();
		params.put("p_clave", usu.getClave());
		String md5Pass = UtilsWeb.convertSimpleMD5(usu.getPassword());
		params.put("p_pass", md5Pass);
		List usuarios = LatidoFacade.getInstance().getListFromParameters(Usuario.class.getName(), "findUser", params);
		if( usuarios != null) {
			if( usuarios.size() > 0) {
				try {
					LatidoSecurityManager.registerUserInSession(usu.getClave());
					redirectView(CommonManagedBean.INDEX);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
