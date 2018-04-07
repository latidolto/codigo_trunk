package com.latido.view.managedbean;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.faces.event.ActionEvent;

import com.latido.model.LatidoFacade;
import com.latido.model.entities.Menu;
import com.latido.model.entities.Sistema;
import com.latido.model.entities.Tarea;
import com.latido.model.entities.Usuario;
import com.latido.security.LatidoSecurityManager;
import com.latido.view.managedbean.utils.CommonManagedBean;
import com.latido.view.managedbean.utils.JsfUtils;

public class Index extends CommonManagedBean{
	
	public Index() {
		super(CommonManagedBean.INDEX_RESOURCE);
	}
	
	public List<Menu> getMenu(){
		Integer sisId = 0;
		if(LatidoSecurityManager.getSystemKey() != null) {
			sisId = Integer.valueOf( LatidoSecurityManager.getSystemKey().toString() );
		}
		return getFacade().getMenu(true,sisId);
	}
	
	public String getSystemName() {
		String systemName = "Latido";
		String systemNameSess = LatidoSecurityManager.getSystemName();
		if(systemNameSess != null)
			systemName = systemNameSess;
		return systemName;
	}
	
	public String getCurrentDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(new Date(System.currentTimeMillis()));
	}
	
	public String getUserName() {
		Usuario usu = LatidoSecurityManager.getUserObject();
		return usu.getNombre() +" "+ (( usu.getApellidoPaterno() != null ) ? usu.getApellidoPaterno() : "" ) +" "+ (( usu.getApellidoMaterno() != null ) ? usu.getApellidoMaterno() : "" );
	}
	
	public void listenerCurrDate(ActionEvent ae) {
		JsfUtils.resfreshComponentById("currDate");
	}
	
	public List<Sistema> getSistemas(){
		return getFacade().getFindAllList(Sistema.class.getName());
	}
	
	public void selectSystem(ActionEvent ae) {
		System.out.println("Metodo de seleccion de sistema");
		Sistema sis = (Sistema) ae.getComponent().getAttributes().get("sistema");
		getFacade().setEjb(Sistema.class.getName(), sis);
		LatidoSecurityManager.setSystemInSession(sis);
		System.out.println("Sistema seleccionado:"+sis.getNombre());
		JsfUtils.resfreshComponentById("mainForm");
	}
	
	public void selectResource(ActionEvent ae) {
		Tarea tar = (Tarea)ae.getComponent().getAttributes().get("tarea");
		getFacade().setEjb(Tarea.class.getName() , tar);
		JsfUtils.resfreshComponentById("systemResource");
	}
	
	public Tarea getTarea() {
		return (Tarea)getFacade().getEjb(Tarea.class.getName());
	}
	
	public void exit(ActionEvent ae) {
		LatidoSecurityManager.getSession().invalidate();
		this.redirectView(LOGIN);
	}
	
	public void exitSystem(ActionEvent ae) {
		LatidoSecurityManager.exitSystem();
		this.redirectView(INDEX);
	}

}
