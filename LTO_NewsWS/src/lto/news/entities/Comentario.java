package lto.news.entities;

import java.io.Serializable;
import java.util.List;

import lto.news.entities.utils.LatidoEntity;

public class Comentario extends LatidoEntity implements Serializable{
	private String comId;
	private String comNoticia;
	private String comUsuario;
	private String comContenido;
	private List<Object> opiniones;

    public String getComId() {
		return comId;
	}
	public void setComId(String comId) {
		this.comId = comId;
	}
	public String getComNoticia() {
		return comNoticia;
	}
	public void setComNoticia(String comNoticia) {
		this.comNoticia = comNoticia;
	}
	public String getComUsuario() {
		return comUsuario;
	}
	public void setComUsuario(String comUsuario) {
		this.comUsuario = comUsuario;
	}
	public String getComContenido() {
		return comContenido;
	}
	public void setComContenido(String comContenido) {
		this.comContenido = comContenido;
	}
	public List<Object> getOpiniones() {
		if(this.comId != null && this.opiniones == null) {
			String query = "Select * from opinion_comentario oco " +
						   "Where oco.com_id = '" + this.comId + "'";
			this.opiniones = (new OpinionComentario()).fillRowsFromQuery(query);
		}
		return opiniones;
	}
	public void setOpiniones(List<Object> opiniones) {
		this.opiniones = opiniones;
	}

}
