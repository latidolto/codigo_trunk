package com.latido.model;

import com.latido.model.entities.Usuario;

public class LatidoFacade extends LatidoFacadeUtil {
	private static LatidoFacade _demoPenolesFacade;
	
	private LatidoFacade() {
		super("LatidoModel");
	}
	/**
	 * Obtener instacia de <b>Facade</b> local con sus Entidades ya registradas
	 * <br/><br/>
	 * Registro de las entidades a usar en la aplicacion e implementar sus metodos mas simples
	 * si se requiere hacer queries o transacciones mas complejas usar metodos internos detro 
	 * de esta clase implementados las entidades necesarias o queries directos
	 * */
	public static LatidoFacade getInstance() {
		if(_demoPenolesFacade == null) {
			_demoPenolesFacade = new LatidoFacade();
			// Entidades
			_demoPenolesFacade.registerEJB(
					new Object[] { new Usuario(),
								   
									});
		}
		return _demoPenolesFacade;
	}
}
