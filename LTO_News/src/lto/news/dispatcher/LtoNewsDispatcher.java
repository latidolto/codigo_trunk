package lto.news.dispatcher;

import java.util.HashMap;
import java.util.Map;

import lto.news.model.controller.CommonCatalogController;
import lto.news.model.controller.LtoController;

/**Clase para mandar llamar desde cualquier parte de el Middleware con el objetivo de centralizar los
 * accesos a las clases controladoras con la logica del negocio pertinente.
 * */
public class LtoNewsDispatcher {
	public static Map<Integer,Object> cachedController;
	public static final int COMMON_CATALOG_CONTROLLER = 0;

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
		if(COMMON_CATALOG_CONTROLLER ==  controller)
			ctrl = new CommonCatalogController(keyMem);
		return ctrl;
	}
	
}
