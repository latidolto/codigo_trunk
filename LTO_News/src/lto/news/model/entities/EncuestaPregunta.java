package lto.news.model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the encuesta_pregunta database table.
 * 
 */
@Entity
@Table(name="encuesta_pregunta")
@NamedQuery(name="EncuestaPregunta.findAll", query="SELECT e FROM EncuestaPregunta e")
public class EncuestaPregunta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String encuesta;

	private String pregunta;

	private String respuesta1;

	private String respuesta2;

	private String respuesta3;

	private String respuesta4;

	private String respuesta5;

	public EncuestaPregunta() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEncuesta() {
		return this.encuesta;
	}

	public void setEncuesta(String encuesta) {
		this.encuesta = encuesta;
	}

	public String getPregunta() {
		return this.pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String getRespuesta1() {
		return this.respuesta1;
	}

	public void setRespuesta1(String respuesta1) {
		this.respuesta1 = respuesta1;
	}

	public String getRespuesta2() {
		return this.respuesta2;
	}

	public void setRespuesta2(String respuesta2) {
		this.respuesta2 = respuesta2;
	}

	public String getRespuesta3() {
		return this.respuesta3;
	}

	public void setRespuesta3(String respuesta3) {
		this.respuesta3 = respuesta3;
	}

	public String getRespuesta4() {
		return this.respuesta4;
	}

	public void setRespuesta4(String respuesta4) {
		this.respuesta4 = respuesta4;
	}

	public String getRespuesta5() {
		return this.respuesta5;
	}

	public void setRespuesta5(String respuesta5) {
		this.respuesta5 = respuesta5;
	}

}