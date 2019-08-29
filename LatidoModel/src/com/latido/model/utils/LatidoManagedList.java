package com.latido.model.utils;

import java.io.Serializable;
import java.util.List;

public class LatidoManagedList implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private Class className;
	private List list;
	
	public LatidoManagedList() {
	}
	
	public LatidoManagedList(String name, Class className, List list) {
		this.name = name;
		this.className = className;
		this.list = list;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Class getClassName() {
		return className;
	}
	public void setClassName(Class className) {
		this.className = className;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	
}
