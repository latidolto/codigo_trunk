package com.latido.view.dao.security;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.latido.model.LatidoFacade;
import com.latido.model.entities.RolTarea;
import com.latido.model.entities.Tarea;
import com.latido.model.entities.UsuRol;
import com.latido.model.entities.Usuario;

public class RolResourceDAO {
	private static RolResourceDAO _RolResourceDAO;
	
	private int idSistema;
	private int idRol;
	private int idTarea;
	
	private RolResourceDAO() {
		
	}
	
	public static RolResourceDAO getInstance() {
		if(_RolResourceDAO == null)
			_RolResourceDAO = new RolResourceDAO();
		return _RolResourceDAO;
	}
	
	public List<Tarea> getRolTareasDisp(){
		List<Tarea> lt = null;
		String select = "Select tar.nombre,tar.url,tar.idTarea,tar.idMenu "
					  + " from Tarea tar "
				      + "Where tar.idTarea not in "
				      + "	( select idTarea from roltarea rt "
				      + "	  where rt.idSistema = ? "
				      + "	  and rt.idRol = ?  )";
		Query query = LatidoFacade.getInstance().getEM().createNativeQuery(select);
		query.setParameter(1, this.idSistema);
		query.setParameter(2, this.idRol);
		
		List<Object[]> tareas = query.getResultList();
		for (Object[] a : tareas) {
			if(lt == null)
				lt = new ArrayList<Tarea>();
			Tarea t = new Tarea();
			t.setNombre((String)a[0]);
			t.setUrl((String)a[1]);
			t.setIdTarea((Integer)a[2]);
			t.setIdMenu((Integer)a[3]);
			lt.add(t);
		}
		return lt;
	}
	
	public void deleteRolUsu(RolTarea ur) throws Exception{
		String delete = "Delete from roltarea where idTarea = ?  and idRol = ? and idSistema = ?";
		EntityTransaction trx = LatidoFacade.getInstance().getEM().getTransaction();
        trx.begin();
		Query query = LatidoFacade.getInstance().getEM().createNativeQuery(delete);
		query.setParameter(1, ur.getId().getIdTarea());
		query.setParameter(2, ur.getId().getIdRol());
		query.setParameter(3, ur.getId().getIdSistema());
		query.executeUpdate();
		trx.commit();
	}

	/**
	 * @return the idSistema
	 */
	public int getIdSistema() {
		return idSistema;
	}

	/**
	 * @param idSistema the idSistema to set
	 */
	public void setIdSistema(int idSistema) {
		this.idSistema = idSistema;
	}

	/**
	 * @return the idRol
	 */
	public int getIdRol() {
		return idRol;
	}

	/**
	 * @param idRol the idRol to set
	 */
	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	/**
	 * @return the idTarea
	 */
	public int getIdTarea() {
		return idTarea;
	}

	/**
	 * @param idTarea the idTarea to set
	 */
	public void setIdTarea(int idTarea) {
		this.idTarea = idTarea;
	}

}
