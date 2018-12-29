 package org.mentesalas.model;


 import java.io.PrintStream;
 import java.lang.annotation.Annotation;
 import java.lang.reflect.Field;
 import java.util.HashMap;
 import java.util.Iterator;
 import java.util.List;
 import java.util.Map;
 import javax.persistence.EntityManager;
 import javax.persistence.EntityTransaction;
 import javax.persistence.Query;
 import javax.persistence.Table;
 import javax.persistence.TypedQuery;


 public class PenolesFacadeUtil extends PenolesEMUtil
 {
	 private Map mapEjb;
	 private Map mapListEjb;

	
	 public PenolesFacadeUtil(String persistenceUnitName)
	 {
		/* 23 */ super(persistenceUnitName);
		 }

	
	 private Integer getNextId(Object ejb) {
		/* 27 */ Class<?> c = ejb.getClass();
		/* 28 */ Table table = (Table) c.getAnnotation(Table.class);
		/* 29 */ String tableName = table.name();
		/* 30 */ tableName = camelToUnderScore(tableName);
		/* 31 */ String columnName = findIdField(ejb.getClass());
		/* 32 */ columnName = camelToUnderScore(columnName);
		
		/* 34 */ Integer nextId = Integer.valueOf(0);
		/* 35 */ StringBuilder stb = new StringBuilder();
		/* 36 */ stb.append("Select Max(");
		/* 37 */ stb.append(columnName);
		/* 38 */ stb.append(") from ");
		/* 39 */ stb.append(tableName);
		/* 40 */ EntityManager em = getEM();
		/* 41 */ System.out.println("SQL : " + stb.toString());
		/* 42 */ Query q = em.createNativeQuery(stb.toString());
		/* 43 */ nextId = (Integer) q.getSingleResult();
		/* 44 */ if (nextId == null)
			/* 45 */ nextId = Integer.valueOf(0);
		/* 46 */ nextId = Integer.valueOf(nextId.intValue() + 1);
		
		/* 48 */ return nextId;
		 }

	
	 private String findIdField(Class cls) {
		Field[] arrayOfField;
		/* 52 */ int j = (arrayOfField = cls.getDeclaredFields()).length;
		for (int i = 0; i < j; i++) {
			Field field = arrayOfField[i];
			/* 53 */ Class type = field.getType();
			/* 54 */ String name = field.getName();
			/* 55 */ Annotation[] annotations = field.getDeclaredAnnotations();
			/* 56 */ for (int n = 0; n < annotations.length; n++) {
				/* 57 */ if (annotations[n].annotationType().equals(javax.persistence.Id.class)) {
					/* 58 */ return name;
					 }
				 }
			 }
		/* 62 */ return null;
		 }

	
	 public void settingNextId(Object ejb)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		/* 66 */ Integer nextId = getNextId(ejb);
		/* 67 */ String idFieldName = findIdField(ejb.getClass());
		/* 68 */ Field field = ejb.getClass().getDeclaredField(idFieldName);
		/* 69 */ field.setAccessible(true);
		/* 70 */ System.out.println("settingNextId [nextId]:" + nextId);
		/* 71 */ field.set(ejb, nextId);
		 }

	
	 public void registerEJB(Object[] classesEjb) {
		/* 75 */ if (classesEjb != null) {
			Object[] arrayOfObject;
			/* 76 */ int j = (arrayOfObject = classesEjb).length;
			for (int i = 0; i < j; i++) {
				Object cls = arrayOfObject[i];
				/* 77 */ if (this.mapEjb == null)
					/* 78 */ this.mapEjb = new HashMap();
				 try {
					/* 80 */ System.out.println("registerEJB:" + cls.getClass().getName());
					/* 81 */ this.mapEjb.put(cls.getClass().getName(), cls.getClass().newInstance());
					 } catch (InstantiationException e) {
					/* 83 */ e.printStackTrace();
					 } catch (IllegalAccessException e) {
					/* 85 */ e.printStackTrace();
					 }
				 }
			 }
		 }

	
	 public Object getEjb(String className) {
		/* 92 */ Object ejb = null;
		/* 93 */ if (this.mapEjb != null) {
			/* 94 */ ejb = this.mapEjb.get(className);
			 }
		/* 96 */ return ejb;
		 }

	
	 public Object setEjb(String className, Object ejb) {
		/* 100 */ if (this.mapEjb != null) {
			/* 101 */ ejb = this.mapEjb.put(className, ejb);
			 }
		/* 103 */ return ejb;
		 }

	
	 public void persistEjb(String className) {
		/* 107 */ Object ejb = null;
		/* 108 */ if (this.mapEjb != null) {
			/* 109 */ EntityTransaction trx = getEM().getTransaction();
			/* 110 */ trx.begin();
			/* 111 */ ejb = this.mapEjb.get(className);
			/* 112 */ if (ejb != null) {
				 try {
					/* 114 */ System.out.println("persistEjb - [className]:" + className);
					/* 115 */ settingNextId(ejb);
					/* 116 */ getEM().persist(ejb);
					/* 117 */ trx.commit();
					 } catch (Exception e) {
					/* 119 */ e.printStackTrace();
					/* 120 */ if (!trx.isActive())
						return;
				}
				/* 121 */ trx.rollback();
				 }
			 else {
				/* 124 */ System.out.println("persistEjb - EJB Not Registered...");
				 }
			 }
		 }

	
	 public void mergeEjb(String className) {
		/* 130 */ Object ejb = null;
		/* 131 */ if (this.mapEjb != null) {
			/* 132 */ EntityTransaction trx = getEM().getTransaction();
			/* 133 */ trx.begin();
			/* 134 */ ejb = this.mapEjb.get(className);
			/* 135 */ if (ejb != null) {
				/* 136 */ getEM().merge(ejb);
				/* 137 */ trx.commit();
				 } else {
				/* 139 */ System.out.println("mergeEjb - EJB Not Registered...");
				 }
			 }
		 }

	
	 public void deleteEjb(String className)
	 {
		/* 146 */ Object ejb = null;
		/* 147 */ if (this.mapEjb != null) {
			/* 148 */ EntityTransaction trx = getEM().getTransaction();
			/* 149 */ trx.begin();
			/* 150 */ ejb = this.mapEjb.get(className);
			/* 151 */ if (ejb != null) {
				/* 152 */ getEM().remove(ejb);
				/* 153 */ trx.commit();
				 } else {
				/* 155 */ System.out.println("deleteEjb - EJB Not Registered...");
				 }
			 }
		 }

	
	 public void registerEjbList(String className, List list) {
		/* 161 */ if (this.mapListEjb == null)
			/* 162 */ this.mapListEjb = new HashMap();
		/* 163 */ this.mapListEjb.put(className, list);
		 }

	
	 public List getRegisteredList(String className) {
		/* 167 */ List lo = null;
		/* 168 */ if (this.mapListEjb != null)
			/* 169 */ lo = (List) this.mapListEjb.get(className);
		/* 170 */ return lo;
		 }

	
	 public List getFindAllList(String className) {
		/* 174 */ List lo = null;
		/* 175 */ if (this.mapEjb != null) {
			/* 176 */ Object ejb = this.mapEjb.get(className);
			/* 177 */ EntityManager em = getEM();
			
			
			/* 180 */ TypedQuery query = em.createNamedQuery(ejb.getClass().getSimpleName() + ".findAll",
					ejb.getClass());
			/* 181 */ lo = query.getResultList();
			 }
		/* 183 */ return lo;
		 }

	
	
	 public List getListFromParameters(String className, String queryName, Map params)
	 {
		/* 189 */ List lo = null;
		/* 190 */ if (this.mapEjb != null) {
			/* 191 */ Object ejb = this.mapEjb.get(className);
			/* 192 */ EntityManager em = getEM();
			/* 193 */ TypedQuery query = em.createNamedQuery(ejb.getClass().getSimpleName() + "." + queryName,
					ejb.getClass());
			/* 194 */ if (params != null) {
				/* 195 */ Iterator it = params.keySet().iterator();
				/* 196 */ while (it.hasNext()) {
					/* 197 */ String key = (String) it.next();
					/* 198 */ query.setParameter(key, params.get(key));
					 }
				 }
			/* 201 */ lo = query.getResultList();
			 }
		/* 203 */ return lo;
		 }

	
	 public String camelToUnderScore(String text) {
		/* 207 */ String newText = "";
		/* 208 */ if (text != null) {
			/* 209 */ for (int i = 0; i < text.length(); i++) {
				/* 210 */ String c = "" + text.charAt(i);
				/* 211 */ if (c.matches("[A-Z]")) {
					/* 212 */ newText = newText + "_";
					/* 213 */ newText = newText + c.toLowerCase();
					 } else {
					/* 215 */ newText = newText + c;
					 }
				 }
			 }
		/* 219 */ return newText;
		 }
	 }

/*
 * Location: D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\
 * PenolesFacadeUtil.class Java compiler version: 8 (52.0) JD-Core Version:
 * 0.7.1
 */