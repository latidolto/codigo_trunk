package com.latido.model.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-27T19:27:23.344-0600")
@StaticMetamodel(Sistema.class)
public class Sistema_ {
	public static volatile SingularAttribute<Sistema, Integer> idSistema;
	public static volatile SingularAttribute<Sistema, String> descripcion;
	public static volatile SingularAttribute<Sistema, Integer> estatus;
	public static volatile SingularAttribute<Sistema, Date> fecMod;
	public static volatile SingularAttribute<Sistema, String> nombre;
	public static volatile SingularAttribute<Sistema, String> usuCve;
}
