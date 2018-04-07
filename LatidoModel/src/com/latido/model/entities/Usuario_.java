package com.latido.model.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-27T19:27:23.358-0600")
@StaticMetamodel(Usuario.class)
public class Usuario_ {
	public static volatile SingularAttribute<Usuario, Integer> idUsuario;
	public static volatile SingularAttribute<Usuario, String> apellidoMaterno;
	public static volatile SingularAttribute<Usuario, String> apellidoPaterno;
	public static volatile SingularAttribute<Usuario, byte[]> avatar;
	public static volatile SingularAttribute<Usuario, String> clave;
	public static volatile SingularAttribute<Usuario, Integer> estatus;
	public static volatile SingularAttribute<Usuario, Date> fecMod;
	public static volatile SingularAttribute<Usuario, String> nombre;
	public static volatile SingularAttribute<Usuario, String> password;
	public static volatile SingularAttribute<Usuario, String> usuCve;
	public static volatile SingularAttribute<Usuario, Integer> idSistema;
}
