package com.latido.view.managedbean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.event.ActionEvent;

import com.latido.model.LatidoFacade;
import com.latido.model.entities.Usuario;

public class Login {
	
	public Usuario getUsuario() {
		return (Usuario)LatidoFacade.getInstance().getEjb(Usuario.class.getName());
	}
	
	
	public void entrar(ActionEvent ae) {
		Usuario usu = this.getUsuario();
		System.out.println(usu.getClave());
		System.out.println(usu.getPassword());
		Map params = new HashMap();
		params.put("p_clave", usu.getClave());
		params.put("p_pass", usu.getPassword());
		List usuarios = LatidoFacade.getInstance().getListFromParameters(Usuario.class.getName(), "findUser", params);
		Boolean isValid = Boolean.FALSE;
		if( usuarios != null) {
			if( usuarios.size() > 0) {
				isValid = Boolean.TRUE;
			}
		}
		System.out.println("Resultado = " + isValid);
	}

}
