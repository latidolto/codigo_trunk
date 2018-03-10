package com.latido.view.dao.security;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.latido.model.LatidoFacade;
import com.latido.model.entities.UsuRol;
import com.latido.model.entities.Usuario;
import com.mysql.jdbc.PreparedStatement;

public class RolUserDAO {
	private static RolUserDAO _RolUserDAO;
	
	private int idSistema;
	private int idRol;
	private int idUsuario;
	
	private RolUserDAO () {
		
	}
	
	public static RolUserDAO getInstance() {
		if(_RolUserDAO == null)
			_RolUserDAO = new RolUserDAO();
		return _RolUserDAO;
	}
	
	public List<Usuario> getUsuariosNoRol() {
		List<Usuario> lu = null;
		// SELECT `idUsuario`, `clave`, `nombre`, `apellidoPaterno`, `apellidoMaterno`, `password`, `avatar`, `estatus`, `usuCve`, `fecMod`, `idSistema` FROM `latido_des`.`Usuario`;

		String select = "Select usu.idUsuario, usu.clave, usu.nombre, usu.apellidoPaterno, "
					  + "usu.apellidoMaterno, usu.password, usu.avatar, usu.estatus, usu.usuCve, "
					  + "usu.fecMod, usu.idSistema "
					  + " from Usuario usu "
				      + "Where usu.idUsuario not in "
				      + "	( select idUsuario from usurol ur "
				      + "	  where ur.idSistema = ? "
				      + "	  and ur.idRol = ?  )";
		Query query = LatidoFacade.getInstance().getEM().createNativeQuery(select);
		
		
		query.setParameter(1, this.idSistema);
		query.setParameter(2, this.idRol);
		
		List<Object[]> users = query.getResultList();
		 
		for (Object[] a : users) {
			if(lu == null)
				lu = new ArrayList<Usuario>();
			Usuario usu = new Usuario();
			usu.setIdUsuario((Integer)a[0]);
			usu.setClave((String)a[1]);
			usu.setNombre((String)a[2]);
			usu.setApellidoPaterno((String)a[3]);
			usu.setApellidoMaterno((String)a[4]);
			usu.setPassword((String)a[5]);
			usu.setAvatar((byte[])a[6]);
			usu.setEstatus((Integer)a[7]);
			usu.setUsuCve((String)a[8]);
			usu.setFecMod((Date)a[9]);
			usu.setIdSistema((Integer)a[10]);
		    lu.add(usu);
		}
		return lu;
	}
	
	public void deleteRolUsu(UsuRol ur) throws Exception{
		String delete = "Delete from usurol where idUsuario = ?  and idRol = ? and idSistema = ?";
		EntityTransaction trx = LatidoFacade.getInstance().getEM().getTransaction();
        trx.begin();
		Query query = LatidoFacade.getInstance().getEM().createNativeQuery(delete);
		query.setParameter(1, ur.getId().getIdUsuario());
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
	 * @return the idUsuario
	 */
	public int getIdUsuario() {
		return idUsuario;
	}

	/**
	 * @param idUsuario the idUsuario to set
	 */
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
}
