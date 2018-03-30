package com.latido.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;

/**
 * The persistent class for the articulo database table.
 * 
 */
@Entity
@Table(name = "articulo")
@NamedQuery(name = "Articulo.findAll", query = "SELECT a FROM Articulo a")
public class Articulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_articulo")
	private int idArticulo;

	
	private int cantidad;

	private String clave;

	private int codigo;

	private int estatus;

	private Timestamp fecMod;

	private int inventario_idInventario;

	private String nombre;

	private int precio;

	private String usuCve;

	public Articulo() {
	}

	public int getIdArticulo() {
		return this.idArticulo;
	}

	public void setIdArticulo(int idArticulo) {
		this.idArticulo = idArticulo;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getEstatus() {
		return this.estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

	public Timestamp getFecMod() {
		return this.fecMod;
	}

	public void setFecMod(Timestamp fecMod) {
		this.fecMod = fecMod;
	}

	public int getInventario_idInventario() {
		return this.inventario_idInventario;
	}

	public void setInventario_idInventario(int inventario_idInventario) {
		this.inventario_idInventario = inventario_idInventario;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getUsuCve() {
		return this.usuCve;
	}

	public void setUsuCve(String usuCve) {
		this.usuCve = usuCve;
	}

}