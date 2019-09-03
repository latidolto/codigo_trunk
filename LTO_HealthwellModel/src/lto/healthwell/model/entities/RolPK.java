package lto.healthwell.model.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * ID class for entity: Rol
 *
 */ 
@Embeddable
public class RolPK  implements Serializable {   
   
	         
	private long idgo;         
	private long idarea;         
	private long idrol;
	private static final long serialVersionUID = 1L;

	public RolPK() {}

	

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
	

	public long getIdrol() {
		return this.idrol;
	}

	public void setIdrol(long idrol) {
		this.idrol = idrol;
	}
	
   
	/*
	 * @see java.lang.Object#equals(Object)
	 */	
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof RolPK)) {
			return false;
		}
		RolPK other = (RolPK) o;
		return true
			&& getIdgo() == other.getIdgo()
			&& getIdarea() == other.getIdarea()
			&& getIdrol() == other.getIdrol();
	}
	
	/*	 
	 * @see java.lang.Object#hashCode()
	 */	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((int) (getIdgo() ^ (getIdgo() >>> 32)));
		result = prime * result + ((int) (getIdarea() ^ (getIdarea() >>> 32)));
		result = prime * result + ((int) (getIdrol() ^ (getIdrol() >>> 32)));
		return result;
	}
   
   
}
