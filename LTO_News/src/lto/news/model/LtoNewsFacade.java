package lto.news.model;

import java.util.HashMap;
import java.util.Map;

import com.latido.model.LatidoFacadeUtil;

import lto.news.model.entities.Post;

public class LtoNewsFacade extends LatidoFacadeUtil{
	private static LtoNewsFacade ltoNews;
	private static final String persistenceUnitName = "LTO_News";
	private String keyMem;
	private Map<String, LtoNewsFacade> cacheFacade;

	protected LtoNewsFacade() {
		super(persistenceUnitName);
	}

	public LtoNewsFacade(String keyMem) {
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
	public static LtoNewsFacade getInstance(String keyMem) {
		LtoNewsFacade cachedDemoPenolesFacade = null;
		Boolean isFirst = Boolean.FALSE;
		if(ltoNews == null) {
			ltoNews = new LtoNewsFacade();
			ltoNews.cacheFacade = new HashMap<String, LtoNewsFacade>();
			cachedDemoPenolesFacade = new LtoNewsFacade();
			cachedDemoPenolesFacade.setKeyMem(keyMem);
			ltoNews.cacheFacade.put(keyMem,cachedDemoPenolesFacade); 
			isFirst = Boolean.TRUE;
		} else {
			if(ltoNews.cacheFacade.get(keyMem) != null) {
				cachedDemoPenolesFacade = ltoNews.cacheFacade.get(keyMem);
				isFirst = Boolean.FALSE;
			} else {
				cachedDemoPenolesFacade = new LtoNewsFacade();
				cachedDemoPenolesFacade.setKeyMem(keyMem);
				ltoNews.cacheFacade.put(keyMem,cachedDemoPenolesFacade);
				isFirst = Boolean.TRUE;
			}
		}
		
		if(isFirst) {
			// Registramos las entities 
			cachedDemoPenolesFacade.registerEJB(new Object[] { new Post() });
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
