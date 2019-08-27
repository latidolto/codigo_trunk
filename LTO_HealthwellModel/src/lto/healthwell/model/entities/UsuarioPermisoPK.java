package lto.healthwell.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Embeddable;

@Embeddable
public class UsuarioPermisoPK implements Serializable{
	private static final long serialVersionUID = 1L;
	private long proceso;
	private String usu_clave;
	private String permiso;
	private Date fecha_inicio;
	
	public UsuarioPermisoPK(long proceso, String usu_clave, String permiso, Date fecha_inicio)  {
		this.proceso = proceso;
		this.usu_clave = usu_clave;
		this.permiso = permiso;
		this.fecha_inicio = fecha_inicio;
	}

	public long getProceso() {
		return proceso;
	}

	public void setProceso(long proceso) {
		this.proceso = proceso;
	}

	public String getUsu_clave() {
		return usu_clave;
	}

	public void setUsu_clave(String usu_clave) {
		this.usu_clave = usu_clave;
	}

	public String getPermiso() {
		return permiso;
	}

	public void setPermiso(String permiso) {
		this.permiso = permiso;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
}
