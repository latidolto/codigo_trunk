package com.latido.view.managedbean.infra;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;
import org.wildfly.security.http.HttpServerRequest;

import com.latido.model.LatidoFacade;
import com.latido.model.entities.Sistema;
import com.latido.model.entities.Usuario;
import com.latido.security.LatidoSecurityManager;
import com.latido.view.dao.infra.UserDAO;
import com.latido.view.managedbean.utils.CommonManagedBean;
import com.latido.view.managedbean.utils.JsfUtils;

public class User extends CommonManagedBean{
	
	public User() {
		super("Catalogo de Usuarios");
	}
	
	public List<Usuario> getUsers(){
		return LatidoFacade.getInstance().getFindAllList(Usuario.class.getName());
	}
	
	public Usuario getUser() {
		return (Usuario)LatidoFacade.getInstance().getEjb(Usuario.class.getName());
	}
	
	public void onSelect(Usuario row, String typeOfSelection, String indexes) {
		LatidoFacade.getInstance().setEjb(Usuario.class.getName(), row );
		JsfUtils.resfreshComponentById("formPanel");
	}
	
	public void saveAction(ActionEvent ae) {
		Usuario usu = (Usuario)LatidoFacade.getInstance().getEjb(Usuario.class.getName());
		
		usu.setAvatar(UserDAO.getInstance().getBytes());
		usu.setFecMod(new Date());
		usu.setUsuCve(LatidoSecurityManager.getUserInLine() == null ? "anonymous" : LatidoSecurityManager.getUserInLine());
		
		if (usu.getIdUsuario() == null || usu.getIdUsuario() == 0) {
			usu.setPassword("NOTVALIDPASSWORD");
			LatidoFacade.getInstance().persistEjb(Usuario.class.getName());
		} else {
			LatidoFacade.getInstance().mergeEjb(Usuario.class.getName());
		}
		JsfUtils.sendMessageToView_INFO("Guardado Exitoso.");
		JsfUtils.resfreshComponentById("formPanel");
		JsfUtils.resfreshComponentById("formDT");
	}
	
	public void clearAction(ActionEvent ae) {
		LatidoFacade.getInstance().setEjb(Usuario.class.getName(), new Usuario() );
		JsfUtils.resfreshComponentById("formPanel");
	}
	
	public Part getPart() {
		return UserDAO.getInstance().getPart();
	}
	
	public void setPart(Part part) {
		UserDAO.getInstance().setPart(part);
	}
	
	public void saveAvatarAction() {
		JsfUtils.resfreshComponentById("avatarGrpForm");
	}

	
	public List<Sistema> getSistemas(){
		return LatidoFacade.getInstance().getFindAllList(Sistema.class.getName());
	}
	
}
