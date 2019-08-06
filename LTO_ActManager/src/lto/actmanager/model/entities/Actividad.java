package lto.actmanager.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the actividad database table.
 * 
 */
@Entity
@NamedQuery(name="Actividad.findAll", query="SELECT a FROM Actividad a")
public class Actividad implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ActividadPK id;

	private int categoria;

	private String descripcion;

	private int estatus;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecMod;

	private int idActividadPadre;

	private String nombre;

	private int orden;

	private int tiempoProgramado;

	private int tiempoReal;

	private String usuCve;

	public Actividad() {
	}

	public ActividadPK getId() {
		return this.id;
	}

	public void setId(ActividadPK id) {
		this.id = id;
	}

	public int getCategoria() {
		return this.categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
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

	public Date getFecMod() {
		return this.fecMod;
	}

	public void setFecMod(Date fecMod) {
		this.fecMod = fecMod;
	}

	public int getIdActividadPadre() {
		return this.idActividadPadre;
	}

	public void setIdActividadPadre(int idActividadPadre) {
		this.idActividadPadre = idActividadPadre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getOrden() {
		return this.orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public int getTiempoProgramado() {
		return this.tiempoProgramado;
	}

	public void setTiempoProgramado(int tiempoProgramado) {
		this.tiempoProgramado = tiempoProgramado;
	}

	public int getTiempoReal() {
		return this.tiempoReal;
	}

	public void setTiempoReal(int tiempoReal) {
		this.tiempoReal = tiempoReal;
	}

	public String getUsuCve() {
		return this.usuCve;
	}

	public void setUsuCve(String usuCve) {
		this.usuCve = usuCve;
	}

}