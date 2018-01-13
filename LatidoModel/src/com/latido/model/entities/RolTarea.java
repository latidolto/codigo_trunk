package com.latido.model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the RolTarea database table.
 * 
 */
@Entity
@NamedQuery(name="RolTarea.findAll", query="SELECT r FROM RolTarea r")
public class RolTarea implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RolTareaPK id;

	public RolTarea() {
	}

	public RolTareaPK getId() {
		return this.id;
	}

	public void setId(RolTareaPK id) {
		this.id = id;
	}

}