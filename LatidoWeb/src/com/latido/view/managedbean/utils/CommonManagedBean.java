package com.latido.view.managedbean.utils;

import java.io.IOException;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.latido.security.LatidoSecurityManager;

public class CommonManagedBean {
	public static final String LOGIN = "/faces/security/login.xhtml";
	public static final String LOGIN_RESOURCE = "Login";
	public static final String INDEX = "/faces/index.xhtml";
	public static final String INDEX_RESOURCE = "Index";

	public CommonManagedBean(String resourceName) {
		System.out.println("NOMBRE :: "+resourceName);
		Boolean isValid = this.validateResource(resourceName);
		if(!isValid) {
			FacesContext fc = FacesContext.getCurrentInstance();
			ExternalContext ec = fc.getExternalContext();
			try {
				ec.redirect(ec.getRequestContextPath() + LOGIN);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private Boolean validateResource(String resourceName){
		Boolean isValid = Boolean.FALSE;
		if(resourceName != null) {
			if(resourceName.equalsIgnoreCase(LOGIN_RESOURCE)) {
				isValid = Boolean.TRUE;
			} 
			if(resourceName.equalsIgnoreCase(INDEX_RESOURCE)) {
				isValid = (LatidoSecurityManager.getUserObject() != null);
			} else {
				// TODO Query to validate resource in BD.
				
			}
		}
		return isValid;
	}
	
	public static void redirectView(String shortPath) {
		FacesContext fc = FacesContext.getCurrentInstance();
		ExternalContext ec = fc.getExternalContext();
		try {
			ec.redirect(ec.getRequestContextPath() + shortPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
