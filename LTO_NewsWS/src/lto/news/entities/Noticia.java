package lto.news.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import lto.news.entities.utils.LatidoEntity;

public class Noticia extends LatidoEntity implements Serializable{
	private String notId;
	private String autId;
	private String notTitulo;
	private String notSubtitulo;
	private Date notFecha;
	private String notVisitas;
	private String notContenido;
	private List<Object> categorias;
	private List<Object> imagenes;
	private List<Object> tags;
	private List<Object> comentarios;
	
	public String getNotId() {
		return notId;
	}
	public void setNotId(String notId) {
		this.notId = notId;
	}
	public String getAutId() {
		return autId;
	}
	public void setAutId(String autId) {
		this.autId = autId;
	}
	public String getNotTitulo() {
		return notTitulo;
	}
	public void setNotTitulo(String notTitulo) {
		this.notTitulo = notTitulo;
	}
	public String getNotSubtitulo() {
		return notSubtitulo;
	}
	public void setNotSubtitulo(String notSubtitulo) {
		this.notSubtitulo = notSubtitulo;
	}
	public Date getNotFecha() {
		return notFecha;
	}
	public void setNotFecha(Date notFecha) {
		this.notFecha = notFecha;
	}
	public String getNotVisitas() {
		return notVisitas;
	}
	public void setNotVisitas(String notVisitas) {
		this.notVisitas = notVisitas;
	}
	public String getNotContenido() {
		return notContenido;
	}
	public void setNotContenido(String notContenido) {
		this.notContenido = notContenido;
	}
	public List<Object> getCategorias() {
		if(this.notId != null && this.categorias == null) {
			String query = "Select * from noticia_categoria nca " +
						   " join categoria cat on cat.cat_id = nca.cat_id " +
						   "Where nca.not_id = '" + this.notId + "'";
			this.categorias = (new Categoria()).fillRowsFromQuery(query);
		}
		return categorias;
	}
	public void setCategorias(List<Object> categorias) {
		this.categorias = categorias;
	}
	public List<Object> getImagenes() {
		if(this.notId != null && this.imagenes == null) {
			String query = "Select * from noticia_imagen nim " +
						   " join imagen img on img.img_id = nim.img_id " +
						   "Where img.not_id = '" + this.notId + "'";
			this.imagenes = (new Imagen()).fillRowsFromQuery(query);
		}
		return imagenes;
	}
	public void setImagenes(List<Object> imagenes) {
		this.imagenes = imagenes;
	}
	public List<Object> getTags() {
		if(this.notId != null && this.tags == null) {
			String query = "Select * from noticia_tag nta " +
						   " join tag ta on ta.tag_id = nta.tag_id " +
						   "Where nta.not_id = '" + this.notId + "'";
			this.tags = (new Tag()).fillRowsFromQuery(query);
		}
		return tags;
	}
	public void setTags(List<Object> tags) {
		this.tags = tags;
	}
	public List<Object> getComentarios() {
		if(this.notId != null && this.comentarios == null) {
			String query = "Select * from comentario com " +
						   "Where com.not_id = '" + this.notId + "'";
			this.comentarios = (new Comentario()).fillRowsFromQuery(query);
		}
		return comentarios;
	}
	public void setComentarios(List<Object> comentarios) {
		this.comentarios = comentarios;
	}

}
