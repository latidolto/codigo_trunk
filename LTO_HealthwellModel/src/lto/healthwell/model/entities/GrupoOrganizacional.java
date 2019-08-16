package lto.healthwell.model.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Base64;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: GrupoOrganizacional
 *
 */
@Entity
@Table(name="grupo_organizacional")
@NamedQueries({
	@NamedQuery(name="GrupoOrganizacional.findAll", query="SELECT o FROM GrupoOrganizacional o"),
	@NamedQuery(name="GrupoOrganizacional.findById", query="SELECT o FROM GrupoOrganizacional o where o.idgo = :p_idgo")
})
public class GrupoOrganizacional implements Serializable {
	@Id
	private long idgo; 
	private String nombre; 
	private String descripcion; 
	private String rfc;
	private byte[] logo;
	@Transient
	private String logoString;
	private int estatus; 
	private Date fec_mod; 
	private String usu_cve;
	@Transient
	private List<GoDomicilio> goDomicilioChildren;
	@Transient
	private List<AvisoPrivacidad> avisoPrivacidadChildren;
	@Transient
	private List<Area> areaChildren;
	@Transient
	private static final long serialVersionUID = 1L;

	public GrupoOrganizacional() {
		super();
	}

	/**
	 * @return the idgo
	 */
	public long getIdgo() {
		return idgo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @return the rfc
	 */
	public String getRfc() {
		return rfc;
	}

	/**
	 * @return the logo
	 */
	public byte[] getLogo() {
		if(logo == null)
			logo = new byte[] {};
		return logo;
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
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @param rfc the rfc to set
	 */
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	/**
	 * @param logo the logo to set
	 */
	public void setLogo(byte[] logo) {
		this.logo = logo;
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
	@Transient
	/**
	 * @return the goDomicilioChildren
	 */
	public List<GoDomicilio> getGoDomicilioChildren() {
		return goDomicilioChildren;
	}
	@Transient
	/**
	 * @return the avisoPrivacidadChildren
	 */
	public List<AvisoPrivacidad> getAvisoPrivacidadChildren() {
		return avisoPrivacidadChildren;
	}
	@Transient
	/**
	 * @return the areaChildren
	 */
	public List<Area> getAreaChildren() {
		return areaChildren;
	}

	/**
	 * @param goDomicilioChildren the goDomicilioChildren to set
	 */
	public void setGoDomicilioChildren(List<GoDomicilio> goDomicilioChildren) {
		this.goDomicilioChildren = goDomicilioChildren;
	}

	/**
	 * @param avisoPrivacidadChildren the avisoPrivacidadChildren to set
	 */
	public void setAvisoPrivacidadChildren(List<AvisoPrivacidad> avisoPrivacidadChildren) {
		this.avisoPrivacidadChildren = avisoPrivacidadChildren;
	}

	/**
	 * @param areaChildren the areaChildren to set
	 */
	public void setAreaChildren(List<Area> areaChildren) {
		this.areaChildren = areaChildren;
	}

	public String getLogoString() {
		logoString = "data:image/png;base64,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";
		if (logo != null) {
			logoString = "data:image/png;base64," + Base64.getEncoder().encodeToString(logo);
		}
		return logoString;
	}

	public void setLogoString(String logoString) {
		this.logoString = logoString;
	}
   
}
