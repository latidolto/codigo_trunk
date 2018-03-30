package com.latido.model.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="inventario")
@NamedQueries({
	@NamedQuery(name="Inventario.findAll",query="Select o from Inventario o")
})
public class Inventario implements Serializable{
	
	@Id
	private int id_inventario;

	private String nombre;
	private int estatus;
	private Timestamp fecMod;
	private String usuCve;
	private String descripcion;
	
	@Column(name="id_almacen")
	private int idAlmacen;

	public int getId_inventario() {
		return id_inventario;
	}

	public void setId_inventario(int id_inventario) {
		this.id_inventario = id_inventario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEstatus() {
		return estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

	public Timestamp getFecMod() {
		return fecMod;
	}

	public void setFecMod(Timestamp fecMod) {
		this.fecMod = fecMod;
	}

	public String getUsuCve() {
		return usuCve;
	}

	public void setUsuCve(String usuCve) {
		this.usuCve = usuCve;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdAlmacen() {
		return idAlmacen;
	}

	public void setIdAlmacen(int idAlmacen) {
		this.idAlmacen = idAlmacen;
	}
	
}
