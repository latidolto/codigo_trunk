package com.latido.model.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the articulocategoria database table.
 * 
 */
@Entity
@Table(name = "articulocategoria")
@NamedQuery(name = "Articulocategoria.findAll", query = "SELECT a FROM Articulocategoria a")
public class Articulocategoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "aca_id")
	private int acaId;

	private int articulo_idArticulo;
	private int categoria_idCategoria;

	public Articulocategoria() {
	}

	public int getAcaId() {
		return this.acaId;
	}

	public void setAcaId(int acaId) {
		this.acaId = acaId;
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

}