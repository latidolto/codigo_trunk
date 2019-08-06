package lto.actmanager.model.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Agenda.findAll", query="SELECT a FROM Agenda a")
public class Agenda {
	
	private String clave;
	private Integer estatus;
	private Date fechaFin;
	private Date fechaInicio;
	private Date fecMod;
	private Integer idActividad;
	@Id
	private Integer idAgenda;
	private Integer idArea;
	private Integer idCompania;
	private Integer idProyecto;
	private Integer periodicidad;
	private Integer repetir;
	private String usuCve;
	private String valorPeriodicidad;
	
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public Integer getEstatus() {
		return estatus;
	}
	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFecMod() {
		return fecMod;
	}
	public void setFecMod(Date fecMod) {
		this.fecMod = fecMod;
	}
	public Integer getIdActividad() {
		return idActividad;
	}
	public void setIdActividad(Integer idActividad) {
		this.idActividad = idActividad;
	}
	public Integer getIdAgenda() {
		return idAgenda;
	}
	public void setIdAgenda(Integer idAgenda) {
		this.idAgenda = idAgenda;
	}
	public Integer getIdArea() {
		return idArea;
	}
	public void setIdArea(Integer idArea) {
		this.idArea = idArea;
	}
	public Integer getIdCompania() {
		return idCompania;
	}
	public void setIdCompania(Integer idCompania) {
		this.idCompania = idCompania;
	}
	public Integer getIdProyecto() {
		return idProyecto;
	}
	public void setIdProyecto(Integer idProyecto) {
		this.idProyecto = idProyecto;
	}
	public Integer getPeriodicidad() {
		return periodicidad;
	}
	public void setPeriodicidad(Integer periodicidad) {
		this.periodicidad = periodicidad;
	}
	public Integer getRepetir() {
		return repetir;
	}
	public void setRepetir(Integer repetir) {
		this.repetir = repetir;
	}
	public String getUsuCve() {
		return usuCve;
	}
	public void setUsuCve(String usuCve) {
		this.usuCve = usuCve;
	}
	public String getValorPeriodicidad() {
		return valorPeriodicidad;
	}
	public void setValorPeriodicidad(String valorPeriodicidad) {
		this.valorPeriodicidad = valorPeriodicidad;
	}
}
