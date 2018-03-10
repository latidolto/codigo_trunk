package com.latido.model.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the UsuRol database table.
 * 
 */
@Embeddable
public class UsuRolPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private Integer idSistema;

	@Column(insertable=false, updatable=false)
	private Integer idUsuario;

	@Column(insertable=false, updatable=false)
	private Integer idRol;

	public UsuRolPK() {
	}
	public Integer getIdSistema() {
		return this.idSistema;
	}
	public void setIdSistema(Integer idSistema) {
		this.idSistema = idSistema;
	}
	public Integer getIdUsuario() {
		return this.idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Integer getIdRol() {
		return this.idRol;
	}
	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UsuRolPK)) {
			return false;
		}
		UsuRolPK castOther = (UsuRolPK)other;
		return 
			(this.idSistema == castOther.idSistema)
			&& (this.idUsuario == castOther.idUsuario)
			&& (this.idRol == castOther.idRol);
	}

	public int hashCode() {
		final int prime = 31;
		long hash = 17;
		hash = hash * prime + this.idSistema;
		hash = hash * prime + this.idUsuario;
		hash = hash * prime + this.idRol;
		
		return Integer.valueOf(hash +"");
	}
}