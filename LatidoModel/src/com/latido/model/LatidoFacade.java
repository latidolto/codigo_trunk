package com.latido.model;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.latido.model.entities.Almacen;
import com.latido.model.entities.AlmacenPK;
import com.latido.model.entities.Articulo;
import com.latido.model.entities.Articulocategoria;
import com.latido.model.entities.Categoria;
import com.latido.model.entities.Inventario;
import com.latido.model.entities.Menu;
import com.latido.model.entities.Multivaluada;
import com.latido.model.entities.Proveedor;
import com.latido.model.entities.Rol;
import com.latido.model.entities.RolTarea;
import com.latido.model.entities.Sistema;
import com.latido.model.entities.Tarea;
import com.latido.model.entities.UsuRol;
import com.latido.model.entities.Usuario;
import com.latido.model.views.ViewArticuloCategoria;

public class LatidoFacade extends LatidoFacadeUtil {
	private static LatidoFacade _latidoFacade;
	private List<Menu> menu;
	private String keyMem;
	private Map cacheFacade;

	private LatidoFacade() {
		super("LatidoModel");
	}
	
	private LatidoFacade(String keyMem) {
		super("LatidoModel");
		System.out.println("New instance facade : "+keyMem);
		this.keyMem = keyMem;
	}
	/**
	 * Obtener instacia de <b>Facade</b> local con sus Entidades ya registradas
	 * <br/>
	 * <br/>
	 * Registro de las entidades a usar en la aplicacion e implementar sus metodos
	 * mas simples si se requiere hacer queries o transacciones mas complejas usar
	 * metodos internos detro de esta clase implementados las entidades necesarias o
	 * queries directos
	 */
	public static LatidoFacade getInstance() {
		if (_latidoFacade == null) {
			_latidoFacade = new LatidoFacade();
			// Entidades
			_latidoFacade.registerEJB(new Object[] { new Usuario(), new UsuRol(), new Rol(), new Sistema(),
					new Menu(), new Tarea(), new RolTarea(), new Categoria(), new Proveedor(), new Multivaluada(),
					new Almacen(), new AlmacenPK(), new Articulo(), new Articulocategoria(),
					new ViewArticuloCategoria(), new Inventario() });
		}
		return _latidoFacade;
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
	public static LatidoFacade getInstance(String keyMem) {
		LatidoFacade cachedFacade = null;
		Boolean isFirst = Boolean.FALSE;
		if(_latidoFacade == null) {
			_latidoFacade = new LatidoFacade();
			_latidoFacade.cacheFacade = new HashMap();
			cachedFacade = new LatidoFacade();
			cachedFacade.setKeyMem(keyMem);
			_latidoFacade.cacheFacade.put(keyMem,cachedFacade); 
			isFirst = Boolean.TRUE;
		} else {
			if(_latidoFacade.cacheFacade.get(keyMem) != null) {
				cachedFacade = (LatidoFacade) _latidoFacade.cacheFacade.get(keyMem);
				isFirst = Boolean.FALSE;
			} else {
				cachedFacade = new LatidoFacade();
				cachedFacade.setKeyMem(keyMem);
				_latidoFacade.cacheFacade.put(keyMem,cachedFacade);
				isFirst = Boolean.TRUE;
			}
		}
		
		if(isFirst) {
			// Registramos las entities 
			cachedFacade.registerEJB(new Object[] { new Usuario(), new UsuRol(), new Rol(), new Sistema(),
					new Menu(), new Tarea(), new RolTarea(), new Categoria(), new Proveedor(), new Multivaluada(),
					new Almacen(), new AlmacenPK(), new Articulo(), new Articulocategoria(),
					new ViewArticuloCategoria(), new Inventario() });
		}
		return cachedFacade;
	}
	
	/***SECURITY SECTION************************************************************************************************************/
	/**Obtener el usuario y sus datos adicionales en base al <b>username</b>*/
	public Usuario getfullUserByUsername(String username){
		Usuario user = null;
		Map params = new HashMap();
		params.put("p_username", username);
		List usuarios = super.getListFromParameters(Usuario.class.getName(), "findUserByUsername", params);
		Boolean isValid = Boolean.FALSE;
		if (usuarios != null) {
			if (usuarios.size() > 0) {
				user = (Usuario) usuarios.get(0);
				params = new HashMap();
				params.put("p_idUsuario", user.getIdUsuario());
				List l_ur = super.getListFromParameters(UsuRol.class.getName(), "findByUserId", params);
				if (l_ur != null) {
					for (Object obj : l_ur) {
						UsuRol ur = (UsuRol) obj;
						params = new HashMap();
						params.put("p_idRol", ur.getId().getIdRol());
						params.put("p_idSistema", ur.getId().getIdSistema());
						List lr = super.getListFromParameters(Rol.class.getName(), "findById", params);
						if (lr != null) {
							Rol r = new Rol();
							r.setIdRol(((Rol) lr.get(0)).getIdRol());
							r.setIdSistema(((Rol) lr.get(0)).getIdSistema());
							r.setNombre(((Rol) lr.get(0)).getNombre());
							ur.setRol(r);
						}
					}
					user.setUsuRol(l_ur);
				}
			}
		}
		return user;
	}

	public boolean validateUserResource(Integer idsis, String nameRes, String usuCve) {
		Boolean isValid = Boolean.FALSE;
		String select = "Select * from vusuarioasignacion where clave = ? and tar_nombre = ? and idSistema = ?";
		Query query = this.getEM().createNativeQuery(select);
		query.setParameter(1, usuCve);
		query.setParameter(2, nameRes);
		query.setParameter(3, idsis);
		List<Object[]> res = query.getResultList();
		if (res != null)
			if (res.size() > 0)
				isValid = Boolean.TRUE;
		return isValid;
	}

	/*******************************************************************************************************************************/
	/***MENU SECTION****************************************************************************************************************/
	public List<Menu> getMenu(Boolean refresh, int idSistema){
		if(  menu == null || refresh  ) {
			menu = new ArrayList<Menu>();
			TypedQuery query = this.getEM().createNamedQuery("Menu.findMenuBySistem", Menu.class);
			query.setParameter("p_idSistema", idSistema);
			menu = query.getResultList();

			/////// LEVEL 1////////
			for (Menu m1 : menu) {
				// MENUS //
				List<Menu> lm1 = new ArrayList<Menu>();
				query = this.getEM().createNamedQuery("Menu.findMenuChildren", Menu.class);
				query.setParameter("p_idSistema", idSistema);
				query.setParameter("p_idMenuPadre", m1.getIdMenu());
				lm1 = query.getResultList();
				/////// LEVEL 2////////
				for (Menu m2 : lm1) {
					// MENUS //
					List<Menu> lm2 = new ArrayList<Menu>();
					query = this.getEM().createNamedQuery("Menu.findMenuChildren", Menu.class);
					query.setParameter("p_idSistema", idSistema);
					query.setParameter("p_idMenuPadre", m2.getIdMenu());
					lm2 = query.getResultList();
					/////// LEVEL 3////////
					for (Menu m3 : lm2) {
						// TAREAS //
						List<Tarea> lt3 = new ArrayList<Tarea>();
						query = this.getEM().createNamedQuery("Tarea.findTareaByMenu", Tarea.class);
						query.setParameter("p_idSistema", idSistema);
						query.setParameter("p_idMenu", m3.getIdMenu());
						lt3 = query.getResultList();
						m3.setTareaChildren(lt3);
					}
					m2.setMenuChildren(lm2);
					// TAREAS //
					List<Tarea> lt2 = new ArrayList<Tarea>();
					query = this.getEM().createNamedQuery("Tarea.findTareaByMenu", Tarea.class);
					query.setParameter("p_idSistema", idSistema);
					query.setParameter("p_idMenu", m2.getIdMenu());
					lt2 = query.getResultList();
					m2.setTareaChildren(lt2);
				}
				m1.setMenuChildren(lm1);
				// TAREAS //
				List<Tarea> lt1 = new ArrayList<Tarea>();
				query = this.getEM().createNamedQuery("Tarea.findTareaByMenu", Tarea.class);
				query.setParameter("p_idSistema", idSistema);
				query.setParameter("p_idMenu", m1.getIdMenu());
				lt1 = query.getResultList();
				m1.setTareaChildren(lt1);
			}

			// TODO Make menu
			/*
			 * List<Tarea> lt = new ArrayList<Tarea>(); Tarea t = new Tarea();
			 * t.setNombre("Tarea 1"); lt.add(t);
			 * 
			 * Menu m = new Menu(); m.setEtiqueta("Menu 1");
			 * 
			 * List<Menu> lm = new ArrayList<Menu>(); Menu sbm = new Menu();
			 * sbm.setEtiqueta("SUB Menu 1"); sbm.setTareaChildren(lt);
			 * 
			 * List<Menu> lm2 = new ArrayList<Menu>(); Menu sbm2 = new Menu();
			 * sbm2.setEtiqueta("SUB Menu 2"); sbm2.setTareaChildren(lt); lm2.add(sbm2);
			 * 
			 * sbm.setMenuChildren(lm2);
			 * 
			 * 
			 * lm.add(sbm); m.setMenuChildren(lm);
			 * 
			 * 
			 * m.setTareaChildren(lt);
			 * 
			 * menu.add(m); m = new Menu(); m.setEtiqueta("Menu 2"); m.setTareaChildren(lt);
			 * menu.add(m);
			 */
		}
		return menu;
	}
	/*******************************************************************************************************************************/
	/**
	 * @return the keyMem
	 */
	public String getKeyMem() {
		return keyMem;
	}
	/**
	 * @param keyMem the keyMem to set
	 */
	public void setKeyMem(String keyMem) {
		this.keyMem = keyMem;
	}

}
