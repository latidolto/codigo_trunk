package com.latido.model.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the Rol database table.
 * 
 */
@Embeddable
public class RolPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private Long idRol;

	@Column(insertable=false, updatable=false)
	private Long idSistema;

	public RolPK() {
	}
	public Long getIdRol() {
		return this.idRol;
	}
	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}
	public Long getIdSistema() {
		return this.idSistema;
	}
	public void setIdSistema(Long idSistema) {
		this.idSistema = idSistema;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RolPK)) {
			return false;
		}
		RolPK castOther = (RolPK)other;
		return 
			(this.idRol == castOther.idRol)
			&& (this.idSistema == castOther.idSistema);
	}

	public int hashCode() {
		final int prime = 31;
		long hash = 17;
		hash = hash * prime + this.idRol;
		hash = hash * prime + this.idSistema;
		
		return Integer.valueOf(hash +"");
	}
}