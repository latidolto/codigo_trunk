package lto.services.model.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the dia_semana database table.
 * 
 */
@Embeddable
public class DiaSemanaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_dias_semana")
	private int idDiasSemana;

	@Column(name="id_calendario", insertable=false, updatable=false)
	private int idCalendario;

	public DiaSemanaPK() {
	}
	public int getIdDiasSemana() {
		return this.idDiasSemana;
	}
	public void setIdDiasSemana(int idDiasSemana) {
		this.idDiasSemana = idDiasSemana;
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
		if (!(other instanceof DiaSemanaPK)) {
			return false;
		}
		DiaSemanaPK castOther = (DiaSemanaPK)other;
		return 
			(this.idDiasSemana == castOther.idDiasSemana)
			&& (this.idCalendario == castOther.idCalendario);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idDiasSemana;
		hash = hash * prime + this.idCalendario;
		
		return hash;
	}
}