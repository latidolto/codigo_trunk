package com.latido.model.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-04-22T16:04:32.407-0500")
@StaticMetamodel(Actividad.class)
public class Actividad_ {
	public static volatile SingularAttribute<Actividad, Integer> idActividades;
	public static volatile SingularAttribute<Actividad, Integer> estatus;
	public static volatile SingularAttribute<Actividad, Date> fechaFin;
	public static volatile SingularAttribute<Actividad, Date> fechaInicio;
	public static volatile SingularAttribute<Actividad, Date> fecMod;
	public static volatile SingularAttribute<Actividad, String> nombre;
	public static volatile SingularAttribute<Actividad, Integer> plan_idPlan;
	public static volatile SingularAttribute<Actividad, String> usuCve;
}
