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
import com.latido.model.entities.Articulo;
import com.latido.model.entities.Articulocategoria;
import com.latido.model.entities.Articuloproveedor;
import com.latido.model.entities.Categoria;
import com.latido.model.entities.Multivaluada;
import com.latido.model.entities.Proveedor;
import com.latido.model.views.ViewArticuloCategoria;
import com.latido.model.views.ViewArticuloProveedor;
import com.latido.view.managedbean.utils.CommonManagedBean;
import com.latido.view.managedbean.utils.JsfUtils;
import com.latido.view.utils.UtilsWeb;

public class Articulos extends CommonManagedBean {

	private int idCategoria = 0;
	private int idProveedor = 0;

	public Articulos() {
		super(CommonManagedBean.LOGIN_RESOURCE);
	}

	public Articulo getArticulo() {
		return (Articulo) LatidoFacade.getInstance().getEjb(Articulo.class.getName());
	}

	public List<Articulo> getArticulos() {
		List<Articulo> lista = LatidoFacade.getInstance().getFindAllList(Articulo.class.getName());
		return lista;
	}

	public List<ViewArticuloCategoria> getArticulosCategoria() {
		TypedQuery<ViewArticuloCategoria> query = LatidoFacade.getInstance().getEM()
				.createNamedQuery("ViewArticuloCategoria.findById", ViewArticuloCategoria.class);
		Articulo articulo = (Articulo) LatidoFacade.getInstance().getEjb(Articulo.class.getName());
		if (articulo == null) {
			query.setParameter("p_id", 0);
		} else {
			query.setParameter("p_id", articulo.getIdArticulo());
		}
		List<ViewArticuloCategoria> result = query.getResultList();
		return result;
	}

	public List<ViewArticuloProveedor> getArticulosProveedor() {
		TypedQuery<ViewArticuloProveedor> query = LatidoFacade.getInstance().getEM()
				.createNamedQuery("ViewArticuloProveedor.findById", ViewArticuloProveedor.class);
		Articulo articulo = (Articulo) LatidoFacade.getInstance().getEjb(Articulo.class.getName());
		if (articulo == null) {
			query.setParameter("p_id", 0);
		} else {
			query.setParameter("p_id", articulo.getIdArticulo());
		}
		List<ViewArticuloProveedor> result = query.getResultList();
		return result;
	}

	public List<Categoria> getCategoriasReg() {
		List<ViewArticuloCategoria> result = getArticulosCategoria();
		TypedQuery<Categoria> query2 = LatidoFacade.getInstance().getEM().createNamedQuery("Categoria.findAll",
				Categoria.class);
		List<Categoria> categorias = query2.getResultList();

		for (int i = 0; i < categorias.size(); i++) {
			int id = categorias.get(i).getIdCategoria();
			boolean coincidencia = false;
			for (int j = 0; j < result.size(); j++) {
				if (!coincidencia && result.get(j).getCategoria_idCategoria() == id) {
					coincidencia = Boolean.TRUE;
				}
			}
			if (!coincidencia) {
				categorias.remove(i--);
			}
		}
		return categorias;
	}

	public List<Proveedor> getProveedoresReg() {
		List<ViewArticuloProveedor> result = getArticulosProveedor();
		TypedQuery<Proveedor> query2 = LatidoFacade.getInstance().getEM().createNamedQuery("Proveedor.findAll",
				Proveedor.class);
		List<Proveedor> proveedores = query2.getResultList();

		for (int i = 0; i < proveedores.size(); i++) {
			int id = proveedores.get(i).getIdProveedor();
			boolean coincidencia = false;
			for (int j = 0; j < result.size(); j++) {
				if (!coincidencia && result.get(j).getProveedor_idProveedor() == id) {
					coincidencia = Boolean.TRUE;
				}
			}
			if (!coincidencia) {
				proveedores.remove(i--);
			}
		}
		return proveedores;
	}

	public List<Categoria> getCategorias() {
		TypedQuery<Categoria> query = LatidoFacade.getInstance().getEM().createNamedQuery("Categoria.findAll",
				Categoria.class);
		List<Categoria> result = query.getResultList();

		Articulo articulo = (Articulo) LatidoFacade.getInstance().getEjb(Articulo.class.getName());
		if (articulo != null) {
			List<ViewArticuloCategoria> articuloCategorias = getArticulosCategoria();
			for (int i = 0; i < articuloCategorias.size(); i++) {
				int idArticulo = articuloCategorias.get(i).getCategoria_idCategoria();
				for (int j = 0; j < result.size(); j++) {
					if (result.get(j).getIdCategoria() == idArticulo) {
						result.remove(j);
						j--;
					}
				}
			}
		}

		return result;
	}

	public List<Proveedor> getProveedores() {
		TypedQuery<Proveedor> query = LatidoFacade.getInstance().getEM().createNamedQuery("Proveedor.findAll",
				Proveedor.class);
		List<Proveedor> result = query.getResultList();

		Articulo articulo = (Articulo) LatidoFacade.getInstance().getEjb(Articulo.class.getName());
		if (articulo != null) {
			List<ViewArticuloProveedor> articuloProveedor = getArticulosProveedor();
			for (int i = 0; i < articuloProveedor.size(); i++) {
				int idArticulo = articuloProveedor.get(i).getProveedor_idProveedor();
				for (int j = 0; j < result.size(); j++) {
					if (result.get(j).getIdProveedor() == idArticulo) {
						result.remove(j);
						j--;
					}
				}
			}
		}

		return result;
	}

	public void onSelect(Articulo articulo, String typeOfSelection, String indexes) {
		LatidoFacade.getInstance().setEjb(Articulo.class.getName(), articulo);
		JsfUtils.resfreshComponentById("fields");
	}

	public void registrar(ActionEvent ae) {
		Articulo _articulo = getArticulo();

		if (_articulo.getIdArticulo() <= 0) {
			_articulo.setFecMod(new Timestamp(new Date().getTime()));
			_articulo.setUsuCve("JL101295");
			_articulo.setInventario_idInventario(1);
			LatidoFacade.getInstance().setEjb(Categoria.class.getName(), _articulo);
			LatidoFacade.getInstance().persistEjb(Categoria.class.getName());
		} else {
			_articulo.setFecMod(new Timestamp(now().getTime()));
			_articulo.setUsuCve("MODIFIED");
			LatidoFacade.getInstance().setEjb(Articulo.class.getName(), _articulo);
			LatidoFacade.getInstance().mergeEjb(Articulo.class.getName());
		}
		limpiar(ae);
	}

	public void eliminar(ActionEvent ae) {
		Articulo articulo = getArticulo();
		articulo.setEstatus(0);
		articulo.setFecMod(new Timestamp(now().getTime()));
		LatidoFacade.getInstance().setEjb(Categoria.class.getName(), articulo);
		LatidoFacade.getInstance().mergeEjb(Categoria.class.getName());
		limpiar(ae);
	}

	public void limpiar(ActionEvent ae) {
		Articulo articulo = new Articulo();
		LatidoFacade.getInstance().setEjb(Articulo.class.getName(), articulo);
		JsfUtils.resfreshComponentById("fields");
	}

	public void vincularCategoria(ActionEvent ae) {
		Articulo articulo = getArticulo();
		if (articulo != null && idCategoria > 0) {
			Articulocategoria articulocategoria = new Articulocategoria();
			articulocategoria.setArticulo_idArticulo(articulo.getIdArticulo());
			articulocategoria.setCategoria_idCategoria(idCategoria);

			LatidoFacade.getInstance().setEjb(Articulocategoria.class.getName(), articulocategoria);
			LatidoFacade.getInstance().persistEjb(Articulocategoria.class.getName());
			limpiar(ae);
		}
	}

	public void vincularProveedor(ActionEvent ae) {
		Articulo articulo = getArticulo();
		if (articulo != null && idProveedor > 0) {
			Articuloproveedor articuloproveedor = new Articuloproveedor();
			articuloproveedor.setArticulo_idArticulo(articulo.getIdArticulo());
			articuloproveedor.setProveedor_idProveedor(idProveedor);

			LatidoFacade.getInstance().setEjb(Articuloproveedor.class.getName(), articuloproveedor);
			LatidoFacade.getInstance().persistEjb(Articuloproveedor.class.getName());
			limpiar(ae);
		}
	}

	public java.sql.Date now() {
		java.util.Date d = new java.util.Date();
		java.sql.Date nd = new java.sql.Date(d.getTime());
		return nd;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

}
