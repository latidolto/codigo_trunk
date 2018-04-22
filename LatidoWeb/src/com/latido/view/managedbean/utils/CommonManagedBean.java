package com.latido.view.managedbean.utils;

import java.io.IOException;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.latido.model.LatidoFacade;
import com.latido.model.entities.Usuario;
import com.latido.security.LatidoSecurityManager;

public class CommonManagedBean {
	public static final String LOGIN = "/faces/security/login.xhtml";
	public static final String LOGIN_RESOURCE = "Login";
	public static final String INDEX = "/faces/index.xhtml";
	public static final String INDEX_RESOURCE = "Index";
	public static final String FORBIDDEN = "/faces/security/forbidden.xhtml";
	
	public static final String ACTIVIDAD = "/faces/ProspectoActividad.xhtml";
	public static final String ACTIVIDAD_RESOURCE = "ProspectoActividad";
	public static final String PLAN = "/faces/ProspectoPlan.xhtml";
	public static final String PLAN_RESOURCE = "ProspectoPlan";
	public static final String DOCUMENTACION = "/faces/ProspectoDocumentacion.xhtml";
	public static final String DOCUMENTACION_RESOURCE = "ProspectoDocumentacion";
	public static final String PROSPECTO = "/faces/Prospecto.xhtml";
	public static final String PROSPECTO_RESOURCE = "Prospecto";

	public CommonManagedBean(String resourceName) {
		System.out.println("NOMBRE :: "+resourceName);
		Integer result = this.validateResource(resourceName);
		FacesContext fc = FacesContext.getCurrentInstance();
		ExternalContext ec = fc.getExternalContext();
		if(result == 0) {
			try {
				ec.redirect(ec.getRequestContextPath() + LOGIN);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if(result == 2) {
			// Validate resource loaded with not permission to access.
			try {
				ec.redirect(ec.getRequestContextPath() + FORBIDDEN);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private Integer validateResource(String resourceName){
		Integer result = 0;
		if(resourceName != null) {
			if(resourceName.equalsIgnoreCase(LOGIN_RESOURCE)) {
				result = 1;
			} else {
				if(resourceName.equalsIgnoreCase(INDEX_RESOURCE)) {
					result = LatidoSecurityManager.getUserObject() != null ? 1 : 0 ;
				} else {
					// Query to validate resource in BD.
					Integer idsis = LatidoSecurityManager.getSystemKey();
					Usuario usu = LatidoSecurityManager.getUserObject();
					if(usu != null && idsis != null) {
						boolean isValid = LatidoFacade.getInstance().validateUserResource(idsis, resourceName, usu.getClave());
						result = isValid ? 1 : 2 ;
					} 
				}
			}
		}
		return result;
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
	
	public LatidoFacade getFacade() {
		String keyMem = null;
		HttpSession session = (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		keyMem = session.getId();
		return LatidoFacade.getInstance(keyMem);
	}
	
}
