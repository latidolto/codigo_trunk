package com.latido.model.views;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;

/**
 * The persistent class for the view_articulo_proveedor database table.
 * 
 */
@Entity
@Table(name="view_articulo_proveedor")
@NamedQueries({
@NamedQuery(name="ViewArticuloProveedor.findAll", query="SELECT v FROM ViewArticuloProveedor v"),
@NamedQuery(name="ViewArticuloProveedor.findById", query="SELECT v FROM ViewArticuloProveedor v WHERE v.proveedor_idProveedor = :p_id")
})
public class ViewArticuloProveedor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="apr_id")
	private int aprId;

	@Id
	private int articulo_idArticulo;

	private String correo;
	private String direccion;
	private int estatus;
	private Timestamp fecMod;

	@Column(name="id_proveedor")
	private int idProveedor;
	private String nombre;
	private int proveedor_idProveedor;
	private int sistema_idSistema;

	private String telefono;

	private String usuCve;

	public ViewArticuloProveedor() {
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

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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

	public int getIdProveedor() {
		return this.idProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getProveedor_idProveedor() {
		return this.proveedor_idProveedor;
	}

	public void setProveedor_idProveedor(int proveedor_idProveedor) {
		this.proveedor_idProveedor = proveedor_idProveedor;
	}

	public int getSistema_idSistema() {
		return this.sistema_idSistema;
	}

	public void setSistema_idSistema(int sistema_idSistema) {
		this.sistema_idSistema = sistema_idSistema;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getUsuCve() {
		return this.usuCve;
	}

	public void setUsuCve(String usuCve) {
		this.usuCve = usuCve;
	}

}