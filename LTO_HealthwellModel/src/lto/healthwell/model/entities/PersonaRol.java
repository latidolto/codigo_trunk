package lto.healthwell.model.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PersonaRol
 *
 */
@Entity
@Table(name="persona_rol")
@IdClass(PersonaRolPK.class)
@NamedQueries({
	@NamedQuery(name = "PersonaRol.findAll", query = "Select o from PersonaRol o")
})
public class PersonaRol implements Serializable {
	@Id
	private long idpersona;   
	@Id
	private long idpersona_rol;
	private int tipo;
	private String descripcion;
	private long rol_idgo;
	private long rol_idarea;
	private long rol_idrol;
	private static final long serialVersionUID = 1L;

	public PersonaRol() {
		super();
	}   
	public long getIdpersona() {
		return this.idpersona;
	}

	public void setIdpersona(long idpersona) {
		this.idpersona = idpersona;
	}   
	public long getIdpersona_rol() {
		return this.idpersona_rol;
	}

	public void setIdpersona_rol(long idpersona_rol) {
		this.idpersona_rol = idpersona_rol;
	}   
	public int getTipo() {
		return this.tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}   
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}   
	public long getRol_idgo() {
		return this.rol_idgo;
	}

	public void setRol_idgo(long rol_idgo) {
		this.rol_idgo = rol_idgo;
	}   
	public long getRol_idarea() {
		return this.rol_idarea;
	}

	public void setRol_idarea(long rol_idarea) {
		this.rol_idarea = rol_idarea;
	}   
	public long getRol_idrol() {
		return this.rol_idrol;
	}

	public void setRol_idrol(long rol_idrol) {
		this.rol_idrol = rol_idrol;
	}
   
}
