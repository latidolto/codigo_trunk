package com.latido.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.latido.model.entities.Menu;
import com.latido.model.entities.Rol;
import com.latido.model.entities.Sistema;
import com.latido.model.entities.Tarea;
import com.latido.model.entities.UsuRol;
import com.latido.model.entities.Usuario;

public class LatidoFacade extends LatidoFacadeUtil {
	private static LatidoFacade _demoPenolesFacade;
	private List<Menu> menu;
	
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
								   new UsuRol(),
								   new Rol(),
								   new Sistema()
									});
		}
		return _demoPenolesFacade;
	}
	
	/***SECURITY SECTION************************************************************************************************************/
	/**Obtener el usuario y sus datos adicionales en base al <b>username</b>*/
	public Usuario getfullUserByUsername(String username){
		Usuario user = null;
		Map params = new HashMap();
		params.put("p_username", username);
		List usuarios = super.getListFromParameters(Usuario.class.getName(), "findUserByUsername", params);
		Boolean isValid = Boolean.FALSE;
		if( usuarios != null) {
			if( usuarios.size() > 0) {
				user = (Usuario) usuarios.get(0);
				params = new HashMap();
				params.put("p_idUsuario", user.getIdUsuario());
				List l_ur = super.getListFromParameters(UsuRol.class.getName(), "findByUserId", params);
				if(l_ur != null) {
					for(Object obj : l_ur) {
						UsuRol ur = (UsuRol)obj;
						params = new HashMap();
						params.put("p_idRol", ur.getId().getIdRol());
						params.put("p_idSistema", ur.getId().getIdSistema());
						List lr = super.getListFromParameters(Rol.class.getName(), "findById", params);
						if(lr != null) {
							Rol r = new Rol();
							r.setId( ((Rol)lr.get(0)).getId() );
							r.setNombre( ((Rol)lr.get(0)).getNombre() );
							ur.setRol(r);
						}
					}
					user.setUsuRol(l_ur);
				}
			}
		}
		return user;
	}
	/*******************************************************************************************************************************/
	/***MENU SECTION****************************************************************************************************************/
	public List<Menu> getMenu(Boolean refresh){
		if(menu == null || refresh) {
			menu = new ArrayList<Menu>();
			// TODO Make menu
			List<Tarea> lt = new ArrayList<Tarea>();
			Tarea t = new Tarea();
			t.setNombre("Tarea 1");
			lt.add(t);
			
			Menu m = new Menu();
			m.setEtiqueta("Menu 1");
			
			List<Menu> lm = new ArrayList<Menu>();
			Menu sbm = new Menu();
			sbm.setEtiqueta("SUB Menu 1");
			sbm.setTareaChildren(lt);
			
			List<Menu> lm2 = new ArrayList<Menu>();
			Menu sbm2 = new Menu();
			sbm2.setEtiqueta("SUB Menu 2");
			sbm2.setTareaChildren(lt);
			lm2.add(sbm2);
			
			sbm.setMenuChildren(lm2);
			
			
			lm.add(sbm);
			m.setMenuChildren(lm);
			
			
			m.setTareaChildren(lt);
			
			menu.add(m);
			m = new Menu();
			m.setEtiqueta("Menu 2");
			m.setTareaChildren(lt);
			menu.add(m);
		}
		return menu;
	}
	/*******************************************************************************************************************************/
	
}
