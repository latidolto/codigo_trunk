package com.latido.view.managedbean;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.persistence.TypedQuery;

import com.latido.model.LatidoFacade;
import com.latido.model.entities.Categoria;
import com.latido.view.managedbean.utils.CommonManagedBean;
import com.latido.view.managedbean.utils.JsfUtils;
import com.latido.view.utils.UtilsWeb;

public class Categorias extends CommonManagedBean {

	public Categorias() {
		super(CommonManagedBean.LOGIN_RESOURCE);
	}

	public Categoria getCategoria() {
		return (Categoria) LatidoFacade.getInstance().getEjb(Categoria.class.getName());
	}

	public List<Categoria> getCategorias() {
		List<Categoria> lista = LatidoFacade.getInstance().getFindAllList(Categoria.class.getName());
		return lista;
	}

	public void onSelect(Categoria categoria, String typeOfSelection, String indexes) {
		LatidoFacade.getInstance().setEjb(Categoria.class.getName(), categoria);
		JsfUtils.resfreshComponentById("fields");
	}

	public void registrar(ActionEvent ae) {
		Categoria _categoria = getCategoria();

		if (_categoria.getIdCategoria() <= 0) {
			_categoria.setEstatus(1);
			_categoria.setFecMod(new Timestamp(new Date().getTime()));
			_categoria.setUsuCve("JL101295");
			LatidoFacade.getInstance().setEjb(Categoria.class.getName(), _categoria);
			LatidoFacade.getInstance().persistEjb(Categoria.class.getName());
		} else {
			_categoria.setFecMod(new Timestamp(now().getTime()));
			_categoria.setUsuCve("MODIFIED");
			LatidoFacade.getInstance().setEjb(Categoria.class.getName(), _categoria);
			LatidoFacade.getInstance().mergeEjb(Categoria.class.getName());
		}
		limpiar(ae);
	}

	public void eliminar(ActionEvent ae) {
		Categoria categoria = getCategoria();
		categoria.setEstatus(0);
		categoria.setFecMod(new Timestamp(now().getTime()));
		LatidoFacade.getInstance().setEjb(Categoria.class.getName(), categoria);
		LatidoFacade.getInstance().mergeEjb(Categoria.class.getName());
		limpiar(ae);
	}

	public void limpiar(ActionEvent ae) {
		Categoria categoria = new Categoria();
		LatidoFacade.getInstance().setEjb(Categoria.class.getName(), categoria);
		JsfUtils.resfreshComponentById("fields");
	}

	public java.sql.Date now() {
		java.util.Date d = new java.util.Date();
		java.sql.Date nd = new java.sql.Date(d.getTime());
		return nd;
	}

}
