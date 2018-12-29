package lto.services.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the multivaluada database table.
 * 
 */
@Entity
@NamedQuery(name="Multivaluada.findAll", query="SELECT m FROM Multivaluada m")
public class Multivaluada implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_multivaluada")
	private int idMultivaluada;

	private String clave;

	private String descripcion;

	private int estatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_modificacion")
	private Date fechaModificacion;

	@Column(name="usuario_modificacion")
	private String usuarioModificacion;

	private int valor;

	public Multivaluada() {
	}

	public int getIdMultivaluada() {
		return this.idMultivaluada;
	}

	public void setIdMultivaluada(int idMultivaluada) {
		this.idMultivaluada = idMultivaluada;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getEstatus() {
		return this.estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public String getUsuarioModificacion() {
		return this.usuarioModificacion;
	}

	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

	public int getValor() {
		return this.valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

}