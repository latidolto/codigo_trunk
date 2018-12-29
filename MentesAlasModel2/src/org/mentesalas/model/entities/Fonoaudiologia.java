/*     */ package org.mentesalas.model.entities;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.Id;
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
/*     */ @Entity
/*     */ @NamedQuery(name="Fonoaudiologia.findAll", query="SELECT f FROM Fonoaudiologia f")
/*     */ public class Fonoaudiologia
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="FON_ID")
/*     */   private int fonId;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="FEC_MOD")
/*     */   private Date fecMod;
/*     */   @Column(name="FON_ENFOQUE")
/*     */   private String fonEnfoque;
/*     */   @Column(name="FON_ESTATUS")
/*     */   private int fonEstatus;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="FON_FECHA")
/*     */   private Date fonFecha;
/*     */   @Column(name="FON_METAS")
/*     */   private String fonMetas;
/*     */   @Column(name="FON_OBSER")
/*     */   private String fonObser;
/*     */   @Column(name="FON_TRATA")
/*     */   private String fonTrata;
/*     */   @Column(name="INT_ID")
/*     */   private int intId;
/*     */   @Column(name="TER_ID")
/*     */   private int terId;
/*     */   @Column(name="USU_CVE")
/*     */   private String usuCve;
/*     */   
/*     */   public int getFonId()
/*     */   {
/*  57 */     return this.fonId;
/*     */   }
/*     */   
/*     */   public void setFonId(int fonId) {
/*  61 */     this.fonId = fonId;
/*     */   }
/*     */   
/*     */   public Date getFecMod() {
/*  65 */     return this.fecMod;
/*     */   }
/*     */   
/*     */   public void setFecMod(Date fecMod) {
/*  69 */     this.fecMod = fecMod;
/*     */   }
/*     */   
/*     */   public String getFonEnfoque() {
/*  73 */     return this.fonEnfoque;
/*     */   }
/*     */   
/*     */   public void setFonEnfoque(String fonEnfoque) {
/*  77 */     this.fonEnfoque = fonEnfoque;
/*     */   }
/*     */   
/*     */   public int getFonEstatus() {
/*  81 */     return this.fonEstatus;
/*     */   }
/*     */   
/*     */   public void setFonEstatus(int fonEstatus) {
/*  85 */     this.fonEstatus = fonEstatus;
/*     */   }
/*     */   
/*     */   public Date getFonFecha() {
/*  89 */     return this.fonFecha;
/*     */   }
/*     */   
/*     */   public void setFonFecha(Date fonFecha) {
/*  93 */     this.fonFecha = fonFecha;
/*     */   }
/*     */   
/*     */   public String getFonMetas() {
/*  97 */     return this.fonMetas;
/*     */   }
/*     */   
/*     */   public void setFonMetas(String fonMetas) {
/* 101 */     this.fonMetas = fonMetas;
/*     */   }
/*     */   
/*     */   public String getFonObser() {
/* 105 */     return this.fonObser;
/*     */   }
/*     */   
/*     */   public void setFonObser(String fonObser) {
/* 109 */     this.fonObser = fonObser;
/*     */   }
/*     */   
/*     */   public String getFonTrata() {
/* 113 */     return this.fonTrata;
/*     */   }
/*     */   
/*     */   public void setFonTrata(String fonTrata) {
/* 117 */     this.fonTrata = fonTrata;
/*     */   }
/*     */   
/*     */   public int getIntId() {
/* 121 */     return this.intId;
/*     */   }
/*     */   
/*     */   public void setIntId(int intId) {
/* 125 */     this.intId = intId;
/*     */   }
/*     */   
/*     */   public int getTerId() {
/* 129 */     return this.terId;
/*     */   }
/*     */   
/*     */   public void setTerId(int terId) {
/* 133 */     this.terId = terId;
/*     */   }
/*     */   
/*     */   public String getUsuCve() {
/* 137 */     return this.usuCve;
/*     */   }
/*     */   
/*     */   public void setUsuCve(String usuCve) {
/* 141 */     this.usuCve = usuCve;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\Fonoaudiologia.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */