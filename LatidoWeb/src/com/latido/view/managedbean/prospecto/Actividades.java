package com.latido.view.managedbean.prospecto;

import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.persistence.TypedQuery;

import com.latido.model.LatidoFacade;
import com.latido.model.entities.Actividad;
import com.latido.view.managedbean.utils.CommonManagedBean;
import com.latido.view.managedbean.utils.JsfUtils;

public class Actividades extends CommonManagedBean {

	public Actividades() {
		super(CommonManagedBean.ACTIVIDAD_RESOURCE);
	}

	public Actividad getActividad() {
		return (Actividad) LatidoFacade.getInstance().getEjb(Actividad.class.getName());
	}

	public List<Actividad> getActividades() {
		TypedQuery query = LatidoFacade.getInstance().getEM().createNamedQuery("Actividad.findAllActive",
				Actividad.class);
		List<Actividad> lista = query.getResultList();
		return lista;
	}

	public void registrar(ActionEvent ae) {

		Actividad ac = getActividad();

		if (ac.getIdActividades() == 0) {
			if (ac.getNombre().isEmpty()) {
				String msg = "No se ha escrito nada";
				FacesMessage fm = new FacesMessage();
				fm.setSeverity(FacesMessage.SEVERITY_INFO);
				fm.setSummary("");
				fm.setDetail(msg);
				FacesContext.getCurrentInstance().addMessage(null, fm);
			}
			else {
			ac.setUsuCve("ADMIN");
			ac.setFecMod(new Date());
			ac.setPlan_idPlan(1);

			LatidoFacade.getInstance().persistEjb(Actividad.class.getName());
			}
		} else {
			ac.setFecMod(new Date());
			LatidoFacade.getInstance().mergeEjb(Actividad.class.getName());
		}
	}

	/*
	 * public void actualizar(ActionEvent ae) {
	 * LatidoFacade.getInstance().mergeEjb(Actividad.class.getName());
	 * }
	 */

	public void eliminar(ActionEvent ae) {
		Actividad ac = getActividad();
		ac.setFecMod(new Date());
		ac.setEstatus(0);
		LatidoFacade.getInstance().mergeEjb(Actividad.class.getName());
	}

	public void limpiar(ActionEvent ae) {
		Actividad ac = new Actividad();
		LatidoFacade.getInstance().setEjb(Actividad.class.getName(), ac);
		JsfUtils.resfreshComponentById("panel");
	}

	public void onSelect(Actividad act) {
		LatidoFacade.getInstance().setEjb(Actividad.class.getName(), act);
		JsfUtils.resfreshComponentById("panel");
	}

}