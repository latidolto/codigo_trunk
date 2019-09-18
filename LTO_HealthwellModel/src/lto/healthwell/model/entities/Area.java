package lto.healthwell.model.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Area
 *
 */
@Entity
@Table(name="area")
@NamedQueries({
	@NamedQuery(name="Area.findAll", query="SELECT o FROM Area o"),
	@NamedQuery(name="Area.findChildrens", query="SELECT o FROM Area o where o.idarea_padre = :p_idarea_padre"),
	@NamedQuery(name="Area.findParents", query="SELECT o FROM Area o where o.idarea_padre is null and o.idgo = :p_idgo")
})
public class Area implements Serializable {
	private long idgo; 
	@Id
	private long idarea; 
	private Long idarea_padre; 
	private String nombre;
	private String descripcion; 
	private byte[] logo;
	private int estatus; 
	private Date fec_mod; 
	private String usu_cve;
	@Transient
	private List<Area> children;
	@Transient
	private static final long serialVersionUID = 1L;

	public Area() {
		super();
	}

	/**
	 * @return the idgo
	 */
	public long getIdgo() {
		return idgo;
	}

	/**
	 * @return the idarea
	 */
	public long getIdarea() {
		return idarea;
	}

	/**
	 * @return the idarea_padre
	 */
	public Long getIdarea_padre() {
		return idarea_padre;
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
	 * @return the logo
	 */
	public byte[] getLogo() {
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
	 * @param idarea the idarea to set
	 */
	public void setIdarea(long idarea) {
		this.idarea = idarea;
	}

	/**
	 * @param idarea_padre the idarea_padre to set
	 */
	public void setIdarea_padre(Long idarea_padre) {
		this.idarea_padre = idarea_padre;
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

	public List<Area> getChildren() {
		return children;
	}

	public void setChildren(List<Area> children) {
		this.children = children;
	}
   
}
