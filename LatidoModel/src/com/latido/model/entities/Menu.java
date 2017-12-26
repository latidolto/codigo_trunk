package com.latido.model.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQuery(name="Menu.findAll", query="SELECT t FROM Menu t")
public class Menu {
	@Id
	private int idMenu;
	private String etiqueta;
	private String descripcion;
	private int idMenuPadre;
	private String usuCve;
	@Temporal(TemporalType.TIMESTAMP)
	private 	Date fecMod;
	private int idSistema;
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
	 * @return the etiqueta
	 */
	public String getEtiqueta() {
		return etiqueta;
	}
	/**
	 * @param etiqueta the etiqueta to set
	 */
	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the idMenuPadre
	 */
	public int getIdMenuPadre() {
		return idMenuPadre;
	}
	/**
	 * @param idMenuPadre the idMenuPadre to set
	 */
	public void setIdMenuPadre(int idMenuPadre) {
		this.idMenuPadre = idMenuPadre;
	}
	/**
	 * @return the usuCve
	 */
	public String getUsuCve() {
		return usuCve;
	}
	/**
	 * @param usuCve the usuCve to set
	 */
	public void setUsuCve(String usuCve) {
		this.usuCve = usuCve;
	}
	/**
	 * @return the fecMod
	 */
	public Date getFecMod() {
		return fecMod;
	}
	/**
	 * @param fecMod the fecMod to set
	 */
	public void setFecMod(Date fecMod) {
		this.fecMod = fecMod;
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
