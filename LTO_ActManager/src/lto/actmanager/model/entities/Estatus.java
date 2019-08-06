package lto.actmanager.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the estatus database table.
 * 
 */
@Entity
@NamedQuery(name="Estatus.findAll", query="SELECT e FROM Estatus e")
public class Estatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EstatusPK id;

	private int estatus;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecMod;

	private String nombre;

	private String usuCve;

	public Estatus() {
	}

	public EstatusPK getId() {
		return this.id;
	}

	public void setId(EstatusPK id) {
		this.id = id;
	}

	public int getEstatus() {
		return this.estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

	public Date getFecMod() {
		return this.fecMod;
	}

	public void setFecMod(Date fecMod) {
		this.fecMod = fecMod;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuCve() {
		return this.usuCve;
	}

	public void setUsuCve(String usuCve) {
		this.usuCve = usuCve;
	}

}