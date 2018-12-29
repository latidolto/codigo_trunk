/*     */ package org.mentesalas.model.entities;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.JoinColumn;
/*     */ import javax.persistence.ManyToOne;
/*     */ import javax.persistence.NamedQuery;
/*     */ import javax.persistence.Temporal;
/*     */ import javax.persistence.TemporalType;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Entity
/*     */ @NamedQuery(name="Evaluacion.findAll", query="SELECT e FROM Evaluacion e")
/*     */ public class Evaluacion
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="EVA_ID")
/*     */   private int evaId;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="EVA_FEC_EVAL")
/*     */   private Date evaFecEval;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="EVA_FEC_REG")
/*     */   private Date evaFecReg;
/*     */   @ManyToOne
/*     */   @JoinColumn(name="INT_ID")
/*     */   private Integrante integrante;
/*     */   @ManyToOne
/*     */   @JoinColumn(name="MUL_ID")
/*     */   private Multivaluada multivaluada;
/*     */   @ManyToOne
/*     */   @JoinColumn(name="PRO_ID")
/*     */   private Programa programa;
/*     */   @ManyToOne
/*     */   @JoinColumn(name="EVA_USU_ID_REG")
/*     */   private User user;
/*     */   
/*     */   public int getEvaId()
/*     */   {
/*  59 */     return this.evaId;
/*     */   }
/*     */   
/*     */   public void setEvaId(int evaId) {
/*  63 */     this.evaId = evaId;
/*     */   }
/*     */   
/*     */   public Date getEvaFecEval() {
/*  67 */     return this.evaFecEval;
/*     */   }
/*     */   
/*     */   public void setEvaFecEval(Date evaFecEval) {
/*  71 */     this.evaFecEval = evaFecEval;
/*     */   }
/*     */   
/*     */   public Date getEvaFecReg() {
/*  75 */     return this.evaFecReg;
/*     */   }
/*     */   
/*     */   public void setEvaFecReg(Date evaFecReg) {
/*  79 */     this.evaFecReg = evaFecReg;
/*     */   }
/*     */   
/*     */   public Integrante getIntegrante() {
/*  83 */     return this.integrante;
/*     */   }
/*     */   
/*     */   public void setIntegrante(Integrante integrante) {
/*  87 */     this.integrante = integrante;
/*     */   }
/*     */   
/*     */   public Multivaluada getMultivaluada() {
/*  91 */     return this.multivaluada;
/*     */   }
/*     */   
/*     */   public void setMultivaluada(Multivaluada multivaluada) {
/*  95 */     this.multivaluada = multivaluada;
/*     */   }
/*     */   
/*     */   public Programa getPrograma() {
/*  99 */     return this.programa;
/*     */   }
/*     */   
/*     */   public void setPrograma(Programa programa) {
/* 103 */     this.programa = programa;
/*     */   }
/*     */   
/*     */   public User getUser() {
/* 107 */     return this.user;
/*     */   }
/*     */   
/*     */   public void setUser(User user) {
/* 111 */     this.user = user;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\Evaluacion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */