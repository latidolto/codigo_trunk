package com.latido.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Tarea database table.
 * 
 */
@Entity
@NamedQuery(name="Tarea.findAll", query="SELECT t FROM Tarea t")
public class Tarea implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TareaPK id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecMod;

	private String nombre;

	private String url;

	private String urlAyuda;

	private String usuCve;

	//bi-directional many-to-many association to Rol
	@ManyToMany
	@JoinTable(
		name="RolTarea"
		, joinColumns={
			@JoinColumn(name="idMenu", referencedColumnName="idMenu"),
			@JoinColumn(name="idSistema", referencedColumnName="idSistema"),
			@JoinColumn(name="idTarea", referencedColumnName="idTarea")
			}
		, inverseJoinColumns={
			@JoinColumn(name="idRol", referencedColumnName="idRol"),
			@JoinColumn(name="idSistema", referencedColumnName="idSistema")
			}
		)
	private List<Rol> rols;

	//bi-directional many-to-one association to Menu
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="idMenu", referencedColumnName="idMenu"),
		@JoinColumn(name="idSistema", referencedColumnName="idSistema")
		})
	private Menu menu;

	public Tarea() {
	}

	public TareaPK getId() {
		return this.id;
	}

	public void setId(TareaPK id) {
		this.id = id;
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

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrlAyuda() {
		return this.urlAyuda;
	}

	public void setUrlAyuda(String urlAyuda) {
		this.urlAyuda = urlAyuda;
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

	public Menu getMenu() {
		return this.menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

}