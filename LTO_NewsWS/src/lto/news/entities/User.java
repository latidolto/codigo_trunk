package lto.news.entities;

import java.io.Serializable;

import lto.news.entities.utils.LatidoEntity;

public class User extends LatidoEntity implements Serializable{
	private long usu_id;
	private String usu_nombre;
	private String usu_correo;
	private String usu_contrasena;
	private long rol_id;
	
	
	public long getUsu_id() {
		return usu_id;
	}
	public void setUsu_id(long usu_id) {
		this.usu_id = usu_id;
	}
	public String getUsu_nombre() {
		return usu_nombre;
	}
	public void setUsu_nombre(String usu_nombre) {
		this.usu_nombre = usu_nombre;
	}
	public String getUsu_correo() {
		return usu_correo;
	}
	public void setUsu_correo(String usu_correo) {
		this.usu_correo = usu_correo;
	}
	public String getUsu_contrasena() {
		return usu_contrasena;
	}
	public void setUsu_contrasena(String usu_contrasena) {
		this.usu_contrasena = usu_contrasena;
	}
	public long getRol_id() {
		return rol_id;
	}
	public void setRol_id(long rol_id) {
		this.rol_id = rol_id;
	}
}
