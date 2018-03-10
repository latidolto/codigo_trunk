package com.latido.view.managedbean.security;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.event.ActionEvent;

import com.latido.model.LatidoFacade;
import com.latido.model.entities.Rol;
import com.latido.model.entities.Sistema;
import com.latido.model.entities.UsuRol;
import com.latido.model.entities.UsuRolPK;
import com.latido.model.entities.Usuario;
import com.latido.security.LatidoSecurityManager;
import com.latido.view.dao.security.RolUserDAO;
import com.latido.view.managedbean.utils.CommonManagedBean;
import com.latido.view.managedbean.utils.JsfUtils;

public class RolUser extends CommonManagedBean{
	
	public RolUser() {
		super("Roles y Usuarios");
	}
	
	public List<UsuRol> getUsuRolList(){
		Map params = new HashMap();
		params.put("p_idSistema", getRolUserDAO().getIdSistema());
		params.put("p_idRol", getRolUserDAO().getIdRol());
		List<UsuRol> lur = LatidoFacade.getInstance().getListFromParameters(UsuRol.class.getName(), "findByRolAndSys", params);
		if(lur != null)
			for(UsuRol ur : lur) {
				Map pU = new HashMap();
				pU.put("p_idUsuario", ur.getId().getIdUsuario());
				List<Usuario> lu = LatidoFacade.getInstance().getListFromParameters(Usuario.class.getName(), "findUserById", pU);
				Usuario usu = null;
				if(lu != null)
					if(lu.size() > 0)
						usu = lu.get(0);
				ur.setUsuario(usu);
			}
		return lur;
	}
	
	public List<Sistema> getSistemas(){
		return LatidoFacade.getInstance().getFindAllList(Sistema.class.getName());
	}
	
	public List<Rol> getRoles(){
		Map params = new HashMap();
		params.put("p_idSistema", getRolUserDAO().getIdSistema());
		return LatidoFacade.getInstance().getListFromParameters(Rol.class.getName(), "findBySys", params);
	}
	
	public RolUserDAO getRolUserDAO() {
		return RolUserDAO.getInstance();
	}
	
	public List<Usuario> getUsuariosDisp(){
		return RolUserDAO.getInstance().getUsuariosNoRol();
	}
	
	public void onSelect(UsuRol row, String typeOfSelection, String indexes) {
		LatidoFacade.getInstance().setEjb(UsuRol.class.getName(), row );
		//JsfUtils.resfreshComponentById("formPanel");
	}
	
	public void onSelectUsuario(Usuario row, String typeOfSelection, String indexes) {
		LatidoFacade.getInstance().setEjb(Usuario.class.getName(), row );
		//JsfUtils.resfreshComponentById("formPanel");
	}
	
	public void saveAction(ActionEvent ae) {
		Usuario usuario = (Usuario)LatidoFacade.getInstance().getEjb(Usuario.class.getName());
		UsuRol usu = (UsuRol)LatidoFacade.getInstance().getEjb(UsuRol.class.getName());
		UsuRolPK urp = new UsuRolPK();
		urp.setIdRol(RolUserDAO.getInstance().getIdRol());
		urp.setIdSistema(RolUserDAO.getInstance().getIdSistema());
		urp.setIdUsuario(usuario.getIdUsuario());
		usu.setId(urp);
		LatidoFacade.getInstance().persistEjb(UsuRol.class.getName(),true);
		LatidoFacade.getInstance().setEjb(UsuRol.class.getName(),new UsuRol());
		JsfUtils.sendMessageToView_INFO("Guardado Exitoso.");
		JsfUtils.resfreshComponentById("dtUsuarios");
		JsfUtils.resfreshComponentById("dtUsuariosDes");
	}
	
	public void deleteAction(ActionEvent ae) {
		UsuRol ur = (UsuRol)LatidoFacade.getInstance().getEjb(UsuRol.class.getName());
		try {
			RolUserDAO.getInstance().deleteRolUsu(ur);
		} catch (Exception e) {
			e.printStackTrace();
		}
		JsfUtils.sendMessageToView_INFO("Borrado Exitoso.");
		JsfUtils.resfreshComponentById("dtUsuarios");
		JsfUtils.resfreshComponentById("dtUsuariosDes");
	}
	
}
