package com.latido.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the almacen database table.
 * 
 */
@Entity
@NamedQuery(name="Almacen.findAll", query="SELECT a FROM Almacen a")
public class Almacen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_almacen")
	private int idAlmacen;

	public int getIdAlmacen() {
		return idAlmacen;
	}

	public void setIdAlmacen(int idAlmacen) {
		this.idAlmacen = idAlmacen;
	}

	public int getSistema_idSistema() {
		return sistema_idSistema;
	}

	public void setSistema_idSistema(int sistema_idSistema) {
		this.sistema_idSistema = sistema_idSistema;
	}

	@Column(name="id_sistema")
	private int sistema_idSistema;
	
	/*@EmbeddedId
	private AlmacenPK id;*/

	private int estatus;

	private Timestamp fecMod;

	private String nombre;

	private String usuCve;

	//bi-directional many-to-one association to Sistema
	//@ManyToOne
	//private Sistema sistema;

	public Almacen() {
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

	/*public Sistema getSistema() {
		return this.sistema;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}*/

}