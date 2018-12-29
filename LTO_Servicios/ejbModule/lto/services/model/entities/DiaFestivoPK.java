package lto.services.model.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the dia_festivo database table.
 * 
 */
@Embeddable
public class DiaFestivoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_dias_festivos")
	private int idDiasFestivos;

	@Column(name="id_calendario", insertable=false, updatable=false)
	private int idCalendario;

	public DiaFestivoPK() {
	}
	public int getIdDiasFestivos() {
		return this.idDiasFestivos;
	}
	public void setIdDiasFestivos(int idDiasFestivos) {
		this.idDiasFestivos = idDiasFestivos;
	}
	public int getIdCalendario() {
		return this.idCalendario;
	}
	public void setIdCalendario(int idCalendario) {
		this.idCalendario = idCalendario;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DiaFestivoPK)) {
			return false;
		}
		DiaFestivoPK castOther = (DiaFestivoPK)other;
		return 
			(this.idDiasFestivos == castOther.idDiasFestivos)
			&& (this.idCalendario == castOther.idCalendario);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idDiasFestivos;
		hash = hash * prime + this.idCalendario;
		
		return hash;
	}
}