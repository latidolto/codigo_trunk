package lto.actmanager.model.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the persona database table.
 * 
 */
@Embeddable
public class PersonaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_persona")
	private int idPersona;

	@Column(name="id_horario")
	private int idHorario;

	public PersonaPK() {
	}
	public int getIdHorario() {
		return this.idHorario;
	}
	public void setIdHorario(int idHorario) {
		this.idHorario = idHorario;
	}
	public int getIdPersona() {
		return this.idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PersonaPK)) {
			return false;
		}
		PersonaPK castOther = (PersonaPK)other;
		return 
			(this.idPersona == castOther.idPersona)
			&& (this.idHorario == castOther.idHorario)
			&& (this.idPersona == castOther.idPersona);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idPersona;
		hash = hash * prime + this.idHorario;
		hash = hash * prime + this.idPersona;
		
		return hash;
	}
}