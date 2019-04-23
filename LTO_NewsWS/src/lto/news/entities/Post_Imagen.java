package lto.news.entities;

import java.io.Serializable;
import java.util.Base64;

import lto.news.entities.utils.LatidoEntity;

public class Post_Imagen extends LatidoEntity implements Serializable{
	private long id;
	private String post;
	private byte[] imagen;
	private String imagen64;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public byte[] getImagen() {
		return imagen;
	}
	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}
	public String getImagen64() {
		this.imagen64 = (imagen != null) ? Base64.getEncoder().encodeToString(imagen) : null;
		return this.imagen64;
	}
	public void setImagen64(String imagen64) {
		this.imagen64 = imagen64;
	}
	
}
