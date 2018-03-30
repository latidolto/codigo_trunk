package com.latido.model.entities;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-30T16:19:33.260-0600")
@StaticMetamodel(Articulo.class)
public class Articulo_ {
	public static volatile SingularAttribute<Articulo, Integer> idArticulo;
	public static volatile SingularAttribute<Articulo, Integer> cantidad;
	public static volatile SingularAttribute<Articulo, String> clave;
	public static volatile SingularAttribute<Articulo, Integer> codigo;
	public static volatile SingularAttribute<Articulo, Integer> estatus;
	public static volatile SingularAttribute<Articulo, Timestamp> fecMod;
	public static volatile SingularAttribute<Articulo, Integer> inventario_idInventario;
	public static volatile SingularAttribute<Articulo, String> nombre;
	public static volatile SingularAttribute<Articulo, Integer> precio;
	public static volatile SingularAttribute<Articulo, String> usuCve;
}
