package com.latido.view.managedbean.prospecto;

import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.persistence.TypedQuery;
import javax.servlet.http.Part;

import com.latido.model.LatidoFacade;
import com.latido.model.entities.Documentacion;
import com.latido.view.managedbean.utils.CommonManagedBean;
import com.latido.view.managedbean.utils.JsfUtils;

public class Documentaciones extends CommonManagedBean {
	
	private Part file;

	public Documentaciones() {
		super("Documentacion");
	}

	public Documentacion getDocumentacion() {
		return (Documentacion) LatidoFacade.getInstance().getEjb(Documentacion.class.getName());
	}

	public List<Documentacion> getDocumentaciones() {
		/*
		 * TypedQuery query = LatidoFacade.getInstance().getEM().createNamedQuery(
		 * "Actividad.findAllActive", Documentacion.class); List<Documentacion> lista =
		 * query.getResultList();
		 */

		List<Documentacion> lista = LatidoFacade.getInstance().getFindAllList(Documentacion.class.getName());
		return lista;
	}

	public void registrar(ActionEvent ae) {

		Documentacion doc = getDocumentacion();

		// if (doc.getIdDocumentacion() == 0) {
		if (doc.getNombre().isEmpty()) {
			doc.setIdDocumentacion(1);
			//doc.setArchivo(DocumentacionDAO.getInstance().getBytes());
			String msg = "No se ha escrito nada";
			FacesMessage fm = new FacesMessage();
			fm.setSeverity(FacesMessage.SEVERITY_INFO);
			fm.setSummary("");
			fm.setDetail(msg);
			FacesContext.getCurrentInstance().addMessage(null, fm);
		} else {
			doc.setUsuCve("ADMIN");
			//doc.setArchivo(DocumentacionDAO.getInstance().getBytes());
			doc.setFecMod(new Date());
			doc.setProspecto_idProspecto(1);

			LatidoFacade.getInstance().persistEjb(Documentacion.class.getName());
		}
		/*
		 * } else { doc.setFecMod(new Date());
		 * LatidoFacade.getInstance().mergeEjb(Documentacion.class.getName()); }
		 */
	}

	/*
	 * public void actualizar(ActionEvent ae) {
	 * LatidoFacade.getInstance().mergeEjb(Actividad.class.getName()); }
	 */

	public void eliminar(ActionEvent ae) {
		Documentacion doc = getDocumentacion();
		doc.setFecMod(new Date());
		doc.setEstatus(0);
		LatidoFacade.getInstance().mergeEjb(Documentacion.class.getName());
	}

	public void limpiar(ActionEvent ae) {
		Documentacion doc = new Documentacion();
		LatidoFacade.getInstance().setEjb(Documentacion.class.getName(), doc);
		JsfUtils.resfreshComponentById("panel");
	}

	public void onSelect(Documentacion doc) {
		LatidoFacade.getInstance().setEjb(Documentacion.class.getName(), doc);
		JsfUtils.resfreshComponentById("panel");
	}
	
	public Part getFile() {
		return null;
		//return DocumentacionDAO.getInstance().getPart();
	}

	public void setFile(Part file) {
		//DocumentacionDAO.getInstance().setPart(file);
	}

}
