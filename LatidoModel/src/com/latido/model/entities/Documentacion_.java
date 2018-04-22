package com.latido.model.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-04-22T17:17:21.207-0500")
@StaticMetamodel(Documentacion.class)
public class Documentacion_ {
	public static volatile SingularAttribute<Documentacion, Integer> idDocumentacion;
	public static volatile SingularAttribute<Documentacion, byte[]> archivo;
	public static volatile SingularAttribute<Documentacion, Integer> estatus;
	public static volatile SingularAttribute<Documentacion, Date> fecMod;
	public static volatile SingularAttribute<Documentacion, String> mime;
	public static volatile SingularAttribute<Documentacion, String> nombre;
	public static volatile SingularAttribute<Documentacion, Integer> prospecto_idProspecto;
	public static volatile SingularAttribute<Documentacion, String> usuCve;
}
