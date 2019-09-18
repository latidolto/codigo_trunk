package lto.healthwell.dispatcher;

import java.util.HashMap;
import java.util.Map;

import lto.healthwell.model.controllers.AreaController;
import lto.healthwell.model.controllers.GrupoOrganizacionalController;
import lto.healthwell.model.controllers.LtoController;
import lto.healthwell.model.controllers.MultivaluadaController;
import lto.healthwell.model.controllers.UsuarioPermisoController;

public class LtoHealthwellDispatcher {
	public static Map<Integer,Object> cachedController;
	public static final int GO_CONTROLLER = 0;
	public static final int MV_CONTROLLER = 1;
	public static final int UP_CONTROLLER = 2;
	public static final int AR_CONTROLLER = 3;
	
	/**
	 * Metodo para regresar el controlador adecuado segun la necesidad.
	 * 
	 * */
	public static Object getControllerInstance(int controller,String keyMem) {
		Object ctrlr = null;
		if(cachedController == null) {
			cachedController = new HashMap<Integer,Object>();
			ctrlr = instanceController(controller, keyMem);
			cachedController.put(controller, ctrlr );
		} else {
			if(cachedController.containsKey(controller)) {
				LtoController ltoController = (LtoController)cachedController.get(controller);
				if(ltoController.getKeyMem().equalsIgnoreCase(keyMem)) {
					ctrlr = cachedController.get(controller);
				} else {
					ctrlr = instanceController(controller, keyMem);
					cachedController.put(controller, ctrlr );
				}
			} else {
				ctrlr = instanceController(controller, keyMem);
				cachedController.put(controller, ctrlr );
			}
		}
		return ctrlr;
	}
	
	private static Object instanceController(int controller,String keyMem) {
		Object ctrl = null;
		if(GO_CONTROLLER ==  controller)
			ctrl = new GrupoOrganizacionalController(keyMem);
		if(MV_CONTROLLER ==  controller)
			ctrl = new MultivaluadaController(keyMem);
		if(UP_CONTROLLER ==  controller)
			ctrl = new UsuarioPermisoController(keyMem);
		if(AR_CONTROLLER ==  controller)
			ctrl = new AreaController(keyMem);
		
		return ctrl;
	}
	
}
