package lto.services.model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the galeria database table.
 * 
 */
@Entity
@NamedQuery(name="Galeria.findAll", query="SELECT g FROM Galeria g")
public class Galeria implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private GaleriaPK id;

	private String extension;

	@Lob
	private byte[] imagen;

	@Column(name="nombre_archivo")
	private String nombreArchivo;

	public Galeria() {
	}

	public GaleriaPK getId() {
		return this.id;
	}

	public void setId(GaleriaPK id) {
		this.id = id;
	}

	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public byte[] getImagen() {
		return this.imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	public String getNombreArchivo() {
		return this.nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

}