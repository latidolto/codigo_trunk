/*    */ package org.mentesalas.model.entities;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.NamedQuery;
/*    */ import javax.persistence.Temporal;
/*    */ import javax.persistence.TemporalType;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Entity
/*    */ @NamedQuery(name="Terapeuta.findAll", query="SELECT t FROM Terapeuta t")
/*    */ public class Terapeuta
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   @Id
/*    */   @Column(name="TER_ID")
/*    */   private int terId;
/*    */   @Temporal(TemporalType.DATE)
/*    */   @Column(name="FEC_MOD")
/*    */   private Date fecMod;
/*    */   @Column(name="TER_ESTATUS")
/*    */   private int terEstatus;
/*    */   @Column(name="TER_NOM")
/*    */   private String terNom;
/*    */   @Column(name="TER_TIPO")
/*    */   private String terTipo;
/*    */   @Column(name="USU_CVE")
/*    */   private String usuCve;
/*    */   
/*    */   public int getTerId()
/*    */   {
/* 41 */     return this.terId;
/*    */   }
/*    */   
/*    */   public void setTerId(int terId) {
/* 45 */     this.terId = terId;
/*    */   }
/*    */   
/*    */   public Date getFecMod() {
/* 49 */     return this.fecMod;
/*    */   }
/*    */   
/*    */   public void setFecMod(Date fecMod) {
/* 53 */     this.fecMod = fecMod;
/*    */   }
/*    */   
/*    */   public int getTerEstatus() {
/* 57 */     return this.terEstatus;
/*    */   }
/*    */   
/*    */   public void setTerEstatus(int terEstatus) {
/* 61 */     this.terEstatus = terEstatus;
/*    */   }
/*    */   
/*    */   public String getTerNom() {
/* 65 */     return this.terNom;
/*    */   }
/*    */   
/*    */   public void setTerNom(String terNom) {
/* 69 */     this.terNom = terNom;
/*    */   }
/*    */   
/*    */   public String getTerTipo() {
/* 73 */     return this.terTipo;
/*    */   }
/*    */   
/*    */   public void setTerTipo(String terTipo) {
/* 77 */     this.terTipo = terTipo;
/*    */   }
/*    */   
/*    */   public String getUsuCve() {
/* 81 */     return this.usuCve;
/*    */   }
/*    */   
/*    */   public void setUsuCve(String usuCve) {
/* 85 */     this.usuCve = usuCve;
/*    */   }
/*    */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\Terapeuta.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */