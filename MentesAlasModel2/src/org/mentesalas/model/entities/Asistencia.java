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
/*    */ @Entity
/*    */ @NamedQuery(name="Asistencia.findAll", query="SELECT a FROM Asistencia a")
/*    */ public class Asistencia
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   @Id
/*    */   @Column(name="ASI_ID")
/*    */   private int asiId;
/*    */   @Temporal(TemporalType.DATE)
/*    */   @Column(name="ASI_FEC_MOD")
/*    */   private Date asiFecMod;
/*    */   @Temporal(TemporalType.DATE)
/*    */   @Column(name="ASI_FECHA")
/*    */   private Date asiFecha;
/*    */   @Column(name="ASI_INCIDENCIA")
/*    */   private String asiIncidencia;
/*    */   @Column(name="ASI_USU_CVE")
/*    */   private String asiUsuCve;
/*    */   @ManyToOne
/*    */   @JoinColumn(name="INT_ID")
/*    */   private Integrante integrante;
/*    */   
/*    */   public int getAsiId()
/*    */   {
/* 44 */     return this.asiId;
/*    */   }
/*    */   
/*    */   public void setAsiId(int asiId) {
/* 48 */     this.asiId = asiId;
/*    */   }
/*    */   
/*    */   public Date getAsiFecMod() {
/* 52 */     return this.asiFecMod;
/*    */   }
/*    */   
/*    */   public void setAsiFecMod(Date asiFecMod) {
/* 56 */     this.asiFecMod = asiFecMod;
/*    */   }
/*    */   
/*    */   public Date getAsiFecha() {
/* 60 */     return this.asiFecha;
/*    */   }
/*    */   
/*    */   public void setAsiFecha(Date asiFecha) {
/* 64 */     this.asiFecha = asiFecha;
/*    */   }
/*    */   
/*    */   public String getAsiIncidencia() {
/* 68 */     return this.asiIncidencia;
/*    */   }
/*    */   
/*    */   public void setAsiIncidencia(String asiIncidencia) {
/* 72 */     this.asiIncidencia = asiIncidencia;
/*    */   }
/*    */   
/*    */   public String getAsiUsuCve() {
/* 76 */     return this.asiUsuCve;
/*    */   }
/*    */   
/*    */   public void setAsiUsuCve(String asiUsuCve) {
/* 80 */     this.asiUsuCve = asiUsuCve;
/*    */   }
/*    */   
/*    */   public Integrante getIntegrante() {
/* 84 */     return this.integrante;
/*    */   }
/*    */   
/*    */   public void setIntegrante(Integrante integrante) {
/* 88 */     this.integrante = integrante;
/*    */   }
/*    */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\Asistencia.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */