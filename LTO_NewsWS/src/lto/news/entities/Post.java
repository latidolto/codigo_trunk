package lto.news.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import lto.news.entities.utils.LatidoEntity;

public class Post extends LatidoEntity implements Serializable{
	private String id;
	private String titulo;
	private String encabezado;
	private String descripcion;
	private int visitas;
	private Date fecha;
	private String usuario;
	private List<Object> imagenes;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEncabezado() {
		return encabezado;
	}
	public void setEncabezado(String encabezado) {
		this.encabezado = encabezado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getVisitas() {
		return visitas;
	}
	public void setVisitas(int visitas) {
		this.visitas = visitas;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public List<Object> getImagenes() {
		if(this.id != null && this.imagenes == null) {
			String query = "Select * from post_imagen where post = '"+this.id+"'";
			this.imagenes = (new Post_Imagen()).fillRowsFromQuery(query);
		}
		return this.imagenes;
	}
	public void setImagenes(List<Object> imagenes) {
		this.imagenes = imagenes;
	}
	
}
