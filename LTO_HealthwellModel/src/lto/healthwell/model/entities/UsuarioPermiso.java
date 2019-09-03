package lto.healthwell.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="usuario_permiso")
@NamedQueries({
	@NamedQuery(name = "UsuarioPermiso.findAll", query = "Select o from UsuarioPermiso o"),
	@NamedQuery(name = "UsuarioPermiso.findByGO", query = "Select o from UsuarioPermiso o "
														+ " join Persona per on per.correo = o.usu_clave "
														+ " join PersonaRol prr on prr.idpersona = per.idpersona "
														+ " join Rol rol on rol.idrol = prr.idpersona_rol "
														+ "Where rol.idgo = :p_idgo ")
})
public class UsuarioPermiso implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	private String idusuario_permiso;
	private String proceso;
	private String usu_clave;
	private int permiso_creacion;
	private int permiso_lectura;
	private int permiso_actualizacion;
	private int permiso_borrado;
	private Date fecha_inicio;
	private Date fecha_fin;
	private int estatus;
	private String usu_cve;
	private Date fec_mod;
	@Transient
	private boolean b_permiso_creacion;
	@Transient
	private boolean b_permiso_lectura;
	@Transient
	private boolean b_permiso_actualizacion;
	@Transient
	private boolean b_permiso_borrado;
	@Transient
	private java.util.Date d_fecha_inicio;
	@Transient
	private java.util.Date d_fecha_fin;
	
	public Date getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	public int getEstatus() {
		return estatus;
	}
	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}
	public String getUsu_cve() {
		return usu_cve;
	}
	public void setUsu_cve(String usu_cve) {
		this.usu_cve = usu_cve;
	}
	public Date getFec_mod() {
		return fec_mod;
	}
	public void setFec_mod(Date fec_mod) {
		this.fec_mod = fec_mod;
	}
	public String getIdusuario_permiso() {
		return idusuario_permiso;
	}
	public void setIdusuario_permiso(String idusuario_permiso) {
		this.idusuario_permiso = idusuario_permiso;
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
	public Date getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public int getPermiso_creacion() {
		return permiso_creacion;
	}
	public void setPermiso_creacion(int permiso_creacion) {
		this.permiso_creacion = permiso_creacion;
	}
	public int getPermiso_lectura() {
		return permiso_lectura;
	}
	public void setPermiso_lectura(int permiso_lectura) {
		this.permiso_lectura = permiso_lectura;
	}
	public int getPermiso_actualizacion() {
		return permiso_actualizacion;
	}
	public void setPermiso_actualizacion(int permiso_actualizacion) {
		this.permiso_actualizacion = permiso_actualizacion;
	}
	public int getPermiso_borrado() {
		return permiso_borrado;
	}
	public void setPermiso_borrado(int permiso_borrado) {
		this.permiso_borrado = permiso_borrado;
	}
	public boolean isB_permiso_creacion() {
		return this.permiso_creacion == 1;
	}
	public void setB_permiso_creacion(boolean b_permiso_creacion) {
		if(b_permiso_creacion) {
			this.setPermiso_creacion(1);
		} else {
			this.setPermiso_creacion(0);
		}
	}
	public boolean isB_permiso_lectura() {
		return this.permiso_lectura == 1;
	}
	public void setB_permiso_lectura(boolean b_permiso_lectura) {
		if(b_permiso_lectura) {
			this.setPermiso_lectura(1);
		} else {
			this.setPermiso_lectura(0);
		}
	}
	public boolean isB_permiso_actualizacion() {
		return this.permiso_actualizacion == 1;
	}
	public void setB_permiso_actualizacion(boolean b_permiso_actualizacion) {
		if(b_permiso_actualizacion) {
			this.setPermiso_actualizacion(1);
		} else {
			this.setPermiso_actualizacion(0);
		}
	}
	public boolean isB_permiso_borrado() {
		return this.permiso_borrado == 1;
	}
	public void setB_permiso_borrado(boolean b_permiso_borrado) {
		if(b_permiso_borrado) {
			this.setPermiso_borrado(1);
		} else {
			this.setPermiso_borrado(0);
		}
	}
	public java.util.Date getD_fecha_inicio() {
		return (this.fecha_inicio != null) ? new java.util.Date(this.fecha_inicio.getTime()): null;
	}
	public void setD_fecha_inicio(java.util.Date d_fecha_inicio) {
		if(d_fecha_inicio != null)
			this.setFecha_inicio(new java.sql.Date(d_fecha_inicio.getTime()));	
	}
	public java.util.Date getD_fecha_fin() {
		return (this.fecha_fin != null) ? new java.util.Date(this.fecha_fin.getTime()): null;
	}
	public void setD_fecha_fin(java.util.Date d_fecha_fin) {
		if(d_fecha_fin != null)
			this.setFecha_fin(new java.sql.Date(d_fecha_fin.getTime()));
	}
	
	
}
