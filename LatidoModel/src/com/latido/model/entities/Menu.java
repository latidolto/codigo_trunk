package com.latido.model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="menu")
@NamedQueries({ 
	@NamedQuery(name="Menu.findAll", query="SELECT m FROM Menu m"),
	@NamedQuery(name="Menu.findMenuBySistem", query="SELECT m FROM Menu m where m.idSistema = :p_idSistema and m.idMenuPadre is null"),
	@NamedQuery(name="Menu.findMenuChildren", query="SELECT m FROM Menu m where m.idSistema = :p_idSistema and m.idMenuPadre = :p_idMenuPadre")
} )
public class Menu implements Serializable{
	@Id
	private Integer idMenu;
	private String etiqueta;
	private String descripcion;
	private Integer idMenuPadre;
	private String usuCve;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecMod;
	private int idSistema;
	@Transient
	private List<Menu> menuChildren;
	@Transient
	private List<Tarea> tareaChildren;
	
	/**
	 * @return the idMenu
	 */
	public Integer getIdMenu() {
		return idMenu;
	}
	/**
	 * @param idMenu the idMenu to set
	 */
	public void setIdMenu(Integer idMenu) {
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
	public Integer getIdMenuPadre() {
		return idMenuPadre;
	}
	/**
	 * @param idMenuPadre the idMenuPadre to set
	 */
	public void setIdMenuPadre(Integer idMenuPadre) {
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
	/**
	 * @return the menuChildren
	 */
	public List<Menu> getMenuChildren() {
		return menuChildren;
	}
	/**
	 * @param menuChildren the menuChildren to set
	 */
	public void setMenuChildren(List<Menu> menuChildren) {
		this.menuChildren = menuChildren;
	}
	/**
	 * @return the tareaChildren
	 */
	public List<Tarea> getTareaChildren() {
		return tareaChildren;
	}
	/**
	 * @param tareaChildren the tareaChildren to set
	 */
	public void setTareaChildren(List<Tarea> tareaChildren) {
		this.tareaChildren = tareaChildren;
	}
}
