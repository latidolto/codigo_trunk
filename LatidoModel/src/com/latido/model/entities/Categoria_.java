package com.latido.model.entities;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-30T16:10:15.109-0600")
@StaticMetamodel(Categoria.class)
public class Categoria_ {
	public static volatile SingularAttribute<Categoria, Integer> idCategoria;
	public static volatile SingularAttribute<Categoria, Integer> estatus;
	public static volatile SingularAttribute<Categoria, Timestamp> fecMod;
	public static volatile SingularAttribute<Categoria, String> nombre;
	public static volatile SingularAttribute<Categoria, String> usuCve;
}
