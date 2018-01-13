package com.latido.model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Rol database table.
 * 
 */
@Entity
@NamedQueries({
@NamedQuery(name="Rol.findAll", query="SELECT r FROM Rol r"),
@NamedQuery(name="Rol.findById", query="SELECT r FROM Rol r where r.id.idRol = :p_idRol and r.id.idSistema = :p_idSistema")
})
public class Rol implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RolPK id;

	private String nombre;

	public Rol() {
	}

	public RolPK getId() {
		return this.id;
	}

	public void setId(RolPK id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}