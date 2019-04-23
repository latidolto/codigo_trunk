package lto.news.model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the encuesta database table.
 * 
 */
@Entity
@NamedQuery(name="Encuesta.findAll", query="SELECT e FROM Encuesta e")
public class Encuesta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Lob
	private String descripcion;

	private String nombre;

	private String usuario;

	public Encuesta() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}