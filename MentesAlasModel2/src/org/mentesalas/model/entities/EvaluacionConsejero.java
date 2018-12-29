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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Entity
/*     */ @Table(name="evaluacion_consejeros")
/*     */ @NamedQuery(name="EvaluacionConsejero.findAll", query="SELECT e FROM EvaluacionConsejero e")
/*     */ public class EvaluacionConsejero
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="ECO_ID")
/*     */   private int ecoId;
/*     */   @Column(name="ECO_1")
/*     */   private int eco1;
/*     */   @Column(name="ECO_2")
/*     */   private int eco2;
/*     */   @Column(name="ECO_3")
/*     */   private int eco3;
/*     */   @Column(name="ECO_4")
/*     */   private int eco4;
/*     */   @Column(name="ECO_5")
/*     */   private int eco5;
/*     */   @Column(name="ECO_6")
/*     */   private int eco6;
/*     */   @Column(name="ECO_7")
/*     */   private int eco7;
/*     */   @Column(name="ECO_8")
/*     */   private int eco8;
/*     */   @Column(name="ECO_AUTO")
/*     */   private int ecoAuto;
/*     */   @Column(name="ECO_ESTATUS")
/*     */   private int ecoEstatus;
/*     */   @Column(name="ECO_EVALUADO")
/*     */   private String ecoEvaluado;
/*     */   @Column(name="ECO_EVALUADOR")
/*     */   private String ecoEvaluador;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="ECO_FECHA")
/*     */   private Date ecoFecha;
/*     */   @Column(name="ECO_SUGERENCIAS")
/*     */   private String ecoSugerencias;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="FEC_MOD")
/*     */   private Date fecMod;
/*     */   @Column(name="USU_CVE")
/*     */   private String usuCve;
/*     */   
/*     */   public int getEcoId()
/*     */   {
/*  76 */     return this.ecoId;
/*     */   }
/*     */   
/*     */   public void setEcoId(int ecoId) {
/*  80 */     this.ecoId = ecoId;
/*     */   }
/*     */   
/*     */   public int getEco1() {
/*  84 */     return this.eco1;
/*     */   }
/*     */   
/*     */   public void setEco1(int eco1) {
/*  88 */     this.eco1 = eco1;
/*     */   }
/*     */   
/*     */   public int getEco2() {
/*  92 */     return this.eco2;
/*     */   }
/*     */   
/*     */   public void setEco2(int eco2) {
/*  96 */     this.eco2 = eco2;
/*     */   }
/*     */   
/*     */   public int getEco3() {
/* 100 */     return this.eco3;
/*     */   }
/*     */   
/*     */   public void setEco3(int eco3) {
/* 104 */     this.eco3 = eco3;
/*     */   }
/*     */   
/*     */   public int getEco4() {
/* 108 */     return this.eco4;
/*     */   }
/*     */   
/*     */   public void setEco4(int eco4) {
/* 112 */     this.eco4 = eco4;
/*     */   }
/*     */   
/*     */   public int getEco5() {
/* 116 */     return this.eco5;
/*     */   }
/*     */   
/*     */   public void setEco5(int eco5) {
/* 120 */     this.eco5 = eco5;
/*     */   }
/*     */   
/*     */   public int getEco6() {
/* 124 */     return this.eco6;
/*     */   }
/*     */   
/*     */   public void setEco6(int eco6) {
/* 128 */     this.eco6 = eco6;
/*     */   }
/*     */   
/*     */   public int getEco7() {
/* 132 */     return this.eco7;
/*     */   }
/*     */   
/*     */   public void setEco7(int eco7) {
/* 136 */     this.eco7 = eco7;
/*     */   }
/*     */   
/*     */   public int getEco8() {
/* 140 */     return this.eco8;
/*     */   }
/*     */   
/*     */   public void setEco8(int eco8) {
/* 144 */     this.eco8 = eco8;
/*     */   }
/*     */   
/*     */   public int getEcoAuto() {
/* 148 */     return this.ecoAuto;
/*     */   }
/*     */   
/*     */   public void setEcoAuto(int ecoAuto) {
/* 152 */     this.ecoAuto = ecoAuto;
/*     */   }
/*     */   
/*     */   public int getEcoEstatus() {
/* 156 */     return this.ecoEstatus;
/*     */   }
/*     */   
/*     */   public void setEcoEstatus(int ecoEstatus) {
/* 160 */     this.ecoEstatus = ecoEstatus;
/*     */   }
/*     */   
/*     */   public String getEcoEvaluado() {
/* 164 */     return this.ecoEvaluado;
/*     */   }
/*     */   
/*     */   public void setEcoEvaluado(String ecoEvaluado) {
/* 168 */     this.ecoEvaluado = ecoEvaluado;
/*     */   }
/*     */   
/*     */   public String getEcoEvaluador() {
/* 172 */     return this.ecoEvaluador;
/*     */   }
/*     */   
/*     */   public void setEcoEvaluador(String ecoEvaluador) {
/* 176 */     this.ecoEvaluador = ecoEvaluador;
/*     */   }
/*     */   
/*     */   public Date getEcoFecha() {
/* 180 */     return this.ecoFecha;
/*     */   }
/*     */   
/*     */   public void setEcoFecha(Date ecoFecha) {
/* 184 */     this.ecoFecha = ecoFecha;
/*     */   }
/*     */   
/*     */   public String getEcoSugerencias() {
/* 188 */     return this.ecoSugerencias;
/*     */   }
/*     */   
/*     */   public void setEcoSugerencias(String ecoSugerencias) {
/* 192 */     this.ecoSugerencias = ecoSugerencias;
/*     */   }
/*     */   
/*     */   public Date getFecMod() {
/* 196 */     return this.fecMod;
/*     */   }
/*     */   
/*     */   public void setFecMod(Date fecMod) {
/* 200 */     this.fecMod = fecMod;
/*     */   }
/*     */   
/*     */   public String getUsuCve() {
/* 204 */     return this.usuCve;
/*     */   }
/*     */   
/*     */   public void setUsuCve(String usuCve) {
/* 208 */     this.usuCve = usuCve;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\EvaluacionConsejero.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */