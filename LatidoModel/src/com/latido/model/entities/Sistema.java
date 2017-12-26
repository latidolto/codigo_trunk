package com.latido.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Sistema database table.
 * 
 */
@Entity
@NamedQuery(name="Sistema.findAll", query="SELECT s FROM Sistema s")
public class Sistema implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idSistema;

	private String descripcion;

	private int estatus;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecMod;

	private String nombre;

	private String usuCve;

	//bi-directional many-to-one association to Rol
	@OneToMany(mappedBy="sistema")
	private List<Rol> rols;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="sistema")
	private List<Usuario> usuarios;

	public Sistema() {
	}

	public int getIdSistema() {
		return this.idSistema;
	}

	public void setIdSistema(int idSistema) {
		this.idSistema = idSistema;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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

	public Rol addRol(Rol rol) {
		getRols().add(rol);
		rol.setSistema(this);

		return rol;
	}

	public Rol removeRol(Rol rol) {
		getRols().remove(rol);
		rol.setSistema(null);

		return rol;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario addUsuario(Usuario usuario) {
		getUsuarios().add(usuario);
		usuario.setSistema(this);

		return usuario;
	}

	public Usuario removeUsuario(Usuario usuario) {
		getUsuarios().remove(usuario);
		usuario.setSistema(null);

		return usuario;
	}

}