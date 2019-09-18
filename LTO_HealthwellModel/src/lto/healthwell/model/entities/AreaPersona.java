package lto.healthwell.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: AreaPersona
 *
 */
@Entity
@Table(name = "area_persona")
@IdClass(AreaPersonaPK.class)
@NamedQueries({
	@NamedQuery(name="AreaPersona.findAll", query="SELECT o FROM AreaPersona o")
})
public class AreaPersona implements Serializable {

	   
	@Id
	private long idgo;   
	@Id
	private long idarea;   
	@Id
	private long idpersona;
	
	private static final long serialVersionUID = 1L;

	public AreaPersona() {
		super();
	}   
	public long getIdgo() {
		return this.idgo;
	}

	public void setIdgo(long idgo) {
		this.idgo = idgo;
	}   
	public long getIdarea() {
		return this.idarea;
	}

	public void setIdarea(long idarea) {
		this.idarea = idarea;
	}   
	public long getIdpersona() {
		return this.idpersona;
	}

	public void setIdpersona(long idpersona) {
		this.idpersona = idpersona;
	}
   
}
