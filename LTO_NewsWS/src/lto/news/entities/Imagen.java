package lto.news.entities;

import java.io.Serializable;

import lto.news.entities.utils.LatidoEntity;

public class Imagen extends LatidoEntity implements Serializable{
	private String imgId;
	private String imgDescripcion;
	
	public String getImgId() {
		return imgId;
	}
	public void setImgId(String imgId) {
		this.imgId = imgId;
	}
	public String getImgDescripcion() {
		return imgDescripcion;
	}
	public void setImgDescripcion(String imgDescripcion) {
		this.imgDescripcion = imgDescripcion;
	}
	
}
