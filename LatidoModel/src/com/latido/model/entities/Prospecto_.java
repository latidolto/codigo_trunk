package com.latido.model.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-04-22T16:00:13.377-0500")
@StaticMetamodel(Prospecto.class)
public class Prospecto_ {
	public static volatile SingularAttribute<Prospecto, Integer> idProspecto;
	public static volatile SingularAttribute<Prospecto, String> contacto;
	public static volatile SingularAttribute<Prospecto, Integer> estatus;
	public static volatile SingularAttribute<Prospecto, Date> fecMod;
	public static volatile SingularAttribute<Prospecto, String> nombre;
	public static volatile SingularAttribute<Prospecto, String> nombreOrganizacional;
	public static volatile SingularAttribute<Prospecto, String> telefono1;
	public static volatile SingularAttribute<Prospecto, String> telefono2;
	public static volatile SingularAttribute<Prospecto, String> usuCve;
}
