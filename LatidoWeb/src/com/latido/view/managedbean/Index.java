package com.latido.view.managedbean;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.faces.event.ActionEvent;

import com.latido.model.LatidoFacade;
import com.latido.model.entities.Menu;
import com.latido.model.entities.Sistema;
import com.latido.model.entities.Usuario;
import com.latido.security.LatidoSecurityManager;
import com.latido.view.managedbean.utils.CommonManagedBean;
import com.latido.view.managedbean.utils.JsfUtils;

public class Index extends CommonManagedBean{
	
	public Index() {
		super(CommonManagedBean.INDEX_RESOURCE);
	}
	
	public List<Menu> getMenu(){
		return LatidoFacade.getInstance().getMenu(false);
	}
	
	public String getSystemName() {
		String systemName = "Latido";
		String systemNameSess = LatidoSecurityManager.getSystemName();
		if(systemNameSess != null)
			systemName = systemNameSess;
		return systemName;
	}
	
	public String getCurrentDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
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
		return LatidoFacade.getInstance().getFindAllList(Sistema.class.getName());
	}
	
	public void selectSystem(ActionEvent ae) {
		Sistema sis = (Sistema) ae.getComponent().getAttributes().get("sistema");
		LatidoFacade.getInstance().setEjb(Sistema.class.getName(), sis);
		LatidoSecurityManager.setSystemInSession(sis);
		System.out.println("Sistema seleccionado:"+sis.getNombre());
		JsfUtils.resfreshComponentById("mainForm");
	}

}
