package lto.healthwell.view.managedbean;

import java.util.List;

import javax.faces.event.ActionEvent;

import com.latido.view.managedbean.utils.CommonManagedBean;
import com.latido.view.managedbean.utils.JsfUtils;

import lto.healthwell.dispatcher.LtoHealthwellDispatcher;
import lto.healthwell.model.controllers.UsuarioPermisoController;
import lto.healthwell.model.entities.Multivaluada;
import lto.healthwell.model.entities.UsuarioPermiso;
import net.bootsfaces.component.selectBooleanCheckbox.SelectBooleanCheckbox;

public class UsuarioPermisoMB extends CommonManagedBean{
	public static final String RESOURCE_NAME = "LTO_HWL_USUARIOPERMISO";

	public UsuarioPermisoMB () {
		super();
		//super(RESOURCE_NAME);
	}
	
	public UsuarioPermisoController getController() {
		return (UsuarioPermisoController) LtoHealthwellDispatcher.getControllerInstance(LtoHealthwellDispatcher.UP_CONTROLLER, this.getSessionKey());
	}
	
	public List<UsuarioPermiso> getUsuarioPermiso(){
		return this.getController().getFilteredUsuarioPermiso(false);
	}
	
	public List<Multivaluada> getMultivaluadaProceso(){
		return this.getController().getMultivaluada("UP_PROCESOS", "usuario_permiso", "proceso");
	}
	
	public void refrescarUsuariosAction(ActionEvent ae) {
		this.getController().mapearUsuariosNuevos();
	}
	
	public void guardarCambiosAction(ActionEvent ae) {
		List<UsuarioPermiso> lup = this.getUsuarioPermiso();
		String message = null;
		for(UsuarioPermiso up : lup) {
			message = this.getController().guardarUsuarioPermiso(up);
		}
		if(message.equalsIgnoreCase("success")) {
			JsfUtils.sendMessageToView_INFO("Se han guardado los cambios de forma correcta.");
		} else {
			JsfUtils.sendMessageToView_ERROR(message);
		}
	}

}
