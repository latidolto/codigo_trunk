package com.latido.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the Tarea database table.
 * 
 */
@Entity
@Table(name="tarea")
@NamedQueries( {
@NamedQuery(name="Tarea.findAll", query="SELECT t FROM Tarea t"),
@NamedQuery(name="Tarea.findTareaByMenu", query="SELECT t FROM Tarea t where t.idMenu = :p_idMenu and t.idSistema = :p_idSistema ") 
} )
public class Tarea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idTarea;
	private int idMenu;
	private int idSistema;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecMod;

	private String nombre;

	private String url;

	private String urlAyuda;

	private String usuCve;

	public Tarea() {
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

	/**
	 * @return the idTarea
	 */
	public int getIdTarea() {
		return idTarea;
	}

	/**
	 * @param idTarea the idTarea to set
	 */
	public void setIdTarea(int idTarea) {
		this.idTarea = idTarea;
	}

	/**
	 * @return the idMenu
	 */
	public int getIdMenu() {
		return idMenu;
	}

	/**
	 * @param idMenu the idMenu to set
	 */
	public void setIdMenu(int idMenu) {
		this.idMenu = idMenu;
	}

	/**
	 * @return the idSistema
	 */
	public int getIdSistema() {
		return idSistema;
	}

	/**
	 * @param idSistema the idSistema to set
	 */
	public void setIdSistema(int idSistema) {
		this.idSistema = idSistema;
	}

}