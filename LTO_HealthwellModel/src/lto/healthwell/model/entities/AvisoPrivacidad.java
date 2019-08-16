package lto.healthwell.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: AvisoPrivacidad
 *
 */
@Entity
@Table(name="aviso_privacidad")
@NamedQueries({
	@NamedQuery(name="AvisoPrivacidad.findAll", query="SELECT o FROM AvisoPrivacidad o"),
	@NamedQuery(name="AvisoPrivacidad.findById", query="SELECT o FROM AvisoPrivacidad o where o.idap = :p_idap"),
	@NamedQuery(name="AvisoPrivacidad.findByGo", query="SELECT o FROM AvisoPrivacidad o where o.idgo = :p_idgo")
})
public class AvisoPrivacidad implements Serializable {
	private long idgo; 
	@Id
	private long idap;
	private String contenido;
	private byte[] archivo;
	private int estatus; 
	private Date fec_mod; 
	private String usu_cve;
	@Transient
	private static final long serialVersionUID = 1L;

	public AvisoPrivacidad() {
		super();
	}

	/**
	 * @return the idgo
	 */
	public long getIdgo() {
		return idgo;
	}

	/**
	 * @return the idap
	 */
	public long getIdap() {
		return idap;
	}

	/**
	 * @return the contenido
	 */
	public String getContenido() {
		return contenido;
	}

	/**
	 * @return the archivo
	 */
	public byte[] getArchivo() {
		return archivo;
	}

	/**
	 * @return the estatus
	 */
	public int getEstatus() {
		return estatus;
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
	 * @param idap the idap to set
	 */
	public void setIdap(long idap) {
		this.idap = idap;
	}

	/**
	 * @param contenido the contenido to set
	 */
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	/**
	 * @param archivo the archivo to set
	 */
	public void setArchivo(byte[] archivo) {
		this.archivo = archivo;
	}

	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(int estatus) {
		this.estatus = estatus;
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
