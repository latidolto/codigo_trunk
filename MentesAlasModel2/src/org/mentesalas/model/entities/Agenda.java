/*    */ package org.mentesalas.model.entities;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.JoinColumn;
/*    */ import javax.persistence.ManyToOne;
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
/*    */ @NamedQuery(name="Agenda.findAll", query="SELECT a FROM Agenda a ")
/*    */ public class Agenda
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   @Id
/*    */   @Column(name="AGE_ID")
/*    */   private int ageId;
/*    */   @Column(name="AGE_ESTATUS")
/*    */   private int ageEstatus;
/*    */   @Temporal(TemporalType.TIMESTAMP)
/*    */   @Column(name="AGE_FECHA")
/*    */   private Date ageFecha;
/*    */   @Temporal(TemporalType.TIMESTAMP)
/*    */   @Column(name="FEC_MOD")
/*    */   private Date fecMod;
/*    */   @Column(name="USU_CVE")
/*    */   private String usuCve;
/*    */   @ManyToOne
/*    */   @JoinColumn(name="INT_ID")
/*    */   private Integrante integrante;
/*    */   
/*    */   public int getAgeId()
/*    */   {
/* 45 */     return this.ageId;
/*    */   }
/*    */   
/*    */   public void setAgeId(int ageId) {
/* 49 */     this.ageId = ageId;
/*    */   }
/*    */   
/*    */   public int getAgeEstatus() {
/* 53 */     return this.ageEstatus;
/*    */   }
/*    */   
/*    */   public void setAgeEstatus(int ageEstatus) {
/* 57 */     this.ageEstatus = ageEstatus;
/*    */   }
/*    */   
/*    */   public Date getAgeFecha() {
/* 61 */     return this.ageFecha;
/*    */   }
/*    */   
/*    */   public void setAgeFecha(Date ageFecha) {
/* 65 */     this.ageFecha = ageFecha;
/*    */   }
/*    */   
/*    */   public Date getFecMod() {
/* 69 */     return this.fecMod;
/*    */   }
/*    */   
/*    */   public void setFecMod(Date fecMod) {
/* 73 */     this.fecMod = fecMod;
/*    */   }
/*    */   
/*    */   public String getUsuCve() {
/* 77 */     return this.usuCve;
/*    */   }
/*    */   
/*    */   public void setUsuCve(String usuCve) {
/* 81 */     this.usuCve = usuCve;
/*    */   }
/*    */   
/*    */   public Integrante getIntegrante() {
/* 85 */     return this.integrante;
/*    */   }
/*    */   
/*    */   public void setIntegrante(Integrante integrante) {
/* 89 */     this.integrante = integrante;
/*    */   }
/*    */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\Agenda.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */