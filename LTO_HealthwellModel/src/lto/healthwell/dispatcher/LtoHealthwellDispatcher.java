package lto.healthwell.dispatcher;

import java.util.HashMap;
import java.util.Map;

import lto.healthwell.model.controllers.GrupoOrganizacionalController;
import lto.healthwell.model.controllers.LtoController;

public class LtoHealthwellDispatcher {
	public static Map<Integer,Object> cachedController;
	public static final int GO_CONTROLLER = 0;
	
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
		
		return ctrl;
	}
	
}
