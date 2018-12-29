package lto.services.view.managedbean.infra;

import java.util.Date;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import com.latido.security.LatidoSecurityManager;
import com.latido.view.managedbean.utils.CommonManagedBean;
import com.latido.view.managedbean.utils.JsfUtils;

import lto.services.dispatcher.LtoServicesDispatcher;
import lto.services.model.controllers.ServicesController;
import lto.services.model.entities.Servicio;

public class ServicesMB extends CommonManagedBean {
	public static final String RESOURCE_NAME = "LTO_SRV_SERVICIO";

	public ServicesMB() {
		super();
		//super(RESOURCE_NAME);
	}
	
	private ServicesController getController() {
		return (ServicesController) LtoServicesDispatcher.getControllerInstance(LtoServicesDispatcher.SERVICES_CONTROLLER, this.getSessionKey());
	}
	
	public Servicio getServicio(){
		return getController().getCurrentService();
	}
	
	public List<Servicio> getServicios(){
		return getController().getServicesByParams();
	}
	/**
	 * Events on the page to handle main action on the button bar or the grid for a common catalog
	 * */
	public void onSelect(Servicio row, String typeOfSelection, String indexes) {
		this.getController().setCurrentService(row);
		JsfUtils.resfreshComponentById("formPanel");
	}
	
	public void newAction(ActionEvent ae) {
		this.getController().setCurrentService(new Servicio());
		JsfUtils.resfreshComponentById("formPanel");
	}
	
	public void saveAction(ActionEvent ae) {
		Servicio servicio = getServicio();
		servicio.setUsuarioModificacion(LatidoSecurityManager.getUserInLine() == null ? "anonymous" : LatidoSecurityManager.getUserInLine());
		getController().saveService(servicio);
		this.getController().setCurrentService(new Servicio());
		JsfUtils.sendMessageToView_INFO("Guardado Exitoso.");
		JsfUtils.resfreshComponentById("mainForm");
	}
	
	public void clearAction(ActionEvent ae) {
		this.getController().setCurrentService(new Servicio());
		JsfUtils.resfreshComponentById("mainForm");
	}	
	/*********************************************************************************************/
	
	/**Additional functionality for the page*/
	public void valueChangeVisibilidad(ValueChangeEvent vce) {
		if(vce.getNewValue() != null) {
			if((Boolean)vce.getNewValue()) {
				getServicio().setCostoVisible(1);
			} else {
				getServicio().setCostoVisible(0);
			}
		}
	}
	
	/****************************************/
}
