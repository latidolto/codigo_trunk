package com.latido.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the salida database table.
 * 
 */
@Entity
@NamedQuery(name="Salida.findAll", query="SELECT s FROM Salida s")
public class Salida implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idSalida;

	private int cantidad;

	private int estatus;

	private Timestamp fecha;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecMod;

	private String usuCve;

	//bi-directional many-to-one association to Articulo
	@ManyToOne
	@JoinColumn(name="Articulo_idArticulo")
	private Articulo articulo;

	//bi-directional many-to-one association to Inventario
	@ManyToOne
	@JoinColumn(name="Inventario_idInventario")
	private Inventario inventario;

	public Salida() {
	}

	public int getIdSalida() {
		return this.idSalida;
	}

	public void setIdSalida(int idSalida) {
		this.idSalida = idSalida;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getEstatus() {
		return this.estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

	public Timestamp getFecha() {
		return this.fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public Date getFecMod() {
		return this.fecMod;
	}

	public void setFecMod(Date fecMod) {
		this.fecMod = fecMod;
	}

	public String getUsuCve() {
		return this.usuCve;
	}

	public void setUsuCve(String usuCve) {
		this.usuCve = usuCve;
	}

	public Articulo getArticulo() {
		return this.articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public Inventario getInventario() {
		return this.inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}

}