package com.latido.model.utils;

/**Clase para llenar NamedQueries de JPA con parametros para ser ejecutada posteriormente
 * 
 * @author Everardo Dominguez
 * 
 * */
public class Parameter {
	private String paramName;
	private Object paramValue;
	
	public Parameter(String paramName, Object paramValue) {
		this.paramName = paramName;
		this.paramValue = paramValue;
	}
	
	/**Nombre de el atributo en la clase EJB*/
	public String getParamName() {
		return paramName;
	}
	public void setParamName(String paramName) {
		this.paramName = paramName;
	}
	/**Valor de el parametro que se requiere filtrar*/
	public Object getParamValue() {
		return paramValue;
	}
	public void setParamValue(Object paramValue) {
		this.paramValue = paramValue;
	}
}
