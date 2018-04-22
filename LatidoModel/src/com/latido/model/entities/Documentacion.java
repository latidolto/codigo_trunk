package com.latido.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the Documentacion database table.
 * 
 */
@Entity
@NamedQuery(name="Documentacion.findAll", query="SELECT d FROM Documentacion d")
public class Documentacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idDocumentacion;

	@Lob
	private byte[] archivo;

	private int estatus;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecMod;

	private String mime;

	private String nombre;

	private int prospecto_idProspecto;

	private String usuCve;

	public Documentacion() {
	}

	public int getIdDocumentacion() {
		return this.idDocumentacion;
	}

	public void setIdDocumentacion(int idDocumentacion) {
		this.idDocumentacion = idDocumentacion;
	}

	public byte[] getArchivo() {
		return this.archivo;
	}

	public void setArchivo(byte[] archivo) {
		this.archivo = archivo;
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

	public String getMime() {
		return this.mime;
	}

	public void setMime(String mime) {
		this.mime = mime;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getProspecto_idProspecto() {
		return this.prospecto_idProspecto;
	}

	public void setProspecto_idProspecto(int prospecto_idProspecto) {
		this.prospecto_idProspecto = prospecto_idProspecto;
	}

	public String getUsuCve() {
		return this.usuCve;
	}

	public void setUsuCve(String usuCve) {
		this.usuCve = usuCve;
	}

}