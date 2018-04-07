package com.latido.view.managedbean.security;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.event.ActionEvent;

import com.latido.model.LatidoFacade;
import com.latido.model.entities.Rol;
import com.latido.model.entities.RolTarea;
import com.latido.model.entities.RolTareaPK;
import com.latido.model.entities.Sistema;
import com.latido.model.entities.Tarea;
import com.latido.view.dao.security.RolResourceDAO;
import com.latido.view.managedbean.utils.CommonManagedBean;
import com.latido.view.managedbean.utils.JsfUtils;

public class RolResource extends CommonManagedBean{
	
	public RolResource() {
		super("Roles y Tareas");
	}
	
	public RolResourceDAO getRolResourceDAO() {
		return RolResourceDAO.getInstance();
	}
	
	public List<Sistema> getSistemas(){
		return getFacade().getFindAllList(Sistema.class.getName());
	}
	
	public List<Rol> getRoles(){
		Map params = new HashMap();
		params.put("p_idSistema", getRolResourceDAO().getIdSistema());
		return getFacade().getListFromParameters(Rol.class.getName(), "findBySys", params);
	}
	
	public List<RolTarea> getRolTareas(){
		Map params = new HashMap();
		params.put("p_idSistema", getRolResourceDAO().getIdSistema());
		params.put("p_idRol", getRolResourceDAO().getIdRol());
		List<RolTarea> lrt = getFacade().getListFromParameters(RolTarea.class.getName(), "findAllBySisRol", params);
		if(lrt != null)
			if(lrt.size() > 0)
				for(RolTarea rt : lrt) {
					Map pU = new HashMap();
					pU.put("p_idTarea", rt.getId().getIdTarea());
					List<Tarea> lt = getFacade().getListFromParameters(Tarea.class.getName(), "findTareaById", pU);
					if(lt != null)
						if(lt.size() > 0)
							rt.setTarea(lt.get(0));
				}
		return lrt;
	}
	
	public void onSelect(RolTarea row, String typeOfSelection, String indexes) {
		getFacade().setEjb(RolTarea.class.getName(), row );
		//JsfUtils.resfreshComponentById("formPanel");
	}
	
	public void onSelectTarea(Tarea row, String typeOfSelection, String indexes) {
		getFacade().setEjb(Tarea.class.getName(), row );
		//JsfUtils.resfreshComponentById("formPanel");
	}
	
	public List<Tarea> getRolTareasDisp(){
		return getRolResourceDAO().getRolTareasDisp();
	}
	
	public void saveAction(ActionEvent ae) {
		RolTarea rt = (RolTarea)getFacade().getEjb(RolTarea.class.getName());
		Tarea t = (Tarea)getFacade().getEjb(Tarea.class.getName());
		RolTareaPK rtp = new RolTareaPK();
		rtp.setIdMenu(t.getIdMenu());
		rtp.setIdTarea(t.getIdTarea());
		rtp.setIdSistema(getRolResourceDAO().getIdSistema());
		rtp.setIdRol(getRolResourceDAO().getIdRol());
		rt.setId(rtp);
		getFacade().persistEjb(RolTarea.class.getName(), true);
		getFacade().setEjb(RolTarea.class.getName(), new RolTarea() );
		
		JsfUtils.sendMessageToView_INFO("Guardado Exitoso.");
		JsfUtils.resfreshComponentById("dtTareas");
		JsfUtils.resfreshComponentById("dtTareasDisp");
	}
	
	public void deleteAction(ActionEvent ae) {
		RolTarea rt = (RolTarea)getFacade().getEjb(RolTarea.class.getName());
		try {
			RolResourceDAO.getInstance().deleteRolUsu(rt);
		} catch (Exception e) {
			e.printStackTrace();
		}
		JsfUtils.sendMessageToView_INFO("Borrado Exitoso.");
		JsfUtils.resfreshComponentById("dtTareas");
		JsfUtils.resfreshComponentById("dtTareasDisp");
	}
}
