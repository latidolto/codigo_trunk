package lto.healthwell.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: GoDomicilio
 *
 */
@Entity
@Table(name="go_domicilio")
@NamedQueries({
	@NamedQuery(name="GoDomicilio.findAll", query="SELECT o FROM GoDomicilio o"),
	@NamedQuery(name="GoDomicilio.findById", query="SELECT o FROM GoDomicilio o where o.idgo_domicilio = :p_idgo_domicilio"),
	@NamedQuery(name="GoDomicilio.findByGo", query="SELECT o FROM GoDomicilio o where o.idgo = :p_idgo")
})
public class GoDomicilio implements Serializable {
	private long idgo; 
	private long idpais; 
	private long idestado; 
	private long idciudad; 
	private long idcolonia; 
	private long idcalle;
	@Id
	private long idgo_domicilio; 
	private String numero_exterior; 
	private String numero_interior; 
	private double latitud; 
	private double longitud; 
	private int tipo; 
	private Date fec_mod; 
	private String usu_cve;
	@Transient
	private static final long serialVersionUID = 1L;

	public GoDomicilio() {
		super();
	}

	/**
	 * @return the idgo
	 */
	public long getIdgo() {
		return idgo;
	}

	/**
	 * @return the idpais
	 */
	public long getIdpais() {
		return idpais;
	}

	/**
	 * @return the idestado
	 */
	public long getIdestado() {
		return idestado;
	}

	/**
	 * @return the idciudad
	 */
	public long getIdciudad() {
		return idciudad;
	}

	/**
	 * @return the idcolonia
	 */
	public long getIdcolonia() {
		return idcolonia;
	}

	/**
	 * @return the idcalle
	 */
	public long getIdcalle() {
		return idcalle;
	}

	/**
	 * @return the idgo_domicilio
	 */
	public long getIdgo_domicilio() {
		return idgo_domicilio;
	}

	/**
	 * @return the numero_exterior
	 */
	public String getNumero_exterior() {
		return numero_exterior;
	}

	/**
	 * @return the numero_interior
	 */
	public String getNumero_interior() {
		return numero_interior;
	}

	/**
	 * @return the latitud
	 */
	public double getLatitud() {
		return latitud;
	}

	/**
	 * @return the longitud
	 */
	public double getLongitud() {
		return longitud;
	}

	/**
	 * @return the tipo
	 */
	public int getTipo() {
		return tipo;
	}

	/**
	 * @return the fec_mod
	 */
	public Date getFec_mod() {
		return fec_mod;
	}

	/**
	 * @return the usu_cve
	 */
	public String getUsu_cve() {
		return usu_cve;
	}

	/**
	 * @param idgo the idgo to set
	 */
	public void setIdgo(long idgo) {
		this.idgo = idgo;
	}

	/**
	 * @param idpais the idpais to set
	 */
	public void setIdpais(long idpais) {
		this.idpais = idpais;
	}

	/**
	 * @param idestado the idestado to set
	 */
	public void setIdestado(long idestado) {
		this.idestado = idestado;
	}

	/**
	 * @param idciudad the idciudad to set
	 */
	public void setIdciudad(long idciudad) {
		this.idciudad = idciudad;
	}

	/**
	 * @param idcolonia the idcolonia to set
	 */
	public void setIdcolonia(long idcolonia) {
		this.idcolonia = idcolonia;
	}

	/**
	 * @param idcalle the idcalle to set
	 */
	public void setIdcalle(long idcalle) {
		this.idcalle = idcalle;
	}

	/**
	 * @param idgo_domicilio the idgo_domicilio to set
	 */
	public void setIdgo_domicilio(long idgo_domicilio) {
		this.idgo_domicilio = idgo_domicilio;
	}

	/**
	 * @param numero_exterior the numero_exterior to set
	 */
	public void setNumero_exterior(String numero_exterior) {
		this.numero_exterior = numero_exterior;
	}

	/**
	 * @param numero_interior the numero_interior to set
	 */
	public void setNumero_interior(String numero_interior) {
		this.numero_interior = numero_interior;
	}

	/**
	 * @param latitud the latitud to set
	 */
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	/**
	 * @param fec_mod the fec_mod to set
	 */
	public void setFec_mod(Date fec_mod) {
		this.fec_mod = fec_mod;
	}

	/**
	 * @param usu_cve the usu_cve to set
	 */
	public void setUsu_cve(String usu_cve) {
		this.usu_cve = usu_cve;
	}
   
}
