package lto.news.entities;

import java.io.Serializable;

import lto.news.entities.utils.LatidoEntity;

public class Categoria extends LatidoEntity implements Serializable{
	private String catId;
	private String catNombre;
	
	public String getCatId() {
		return catId;
	}
	public void setCatId(String catId) {
		this.catId = catId;
	}
	public String getCatNombre() {
		return catNombre;
	}
	public void setCatNombre(String catNombre) {
		this.catNombre = catNombre;
	}
	
}
