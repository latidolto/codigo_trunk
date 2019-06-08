package lto.news.entities;

import java.io.Serializable;

import lto.news.entities.utils.LatidoEntity;

public class Tag extends LatidoEntity implements Serializable{
	private String tagId;
	private String tagDescripcion;
	
	public String getTagId() {
		return tagId;
	}
	public void setTagId(String tagId) {
		this.tagId = tagId;
	}
	public String getTagDescripcion() {
		return tagDescripcion;
	}
	public void setTagDescripcion(String tagDescripcion) {
		this.tagDescripcion = tagDescripcion;
	}

}
