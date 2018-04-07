package com.latido.model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the articuloproveedor database table.
 * 
 */
@Entity
@NamedQuery(name="Articuloproveedor.findAll", query="SELECT a FROM Articuloproveedor a")
public class Articuloproveedor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="apr_id")
	private int aprId;

	private int articulo_idArticulo;

	private int proveedor_idProveedor;

	public Articuloproveedor() {
	}

	public int getAprId() {
		return this.aprId;
	}

	public void setAprId(int aprId) {
		this.aprId = aprId;
	}

	public int getArticulo_idArticulo() {
		return this.articulo_idArticulo;
	}

	public void setArticulo_idArticulo(int articulo_idArticulo) {
		this.articulo_idArticulo = articulo_idArticulo;
	}

	public int getProveedor_idProveedor() {
		return this.proveedor_idProveedor;
	}

	public void setProveedor_idProveedor(int proveedor_idProveedor) {
		this.proveedor_idProveedor = proveedor_idProveedor;
	}

}