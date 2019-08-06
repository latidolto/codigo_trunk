package lto.actmanager.model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the actividadpersona database table.
 * 
 */
@Entity
@NamedQuery(name="Actividadpersona.findAll", query="SELECT a FROM Actividadpersona a")
public class Actividadpersona implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ActividadpersonaPK id;

	public Actividadpersona() {
	}

	public ActividadpersonaPK getId() {
		return this.id;
	}

	public void setId(ActividadpersonaPK id) {
		this.id = id;
	}

}