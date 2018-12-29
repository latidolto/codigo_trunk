package lto.services.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="contacto")
@NamedQueries({
	@NamedQuery(name="Contacto.findAll", query="SELECT c FROM Contacto c"),
	@NamedQuery(name="Contacto.findById", query="SELECT c FROM Contacto c ")
})
public class Contacto implements Serializable{
	
	@Id
	@Column(name="id_contacto")
	private int idContacto;

	public int getIdContacto() {
		return idContacto;
	}

	public void setIdContacto(int idContacto) {
		this.idContacto = idContacto;
	}
}
