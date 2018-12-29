package lto.services.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Random;


/**
 * The persistent class for the servicio database table.
 * 
 */
@Entity
@Table(name="servicio")
@NamedQueries({
	@NamedQuery(name="Servicio.findAll", query="SELECT s FROM Servicio s"),
	@NamedQuery(name="Servicio.findById", query="SELECT s FROM Servicio s where s.idServicio = :p_clave")
})

public class Servicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_servicio")
	private Long idServicio;

	private Double costo;

	@Column(name="costo_visible")
	private int costoVisible;

	private String descripcion;

	private int estatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_modificacion")
	private Date fechaModificacion;

	private String nombre;

	@Column(name="usuario_modificacion")
	private String usuarioModificacion;

	public Servicio() {
		this.idServicio = Math.round( (Math.random() * 11) );
	}

	public Long getIdServicio() {
		return this.idServicio;
	}

	public void setIdServicio(Long idServicio) {
		this.idServicio = idServicio;
	}

	public Double getCosto() {
		return this.costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	public int getCostoVisible() {
		return this.costoVisible;
	}

	public void setCostoVisible(int costoVisible) {
		this.costoVisible = costoVisible;
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

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuarioModificacion() {
		return this.usuarioModificacion;
	}

	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

}