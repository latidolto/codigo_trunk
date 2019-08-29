package lto.healthwell.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UsuarioPermisoPK implements Serializable{
	private static final long serialVersionUID = 1L;
	@Column(insertable=false, updatable=false)
	private String proceso;
	@Column(insertable=false, updatable=false)
	private String usu_clave;
	@Column(insertable=false, updatable=false)
	private String permiso;
	@Column(insertable=false, updatable=false)
	private Date fecha_inicio;
	
	public UsuarioPermisoPK() {
		
	}
	
	public UsuarioPermisoPK(String proceso, String usu_clave, String permiso, Date fecha_inicio)  {
		this.proceso = proceso;
		this.usu_clave = usu_clave;
		this.permiso = permiso;
		this.fecha_inicio = fecha_inicio;
	}

	public String getProceso() {
		return proceso;
	}

	public void setProceso(String proceso) {
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
