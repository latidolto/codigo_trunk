package lto.healthwell.model.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * ID class for entity: PersonaRol
 *
 */ 
@Embeddable
public class PersonaRolPK  implements Serializable {   
   
	         
	private long idpersona;         
	private long idpersona_rol;
	private static final long serialVersionUID = 1L;

	public PersonaRolPK() {}

	

	public long getIdpersona() {
		return this.idpersona;
	}

	public void setIdpersona(long idpersona) {
		this.idpersona = idpersona;
	}
	

	public long getIdpersona_rol() {
		return this.idpersona_rol;
	}

	public void setIdpersona_rol(long idpersona_rol) {
		this.idpersona_rol = idpersona_rol;
	}
	
   
	/*
	 * @see java.lang.Object#equals(Object)
	 */	
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof PersonaRolPK)) {
			return false;
		}
		PersonaRolPK other = (PersonaRolPK) o;
		return true
			&& getIdpersona() == other.getIdpersona()
			&& getIdpersona_rol() == other.getIdpersona_rol();
	}
	
	/*	 
	 * @see java.lang.Object#hashCode()
	 */	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((int) (getIdpersona() ^ (getIdpersona() >>> 32)));
		result = prime * result + ((int) (getIdpersona_rol() ^ (getIdpersona_rol() >>> 32)));
		return result;
	}
   
   
}
