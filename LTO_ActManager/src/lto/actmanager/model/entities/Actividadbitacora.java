package lto.actmanager.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the actividadbitacora database table.
 * 
 */
@Entity
@NamedQuery(name="Actividadbitacora.findAll", query="SELECT a FROM Actividadbitacora a")
public class Actividadbitacora implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ActividadbitacoraPK id;

	private int estatus;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecMov;

	private String usuCve;

	public Actividadbitacora() {
	}

	public ActividadbitacoraPK getId() {
		return this.id;
	}

	public void setId(ActividadbitacoraPK id) {
		this.id = id;
	}

	public int getEstatus() {
		return this.estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

	public Date getFecMov() {
		return this.fecMov;
	}

	public void setFecMov(Date fecMov) {
		this.fecMov = fecMov;
	}

	public String getUsuCve() {
		return this.usuCve;
	}

	public void setUsuCve(String usuCve) {
		this.usuCve = usuCve;
	}

}