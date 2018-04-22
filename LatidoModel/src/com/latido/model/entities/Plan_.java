package com.latido.model.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-04-22T16:00:13.375-0500")
@StaticMetamodel(Plan.class)
public class Plan_ {
	public static volatile SingularAttribute<Plan, Integer> idPlan;
	public static volatile SingularAttribute<Plan, Integer> estatus;
	public static volatile SingularAttribute<Plan, Date> fecMod;
	public static volatile SingularAttribute<Plan, String> nombre;
	public static volatile SingularAttribute<Plan, Integer> prospecto_idProspecto;
	public static volatile SingularAttribute<Plan, String> usuCve;
	public static volatile SingularAttribute<Plan, Integer> version;
}
