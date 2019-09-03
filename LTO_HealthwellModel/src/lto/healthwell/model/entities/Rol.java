package lto.healthwell.model.entities;

import java.io.Serializable;
import java.lang.String;
import java.sql.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Rol
 *
 */
@Entity
@Table(name="rol")
@IdClass(RolPK.class)
@NamedQueries({
	@NamedQuery(name = "Rol.findAll", query = "Select o from Rol o")
})
public class Rol implements Serializable {@Id
	private long idgo;   
	@Id
	private long idarea;   
	@Id
	private long idrol;
	private String nombre;
	private Date fec_mod;
	private String usu_cve;
	private long idgo_padre;
	private long idarea_padre;
	private long idrol_padre;
	private static final long serialVersionUID = 1L;

	public Rol() {
		super();
	}   
	public long getIdgo() {
		return this.idgo;
	}

	public void setIdgo(long idgo) {
		this.idgo = idgo;
	}   
	public long getIdarea() {
		return this.idarea;
	}

	public void setIdarea(long idarea) {
		this.idarea = idarea;
	}   
	public long getIdrol() {
		return this.idrol;
	}

	public void setIdrol(long idrol) {
		this.idrol = idrol;
	}   
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}   
	public Date getFec_mod() {
		return this.fec_mod;
	}

	public void setFec_mod(Date fec_mod) {
		this.fec_mod = fec_mod;
	}   
	public String getUsu_cve() {
		return this.usu_cve;
	}

	public void setUsu_cve(String usu_cve) {
		this.usu_cve = usu_cve;
	}   
	public long getIdgo_padre() {
		return this.idgo_padre;
	}

	public void setIdgo_padre(long idgo_padre) {
		this.idgo_padre = idgo_padre;
	}   
	public long getIdarea_padre() {
		return this.idarea_padre;
	}

	public void setIdarea_padre(long idarea_padre) {
		this.idarea_padre = idarea_padre;
	}   
	public long getIdrol_padre() {
		return this.idrol_padre;
	}

	public void setIdrol_padre(long idrol_padre) {
		this.idrol_padre = idrol_padre;
	}
   
}
