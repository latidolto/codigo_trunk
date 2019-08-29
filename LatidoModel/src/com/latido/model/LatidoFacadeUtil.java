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

import com.latido.model.utils.LatidoManagedList;
import com.latido.model.utils.Parameter;

public class LatidoFacadeUtil extends LatidoEMUtil{
	private Map mapEjb;
	private Map<String, LatidoManagedList> mapManagedList = new HashMap<String, LatidoManagedList>();

	public LatidoFacadeUtil(String persistenceUnitName) {
		super(persistenceUnitName);
	}

	private Integer getNextId(Object ejb){
		Class<?> c = ejb.getClass();
		Table table = c.getAnnotation(Table.class);
		String tableName = table.name();
		//tableName = camelToUnderScore(tableName);
		String columnName = findIdField(ejb.getClass());
		//columnName = camelToUnderScore(columnName);
		
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
					mapEjb.put(cls.getClass().getName(), cls);
				} catch (Exception e) {
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
	
	public void persistEjb(String className,boolean withoutId){
		Object ejb = null;
		if(mapEjb != null){
			EntityTransaction trx = this.getEM().getTransaction();
	        trx.begin();
			ejb = mapEjb.get(className);
			if(ejb != null){
				try {
					System.out.println("persistEjb - [className]:"+className);
					if(!withoutId)
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
	
	public void persistEjb(Object ejb){
		if(ejb != null){
			EntityTransaction trx = this.getEM().getTransaction();
	        trx.begin();
			this.getEM().persist(ejb);
			trx.commit();
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
	
	public void mergeEjb(Object ejb){
		if(ejb != null){
			EntityTransaction trx = this.getEM().getTransaction();
	        trx.begin();
			this.getEM().merge(ejb);
			trx.commit();
		}
	}
	
	public void deleteEjb(String className){
		Object ejb = null;
		if(mapEjb != null){
			//EntityTransaction trx = this.getEM().getTransaction();
	        //trx.begin();
			/*ejb = mapEjb.get(className);
			if(ejb != null){
				this.getEM().remove(ejb);
				this.getEM().flush();
				trx.commit();
			}else{
				System.out.println("deleteEjb - EJB Not Registered...");
			}*/
			EntityTransaction trx = this.getEM().getTransaction();
	        trx.begin();
			ejb = mapEjb.get(className);
			if(ejb != null){
				Class<?> c = ejb.getClass();
				Table table = c.getAnnotation(Table.class);
				String tableName = table.name();
				Field idField = null;
				try {
					for(Field field : c.getDeclaredFields()){
				        Annotation[] annotations = field.getDeclaredAnnotations();
				        for (int i = 0; i < annotations.length; i++) {
				            if (annotations[i].annotationType().equals(Id.class)) {
				                idField = field;
				                break;
				            }
				        }
				    }
					idField.setAccessible(true);
					String deleteQuery = "Delete from "+tableName+" where "+idField.getName()+" = "+ idField.get(ejb);
					Query delete = this.getEM().createNativeQuery(deleteQuery);
					delete.executeUpdate();
					trx.commit();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else{
				System.out.println("deleteEjb - EJB Not Registered...");
			}
		}
			
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
	
	private void registerManagedList(String name, LatidoManagedList list){
		mapManagedList.put(name, list);
	}
	
	private LatidoManagedList getRegisteredManagedList(String name){
		return mapManagedList.get(name);
	}
	
	@Deprecated
	public void registerEjbList(String className, List list){
		//nothing
	}
	
	@Deprecated
	public List getRegisteredList(String className) {
		return null;
	}
	
	@Deprecated
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
	/**
	 * Metodo para la obtencion de una lista que puede que este en cache o crearla, 
	 * si el tipo es EAGER entonces siempre se obtiene la lista de nueva cuenta.
	 * 
	 * @param cls (Clase de la entity en juego)
	 * @param queryName (Nombre de el query en JPQL existente en el entity)
	 * @param isEagerType (Activo si se requiere una lista nueva)
	 * @param params (Parametros de la consulta)
	 * */
	public List getListFromParameters(Class cls, String queryName, Boolean isEagerType, Parameter...params) {
		List resultList = null;
		Map prms = null;
		if(params != null) {
			prms = new HashMap();
			for(Parameter prm : params) {
				prms.put(prm.getParamName(), prm.getParamValue());
			}
		}
		if(isEagerType) {
			resultList = this.getListFromParameters(cls.getName(), queryName, prms);
			if(resultList != null)
				this.registerManagedList(queryName, new LatidoManagedList(queryName, cls, resultList));
		} else {
			LatidoManagedList lml = mapManagedList.get(queryName);
			if(lml != null) {
				resultList = lml.getList();
			} else {
				resultList = this.getListFromParameters(cls.getName(), queryName, prms);
				if(resultList != null)
					this.registerManagedList(queryName, new LatidoManagedList(queryName, cls, resultList));
			}
		}
		return resultList;
	}
	
	public List getListFromParameters(String className,String queryName,Map params){
		List lo = null;
		if(mapEjb != null){
			Object ejb = mapEjb.get(className);
			//System.out.println(ejb);
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
	/**
	 * Metodo para la obtencion de una lista que puede que este en cache o crearla, 
	 * si el tipo es EAGER entonces siempre se obtiene la lista de nueva cuenta.
	 * 
	 * @param cls (Clase de la entity en juego)
	 * @param isEagerType (Activo si se requiere una lista nueva)
	 * @param params (Parametros de la consulta)
	 * */
	public List getListFromParameters(Class cls, Boolean isEagerType, Parameter...params) {
		String queryName = "find"+cls.getSimpleName()+"Onfly";
		List resultList = null;
		if(isEagerType) {
			resultList = this.getListFromParameters(cls, params);
			if(resultList != null)
				this.registerManagedList(queryName, new LatidoManagedList(queryName, cls, resultList));
		} else {
			LatidoManagedList lml = mapManagedList.get(queryName);
			if(lml != null) {
				resultList = lml.getList();
			} else {
				resultList = this.getListFromParameters(cls, params);
				if(resultList != null)
					this.registerManagedList(queryName, new LatidoManagedList(queryName, cls, resultList));
			}
		}
		return resultList;
	}
	
	public List getListFromParameters(Class cls, Parameter...parameters) {
		List<Object> lo = null;
		StringBuilder stb = new StringBuilder();
		stb.append("Select c from ");
		stb.append(cls.getSimpleName());
		stb.append(" c ");
		try {
			if(parameters != null) {
				Boolean isFirst = Boolean.TRUE;
				for(Parameter param : parameters) {
					if(isFirst) {
						stb.append("where c.");
						stb.append(param.getParamName());
						stb.append(" = :p_");
						stb.append(param.getParamName());
					} else {
						stb.append(" and c.");
						stb.append(param.getParamName());
						stb.append(" = :p_");
						stb.append(param.getParamName());
					}
					isFirst = Boolean.FALSE;
				}
			}
			EntityManager em = this.getEM();
			Query q = em.createQuery(stb.toString(), cls);
			em.getEntityManagerFactory().addNamedQuery("find"+cls.getSimpleName()+"Onfly", q);		
			TypedQuery<Object> nq = em.createNamedQuery("find"+cls.getSimpleName()+"Onfly", cls);
			if(parameters != null) {
				for(Parameter param : parameters) {
					nq.setParameter("p_" + param.getParamName(), param.getParamValue());
				}
			}
			lo = nq.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lo;
	}
	
	
}
