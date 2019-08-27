package lto.healthwell.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "multivaluada")
@NamedQueries({
	@NamedQuery(name = "Multivaluada.findAll", query = "Select o from Multivaluada o")
})
public class Multivaluada implements Serializable{
	private static final long serialVersionUID = -7077273434537491848L;
	@Id
	private long idmultivaluada;
	private String clave;
	private String tabla;
	private String columna;
	private String descripcion;
	private String valor;
	private Date fec_mod;
	private String usu_cve;
	
	
	public long getIdmultivaluada() {
		return idmultivaluada;
	}
	public void setIdmultivaluada(long idmultivaluada) {
		this.idmultivaluada = idmultivaluada;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getTabla() {
		return tabla;
	}
	public void setTabla(String tabla) {
		this.tabla = tabla;
	}
	public String getColumna() {
		return columna;
	}
	public void setColumna(String columna) {
		this.columna = columna;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Date getFec_mod() {
		return fec_mod;
	}
	public void setFec_mod(Date fec_mod) {
		this.fec_mod = fec_mod;
	}
	public String getUsu_cve() {
		return usu_cve;
	}
	public void setUsu_cve(String usu_cve) {
		this.usu_cve = usu_cve;
	}

}
