package lto.actmanager.model.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the area database table.
 * 
 */
@Embeddable
public class AreaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int idArea;

	private int idCompania;

	public AreaPK() {
	}
	public int getIdArea() {
		return this.idArea;
	}
	public void setIdArea(int idArea) {
		this.idArea = idArea;
	}
	public int getIdCompania() {
		return this.idCompania;
	}
	public void setIdCompania(int idCompania) {
		this.idCompania = idCompania;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AreaPK)) {
			return false;
		}
		AreaPK castOther = (AreaPK)other;
		return 
			(this.idArea == castOther.idArea)
			&& (this.idCompania == castOther.idCompania);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idArea;
		hash = hash * prime + this.idCompania;
		
		return hash;
	}
}