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
import com.latido.model.entities.Categoria;
import com.latido.model.entities.Multivaluada;
import com.latido.model.entities.Proveedor;
import com.latido.view.managedbean.utils.CommonManagedBean;
import com.latido.view.managedbean.utils.JsfUtils;
import com.latido.view.utils.UtilsWeb;

public class Proveedores extends CommonManagedBean {

	String estado;

	public Proveedores() {
		super(CommonManagedBean.LOGIN_RESOURCE);
	}

	public Proveedor getProveedor() {
		return (Proveedor) LatidoFacade.getInstance().getEjb(Proveedor.class.getName());
	}

	public List<Proveedor> getProveedores() {
		List<Proveedor> lista = LatidoFacade.getInstance().getFindAllList(Proveedor.class.getName());
		return lista;
	}

	public List<Multivaluada> getEstado() {
		TypedQuery<Multivaluada> query = LatidoFacade.getInstance().getEM().createNamedQuery("Multivaluada.findByClave",
				Multivaluada.class);
		query.setParameter("p_clave", "0001");
		List<Multivaluada> result = query.getResultList();
		return result;
	}

	public void onSelect(Proveedor proveedor, String typeOfSelection, String indexes) {
		LatidoFacade.getInstance().setEjb(Proveedor.class.getName(), proveedor);
		JsfUtils.resfreshComponentById("fields");
	}

	public void registrar(ActionEvent ae) {
		Proveedor proveedor = getProveedor();
		if (proveedor.getIdProveedor() == 0) {
			insertar(proveedor);
		} else {
			actualizar(proveedor);
		}
		limpiar(ae);
	}

	public void insertar(Proveedor proveedor) {
		proveedor.setFecMod(new Timestamp(new Date().getTime()));
		proveedor.setUsuCve("JL101295");
		proveedor.setSistema_idSistema(2);
		LatidoFacade.getInstance().setEjb(Proveedor.class.getName(), proveedor);
		LatidoFacade.getInstance().persistEjb(Proveedor.class.getName());
	}

	public void actualizar(Proveedor proveedor) {
		proveedor.setFecMod(new Timestamp(now().getTime()));
		proveedor.setUsuCve("MODIFIED");
		LatidoFacade.getInstance().setEjb(Proveedor.class.getName(), proveedor);
		LatidoFacade.getInstance().mergeEjb(Proveedor.class.getName());
	}

	public void eliminar(ActionEvent ae) {
		Proveedor proveedor = getProveedor();
		proveedor.setEstatus(0);
		proveedor.setFecMod(new Timestamp(now().getTime()));
		LatidoFacade.getInstance().setEjb(Proveedor.class.getName(), proveedor);
		LatidoFacade.getInstance().mergeEjb(Proveedor.class.getName());
		limpiar(ae);
	}

	public void limpiar(ActionEvent ae) {
		Proveedor proveedor = new Proveedor();
		LatidoFacade.getInstance().setEjb(Proveedor.class.getName(), proveedor);
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
