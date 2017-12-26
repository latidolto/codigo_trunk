package com.latido.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UsuarioPK id;

	private String apellidoMaterno;

	private String apellidoPaterno;

	@Lob
	private byte[] avatar;

	private String clave;

	private int estatus;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecMod;

	private String nombre;

	private String password;

	private String usuCve;

	//bi-directional many-to-many association to Rol
	@ManyToMany
	@JoinTable(
		name="UsuRol"
		, joinColumns={
			@JoinColumn(name="idSistema", referencedColumnName="idSistema"),
			@JoinColumn(name="idUsuario", referencedColumnName="idUsuario")
			}
		, inverseJoinColumns={
			@JoinColumn(name="idRol", referencedColumnName="idRol"),
			@JoinColumn(name="idSistema", referencedColumnName="idSistema")
			}
		)
	private List<Rol> rols;

	//bi-directional many-to-one association to Sistema
	@ManyToOne
	@JoinColumn(name="idSistema")
	private Sistema sistema;

	public Usuario() {
	}

	public UsuarioPK getId() {
		return this.id;
	}

	public void setId(UsuarioPK id) {
		this.id = id;
	}

	public String getApellidoMaterno() {
		return this.apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getApellidoPaterno() {
		return this.apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public byte[] getAvatar() {
		return this.avatar;
	}

	public void setAvatar(byte[] avatar) {
		this.avatar = avatar;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public int getEstatus() {
		return this.estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsuCve() {
		return this.usuCve;
	}

	public void setUsuCve(String usuCve) {
		this.usuCve = usuCve;
	}

	public List<Rol> getRols() {
		return this.rols;
	}

	public void setRols(List<Rol> rols) {
		this.rols = rols;
	}

	public Sistema getSistema() {
		return this.sistema;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

}