package lto.healthwell.model;

import java.util.HashMap;
import java.util.Map;

import com.latido.model.LatidoFacadeUtil;

import lto.healthwell.model.entities.Area;
import lto.healthwell.model.entities.AvisoPrivacidad;
import lto.healthwell.model.entities.GoDomicilio;
import lto.healthwell.model.entities.GrupoOrganizacional;

public class LtoHealthwellFacade extends LatidoFacadeUtil{
	private static LtoHealthwellFacade ltoHealthwell;
	private static final String persistenceUnitName = "LTO_HealthwellModel";
	private String keyMem;
	private Map<String, LtoHealthwellFacade> cacheFacade;
	
	protected LtoHealthwellFacade() {
		super(persistenceUnitName);
	}
	
	public LtoHealthwellFacade(String keyMem) {
		super(persistenceUnitName);
		this.keyMem = keyMem;
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
	public static LtoHealthwellFacade getInstance(String keyMem) {
		LtoHealthwellFacade cachedHealthwellFacade = null;
		Boolean isFirst = Boolean.FALSE;
		if(ltoHealthwell == null) {
			ltoHealthwell = new LtoHealthwellFacade();
			ltoHealthwell.cacheFacade = new HashMap<String, LtoHealthwellFacade>();
			cachedHealthwellFacade = new LtoHealthwellFacade();
			cachedHealthwellFacade.setKeyMem(keyMem);
			ltoHealthwell.cacheFacade.put(keyMem,cachedHealthwellFacade); 
			isFirst = Boolean.TRUE;
		} else {
			if(ltoHealthwell.cacheFacade.get(keyMem) != null) {
				cachedHealthwellFacade = ltoHealthwell.cacheFacade.get(keyMem);
				isFirst = Boolean.FALSE;
			} else {
				cachedHealthwellFacade = new LtoHealthwellFacade();
				cachedHealthwellFacade.setKeyMem(keyMem);
				ltoHealthwell.cacheFacade.put(keyMem,cachedHealthwellFacade);
				isFirst = Boolean.TRUE;
			}
		}
		
		if(isFirst) {
			// Registramos las entities 
			cachedHealthwellFacade.registerEJB(new Object[] { new GrupoOrganizacional(),
															  new GoDomicilio(), 
															  new AvisoPrivacidad(),
															  new Area()
															});
		}
		return cachedHealthwellFacade;
	}
	
	public String getKeyMem() {
		return keyMem;
	}

	public void setKeyMem(String keyMem) {
		this.keyMem = keyMem;
	}
}
