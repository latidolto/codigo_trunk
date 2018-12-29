package com.latido.view.managedbean.prospecto;

import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.persistence.TypedQuery;

import com.latido.model.LatidoFacade;
import com.latido.model.entities.Prospecto;
import com.latido.view.managedbean.utils.CommonManagedBean;
import com.latido.view.managedbean.utils.JsfUtils;

public class Prospectos extends CommonManagedBean {
	
	public Prospectos() {
		super("Prospecto");
	}

	public Prospecto getProspecto() {
		return (Prospecto) LatidoFacade.getInstance().getEjb(Prospecto.class.getName());
	}

	public List<Prospecto> getProspectos() {
		TypedQuery query = LatidoFacade.getInstance().getEM().createNamedQuery("Prospecto.findAllActive",
				Prospecto.class);
		List<Prospecto> lista = query.getResultList();
		return lista;
	}

	public void registrar(ActionEvent ae) {
		Prospecto pr = getProspecto();

		if (pr.getIdProspecto() == 0) {
			if (pr.getNombre().isEmpty()) {
				String msg = "No se ha escrito nada";
				FacesMessage fm = new FacesMessage();
				fm.setSeverity(FacesMessage.SEVERITY_INFO);
				fm.setSummary("");
				fm.setDetail(msg);
				FacesContext.getCurrentInstance().addMessage(null, fm);
			}
			else {
				pr.setUsuCve("ADMIN");
				pr.setFecMod(new Date());

			LatidoFacade.getInstance().persistEjb(Prospecto.class.getName());
			}
		} else {
			pr.setFecMod(new Date());
			LatidoFacade.getInstance().mergeEjb(Prospecto.class.getName());
		}
	}

	/*
	 * public void actualizar(ActionEvent ae) {
	 * LatidoFacade.getInstance().mergeEjb(Actividad.class.getName());
	 * }
	 */

	public void eliminar(ActionEvent ae) {
		Prospecto pr = getProspecto();
		pr.setFecMod(new Date());
		pr.setEstatus(0);
		LatidoFacade.getInstance().mergeEjb(Prospecto.class.getName());
		pr = new Prospecto();
		LatidoFacade.getInstance().setEjb(Prospecto.class.getName(), pr);
	}

	public void limpiar(ActionEvent ae) {
		Prospecto pr = new Prospecto();
		LatidoFacade.getInstance().setEjb(Prospecto.class.getName(), pr);
		JsfUtils.resfreshComponentById("panel");
	}

	public void onSelect(Prospecto pr) {
		LatidoFacade.getInstance().setEjb(Prospecto.class.getName(), pr);
		JsfUtils.resfreshComponentById("panel");
	}
}
