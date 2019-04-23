package lto.news.model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the comentario_voto database table.
 * 
 */
@Entity
@Table(name="comentario_voto")
@NamedQuery(name="ComentarioVoto.findAll", query="SELECT c FROM ComentarioVoto c")
public class ComentarioVoto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String comentario;

	private byte positivo;

	public ComentarioVoto() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getComentario() {
		return this.comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public byte getPositivo() {
		return this.positivo;
	}

	public void setPositivo(byte positivo) {
		this.positivo = positivo;
	}

}