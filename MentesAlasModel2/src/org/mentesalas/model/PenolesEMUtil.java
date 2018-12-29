/*    */ package org.mentesalas.model;
/*    */ 
/*    */ import javax.persistence.EntityManager;
/*    */ import javax.persistence.EntityManagerFactory;
/*    */ import javax.persistence.Persistence;
/*    */ 
/*    */ public class PenolesEMUtil
/*    */ {
/*    */   private EntityManagerFactory emf;
/*    */   private EntityManager em;
/*    */   
/*    */   public PenolesEMUtil(String persistenceUnitName)
/*    */   {
/*    */     try
/*    */     {
/* 16 */       Class.forName("com.mysql.jdbc.Driver");
/*    */     } catch (Exception ex) {
/* 18 */       ex.printStackTrace();
/*    */     }
/* 20 */     this.emf = Persistence.createEntityManagerFactory(persistenceUnitName);
/* 21 */     this.em = this.emf.createEntityManager();
/*    */   }
/*    */   
/*    */   public EntityManager getEM() {
/* 25 */     return this.em;
/*    */   }
/*    */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\PenolesEMUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */