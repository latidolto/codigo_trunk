package lto.actmanager.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the compania database table.
 * 
 */
@Entity
@Table(name="Compania")
@NamedQuery(name="Compania.findAll", query="SELECT c FROM Compania c")
public class Compania implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long idCompania;

	private String domicilio;

	private int estatus;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecMod;

	private String nombre;

	private String rfc;

	private String telefono;

	private String usuCve;

	public Compania() {
	}

	public Long getIdCompania() {
		return this.idCompania;
	}

	public void setIdCompania(Long idCompania) {
		this.idCompania = idCompania;
	}

	public String getDomicilio() {
		return this.domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getEstatus() {
		return this.estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

	public Date getFecMod() {
		return this.fecMod;
	}

	public void setFecMod(Date fecMod) {
		this.fecMod = fecMod;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRfc() {
		return this.rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getUsuCve() {
		return this.usuCve;
	}

	public void setUsuCve(String usuCve) {
		this.usuCve = usuCve;
	}

}