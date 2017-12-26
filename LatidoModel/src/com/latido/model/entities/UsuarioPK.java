package com.latido.model.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the Usuario database table.
 * 
 */
@Embeddable
public class UsuarioPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int idUsuario;

	@Column(insertable=false, updatable=false)
	private int idSistema;

	public UsuarioPK() {
	}
	public int getIdUsuario() {
		return this.idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getIdSistema() {
		return this.idSistema;
	}
	public void setIdSistema(int idSistema) {
		this.idSistema = idSistema;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UsuarioPK)) {
			return false;
		}
		UsuarioPK castOther = (UsuarioPK)other;
		return 
			(this.idUsuario == castOther.idUsuario)
			&& (this.idSistema == castOther.idSistema);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idUsuario;
		hash = hash * prime + this.idSistema;
		
		return hash;
	}
}