package com.latido.model.entities;

import java.sql.Timestamp;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-30T16:00:14.279-0600")
@StaticMetamodel(Entrada.class)
public class Entrada_ {
	public static volatile SingularAttribute<Entrada, Integer> idEntrada;
	public static volatile SingularAttribute<Entrada, Integer> cantidad;
	public static volatile SingularAttribute<Entrada, Integer> estatus;
	public static volatile SingularAttribute<Entrada, Timestamp> fecha;
	public static volatile SingularAttribute<Entrada, Date> fecMod;
	public static volatile SingularAttribute<Entrada, String> usuCve;
	public static volatile SingularAttribute<Entrada, Articulo> articulo;
	public static volatile SingularAttribute<Entrada, Inventario> inventario;
}
