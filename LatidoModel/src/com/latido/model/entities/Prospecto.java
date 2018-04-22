package com.latido.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the prospecto database table.
 * 
 */
@Entity
@Table(name="prospecto")
@NamedQueries({
@NamedQuery(name="Prospecto.findAll", query="SELECT p FROM Prospecto p"),
@NamedQuery(name="Prospecto.findAllActive", query="SELECT p FROM Prospecto p WHERE p.estatus <>0")})
public class Prospecto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idProspecto;

	private String contacto;

	private int estatus;

	@Temporal(TemporalType.DATE)
	private Date fecMod;

	private String nombre;

	private String nombreOrganizacional;

	private String telefono1;

	private String telefono2;

	private String usuCve;

	public Prospecto() {
	}

	public int getIdProspecto() {
		return this.idProspecto;
	}

	public void setIdProspecto(int idProspecto) {
		this.idProspecto = idProspecto;
	}

	public String getContacto() {
		return this.contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
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

	public String getNombreOrganizacional() {
		return this.nombreOrganizacional;
	}

	public void setNombreOrganizacional(String nombreOrganizacional) {
		this.nombreOrganizacional = nombreOrganizacional;
	}

	public String getTelefono1() {
		return this.telefono1;
	}

	public void setTelefono1(String telefono1) {
		this.telefono1 = telefono1;
	}

	public String getTelefono2() {
		return this.telefono2;
	}

	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
	}

	public String getUsuCve() {
		return this.usuCve;
	}

	public void setUsuCve(String usuCve) {
		this.usuCve = usuCve;
	}
}