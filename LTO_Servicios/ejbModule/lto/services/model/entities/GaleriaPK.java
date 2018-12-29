package lto.services.model.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the galeria database table.
 * 
 */
@Embeddable
public class GaleriaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_galeria")
	private int idGaleria;

	@Column(name="id_servicio", insertable=false, updatable=false)
	private int idServicio;

	public GaleriaPK() {
	}
	public int getIdGaleria() {
		return this.idGaleria;
	}
	public void setIdGaleria(int idGaleria) {
		this.idGaleria = idGaleria;
	}
	public int getIdServicio() {
		return this.idServicio;
	}
	public void setIdServicio(int idServicio) {
		this.idServicio = idServicio;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof GaleriaPK)) {
			return false;
		}
		GaleriaPK castOther = (GaleriaPK)other;
		return 
			(this.idGaleria == castOther.idGaleria)
			&& (this.idServicio == castOther.idServicio);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idGaleria;
		hash = hash * prime + this.idServicio;
		
		return hash;
	}
}