package lto.healthwell.model.entities;

import java.io.Serializable;
import java.lang.String;
import java.sql.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Persona
 *
 */
@Entity
@Table(name="persona")
@NamedQueries({
	@NamedQuery(name = "Persona.findAll", query = "Select o from Persona o")
})
public class Persona implements Serializable {
	@Id
	private long idpersona;
	private String nombre;
	private String apellido_paterno;
	private String apellido_materno;
	private Date fecha_nacimiento;
	private String correo;
	private String celular;
	private String telefono;
	private String rfc;
	private Date fec_mod;
	private String usu_cve;
	
	private static final long serialVersionUID = 1L;

	public Persona() {
		super();
	}   
	public long getIdpersona() {
		return this.idpersona;
	}

	public void setIdpersona(long idpersona) {
		this.idpersona = idpersona;
	}   
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}   
	public String getApellido_paterno() {
		return this.apellido_paterno;
	}

	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}   
	public String getApellido_materno() {
		return this.apellido_materno;
	}

	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}   
	public Date getFecha_nacimiento() {
		return this.fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}   
	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}   
	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}   
	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}   
	public String getRfc() {
		return this.rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
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
   
}
