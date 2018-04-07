package com.latido.model.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-27T19:27:23.350-0600")
@StaticMetamodel(Tarea.class)
public class Tarea_ {
	public static volatile SingularAttribute<Tarea, Integer> idTarea;
	public static volatile SingularAttribute<Tarea, Integer> idMenu;
	public static volatile SingularAttribute<Tarea, Integer> idSistema;
	public static volatile SingularAttribute<Tarea, Date> fecMod;
	public static volatile SingularAttribute<Tarea, String> nombre;
	public static volatile SingularAttribute<Tarea, String> url;
	public static volatile SingularAttribute<Tarea, String> urlAyuda;
	public static volatile SingularAttribute<Tarea, String> usuCve;
}
