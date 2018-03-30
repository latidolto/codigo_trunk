package com.latido.view.managedbean;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.persistence.TypedQuery;

import com.latido.model.LatidoFacade;
import com.latido.model.entities.Almacen;
import com.latido.model.entities.Categoria;
import com.latido.model.entities.Multivaluada;
import com.latido.model.entities.Proveedor;
import com.latido.view.managedbean.utils.CommonManagedBean;
import com.latido.view.managedbean.utils.JsfUtils;
import com.latido.view.utils.UtilsWeb;

public class Almacenes extends CommonManagedBean {

	String estado;

	public Almacenes() {
		super(CommonManagedBean.LOGIN_RESOURCE);
	}

	public Almacen getAlmacen() {
		return (Almacen) LatidoFacade.getInstance().getEjb(Almacen.class.getName());
	}

	public List<Almacen> getAlmacenes() {
		List<Almacen> lista = LatidoFacade.getInstance().getFindAllList(Almacen.class.getName());
		return lista;
	}

	public List<Multivaluada> getEstado() {
		TypedQuery<Multivaluada> query = LatidoFacade.getInstance().getEM().createNamedQuery("Multivaluada.findByClave",
				Multivaluada.class);
		query.setParameter("p_clave", "0001");
		List<Multivaluada> result = query.getResultList();
		return result;
	}

	public void onSelect(Almacen almacen, String typeOfSelection, String indexes) {
		LatidoFacade.getInstance().setEjb(Almacen.class.getName(), almacen);
		JsfUtils.resfreshComponentById("fields");
	}

	public void registrar(ActionEvent ae) {
		Almacen almacen = getAlmacen();
		if (almacen.getId() == null || almacen.getId().getIdAlmacen() == 0) {
			insertar(almacen);
		} else {
			actualizar(almacen);
		}
		limpiar(ae);
	}

	public void insertar(Almacen alamacen) {
		alamacen.setFecMod(new Timestamp(new Date().getTime()));
		alamacen.setUsuCve("JL101295");
		alamacen.getId().setSistema_idSistema(1);
		LatidoFacade.getInstance().setEjb(Almacen.class.getName(), alamacen);
		LatidoFacade.getInstance().persistEjb(Almacen.class.getName());
	}

	public void actualizar(Almacen almacen) {
		almacen.setFecMod(new Timestamp(now().getTime()));
		almacen.setUsuCve("MODIFIED");
		LatidoFacade.getInstance().setEjb(Almacen.class.getName(), almacen);
		LatidoFacade.getInstance().mergeEjb(Almacen.class.getName());
	}

	public void eliminar(ActionEvent ae) {
		Almacen almacen = getAlmacen();
		almacen.setEstatus(0);
		almacen.setFecMod(new Timestamp(now().getTime()));
		LatidoFacade.getInstance().setEjb(Almacen.class.getName(), almacen);
		LatidoFacade.getInstance().mergeEjb(Almacen.class.getName());
		limpiar(ae);
	}

	public void limpiar(ActionEvent ae) {
		Almacen almacen = new Almacen();
		LatidoFacade.getInstance().setEjb(Almacen.class.getName(), almacen);
		JsfUtils.resfreshComponentById("formPrincipal");
	}

	public java.sql.Date now() {
		java.util.Date d = new java.util.Date();
		java.sql.Date nd = new java.sql.Date(d.getTime());
		return nd;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
