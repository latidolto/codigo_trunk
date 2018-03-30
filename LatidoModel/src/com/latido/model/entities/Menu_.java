package com.latido.model.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-27T19:27:23.329-0600")
@StaticMetamodel(Menu.class)
public class Menu_ {
	public static volatile SingularAttribute<Menu, Integer> idMenu;
	public static volatile SingularAttribute<Menu, String> etiqueta;
	public static volatile SingularAttribute<Menu, String> descripcion;
	public static volatile SingularAttribute<Menu, Integer> idMenuPadre;
	public static volatile SingularAttribute<Menu, String> usuCve;
	public static volatile SingularAttribute<Menu, Date> fecMod;
	public static volatile SingularAttribute<Menu, Integer> idSistema;
}
