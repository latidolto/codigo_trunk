package lto.services.dispatcher;

import java.util.HashMap;
import java.util.Map;

import lto.services.model.LtoServicesFacade;
import lto.services.model.controllers.CommonCatalogController;
import lto.services.model.controllers.LtoController;
import lto.services.model.controllers.ScheduleController;
import lto.services.model.controllers.ServicesController;
/**Clase para mandar llamar desde cualquier parte de el Middleware con el objetivo de centralizar los
 * accesos a las clases controladoras con la logica del negocio pertinente.
 * */
public class LtoServicesDispatcher {
	//private static LtoServicesFacade lsf;
	public static Map<Integer,Object> cachedController;
	public static final int COMMON_CATALOG_CONTROLLER = 0;
	public static final int SCHEDULE_CONTROLLER = 1;
	public static final int SERVICES_CONTROLLER = 2;

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
		if(SCHEDULE_CONTROLLER ==  controller)
			ctrl = new ScheduleController(keyMem);
		if(SERVICES_CONTROLLER ==  controller)
			ctrl = new ServicesController(keyMem);
		return ctrl;
	}
	
}
