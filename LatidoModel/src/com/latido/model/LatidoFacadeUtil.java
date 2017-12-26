package com.latido.model;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Query;
import javax.persistence.Table;
import javax.persistence.TypedQuery;

public class LatidoFacadeUtil extends LatidoEMUtil{
	private Map mapEjb;
	private Map mapListEjb;

	public LatidoFacadeUtil(String persistenceUnitName) {
		super(persistenceUnitName);
	}

	private Integer getNextId(Object ejb){
		Class<?> c = ejb.getClass();
		Table table = c.getAnnotation(Table.class);
		String tableName = table.name();
		tableName = camelToUnderScore(tableName);
		String columnName = findIdField(ejb.getClass());
		columnName = camelToUnderScore(columnName);
		
		Integer nextId = 0;
		StringBuilder stb = new StringBuilder();
		stb.append("Select Max(");
		stb.append(columnName);
		stb.append(") from ");
		stb.append(tableName);
		EntityManager em = this.getEM();
		Query q = em.createNativeQuery(stb.toString());
		nextId = (Integer)q.getSingleResult();
		if(nextId == null)
			nextId = 0;
		nextId = nextId + 1;
		
		return nextId;
	}
	
	private String findIdField(Class cls) {
	    for(Field field : cls.getDeclaredFields()){
	        Class type = field.getType();
	        String name = field.getName();
	        Annotation[] annotations = field.getDeclaredAnnotations();
	        for (int i = 0; i < annotations.length; i++) {
	            if (annotations[i].annotationType().equals(Id.class)) {
	                return name;
	            }
	        }
	    }
	    return null;
	}
	
	private void settingNextId(Object ejb) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		Integer nextId = this.getNextId(ejb);
		String idFieldName = this.findIdField(ejb.getClass());
		Field field = ejb.getClass().getDeclaredField(idFieldName);
		field.setAccessible(true);
		System.out.println("settingNextId [nextId]:"+nextId);
		field.set(ejb, nextId);
	}
	
	public void registerEJB(Object[] classesEjb){
		if(classesEjb != null){
			for(Object cls : classesEjb){
				if(mapEjb == null)
					mapEjb = new HashMap();
				try {
					System.out.println("registerEJB:"+cls.getClass().getName());
					mapEjb.put(cls.getClass().getName(), cls.getClass().newInstance());
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public Object getEjb(String className){
		Object ejb = null;
		if(mapEjb != null){
			ejb = mapEjb.get(className);
		}
		return ejb;
	}
	
	public Object setEjb(String className,Object ejb){
		if(mapEjb != null){
			ejb = mapEjb.put(className,ejb);
		}
		return ejb;
	}
	
	public void persistEjb(String className){
		Object ejb = null;
		if(mapEjb != null){
			EntityTransaction trx = this.getEM().getTransaction();
	        trx.begin();
			ejb = mapEjb.get(className);
			if(ejb != null){
				try {
					System.out.println("persistEjb - [className]:"+className);
					this.settingNextId(ejb);
					this.getEM().persist(ejb);
					trx.commit();
				} catch (Exception e) {
					e.printStackTrace();
					if(trx.isActive())
		                trx.rollback();
				} 
			} else {
				System.out.println("persistEjb - EJB Not Registered...");
			}
		}
	}
	
	public void mergeEjb(String className){
		Object ejb = null;
		if(mapEjb != null){
			EntityTransaction trx = this.getEM().getTransaction();
	        trx.begin();
			ejb = mapEjb.get(className);
			if(ejb != null){
				this.getEM().merge(ejb);
				trx.commit();
			}else{
				System.out.println("mergeEjb - EJB Not Registered...");
			}
			
		}
	}
	
	public void deleteEjb(String className){
		Object ejb = null;
		if(mapEjb != null){
			EntityTransaction trx = this.getEM().getTransaction();
	        trx.begin();
			ejb = mapEjb.get(className);
			if(ejb != null){
				this.getEM().remove(ejb);
				trx.commit();
			}else{
				System.out.println("deleteEjb - EJB Not Registered...");
			}
		}
	}
	
	public void registerEjbList(String className,List list){
		if(mapListEjb == null)
			mapListEjb = new HashMap();
		mapListEjb.put(className, list);
	}
	
	public List getRegisteredList(String className){
		List lo = null;
		if(mapListEjb != null)
			lo = (List) mapListEjb.get(className);
		return lo;
	}
	
	public List getFindAllList(String className){
		List lo = null;
		if(mapEjb != null){
			Object ejb = mapEjb.get(className);
			EntityManager em = this.getEM();
			//System.out.println(em);
			//System.out.println(ejb);
			TypedQuery query = em.createNamedQuery(ejb.getClass().getSimpleName()+".findAll", ejb.getClass());
			lo = query.getResultList();
		}
		return lo;
	}
	
	public List getListFromParameters(String className,String queryName,Map params){
		List lo = null;
		if(mapEjb != null){
			Object ejb = mapEjb.get(className);
			EntityManager em = this.getEM();
			TypedQuery query = em.createNamedQuery(ejb.getClass().getSimpleName()+"."+queryName, ejb.getClass());
			if(params != null){
				Iterator it = params.keySet().iterator();
				while(it.hasNext()){
				  String key = (String)it.next();
				  query.setParameter(key, params.get(key));
				}
			}
			lo = query.getResultList();
		}
		return lo;
	}
	
	public String camelToUnderScore(String text){
		String newText = "";
		if(text!= null){
			for(int i = 0; i < text.length() ; i++){
				String c = text.charAt(i)+"";
				if(c.matches("[A-Z]")){
					newText += "_";
					newText += c.toLowerCase();
				}else{
					newText += c;
				}
			}
		}
		return newText;
	}
	
}
