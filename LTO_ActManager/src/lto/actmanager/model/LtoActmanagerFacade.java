package lto.actmanager.model;

import java.util.HashMap;
import java.util.Map;

import com.latido.model.LatidoFacadeUtil;

import lto.actmanager.model.entities.Compania;

public class LtoActmanagerFacade extends LatidoFacadeUtil{
	private static LtoActmanagerFacade ltoActmanager;
	private static final String persistenceUnitName = "LTO_Servicios";
	private String keyMem;
	private Map<String, LtoActmanagerFacade> cacheFacade;

	protected LtoActmanagerFacade() {
		super(persistenceUnitName);
	}

	public LtoActmanagerFacade(String keyMem) {
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
	public static LtoActmanagerFacade getInstance(String keyMem) {
		LtoActmanagerFacade cachedDemoPenolesFacade = null;
		Boolean isFirst = Boolean.FALSE;
		if(ltoActmanager == null) {
			ltoActmanager = new LtoActmanagerFacade();
			ltoActmanager.cacheFacade = new HashMap<String, LtoActmanagerFacade>();
			cachedDemoPenolesFacade = new LtoActmanagerFacade();
			cachedDemoPenolesFacade.setKeyMem(keyMem);
			ltoActmanager.cacheFacade.put(keyMem,cachedDemoPenolesFacade); 
			isFirst = Boolean.TRUE;
		} else {
			if(ltoActmanager.cacheFacade.get(keyMem) != null) {
				cachedDemoPenolesFacade = ltoActmanager.cacheFacade.get(keyMem);
				isFirst = Boolean.FALSE;
			} else {
				cachedDemoPenolesFacade = new LtoActmanagerFacade();
				cachedDemoPenolesFacade.setKeyMem(keyMem);
				ltoActmanager.cacheFacade.put(keyMem,cachedDemoPenolesFacade);
				isFirst = Boolean.TRUE;
			}
		}
		
		if(isFirst) {
			// Registramos las entities 
			cachedDemoPenolesFacade.registerEJB(new Object[] { new Compania() });
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
