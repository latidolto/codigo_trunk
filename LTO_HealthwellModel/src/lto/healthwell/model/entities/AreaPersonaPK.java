package lto.healthwell.model.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * ID class for entity: AreaPersona
 *
 */ 
@Embeddable
public class AreaPersonaPK  implements Serializable {   
   
	         
	private long idgo;         
	private long idarea;         
	private long idpersona;
	private static final long serialVersionUID = 1L;

	public AreaPersonaPK() {}

	

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
	
   
	/*
	 * @see java.lang.Object#equals(Object)
	 */	
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof AreaPersonaPK)) {
			return false;
		}
		AreaPersonaPK other = (AreaPersonaPK) o;
		return true
			&& getIdgo() == other.getIdgo()
			&& getIdarea() == other.getIdarea()
			&& getIdpersona() == other.getIdpersona();
	}
	
	/*	 
	 * @see java.lang.Object#hashCode()
	 */	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((int) (getIdgo() ^ (getIdgo() >>> 32)));
		result = prime * result + ((int) (getIdarea() ^ (getIdarea() >>> 32)));
		result = prime * result + ((int) (getIdpersona() ^ (getIdpersona() >>> 32)));
		return result;
	}
   
   
}
