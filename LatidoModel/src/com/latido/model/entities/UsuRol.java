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
@NamedQuery(name="UsuRol.findByUserId", query="SELECT u FROM UsuRol u where u.id.idUsuario = :p_idUsuario")
})

public class UsuRol implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UsuRolPK id;
	@Transient
	private Rol rol;
	
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

}