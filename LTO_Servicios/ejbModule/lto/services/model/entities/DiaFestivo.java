package lto.services.model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the dia_festivo database table.
 * 
 */
@Entity
@Table(name="dia_festivo")
@NamedQuery(name="DiaFestivo.findAll", query="SELECT d FROM DiaFestivo d")
public class DiaFestivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DiaFestivoPK id;

	private int dia;

	private int mes;

	public DiaFestivo() {
	}

	public DiaFestivoPK getId() {
		return this.id;
	}

	public void setId(DiaFestivoPK id) {
		this.id = id;
	}

	public int getDia() {
		return this.dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return this.mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

}