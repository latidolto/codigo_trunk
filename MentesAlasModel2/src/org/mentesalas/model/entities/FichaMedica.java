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
/*     */ 
/*     */ @Entity
/*     */ @Table(name="ficha_medica")
/*     */ @NamedQuery(name="FichaMedica.findAll", query="SELECT f FROM FichaMedica f")
/*     */ public class FichaMedica
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="FCH_ID")
/*     */   private int fchId;
/*     */   @Column(name="FCH_AN_GINE")
/*     */   private String fchAnGine;
/*     */   @Column(name="FCH_AN_HER")
/*     */   private String fchAnHer;
/*     */   @Column(name="FCH_AN_NO_PAT")
/*     */   private String fchAnNoPat;
/*     */   @Column(name="FCH_AN_PAT")
/*     */   private String fchAnPat;
/*     */   @Column(name="FCH_EP_FIS")
/*     */   private String fchEpFis;
/*     */   @Column(name="FCH_ESTATUS")
/*     */   private int fchEstatus;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="FCH_FECHA")
/*     */   private Date fchFecha;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="FEC_MOD")
/*     */   private Date fecMod;
/*     */   @Column(name="INT_ID")
/*     */   private int intId;
/*     */   @Column(name="USU_CVE")
/*     */   private String usuCve;
/*     */   
/*     */   public int getFchId()
/*     */   {
/*  58 */     return this.fchId;
/*     */   }
/*     */   
/*     */   public void setFchId(int fchId) {
/*  62 */     this.fchId = fchId;
/*     */   }
/*     */   
/*     */   public String getFchAnGine() {
/*  66 */     return this.fchAnGine;
/*     */   }
/*     */   
/*     */   public void setFchAnGine(String fchAnGine) {
/*  70 */     this.fchAnGine = fchAnGine;
/*     */   }
/*     */   
/*     */   public String getFchAnHer() {
/*  74 */     return this.fchAnHer;
/*     */   }
/*     */   
/*     */   public void setFchAnHer(String fchAnHer) {
/*  78 */     this.fchAnHer = fchAnHer;
/*     */   }
/*     */   
/*     */   public String getFchAnNoPat() {
/*  82 */     return this.fchAnNoPat;
/*     */   }
/*     */   
/*     */   public void setFchAnNoPat(String fchAnNoPat) {
/*  86 */     this.fchAnNoPat = fchAnNoPat;
/*     */   }
/*     */   
/*     */   public String getFchAnPat() {
/*  90 */     return this.fchAnPat;
/*     */   }
/*     */   
/*     */   public void setFchAnPat(String fchAnPat) {
/*  94 */     this.fchAnPat = fchAnPat;
/*     */   }
/*     */   
/*     */   public String getFchEpFis() {
/*  98 */     return this.fchEpFis;
/*     */   }
/*     */   
/*     */   public void setFchEpFis(String fchEpFis) {
/* 102 */     this.fchEpFis = fchEpFis;
/*     */   }
/*     */   
/*     */   public int getFchEstatus() {
/* 106 */     return this.fchEstatus;
/*     */   }
/*     */   
/*     */   public void setFchEstatus(int fchEstatus) {
/* 110 */     this.fchEstatus = fchEstatus;
/*     */   }
/*     */   
/*     */   public Date getFchFecha() {
/* 114 */     return this.fchFecha;
/*     */   }
/*     */   
/*     */   public void setFchFecha(Date fchFecha) {
/* 118 */     this.fchFecha = fchFecha;
/*     */   }
/*     */   
/*     */   public Date getFecMod() {
/* 122 */     return this.fecMod;
/*     */   }
/*     */   
/*     */   public void setFecMod(Date fecMod) {
/* 126 */     this.fecMod = fecMod;
/*     */   }
/*     */   
/*     */   public int getIntId() {
/* 130 */     return this.intId;
/*     */   }
/*     */   
/*     */   public void setIntId(int intId) {
/* 134 */     this.intId = intId;
/*     */   }
/*     */   
/*     */   public String getUsuCve() {
/* 138 */     return this.usuCve;
/*     */   }
/*     */   
/*     */   public void setUsuCve(String usuCve) {
/* 142 */     this.usuCve = usuCve;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\FichaMedica.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */