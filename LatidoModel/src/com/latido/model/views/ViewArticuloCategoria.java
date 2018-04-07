package com.latido.model.views;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;

/**
 * The persistent class for the view_articulo_categoria database table.
 * 
 */
@Entity
@Table(name="view_articulo_categoria")
@NamedQueries({
@NamedQuery(name="ViewArticuloCategoria.findAll", query="SELECT v FROM ViewArticuloCategoria v"),
@NamedQuery(name="ViewArticuloCategoria.findById", query="SELECT v FROM ViewArticuloCategoria v WHERE v.articulo_idArticulo = :p_id")
})
public class ViewArticuloCategoria implements Serializable {
	private static final long serialVersionUID = 1L;

	private int articulo_idArticulo;
	private int categoria_idCategoria;
	private int estatus;

	private Timestamp fecMod;

	@Id
	@Column(name="id_categoria")
	private int idCategoria;

	private String nombre;

	private String usuCve;

	public ViewArticuloCategoria() {
	}

	public int getArticulo_idArticulo() {
		return this.articulo_idArticulo;
	}

	public void setArticulo_idArticulo(int articulo_idArticulo) {
		this.articulo_idArticulo = articulo_idArticulo;
	}

	public int getCategoria_idCategoria() {
		return this.categoria_idCategoria;
	}

	public void setCategoria_idCategoria(int categoria_idCategoria) {
		this.categoria_idCategoria = categoria_idCategoria;
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

	public int getIdCategoria() {
		return this.idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
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