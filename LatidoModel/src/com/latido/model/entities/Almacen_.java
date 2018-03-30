package com.latido.model.entities;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-30T16:00:14.175-0600")
@StaticMetamodel(Almacen.class)
public class Almacen_ {
	public static volatile SingularAttribute<Almacen, AlmacenPK> id;
	public static volatile SingularAttribute<Almacen, Integer> estatus;
	public static volatile SingularAttribute<Almacen, Timestamp> fecMod;
	public static volatile SingularAttribute<Almacen, String> nombre;
	public static volatile SingularAttribute<Almacen, String> usuCve;
	public static volatile SingularAttribute<Almacen, Sistema> sistema;
}
