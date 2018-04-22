package com.latido.view.managedbean.prospecto;

import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.persistence.TypedQuery;

import com.latido.model.LatidoFacade;
import com.latido.model.entities.Plan;
import com.latido.view.managedbean.utils.CommonManagedBean;
import com.latido.view.managedbean.utils.JsfUtils;

public class Planes extends CommonManagedBean {

	public Planes() {
		super(CommonManagedBean.PLAN_RESOURCE);
	}
	
	public Plan getPlan() {
		return (Plan) LatidoFacade.getInstance().getEjb(Plan.class.getName());
	}

	public List<Plan> getPlanes() {
		TypedQuery query = LatidoFacade.getInstance().getEM().createNamedQuery("Plan.findAllActive",Plan.class);
		List<Plan> lista = query.getResultList();
		
		//List<Plan> lista = LatidoFacade.getInstance().getFindAllList(Plan.class.getName());
		return lista;
	}

	public void registrar(ActionEvent ae) {

		Plan pl = getPlan();

		if (pl.getIdPlan() == 0) {
			if (pl.getNombre().isEmpty()) {
				String msg = "Por favor ingrese todo los datos antes de guardar";
				FacesMessage fm = new FacesMessage();
				fm.setSeverity(FacesMessage.SEVERITY_INFO);
				fm.setSummary("");
				fm.setDetail(msg);
				FacesContext.getCurrentInstance().addMessage(null, fm);
			}
			else {
				pl.setUsuCve("ADMIN");
				pl.setFecMod(new Date());
				pl.setProspecto_idProspecto(1);
				LatidoFacade.getInstance().persistEjb(Plan.class.getName());
			}
		} else {
			pl.setFecMod(new Date());
			LatidoFacade.getInstance().mergeEjb(Plan.class.getName());
		}
	}

	/*
	 * public void actualizar(ActionEvent ae) {
	 * LatidoFacade.getInstance().mergeEjb(Plan.class.getName());
	 * }
	 */

	public void eliminar(ActionEvent ae) {
		Plan pl = getPlan();
		pl.setFecMod(new Date());
		pl.setEstatus(0);
		LatidoFacade.getInstance().mergeEjb(Plan.class.getName());
	}

	public void limpiar(ActionEvent ae) {
		Plan pl = new Plan();
		LatidoFacade.getInstance().setEjb(Plan.class.getName(), pl);
		JsfUtils.resfreshComponentById("panel");
	}

	public void onSelect(Plan plan) {
		LatidoFacade.getInstance().setEjb(Plan.class.getName(), plan);
		JsfUtils.resfreshComponentById("panel");
	}
}
