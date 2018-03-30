package com.latido.model.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the almacen database table.
 * 
 */
@Embeddable
public class AlmacenPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_almacen")
	private int idAlmacen;

	@Column(insertable=false, updatable=false)
	private int sistema_idSistema;

	public AlmacenPK() {
	}
	public int getIdAlmacen() {
		return this.idAlmacen;
	}
	public void setIdAlmacen(int idAlmacen) {
		this.idAlmacen = idAlmacen;
	}
	public int getSistema_idSistema() {
		return this.sistema_idSistema;
	}
	public void setSistema_idSistema(int sistema_idSistema) {
		this.sistema_idSistema = sistema_idSistema;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AlmacenPK)) {
			return false;
		}
		AlmacenPK castOther = (AlmacenPK)other;
		return 
			(this.idAlmacen == castOther.idAlmacen)
			&& (this.sistema_idSistema == castOther.sistema_idSistema);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idAlmacen;
		hash = hash * prime + this.sistema_idSistema;
		
		return hash;
	}
}