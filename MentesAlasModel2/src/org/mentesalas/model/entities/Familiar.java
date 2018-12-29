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
/*     */ 
/*     */ 
/*     */ 
/*     */ @Entity
/*     */ @NamedQuery(name="Familiar.findAll", query="SELECT f FROM Familiar f")
/*     */ public class Familiar
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="FAM_ID")
/*     */   private int famId;
/*     */   @Column(name="FAM_APE_MAT")
/*     */   private String famApeMat;
/*     */   @Column(name="FAM_APE_PAT")
/*     */   private String famApePat;
/*     */   @Column(name="FAM_DOM")
/*     */   private String famDom;
/*     */   @Column(name="FAM_EMP")
/*     */   private String famEmp;
/*     */   @Column(name="FAM_ESC")
/*     */   private int famEsc;
/*     */   @Column(name="FAM_EST_CIV")
/*     */   private int famEstCiv;
/*     */   @Column(name="FAM_ESTATUS")
/*     */   private int famEstatus;
/*     */   @Column(name="FAM_ING")
/*     */   private int famIng;
/*     */   @Column(name="FAM_NOM")
/*     */   private String famNom;
/*     */   @Column(name="FAM_NUM_IMSS")
/*     */   private String famNumImss;
/*     */   @Column(name="FAM_OBS")
/*     */   private String famObs;
/*     */   @Column(name="FAM_PRO")
/*     */   private String famPro;
/*     */   @Column(name="FAM_REL")
/*     */   private String famRel;
/*     */   @Column(name="FAM_ROL")
/*     */   private int famRol;
/*     */   @Column(name="FAM_TIPO")
/*     */   private int famTipo;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="FEC_MOD")
/*     */   private Date fecMod;
/*     */   @Column(name="USU_CVE")
/*     */   private String usuCve;
/*     */   @ManyToOne
/*     */   @JoinColumn(name="INT_ID")
/*     */   private Integrante integrante;
/*     */   
/*     */   public int getFamId()
/*     */   {
/*  82 */     return this.famId;
/*     */   }
/*     */   
/*     */   public void setFamId(int famId) {
/*  86 */     this.famId = famId;
/*     */   }
/*     */   
/*     */   public String getFamApeMat() {
/*  90 */     return this.famApeMat;
/*     */   }
/*     */   
/*     */   public void setFamApeMat(String famApeMat) {
/*  94 */     this.famApeMat = famApeMat;
/*     */   }
/*     */   
/*     */   public String getFamApePat() {
/*  98 */     return this.famApePat;
/*     */   }
/*     */   
/*     */   public void setFamApePat(String famApePat) {
/* 102 */     this.famApePat = famApePat;
/*     */   }
/*     */   
/*     */   public String getFamDom() {
/* 106 */     return this.famDom;
/*     */   }
/*     */   
/*     */   public void setFamDom(String famDom) {
/* 110 */     this.famDom = famDom;
/*     */   }
/*     */   
/*     */   public String getFamEmp() {
/* 114 */     return this.famEmp;
/*     */   }
/*     */   
/*     */   public void setFamEmp(String famEmp) {
/* 118 */     this.famEmp = famEmp;
/*     */   }
/*     */   
/*     */   public int getFamEsc() {
/* 122 */     return this.famEsc;
/*     */   }
/*     */   
/*     */   public void setFamEsc(int famEsc) {
/* 126 */     this.famEsc = famEsc;
/*     */   }
/*     */   
/*     */   public int getFamEstCiv() {
/* 130 */     return this.famEstCiv;
/*     */   }
/*     */   
/*     */   public void setFamEstCiv(int famEstCiv) {
/* 134 */     this.famEstCiv = famEstCiv;
/*     */   }
/*     */   
/*     */   public int getFamEstatus() {
/* 138 */     return this.famEstatus;
/*     */   }
/*     */   
/*     */   public void setFamEstatus(int famEstatus) {
/* 142 */     this.famEstatus = famEstatus;
/*     */   }
/*     */   
/*     */   public int getFamIng() {
/* 146 */     return this.famIng;
/*     */   }
/*     */   
/*     */   public void setFamIng(int famIng) {
/* 150 */     this.famIng = famIng;
/*     */   }
/*     */   
/*     */   public String getFamNom() {
/* 154 */     return this.famNom;
/*     */   }
/*     */   
/*     */   public void setFamNom(String famNom) {
/* 158 */     this.famNom = famNom;
/*     */   }
/*     */   
/*     */   public String getFamNumImss() {
/* 162 */     return this.famNumImss;
/*     */   }
/*     */   
/*     */   public void setFamNumImss(String famNumImss) {
/* 166 */     this.famNumImss = famNumImss;
/*     */   }
/*     */   
/*     */   public String getFamObs() {
/* 170 */     return this.famObs;
/*     */   }
/*     */   
/*     */   public void setFamObs(String famObs) {
/* 174 */     this.famObs = famObs;
/*     */   }
/*     */   
/*     */   public String getFamPro() {
/* 178 */     return this.famPro;
/*     */   }
/*     */   
/*     */   public void setFamPro(String famPro) {
/* 182 */     this.famPro = famPro;
/*     */   }
/*     */   
/*     */   public String getFamRel() {
/* 186 */     return this.famRel;
/*     */   }
/*     */   
/*     */   public void setFamRel(String famRel) {
/* 190 */     this.famRel = famRel;
/*     */   }
/*     */   
/*     */   public int getFamRol() {
/* 194 */     return this.famRol;
/*     */   }
/*     */   
/*     */   public void setFamRol(int famRol) {
/* 198 */     this.famRol = famRol;
/*     */   }
/*     */   
/*     */   public int getFamTipo() {
/* 202 */     return this.famTipo;
/*     */   }
/*     */   
/*     */   public void setFamTipo(int famTipo) {
/* 206 */     this.famTipo = famTipo;
/*     */   }
/*     */   
/*     */   public Date getFecMod() {
/* 210 */     return this.fecMod;
/*     */   }
/*     */   
/*     */   public void setFecMod(Date fecMod) {
/* 214 */     this.fecMod = fecMod;
/*     */   }
/*     */   
/*     */   public String getUsuCve() {
/* 218 */     return this.usuCve;
/*     */   }
/*     */   
/*     */   public void setUsuCve(String usuCve) {
/* 222 */     this.usuCve = usuCve;
/*     */   }
/*     */   
/*     */   public Integrante getIntegrante() {
/* 226 */     return this.integrante;
/*     */   }
/*     */   
/*     */   public void setIntegrante(Integrante integrante) {
/* 230 */     this.integrante = integrante;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\Familiar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */