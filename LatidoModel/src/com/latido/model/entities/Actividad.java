package com.latido.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the actividad database table.
 * 
 */
@Entity
@Table(name="Actividades")
@NamedQueries({
	@NamedQuery(name="Actividad.findAll", query="SELECT a FROM Actividad a"),
	@NamedQuery(name="Actividad.findAllActive", query="SELECT a FROM Actividad a WHERE a.estatus<>0")
})
public class Actividad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idActividades;

	private int estatus;

	@Temporal(TemporalType.DATE)
	private Date fechaFin;

	@Temporal(TemporalType.DATE)
	private Date fechaInicio;

	@Temporal(TemporalType.DATE)
	private Date fecMod;

	private String nombre;

	private int plan_idPlan;

	private String usuCve;

	public Actividad() {
	}

	public int getIdActividades() {
		return this.idActividades;
	}

	public void setIdActividades(int idActividades) {
		this.idActividades = idActividades;
	}

	public int getEstatus() {
		return this.estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
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

	public int getPlan_idPlan() {
		return this.plan_idPlan;
	}

	public void setPlan_idPlan(int plan_idPlan) {
		this.plan_idPlan = plan_idPlan;
	}

	public String getUsuCve() {
		return this.usuCve;
	}

	public void setUsuCve(String usuCve) {
		this.usuCve = usuCve;
	}

}