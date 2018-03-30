package com.latido.model.entities;

import java.sql.Timestamp;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-30T16:00:14.294-0600")
@StaticMetamodel(Salida.class)
public class Salida_ {
	public static volatile SingularAttribute<Salida, Integer> idSalida;
	public static volatile SingularAttribute<Salida, Integer> cantidad;
	public static volatile SingularAttribute<Salida, Integer> estatus;
	public static volatile SingularAttribute<Salida, Timestamp> fecha;
	public static volatile SingularAttribute<Salida, Date> fecMod;
	public static volatile SingularAttribute<Salida, String> usuCve;
	public static volatile SingularAttribute<Salida, Articulo> articulo;
	public static volatile SingularAttribute<Salida, Inventario> inventario;
}
