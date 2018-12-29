package lto.services.model;

import java.util.HashMap;
import java.util.Map;

import com.latido.model.LatidoFacadeUtil;

import lto.services.model.entities.Servicio;

public class LtoServicesFacade extends LatidoFacadeUtil{
	private static LtoServicesFacade ltoServices;
	private static final String persistenceUnitName = "LTO_Servicios";
	private String keyMem;
	private Map<String, LtoServicesFacade> cacheFacade;

	protected LtoServicesFacade() {
		super(persistenceUnitName);
	}

	public LtoServicesFacade(String keyMem) {
		super(persistenceUnitName);
		this.setKeyMem(keyMem);
	}
	
	/**
	 * Obtener instacia de <b>Facade</b> local con sus Entidades ya registradas
	 * <br/><br/>
	 * Registro de las entidades a usar en la aplicacion e implementar sus metodos mas simples
	 * si se requiere hacer queries o transacciones mas complejas usar metodos internos detro 
	 * de esta clase implementados las entidades necesarias o queries directos
	 * 
	 * <b>version 1.0.0.1</b> 
	 * 
	 * Recibe como parametro la key de la sesion , esto para mejorar la visualizacion de los 
	 * objetos y no choquen entre usuarios.
	 * 
	 * @author everardodominguez
	 * */
	public static LtoServicesFacade getInstance(String keyMem) {
		LtoServicesFacade cachedDemoPenolesFacade = null;
		Boolean isFirst = Boolean.FALSE;
		if(ltoServices == null) {
			ltoServices = new LtoServicesFacade();
			ltoServices.cacheFacade = new HashMap<String, LtoServicesFacade>();
			cachedDemoPenolesFacade = new LtoServicesFacade();
			cachedDemoPenolesFacade.setKeyMem(keyMem);
			ltoServices.cacheFacade.put(keyMem,cachedDemoPenolesFacade); 
			isFirst = Boolean.TRUE;
		} else {
			if(ltoServices.cacheFacade.get(keyMem) != null) {
				cachedDemoPenolesFacade = ltoServices.cacheFacade.get(keyMem);
				isFirst = Boolean.FALSE;
			} else {
				cachedDemoPenolesFacade = new LtoServicesFacade();
				cachedDemoPenolesFacade.setKeyMem(keyMem);
				ltoServices.cacheFacade.put(keyMem,cachedDemoPenolesFacade);
				isFirst = Boolean.TRUE;
			}
		}
		
		if(isFirst) {
			// Registramos las entities 
			cachedDemoPenolesFacade.registerEJB(new Object[] { new Servicio() });
		}
		return cachedDemoPenolesFacade;
	}

	public String getKeyMem() {
		return keyMem;
	}

	public void setKeyMem(String keyMem) {
		this.keyMem = keyMem;
	}
	
}
