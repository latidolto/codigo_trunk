package lto.news.model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the encuesta_respuesta database table.
 * 
 */
@Entity
@Table(name="encuesta_respuesta")
@NamedQuery(name="EncuestaRespuesta.findAll", query="SELECT e FROM EncuestaRespuesta e")
public class EncuestaRespuesta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String pregunta;

	private int respuesta;

	public EncuestaRespuesta() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPregunta() {
		return this.pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public int getRespuesta() {
		return this.respuesta;
	}

	public void setRespuesta(int respuesta) {
		this.respuesta = respuesta;
	}

}