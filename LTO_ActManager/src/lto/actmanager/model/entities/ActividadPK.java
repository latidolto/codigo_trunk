package lto.actmanager.model.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the actividad database table.
 * 
 */
@Embeddable
public class ActividadPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int idCompania;

	private int idArea;

	private int idProyecto;

	private int idActividad;

	public ActividadPK() {
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
	public int getIdActividad() {
		return this.idActividad;
	}
	public void setIdActividad(int idActividad) {
		this.idActividad = idActividad;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ActividadPK)) {
			return false;
		}
		ActividadPK castOther = (ActividadPK)other;
		return 
			(this.idCompania == castOther.idCompania)
			&& (this.idArea == castOther.idArea)
			&& (this.idProyecto == castOther.idProyecto)
			&& (this.idActividad == castOther.idActividad);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idCompania;
		hash = hash * prime + this.idArea;
		hash = hash * prime + this.idProyecto;
		hash = hash * prime + this.idActividad;
		
		return hash;
	}
}