package com.latido.model.entities;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-30T16:01:06.441-0600")
@StaticMetamodel(Inventario.class)
public class Inventario_ {
	public static volatile SingularAttribute<Inventario, Integer> id_inventario;
	public static volatile SingularAttribute<Inventario, String> nombre;
	public static volatile SingularAttribute<Inventario, Integer> estatus;
	public static volatile SingularAttribute<Inventario, Timestamp> fecMod;
	public static volatile SingularAttribute<Inventario, String> usuCve;
	public static volatile SingularAttribute<Inventario, String> descripcion;
	public static volatile SingularAttribute<Inventario, Integer> idAlmacen;
}