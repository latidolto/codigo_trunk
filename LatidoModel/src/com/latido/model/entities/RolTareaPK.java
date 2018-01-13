package com.latido.model.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the RolTarea database table.
 * 
 */
@Embeddable
public class RolTareaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int idTarea;

	@Column(insertable=false, updatable=false)
	private int idMenu;

	@Column(insertable=false, updatable=false)
	private int idSistema;

	@Column(insertable=false, updatable=false)
	private int idRol;

	public RolTareaPK() {
	}
	public int getIdTarea() {
		return this.idTarea;
	}
	public void setIdTarea(int idTarea) {
		this.idTarea = idTarea;
	}
	public int getIdMenu() {
		return this.idMenu;
	}
	public void setIdMenu(int idMenu) {
		this.idMenu = idMenu;
	}
	public int getIdSistema() {
		return this.idSistema;
	}
	public void setIdSistema(int idSistema) {
		this.idSistema = idSistema;
	}
	public int getIdRol() {
		return this.idRol;
	}
	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RolTareaPK)) {
			return false;
		}
		RolTareaPK castOther = (RolTareaPK)other;
		return 
			(this.idTarea == castOther.idTarea)
			&& (this.idMenu == castOther.idMenu)
			&& (this.idSistema == castOther.idSistema)
			&& (this.idRol == castOther.idRol);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idTarea;
		hash = hash * prime + this.idMenu;
		hash = hash * prime + this.idSistema;
		hash = hash * prime + this.idRol;
		
		return hash;
	}
}