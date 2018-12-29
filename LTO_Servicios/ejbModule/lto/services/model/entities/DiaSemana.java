package lto.services.model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the dia_semana database table.
 * 
 */
@Entity
@Table(name="dia_semana")
@NamedQuery(name="DiaSemana.findAll", query="SELECT d FROM DiaSemana d")
public class DiaSemana implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DiaSemanaPK id;

	@Column(name="dia_laborable")
	private int diaLaborable;

	@Column(name="dia_semana")
	private int diaSemana;

	public DiaSemana() {
	}

	public DiaSemanaPK getId() {
		return this.id;
	}

	public void setId(DiaSemanaPK id) {
		this.id = id;
	}

	public int getDiaLaborable() {
		return this.diaLaborable;
	}

	public void setDiaLaborable(int diaLaborable) {
		this.diaLaborable = diaLaborable;
	}

	public int getDiaSemana() {
		return this.diaSemana;
	}

	public void setDiaSemana(int diaSemana) {
		this.diaSemana = diaSemana;
	}

}