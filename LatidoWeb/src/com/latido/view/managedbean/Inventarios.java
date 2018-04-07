package com.latido.view.managedbean;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.persistence.TypedQuery;

import com.latido.model.LatidoFacade;
import com.latido.model.entities.Categoria;
import com.latido.model.entities.Inventario;
import com.latido.model.entities.Multivaluada;
import com.latido.view.managedbean.utils.CommonManagedBean;
import com.latido.view.managedbean.utils.JsfUtils;

public class Inventarios extends CommonManagedBean {

	public Inventarios() {
		super(CommonManagedBean.LOGIN_RESOURCE);
	}

	public Inventario getInventario() {
		return (Inventario) LatidoFacade.getInstance().getEjb(Inventario.class.getName());
	}

	public List<Inventario> getInventarios() {
		List<Inventario> lista = LatidoFacade.getInstance().getFindAllList(Inventario.class.getName());
		return lista;
	}

	public void onSelect(Inventario categoria, String typeOfSelection, String indexes) {
		LatidoFacade.getInstance().setEjb(Inventario.class.getName(), categoria);
		JsfUtils.resfreshComponentById("fields");
	}

	public void registrar(ActionEvent ae) {
		Inventario inventario = getInventario();

		if (inventario.getId_inventario() <= 0) {
			inventario.setIdAlmacen(1);
			inventario.setFecMod(new Timestamp(new Date().getTime()));
			inventario.setUsuCve("JL101295");
			LatidoFacade.getInstance().setEjb(Inventario.class.getName(), inventario);
			LatidoFacade.getInstance().persistEjb(Inventario.class.getName());
		} else {
			inventario.setFecMod(new Timestamp(now().getTime()));
			inventario.setUsuCve("MODIFIED");
			LatidoFacade.getInstance().setEjb(Inventario.class.getName(), inventario);
			LatidoFacade.getInstance().mergeEjb(Inventario.class.getName());
		}
		limpiar(ae);
	}

	public void eliminar(ActionEvent ae) {
		Inventario inventario = getInventario();
		inventario.setEstatus(0);
		inventario.setFecMod(new Timestamp(now().getTime()));
		LatidoFacade.getInstance().setEjb(Categoria.class.getName(), inventario);
		LatidoFacade.getInstance().mergeEjb(Categoria.class.getName());
		limpiar(ae);
	}

	public void limpiar(ActionEvent ae) {
		Inventario categoria = new Inventario();
		LatidoFacade.getInstance().setEjb(Inventario.class.getName(), categoria);
		JsfUtils.resfreshComponentById("fields");
	}

	public List<Multivaluada> getEstado() {
		TypedQuery<Multivaluada> query = LatidoFacade.getInstance().getEM().createNamedQuery("Multivaluada.findByClave",
				Multivaluada.class);
		query.setParameter("p_clave", "0001");
		List<Multivaluada> result = query.getResultList();
		return result;
	}

	public java.sql.Date now() {
		java.util.Date d = new java.util.Date();
		java.sql.Date nd = new java.sql.Date(d.getTime());
		return nd;
	}

}
