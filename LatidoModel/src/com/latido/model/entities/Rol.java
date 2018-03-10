package com.latido.model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Rol database table.
 * 
 */
@Entity
@Table(name="rol")
@NamedQueries({
@NamedQuery(name="Rol.findAll", query="SELECT r FROM Rol r"),
@NamedQuery(name="Rol.findById", query="SELECT r FROM Rol r where r.idRol = :p_idRol and r.idSistema = :p_idSistema"),
@NamedQuery(name="Rol.findBySys", query="SELECT r FROM Rol r where r.idSistema = :p_idSistema")

})
public class Rol implements Serializable {
	private static final long serialVersionUID = 1L;

	//@EmbeddedId
	//private RolPK id;
	@Id
	private int idRol;
	
	private int idSistema;

	private String nombre;

	public Rol() {
	}

	/*public RolPK getId() {
		return this.id;
	}

	public void setId(RolPK id) {
		this.id = id;
	}*/

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the idRol
	 */
	public int getIdRol() {
		return idRol;
	}

	/**
	 * @param idRol the idRol to set
	 */
	public void setIdRol(int idRol) {
		this.idRol = idRol;
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