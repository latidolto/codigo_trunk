package lto.news.model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the redes_sociales database table.
 * 
 */
@Entity
@Table(name="redes_sociales")
@NamedQuery(name="RedesSociale.findAll", query="SELECT r FROM RedesSociale r")
public class RedesSociale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String facebook;

	private String instagram;

	private String twitter;

	private String usuario;

	public RedesSociale() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFacebook() {
		return this.facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getInstagram() {
		return this.instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	public String getTwitter() {
		return this.twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}