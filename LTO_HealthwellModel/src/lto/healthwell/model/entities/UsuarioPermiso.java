package lto.healthwell.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="usuario_permiso")
@NamedQueries({
	@NamedQuery(name = "UsuarioPermiso.findAll", query = "Select o from UsuarioPermiso o")
})
public class UsuarioPermiso implements Serializable{
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private UsuarioPermisoPK usuPerPK;
	private Date fecha_fin;
	private int estatus;
	private String usu_cve;
	private Date fec_mod;
	
	public UsuarioPermisoPK getUsuPerPK() {
		if(usuPerPK == null)
			usuPerPK = new UsuarioPermisoPK(0L,null,null,null);
		return usuPerPK;
	}
	public void setUsuPerPK(UsuarioPermisoPK usuPerPK) {
		this.usuPerPK = usuPerPK;
	}
	public void setUsuPerPK(long proceso,String usu_clave, String permiso, Date fecha_inicio) {
		if(usuPerPK == null) {
			usuPerPK = new UsuarioPermisoPK(proceso,usu_clave,permiso,fecha_inicio);
		} else {
			this.usuPerPK.setProceso(proceso);
			this.usuPerPK.setUsu_clave(usu_clave);
			this.usuPerPK.setPermiso(permiso);
			this.usuPerPK.setFecha_inicio(fecha_inicio);	
		}
	}
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
	
	
}
