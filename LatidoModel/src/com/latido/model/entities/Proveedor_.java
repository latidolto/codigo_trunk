package com.latido.model.entities;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-30T16:19:33.280-0600")
@StaticMetamodel(Proveedor.class)
public class Proveedor_ {
	public static volatile SingularAttribute<Proveedor, Integer> idProveedor;
	public static volatile SingularAttribute<Proveedor, String> correo;
	public static volatile SingularAttribute<Proveedor, String> direccion;
	public static volatile SingularAttribute<Proveedor, Integer> estatus;
	public static volatile SingularAttribute<Proveedor, Timestamp> fecMod;
	public static volatile SingularAttribute<Proveedor, String> nombre;
	public static volatile SingularAttribute<Proveedor, Integer> sistema_idSistema;
	public static volatile SingularAttribute<Proveedor, String> telefono;
	public static volatile SingularAttribute<Proveedor, String> usuCve;
}
