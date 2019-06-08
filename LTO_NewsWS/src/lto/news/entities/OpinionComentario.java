package lto.news.entities;

import java.io.Serializable;

import lto.news.entities.utils.LatidoEntity;

public class OpinionComentario extends LatidoEntity implements Serializable{
	private String ocoId;
	private String comId;
	private String ocoOpinion;
	private String usuId;
	
	public String getOcoId() {
		return ocoId;
	}
	public void setOcoId(String ocoId) {
		this.ocoId = ocoId;
	}
	public String getComId() {
		return comId;
	}
	public void setComId(String comId) {
		this.comId = comId;
	}
	public String getOcoOpinion() {
		return ocoOpinion;
	}
	public void setOcoOpinion(String ocoOpinion) {
		this.ocoOpinion = ocoOpinion;
	}
	public String getUsuId() {
		return usuId;
	}
	public void setUsuId(String usuId) {
		this.usuId = usuId;
	}
	
}
