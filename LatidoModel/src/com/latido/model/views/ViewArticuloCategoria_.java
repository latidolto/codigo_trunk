package com.latido.model.views;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-07-19T12:09:26.721-0500")
@StaticMetamodel(ViewArticuloCategoria.class)
public class ViewArticuloCategoria_ {
	public static volatile SingularAttribute<ViewArticuloCategoria, Integer> articulo_idArticulo;
	public static volatile SingularAttribute<ViewArticuloCategoria, Integer> categoria_idCategoria;
	public static volatile SingularAttribute<ViewArticuloCategoria, Integer> estatus;
	public static volatile SingularAttribute<ViewArticuloCategoria, Timestamp> fecMod;
	public static volatile SingularAttribute<ViewArticuloCategoria, Integer> idCategoria;
	public static volatile SingularAttribute<ViewArticuloCategoria, String> nombre;
	public static volatile SingularAttribute<ViewArticuloCategoria, String> usuCve;
}
