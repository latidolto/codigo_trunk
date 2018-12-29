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
/*     */ @Table(name="terapia_psicologica_individual")
/*     */ @NamedQuery(name="TerapiaPsicologicaIndividual.findAll", query="SELECT t FROM TerapiaPsicologicaIndividual t")
/*     */ public class TerapiaPsicologicaIndividual
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="TPI_ID")
/*     */   private int tpiId;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="FEC_MOD")
/*     */   private Date fecMod;
/*     */   @Column(name="INT_ID")
/*     */   private int intId;
/*     */   @Column(name="TPI_ASPABOR")
/*     */   private String tpiAspabor;
/*     */   @Column(name="TPI_DURACION")
/*     */   private int tpiDuracion;
/*     */   @Column(name="TPI_ESTATUS")
/*     */   private int tpiEstatus;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="TPI_FECHA")
/*     */   private Date tpiFecha;
/*     */   @Column(name="TPI_OBSGEN")
/*     */   private String tpiObsgen;
/*     */   @Column(name="TPI_SESION")
/*     */   private int tpiSesion;
/*     */   @Column(name="USU_CVE")
/*     */   private String usuCve;
/*     */   
/*     */   public int getTpiId()
/*     */   {
/*  55 */     return this.tpiId;
/*     */   }
/*     */   
/*     */   public void setTpiId(int tpiId) {
/*  59 */     this.tpiId = tpiId;
/*     */   }
/*     */   
/*     */   public Date getFecMod() {
/*  63 */     return this.fecMod;
/*     */   }
/*     */   
/*     */   public void setFecMod(Date fecMod) {
/*  67 */     this.fecMod = fecMod;
/*     */   }
/*     */   
/*     */   public int getIntId() {
/*  71 */     return this.intId;
/*     */   }
/*     */   
/*     */   public void setIntId(int intId) {
/*  75 */     this.intId = intId;
/*     */   }
/*     */   
/*     */   public String getTpiAspabor() {
/*  79 */     return this.tpiAspabor;
/*     */   }
/*     */   
/*     */   public void setTpiAspabor(String tpiAspabor) {
/*  83 */     this.tpiAspabor = tpiAspabor;
/*     */   }
/*     */   
/*     */   public int getTpiDuracion() {
/*  87 */     return this.tpiDuracion;
/*     */   }
/*     */   
/*     */   public void setTpiDuracion(int tpiDuracion) {
/*  91 */     this.tpiDuracion = tpiDuracion;
/*     */   }
/*     */   
/*     */   public int getTpiEstatus() {
/*  95 */     return this.tpiEstatus;
/*     */   }
/*     */   
/*     */   public void setTpiEstatus(int tpiEstatus) {
/*  99 */     this.tpiEstatus = tpiEstatus;
/*     */   }
/*     */   
/*     */   public Date getTpiFecha() {
/* 103 */     return this.tpiFecha;
/*     */   }
/*     */   
/*     */   public void setTpiFecha(Date tpiFecha) {
/* 107 */     this.tpiFecha = tpiFecha;
/*     */   }
/*     */   
/*     */   public String getTpiObsgen() {
/* 111 */     return this.tpiObsgen;
/*     */   }
/*     */   
/*     */   public void setTpiObsgen(String tpiObsgen) {
/* 115 */     this.tpiObsgen = tpiObsgen;
/*     */   }
/*     */   
/*     */   public int getTpiSesion() {
/* 119 */     return this.tpiSesion;
/*     */   }
/*     */   
/*     */   public void setTpiSesion(int tpiSesion) {
/* 123 */     this.tpiSesion = tpiSesion;
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


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\TerapiaPsicologicaIndividual.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */