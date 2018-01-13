package com.latido.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the Tarea database table.
 * 
 */
@Entity
@NamedQuery(name="Tarea.findAll", query="SELECT t FROM Tarea t")
public class Tarea implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TareaPK id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecMod;

	private String nombre;

	private String url;

	private String urlAyuda;

	private String usuCve;

	public Tarea() {
	}

	public TareaPK getId() {
		return this.id;
	}

	public void setId(TareaPK id) {
		this.id = id;
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

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrlAyuda() {
		return this.urlAyuda;
	}

	public void setUrlAyuda(String urlAyuda) {
		this.urlAyuda = urlAyuda;
	}

	public String getUsuCve() {
		return this.usuCve;
	}

	public void setUsuCve(String usuCve) {
		this.usuCve = usuCve;
	}

}