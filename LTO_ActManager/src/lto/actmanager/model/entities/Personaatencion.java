package lto.actmanager.model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the personaatencion database table.
 * 
 */
@Entity
@NamedQuery(name="Personaatencion.findAll", query="SELECT p FROM Personaatencion p")
public class Personaatencion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PersonaatencionPK id;

	public Personaatencion() {
	}

	public PersonaatencionPK getId() {
		return this.id;
	}

	public void setId(PersonaatencionPK id) {
		this.id = id;
	}

}