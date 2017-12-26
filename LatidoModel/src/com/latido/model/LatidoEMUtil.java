package com.latido.model;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LatidoEMUtil {
	private EntityManagerFactory emf;
	private EntityManager em;
	
	public LatidoEMUtil(String persistenceUnitName) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		this.emf = Persistence.createEntityManagerFactory(persistenceUnitName);
		this.em = this.emf.createEntityManager();
	}
	
	public EntityManager getEM() {
		return this.em;
	}
	
}
