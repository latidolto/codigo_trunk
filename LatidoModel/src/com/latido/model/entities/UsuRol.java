package com.latido.model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the UsuRol database table.
 * 
 */
@Entity
@NamedQueries ({
@NamedQuery(name="UsuRol.findAll", query="SELECT u FROM UsuRol u"),
@NamedQuery(name="UsuRol.findByUserId", query="SELECT u FROM UsuRol u where u.id.idUsuario = :p_idUsuario"),
@NamedQuery(name="UsuRol.findByRolAndSys", query="SELECT u FROM UsuRol u where u.id.idSistema = :p_idSistema and u.id.idRol = :p_idRol")
})

public class UsuRol implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UsuRolPK id;
	@Transient
	private Rol rol;
	@Transient 
	private Usuario usuario;
	
	public UsuRol() {
	}

	public UsuRolPK getId() {
		return this.id;
	}

	public void setId(UsuRolPK id) {
		this.id = id;
	}

	/**
	 * @return the rol
	 */
	public Rol getRol() {
		return rol;
	}

	/**
	 * @param rol the rol to set
	 */
	public void setRol(Rol rol) {
		this.rol = rol;
	}

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}