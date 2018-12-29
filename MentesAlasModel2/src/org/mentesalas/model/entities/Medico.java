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
/*    */ @NamedQuery(name="Medico.findAll", query="SELECT m FROM Medico m")
/*    */ public class Medico
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   @Id
/*    */   @Column(name="MED_ID")
/*    */   private int medId;
/*    */   @Temporal(TemporalType.DATE)
/*    */   @Column(name="FEC_MOD")
/*    */   private Date fecMod;
/*    */   @Column(name="MED_CEDULA")
/*    */   private String medCedula;
/*    */   @Column(name="MED_ESTATUS")
/*    */   private int medEstatus;
/*    */   @Column(name="MED_NOMBRE")
/*    */   private String medNombre;
/*    */   @Column(name="USU_CVE")
/*    */   private String usuCve;
/*    */   
/*    */   public int getMedId()
/*    */   {
/* 41 */     return this.medId;
/*    */   }
/*    */   
/*    */   public void setMedId(int medId) {
/* 45 */     this.medId = medId;
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
/*    */   public String getMedCedula() {
/* 57 */     return this.medCedula;
/*    */   }
/*    */   
/*    */   public void setMedCedula(String medCedula) {
/* 61 */     this.medCedula = medCedula;
/*    */   }
/*    */   
/*    */   public int getMedEstatus() {
/* 65 */     return this.medEstatus;
/*    */   }
/*    */   
/*    */   public void setMedEstatus(int medEstatus) {
/* 69 */     this.medEstatus = medEstatus;
/*    */   }
/*    */   
/*    */   public String getMedNombre() {
/* 73 */     return this.medNombre;
/*    */   }
/*    */   
/*    */   public void setMedNombre(String medNombre) {
/* 77 */     this.medNombre = medNombre;
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


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\Medico.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */