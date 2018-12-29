package com.latido.model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the multivaluada database table.
 * 
 */
@Entity
@Table(name="multivaluada")
@NamedQueries({
	@NamedQuery(name="Multivaluada.findAll", query="SELECT m FROM Multivaluada m"),
	@NamedQuery(name="Multivaluada.findByClave", query="SELECT m FROM Multivaluada m where m.clave = :p_clave")
})


public class Multivaluada implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="mul_id")
	private int mulId;

	private String clave;

	private String descripcion;

	private int valor;

	public Multivaluada() {
	}

	public int getMulId() {
		return this.mulId;
	}

	public void setMulId(int mulId) {
		this.mulId = mulId;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getValor() {
		return this.valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

}