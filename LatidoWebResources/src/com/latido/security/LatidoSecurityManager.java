package com.latido.security;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.latido.model.LatidoFacade;
import com.latido.model.entities.Sistema;
import com.latido.model.entities.UsuRol;
import com.latido.model.entities.Usuario;

public class LatidoSecurityManager {
	public static final String USERNAME = "USERINLINE";
	public static final String ROLES = "ASSIGNEDROLES";
	public static final String USEROBJECT = "USEROBJECT";
	public static final String SYSTEM_NAME = "SYSTEM_NAME";
	public static final String SYSTEM_KEY = "SYSTEM_KEY";


	/**
	 * @return the session
	 */
	public static HttpSession getSession() {
		return (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
	}
	/**
	 * Una vez que tenemos al usuario validado se carga la información incial de el.
	 * 
	 * */
	public static void registerUserInSession(String userName) throws Exception{
		if(userName != null) {
			Usuario user = LatidoFacade.getInstance(getSession().getId()).getfullUserByUsername(userName);
			if(user != null) {
				HttpSession session  = getSession();
				session.setAttribute(USERNAME, userName);
				String[] roles = new String[1024] ;
				int index = 0;
				if(user.getUsuRol() != null)
					for(UsuRol ur : user.getUsuRol()) {
						roles[index++] = ur.getRol().getNombre(); 
					}
				session.setAttribute(USEROBJECT, user);
				session.setAttribute(ROLES, roles);
			} else {
				throw new Exception ("User not found or inactivated ...");
			}
			
		} else {
			throw new Exception ("The user cannot be null ...");
		}
	}
	
	public static String getUserInLine() {
		return (String) getSession().getAttribute(USERNAME);
	}
	
	public static String[] getUserRoles() {
		return (String[]) getSession().getAttribute(ROLES);
	}
	
	public static Usuario getUserObject() {
		return (Usuario) getSession().getAttribute(USEROBJECT);
	}
	
	public static String getSystemName() {
		return (String) getSession().getAttribute(SYSTEM_NAME);
	}
	
	public static Integer getSystemKey() {
		return (Integer) getSession().getAttribute(SYSTEM_KEY);
	}

	public static void setSystemInSession(Sistema sis) {
		if(sis != null) {
			HttpSession session = getSession();
			session.setAttribute(SYSTEM_NAME, sis.getNombre());
			session.setAttribute(SYSTEM_KEY, sis.getIdSistema());
		}
	}
	
	public static void exitSystem() {
		HttpSession session = getSession();
		session.setAttribute(SYSTEM_NAME, null);
		session.setAttribute(SYSTEM_KEY, null);
	}
}
