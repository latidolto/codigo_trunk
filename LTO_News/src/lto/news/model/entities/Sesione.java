package lto.news.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sesiones database table.
 * 
 */
@Entity
@Table(name="sesiones")
@NamedQuery(name="Sesione.findAll", query="SELECT s FROM Sesione s")
public class Sesione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	private String usaurio;

	public Sesione() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getUsaurio() {
		return this.usaurio;
	}

	public void setUsaurio(String usaurio) {
		this.usaurio = usaurio;
	}

}