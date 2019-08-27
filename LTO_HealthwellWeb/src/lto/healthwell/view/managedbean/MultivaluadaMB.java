package lto.healthwell.view.managedbean;

import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import com.latido.view.managedbean.utils.CommonManagedBean;
import com.latido.view.managedbean.utils.JsfUtils;

import lto.healthwell.dispatcher.LtoHealthwellDispatcher;
import lto.healthwell.model.controllers.MultivaluadaController;
import lto.healthwell.model.entities.Multivaluada;

public class MultivaluadaMB extends CommonManagedBean{
	public static final String RESOURCE_NAME = "LTO_HWL_MULTIVALUADA";
	
	public MultivaluadaMB() {
		//super(RESOURCE_NAME);
	}
	
	/*Logica de negocios para los objetos relacionados con el Grupo Organizacional*/
	private MultivaluadaController getController() {
		MultivaluadaController mc = (MultivaluadaController) LtoHealthwellDispatcher.getControllerInstance(LtoHealthwellDispatcher.MV_CONTROLLER, this.getSessionKey());
		// Inicializacion de variables globales en cache
		return mc;
	}
	
	public Multivaluada getMultivaluada() {
		return this.getController().getCurrentMultivaluada();
	}
	
	public List<Multivaluada> getMultivaluadas(){
		return this.getController().getFilteredMultivaluadas();
	}
	
	public List<String> getTablas(){
		return this.getController().getTablas();
	}
	
	public List<String> getColumnas(){
		String tabla = this.getMultivaluada().getTabla();
		if(tabla != null)
			return this.getController().getColumnas(tabla);
		return null;
	}
	
	public void onSelectMultivaluada(Multivaluada row, String typeOfSelection, String indexes) {
		this.getController().getLtoHealthwellFacade().setEjb(Multivaluada.class.getName(), row);
		JsfUtils.resfreshComponentById("mainBttnGrp");
	}
	
	public void onDeselectMultivaluada() {
		this.resetUI();
		JsfUtils.resfreshComponentById("mainBttnGrp");
	}
	
	public void guardarMultivaluada(ActionEvent ae) {
		Multivaluada mul = this.getMultivaluada();
		String message = this.getController().guardarMultivaluada(mul);
		
		if(!message.equalsIgnoreCase("success")) { 
			JsfUtils.sendMessageToView_ERROR(message);
		} else {
			message = "Se ha guardado el grupo de forma correcta.";
			JsfUtils.sendMessageToView_INFO(message);
			this.resetUI();
		}
		this.resetUI();
	}
	
	public void cancelarGuardarMultivaluada(ActionEvent ae) {
		this.resetUI();
	}
	
	public void resetUI() {
		//Dejamos la pantalla como en un inicio
		this.getController().getLtoHealthwellFacade().setEjb(Multivaluada.class.getName(), new Multivaluada());
	}
}
