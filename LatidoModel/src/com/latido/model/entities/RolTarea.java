package com.latido.model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the RolTarea database table.
 * 
 */
@Entity
@Table(name="roltarea")
@NamedQueries({
@NamedQuery(name="RolTarea.findAll", query="SELECT r FROM RolTarea r"),
@NamedQuery(name="RolTarea.findAllBySisRol", query="SELECT r FROM RolTarea r where r.id.idSistema = :p_idSistema and r.id.idRol = :p_idRol")
})
public class RolTarea implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RolTareaPK id;
	
	@Transient
	private Tarea tarea;

	public RolTarea() {
	}

	public RolTareaPK getId() {
		return this.id;
	}

	public void setId(RolTareaPK id) {
		this.id = id;
	}

	/**
	 * @return the tarea
	 */
	public Tarea getTarea() {
		return tarea;
	}

	/**
	 * @param tarea the tarea to set
	 */
	public void setTarea(Tarea tarea) {
		this.tarea = tarea;
	}

}