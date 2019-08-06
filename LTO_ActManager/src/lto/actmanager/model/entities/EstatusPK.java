package lto.actmanager.model.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the estatus database table.
 * 
 */
@Embeddable
public class EstatusPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int idCompania;

	private int idArea;

	private int idProyecto;

	private int idEstatus;

	public EstatusPK() {
	}
	public int getIdCompania() {
		return this.idCompania;
	}
	public void setIdCompania(int idCompania) {
		this.idCompania = idCompania;
	}
	public int getIdArea() {
		return this.idArea;
	}
	public void setIdArea(int idArea) {
		this.idArea = idArea;
	}
	public int getIdProyecto() {
		return this.idProyecto;
	}
	public void setIdProyecto(int idProyecto) {
		this.idProyecto = idProyecto;
	}
	public int getIdEstatus() {
		return this.idEstatus;
	}
	public void setIdEstatus(int idEstatus) {
		this.idEstatus = idEstatus;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof EstatusPK)) {
			return false;
		}
		EstatusPK castOther = (EstatusPK)other;
		return 
			(this.idCompania == castOther.idCompania)
			&& (this.idArea == castOther.idArea)
			&& (this.idProyecto == castOther.idProyecto)
			&& (this.idEstatus == castOther.idEstatus);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idCompania;
		hash = hash * prime + this.idArea;
		hash = hash * prime + this.idProyecto;
		hash = hash * prime + this.idEstatus;
		
		return hash;
	}
}