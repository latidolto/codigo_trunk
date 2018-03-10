package com.latido.view.managedbean.infra;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.event.ActionEvent;

import com.latido.model.LatidoFacade;
import com.latido.model.entities.Menu;
import com.latido.model.entities.Sistema;
import com.latido.model.entities.Tarea;
import com.latido.security.LatidoSecurityManager;
import com.latido.view.dao.infra.MenuConfigDAO;
import com.latido.view.managedbean.utils.CommonManagedBean;
import com.latido.view.managedbean.utils.JsfUtils;

public class MenuConfig extends CommonManagedBean{
	
	public MenuConfig() {
		super("Configuración de Menu");
	}

	public List<Sistema> getSistemas(){
		return LatidoFacade.getInstance().getFindAllList(Sistema.class.getName());
	}
	
	public Menu getMenu() {
		return (Menu)LatidoFacade.getInstance().getEjb(Menu.class.getName());
	}
	
	public void onSelectSistema(Sistema sis, String typeOfSelection, String indexes) {
		LatidoFacade.getInstance().setEjb(Sistema.class.getName(), sis);
		LatidoFacade.getInstance().setEjb(Menu.class.getName(), new Menu());
		JsfUtils.resfreshComponentById("panelMenu");
		JsfUtils.resfreshComponentById("panelTareas");
		
	}
	
	public void onSelectMenu1(Menu menu, String typeOfSelection, String indexes) {
		MenuConfigDAO.getInstance().setMenu1(menu);
		MenuConfigDAO.getInstance().setMenu2(null);
		MenuConfigDAO.getInstance().setMenu3(null);
		LatidoFacade.getInstance().setEjb(Menu.class.getName(), new Menu());
		MenuConfigDAO.getInstance().setMenuSelected(menu);
		JsfUtils.resfreshComponentById("dtMenu2");
		JsfUtils.resfreshComponentById("dtMenu3");
		JsfUtils.resfreshComponentById("panelTareas");
	}
	
	public void onSelectMenu2(Menu menu, String typeOfSelection, String indexes) {
		MenuConfigDAO.getInstance().setMenu2(menu);
		MenuConfigDAO.getInstance().setMenu3(null);
		LatidoFacade.getInstance().setEjb(Menu.class.getName(), new Menu());
		MenuConfigDAO.getInstance().setMenuSelected(menu);
		JsfUtils.resfreshComponentById("dtMenu3");
		JsfUtils.resfreshComponentById("panelTareas");
	}
	
	public void onSelectMenu3(Menu menu, String typeOfSelection, String indexes) {
		MenuConfigDAO.getInstance().setMenu3(menu);
		MenuConfigDAO.getInstance().setMenuSelected(menu);
		JsfUtils.resfreshComponentById("panelTareas");
	}

	public List<Menu> getMenu1(){
		Map params = new HashMap();
		Sistema sis = (Sistema)LatidoFacade.getInstance().getEjb(Sistema.class.getName());
		params.put("p_idSistema", sis.getIdSistema());
		return LatidoFacade.getInstance().getListFromParameters(Menu.class.getName(),"findMenuBySistem", params);
	}
	
	public List<Menu> getMenu2(){
		Map params = new HashMap();
		Sistema sis = (Sistema)LatidoFacade.getInstance().getEjb(Sistema.class.getName());
		params.put("p_idSistema", sis.getIdSistema());
		
		if(MenuConfigDAO.getInstance().getMenu1() != null) {
			params.put("p_idMenuPadre", MenuConfigDAO.getInstance().getMenu1().getIdMenu());
		} else {
			params.put("p_idMenuPadre", null);
		}
		
		return LatidoFacade.getInstance().getListFromParameters(Menu.class.getName(),"findMenuChildren", params);
	}
	
	public List<Menu> getMenu3(){
		Map params = new HashMap();
		Sistema sis = (Sistema)LatidoFacade.getInstance().getEjb(Sistema.class.getName());
		params.put("p_idSistema", sis.getIdSistema());
		
		if(MenuConfigDAO.getInstance().getMenu2() != null) {
			params.put("p_idMenuPadre", MenuConfigDAO.getInstance().getMenu2().getIdMenu());
		} else {
			params.put("p_idMenuPadre", null);
		}
		
		return LatidoFacade.getInstance().getListFromParameters(Menu.class.getName(),"findMenuChildren", params);
	}
	
	public void addMenuAction(ActionEvent ae) {
		String level = ae.getComponent().getAttributes().get("level").toString();
		MenuConfigDAO.getInstance().setLevel(Integer.valueOf(level));
		java.lang.System.out.println("Level Selected:"+level);
	}
	
	public void saveMenuAction(ActionEvent ae) {
		Integer level = MenuConfigDAO.getInstance().getLevel();
		Sistema sis = (Sistema)LatidoFacade.getInstance().getEjb(Sistema.class.getName());
		Menu m = (Menu)LatidoFacade.getInstance().getEjb(Menu.class.getName());
		if(sis != null) {
			if(m.getEtiqueta() != null && m.getDescripcion() != null) {
				m.setFecMod(new Date());
				m.setUsuCve(LatidoSecurityManager.getUserInLine() == null ? "anonymous" : LatidoSecurityManager.getUserInLine());
				m.setIdSistema(sis.getIdSistema());
				Menu mP = null;
				if(level == 2) {
					mP = MenuConfigDAO.getInstance().getMenu1();
				} 
				if(level == 3) {
					mP = MenuConfigDAO.getInstance().getMenu2();
				} 
				if ( ( level == 2 || level ==3 ) && mP != null) {
					m.setIdMenuPadre(mP.getIdMenu());
				} else if( level == 2 || level ==3 ) {
					JsfUtils.sendMessageToView_ERROR("Es necesario seleccionar un menu para dar de alta el menu.");
				}
				LatidoFacade.getInstance().persistEjb(Menu.class.getName());
				JsfUtils.sendMessageToView_INFO("Guardado Exitoso");
				JsfUtils.resfreshComponentById("panelMenu");
				java.lang.System.out.println("Guardado sin problemas.");
			} else {
				JsfUtils.sendMessageToView_ERROR("Es necesario capturar todo los campos para dar de alta el menu.");
			}
		} else {
			JsfUtils.sendMessageToView_ERROR("Es necesario seleccionar un sistema para dar de alta el menu.");
		}
		
	}
	
	public void saveMenuAction() {
		this.saveMenuAction(null);
	}
	
	public void editMenu(Menu row) {
		java.lang.System.out.println("Editar o borrar el registro:"+row.getEtiqueta());
		LatidoFacade.getInstance().setEjb(Menu.class.getName(), row);
		
	}
	
	public void saveEditMenuAction() {
		Menu m = (Menu)LatidoFacade.getInstance().getEjb(Menu.class.getName());
		if(m.getEtiqueta() != null && m.getDescripcion() != null) {
			LatidoFacade.getInstance().mergeEjb(Menu.class.getName());
			JsfUtils.sendMessageToView_INFO("Guardado Exitoso");
			JsfUtils.resfreshComponentById("panelMenu");
			java.lang.System.out.println("Editado sin problemas.");
		} else {
			JsfUtils.sendMessageToView_ERROR("Es necesario capturar todo los campos para dar de alta el menu.");
		}
	}
	
	public void confirmDeleteMenuAction() {
		// TODO validacion de hijos antes del borrado
		LatidoFacade.getInstance().deleteEjb(Menu.class.getName());
		JsfUtils.sendMessageToView_INFO("Borrado Exitoso");
		JsfUtils.resfreshComponentById("panelMenu");
		java.lang.System.out.println("Borrado sin problemas.");
	}
	
	public List<Tarea> getTareas(){
		List<Tarea> lt = null;
		Sistema sis = (Sistema)LatidoFacade.getInstance().getEjb(Sistema.class.getName());
		Menu men = MenuConfigDAO.getInstance().getMenuSelected();
		if(sis != null && men != null) {
			Map params = new HashMap();
			params.put("p_idSistema", sis.getIdSistema());
			params.put("p_idMenu", men.getIdMenu());
			lt = LatidoFacade.getInstance().getListFromParameters(Tarea.class.getName(),"findTareaByMenu", params);
		}
		return lt;
	}
	
	public Tarea getTarea() {
		return (Tarea)LatidoFacade.getInstance().getEjb(Tarea.class.getName());
	}
	
	public void addTareaAction(ActionEvent ae) {
		LatidoFacade.getInstance().setEjb(Tarea.class.getName(), new Tarea());
	}
	
	public void onSelectTarea(Tarea tarea, String typeOfSelection, String indexes) {
		java.lang.System.out.println("Id:"+tarea.getIdTarea()+" Tarea Seleccionada :"+tarea.getNombre());
		LatidoFacade.getInstance().setEjb(Tarea.class.getName(), tarea);
	}
	
	public void saveTareaAction() {
		Sistema sis = (Sistema)LatidoFacade.getInstance().getEjb(Sistema.class.getName());
		Menu men = MenuConfigDAO.getInstance().getMenuSelected();
		
		if(sis != null && men != null) {
			Tarea t = (Tarea) LatidoFacade.getInstance().getEjb(Tarea.class.getName());
			t.setFecMod(new Date());
			t.setUsuCve(LatidoSecurityManager.getUserInLine() == null ? "anonymous" : LatidoSecurityManager.getUserInLine());
			t.setIdSistema(sis.getIdSistema());
			t.setIdMenu(men.getIdMenu());
			if(t.getIdTarea() == 0) {
				LatidoFacade.getInstance().persistEjb(Tarea.class.getName());
			} else {
				LatidoFacade.getInstance().mergeEjb(Tarea.class.getName());
			}
			JsfUtils.sendMessageToView_INFO("Guardado Exitoso");
			JsfUtils.resfreshComponentById("panelTareas");
			java.lang.System.out.println("Guardado de tarea sin problemas.");
		} else {
			JsfUtils.sendMessageToView_ERROR("Es necesario seleccionar un sistema y un menu para dar de alta una tarea.");
		}
		
	}
	
	public void confirmDeleteTareaAction() {
		LatidoFacade.getInstance().deleteEjb(Tarea.class.getName());
		JsfUtils.sendMessageToView_INFO("Borrado Exitoso");
		JsfUtils.resfreshComponentById("panelTareas");
		java.lang.System.out.println("Borrado sin problemas.");
	}
	
	public List<Menu> getMenuPrev(){
		Sistema sis = (Sistema)LatidoFacade.getInstance().getEjb(Sistema.class.getName());
		return LatidoFacade.getInstance().getMenu(true,sis.getIdSistema());
	}
	
}
