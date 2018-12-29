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
/*     */ 
/*     */ 
/*     */ 
/*     */ @Entity
/*     */ @NamedQuery(name="Psicologia.findAll", query="SELECT p FROM Psicologia p")
/*     */ public class Psicologia
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="PSI_ID")
/*     */   private int psiId;
/*     */   @Column(name="PSI_ASP")
/*     */   private String psiAsp;
/*     */   @Column(name="PSI_CVE_SES")
/*     */   private String psiCveSes;
/*     */   @Column(name="PSI_DESC_EST_FIN")
/*     */   private String psiDescEstFin;
/*     */   @Column(name="PSI_DESC_EST_REC")
/*     */   private String psiDescEstRec;
/*     */   @Temporal(TemporalType.TIMESTAMP)
/*     */   @Column(name="PSI_FECHA")
/*     */   private Date psiFecha;
/*     */   @Temporal(TemporalType.TIMESTAMP)
/*     */   @Column(name="PSI_HOR_ENT")
/*     */   private Date psiHorEnt;
/*     */   @Temporal(TemporalType.TIMESTAMP)
/*     */   @Column(name="PSI_HOR_SAL")
/*     */   private Date psiHorSal;
/*     */   @Column(name="PSI_LOG_ACU")
/*     */   private String psiLogAcu;
/*     */   @Column(name="PSI_MOT_CON")
/*     */   private String psiMotCon;
/*     */   @Column(name="PSI_NO_SES")
/*     */   private String psiNoSes;
/*     */   @Column(name="PSI_NOM_SOL")
/*     */   private String psiNomSol;
/*     */   @Column(name="PSI_OBS")
/*     */   private String psiObs;
/*     */   @Column(name="PSI_TAR_APLI")
/*     */   private String psiTarApli;
/*     */   
/*     */   public int getPsiId()
/*     */   {
/*  67 */     return this.psiId;
/*     */   }
/*     */   
/*     */   public void setPsiId(int psiId) {
/*  71 */     this.psiId = psiId;
/*     */   }
/*     */   
/*     */   public String getPsiAsp() {
/*  75 */     return this.psiAsp;
/*     */   }
/*     */   
/*     */   public void setPsiAsp(String psiAsp) {
/*  79 */     this.psiAsp = psiAsp;
/*     */   }
/*     */   
/*     */   public String getPsiCveSes() {
/*  83 */     return this.psiCveSes;
/*     */   }
/*     */   
/*     */   public void setPsiCveSes(String psiCveSes) {
/*  87 */     this.psiCveSes = psiCveSes;
/*     */   }
/*     */   
/*     */   public String getPsiDescEstFin() {
/*  91 */     return this.psiDescEstFin;
/*     */   }
/*     */   
/*     */   public void setPsiDescEstFin(String psiDescEstFin) {
/*  95 */     this.psiDescEstFin = psiDescEstFin;
/*     */   }
/*     */   
/*     */   public String getPsiDescEstRec() {
/*  99 */     return this.psiDescEstRec;
/*     */   }
/*     */   
/*     */   public void setPsiDescEstRec(String psiDescEstRec) {
/* 103 */     this.psiDescEstRec = psiDescEstRec;
/*     */   }
/*     */   
/*     */   public Date getPsiFecha() {
/* 107 */     return this.psiFecha;
/*     */   }
/*     */   
/*     */   public void setPsiFecha(Date psiFecha) {
/* 111 */     this.psiFecha = psiFecha;
/*     */   }
/*     */   
/*     */   public Date getPsiHorEnt() {
/* 115 */     return this.psiHorEnt;
/*     */   }
/*     */   
/*     */   public void setPsiHorEnt(Date psiHorEnt) {
/* 119 */     this.psiHorEnt = psiHorEnt;
/*     */   }
/*     */   
/*     */   public Date getPsiHorSal() {
/* 123 */     return this.psiHorSal;
/*     */   }
/*     */   
/*     */   public void setPsiHorSal(Date psiHorSal) {
/* 127 */     this.psiHorSal = psiHorSal;
/*     */   }
/*     */   
/*     */   public String getPsiLogAcu() {
/* 131 */     return this.psiLogAcu;
/*     */   }
/*     */   
/*     */   public void setPsiLogAcu(String psiLogAcu) {
/* 135 */     this.psiLogAcu = psiLogAcu;
/*     */   }
/*     */   
/*     */   public String getPsiMotCon() {
/* 139 */     return this.psiMotCon;
/*     */   }
/*     */   
/*     */   public void setPsiMotCon(String psiMotCon) {
/* 143 */     this.psiMotCon = psiMotCon;
/*     */   }
/*     */   
/*     */   public String getPsiNoSes() {
/* 147 */     return this.psiNoSes;
/*     */   }
/*     */   
/*     */   public void setPsiNoSes(String psiNoSes) {
/* 151 */     this.psiNoSes = psiNoSes;
/*     */   }
/*     */   
/*     */   public String getPsiNomSol() {
/* 155 */     return this.psiNomSol;
/*     */   }
/*     */   
/*     */   public void setPsiNomSol(String psiNomSol) {
/* 159 */     this.psiNomSol = psiNomSol;
/*     */   }
/*     */   
/*     */   public String getPsiObs() {
/* 163 */     return this.psiObs;
/*     */   }
/*     */   
/*     */   public void setPsiObs(String psiObs) {
/* 167 */     this.psiObs = psiObs;
/*     */   }
/*     */   
/*     */   public String getPsiTarApli() {
/* 171 */     return this.psiTarApli;
/*     */   }
/*     */   
/*     */   public void setPsiTarApli(String psiTarApli) {
/* 175 */     this.psiTarApli = psiTarApli;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\Psicologia.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */