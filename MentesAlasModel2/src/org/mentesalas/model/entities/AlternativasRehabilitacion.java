/*     */ package org.mentesalas.model.entities;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.NamedQuery;
/*     */ import javax.persistence.Table;
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
/*     */ @Entity
/*     */ @Table(name="alternativas_rehabilitacion")
/*     */ @NamedQuery(name="AlternativasRehabilitacion.findAll", query="SELECT a FROM AlternativasRehabilitacion a")
/*     */ public class AlternativasRehabilitacion
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="ALR_ID")
/*     */   private int alrId;
/*     */   @Column(name="ALR_ESTATUS")
/*     */   private int alrEstatus;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="ALR_FECHA")
/*     */   private Date alrFecha;
/*     */   @Column(name="ALR_METAS")
/*     */   private String alrMetas;
/*     */   @Column(name="ALR_OBSERVA")
/*     */   private String alrObserva;
/*     */   @Column(name="ALR_TERAPIA")
/*     */   private String alrTerapia;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="FEC_MOD")
/*     */   private Date fecMod;
/*     */   @Column(name="INT_ID")
/*     */   private int intId;
/*     */   @Column(name="TER_ID")
/*     */   private int terId;
/*     */   @Column(name="USU_CVE")
/*     */   private String usuCve;
/*     */   
/*     */   public int getAlrId()
/*     */   {
/*  55 */     return this.alrId;
/*     */   }
/*     */   
/*     */   public void setAlrId(int alrId) {
/*  59 */     this.alrId = alrId;
/*     */   }
/*     */   
/*     */   public int getAlrEstatus() {
/*  63 */     return this.alrEstatus;
/*     */   }
/*     */   
/*     */   public void setAlrEstatus(int alrEstatus) {
/*  67 */     this.alrEstatus = alrEstatus;
/*     */   }
/*     */   
/*     */   public Date getAlrFecha() {
/*  71 */     return this.alrFecha;
/*     */   }
/*     */   
/*     */   public void setAlrFecha(Date alrFecha) {
/*  75 */     this.alrFecha = alrFecha;
/*     */   }
/*     */   
/*     */   public String getAlrMetas() {
/*  79 */     return this.alrMetas;
/*     */   }
/*     */   
/*     */   public void setAlrMetas(String alrMetas) {
/*  83 */     this.alrMetas = alrMetas;
/*     */   }
/*     */   
/*     */   public String getAlrObserva() {
/*  87 */     return this.alrObserva;
/*     */   }
/*     */   
/*     */   public void setAlrObserva(String alrObserva) {
/*  91 */     this.alrObserva = alrObserva;
/*     */   }
/*     */   
/*     */   public String getAlrTerapia() {
/*  95 */     return this.alrTerapia;
/*     */   }
/*     */   
/*     */   public void setAlrTerapia(String alrTerapia) {
/*  99 */     this.alrTerapia = alrTerapia;
/*     */   }
/*     */   
/*     */   public Date getFecMod() {
/* 103 */     return this.fecMod;
/*     */   }
/*     */   
/*     */   public void setFecMod(Date fecMod) {
/* 107 */     this.fecMod = fecMod;
/*     */   }
/*     */   
/*     */   public int getIntId() {
/* 111 */     return this.intId;
/*     */   }
/*     */   
/*     */   public void setIntId(int intId) {
/* 115 */     this.intId = intId;
/*     */   }
/*     */   
/*     */   public int getTerId() {
/* 119 */     return this.terId;
/*     */   }
/*     */   
/*     */   public void setTerId(int terId) {
/* 123 */     this.terId = terId;
/*     */   }
/*     */   
/*     */   public String getUsuCve() {
/* 127 */     return this.usuCve;
/*     */   }
/*     */   
/*     */   public void setUsuCve(String usuCve) {
/* 131 */     this.usuCve = usuCve;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\AlternativasRehabilitacion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */