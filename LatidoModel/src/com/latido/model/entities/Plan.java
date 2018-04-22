package com.latido.model.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


/**
 * The persistent class for the plan database table.
 * 
 */
@Entity
@Table(name="plan")
@NamedQueries({
@NamedQuery(name="Plan.findAll", query="SELECT p FROM Plan p"),
@NamedQuery(name="Plan.findAllActive", query="SELECT p FROM Plan p WHERE p.estatus<>0")})
public class Plan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idPlan;

	private int estatus;

	private Date fecMod;

	private String nombre;

	private int prospecto_idProspecto;

	private String usuCve;

	private int version;

	public Plan() {
	}

	public int getIdPlan() {
		return this.idPlan;
	}

	public void setIdPlan(int idPlan) {
		this.idPlan = idPlan;
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

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}