package com.latido.view.managedbean;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.faces.application.FacesMessage;
import javax.faces.event.ActionEvent;

import com.latido.model.LatidoFacade;
import com.latido.model.entities.Usuario;
import com.latido.security.LatidoSecurityManager;
import com.latido.utils.EmailUtils;
import com.latido.view.managedbean.utils.CommonManagedBean;
import com.latido.view.managedbean.utils.JsfUtils;
import com.latido.view.utils.UtilsWeb;

public class Login extends CommonManagedBean{
	
	public Login() {
		super(CommonManagedBean.LOGIN_RESOURCE);
	}
	
	public Usuario getUsuario() {
		return (Usuario)getFacade().getEjb(Usuario.class.getName());
	}
	
	
	public void entrar(ActionEvent ae) {
		Usuario usu = this.getUsuario();
		Map params = new HashMap();
		params.put("p_clave", usu.getClave());
		String md5Pass = UtilsWeb.convertSimpleMD5(usu.getPassword());
		params.put("p_pass", md5Pass);
		List usuarios = getFacade().getListFromParameters(Usuario.class.getName(), "findUser", params);
		if( usuarios != null) {
			if( usuarios.size() > 0) {
				usu = (Usuario) usuarios.get(0);
				// Usuario valido y activo
				if(usu.getEstatus() == 1) {
					try {
						LatidoSecurityManager.registerUserInSession(usu.getClave());
						redirectView(CommonManagedBean.INDEX);
					} catch (Exception e) {
						e.printStackTrace();
						JsfUtils.sendMessageToView_ERROR(e.getMessage());
						JsfUtils.resfreshComponentById("mainForm");
					}
				}
				// Usuario valido pero tiene que cambiar su contraseña
				if(usu.getEstatus() == 2) {
					usu.setPassword(null);
					getFacade().setEjb(Usuario.class.getName(), usu);
					redirectView(CommonManagedBean.CHANGE_PASS);
				}
			}
		}
	}
	
	public void enviar(ActionEvent ae) {
		Usuario usu = this.getUsuario();
		if(usu.getClave()!=null) {
			Map params = new HashMap();
			params.put("p_username", usu.getClave());
			List usuarios = getFacade().getListFromParameters(Usuario.class.getName(), "findUserByUsername", params);
			if( usuarios != null) {
				if( usuarios.size() > 0) {
					usu = (Usuario) usuarios.get(0);
					String generatedPassword = UtilsWeb.passwordGenerator();
				    usu.setPassword(UtilsWeb.convertSimpleMD5(generatedPassword));
				    usu.setEstatus(2);
				    try {
						getFacade().mergeEjb(usu);
						EmailUtils.sendSimpleEmail(usu.getClave(), 
												  "Cambio de Contraseña Correcto", 
												  "Hemos cambiado su contraseña a la siguiente: <b>"+generatedPassword+"</b> ; "
												+ "una ves que haya accesado se le pedira cambiar su contraseña inmediatamente.");
						JsfUtils.sendMessageToView_INFO("Se envio el correo correctamente con su contraseña temporal.");
					} catch (Exception e) {
						e.printStackTrace();
						JsfUtils.sendMessageToView_ERROR(e.getMessage());
					}
				    JsfUtils.resfreshComponentById("mainForm");
				}
			}
		}
	}
	
}
