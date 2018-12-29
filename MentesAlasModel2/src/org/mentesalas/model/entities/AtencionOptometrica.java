/*     */ package org.mentesalas.model.entities;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.sql.Timestamp;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Entity
/*     */ @Table(name="atencion_optometrica")
/*     */ @NamedQuery(name="AtencionOptometrica.findAll", query="SELECT a FROM AtencionOptometrica a")
/*     */ public class AtencionOptometrica
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="AOP_ID")
/*     */   private int aopId;
/*     */   @Column(name="AOP_ANTECEDENTES")
/*     */   private String aopAntecedentes;
/*     */   @Column(name="AOP_AVC_AO")
/*     */   private String aopAvcAo;
/*     */   @Column(name="AOP_AVC_OD")
/*     */   private String aopAvcOd;
/*     */   @Column(name="AOP_AVC_OI")
/*     */   private String aopAvcOi;
/*     */   @Column(name="AOP_AVL_AO")
/*     */   private String aopAvlAo;
/*     */   @Column(name="AOP_AVL_OD")
/*     */   private String aopAvlOd;
/*     */   @Column(name="AOP_AVL_OI")
/*     */   private String aopAvlOi;
/*     */   @Column(name="AOP_CAMPO_VISUAL")
/*     */   private String aopCampoVisual;
/*     */   @Column(name="AOP_CTRL_OCULAR")
/*     */   private String aopCtrlOcular;
/*     */   @Column(name="AOP_DIAG_POSTURA")
/*     */   private String aopDiagPostura;
/*     */   @Column(name="AOP_DONACION")
/*     */   private int aopDonacion;
/*     */   @Temporal(TemporalType.TIMESTAMP)
/*     */   @Column(name="AOP_FECHA")
/*     */   private Date aopFecha;
/*     */   @Column(name="AOP_HAB_ACOMODA")
/*     */   private String aopHabAcomoda;
/*     */   @Column(name="AOP_HAB_BINOCULAR")
/*     */   private String aopHabBinocular;
/*     */   @Column(name="AOP_HAB_MOVOCULAR")
/*     */   private String aopHabMovocular;
/*     */   @Column(name="AOP_HORA")
/*     */   private Timestamp aopHora;
/*     */   @Column(name="AOP_MANEJJO_POSTURA")
/*     */   private String aopManejjoPostura;
/*     */   @Column(name="AOP_MONTO")
/*     */   private double aopMonto;
/*     */   @Column(name="AOP_OFTALMOSCOPIA")
/*     */   private String aopOftalmoscopia;
/*     */   @Column(name="AOP_SEG_ANTERIOR")
/*     */   private String aopSegAnterior;
/*     */   @Column(name="AOP_TTO_POSTURA")
/*     */   private String aopTtoPostura;
/*     */   @Column(name="AOP_VISION_CROMATICA")
/*     */   private String aopVisionCromatica;
/*     */   @Column(name="INT_ID")
/*     */   private int intId;
/*     */   @Column(name="MED_ID")
/*     */   private String medId;
/*     */   
/*     */   public int getAopId()
/*     */   {
/* 100 */     return this.aopId;
/*     */   }
/*     */   
/*     */   public void setAopId(int aopId) {
/* 104 */     this.aopId = aopId;
/*     */   }
/*     */   
/*     */   public String getAopAntecedentes() {
/* 108 */     return this.aopAntecedentes;
/*     */   }
/*     */   
/*     */   public void setAopAntecedentes(String aopAntecedentes) {
/* 112 */     this.aopAntecedentes = aopAntecedentes;
/*     */   }
/*     */   
/*     */   public String getAopAvcAo() {
/* 116 */     return this.aopAvcAo;
/*     */   }
/*     */   
/*     */   public void setAopAvcAo(String aopAvcAo) {
/* 120 */     this.aopAvcAo = aopAvcAo;
/*     */   }
/*     */   
/*     */   public String getAopAvcOd() {
/* 124 */     return this.aopAvcOd;
/*     */   }
/*     */   
/*     */   public void setAopAvcOd(String aopAvcOd) {
/* 128 */     this.aopAvcOd = aopAvcOd;
/*     */   }
/*     */   
/*     */   public String getAopAvcOi() {
/* 132 */     return this.aopAvcOi;
/*     */   }
/*     */   
/*     */   public void setAopAvcOi(String aopAvcOi) {
/* 136 */     this.aopAvcOi = aopAvcOi;
/*     */   }
/*     */   
/*     */   public String getAopAvlAo() {
/* 140 */     return this.aopAvlAo;
/*     */   }
/*     */   
/*     */   public void setAopAvlAo(String aopAvlAo) {
/* 144 */     this.aopAvlAo = aopAvlAo;
/*     */   }
/*     */   
/*     */   public String getAopAvlOd() {
/* 148 */     return this.aopAvlOd;
/*     */   }
/*     */   
/*     */   public void setAopAvlOd(String aopAvlOd) {
/* 152 */     this.aopAvlOd = aopAvlOd;
/*     */   }
/*     */   
/*     */   public String getAopAvlOi() {
/* 156 */     return this.aopAvlOi;
/*     */   }
/*     */   
/*     */   public void setAopAvlOi(String aopAvlOi) {
/* 160 */     this.aopAvlOi = aopAvlOi;
/*     */   }
/*     */   
/*     */   public String getAopCampoVisual() {
/* 164 */     return this.aopCampoVisual;
/*     */   }
/*     */   
/*     */   public void setAopCampoVisual(String aopCampoVisual) {
/* 168 */     this.aopCampoVisual = aopCampoVisual;
/*     */   }
/*     */   
/*     */   public String getAopCtrlOcular() {
/* 172 */     return this.aopCtrlOcular;
/*     */   }
/*     */   
/*     */   public void setAopCtrlOcular(String aopCtrlOcular) {
/* 176 */     this.aopCtrlOcular = aopCtrlOcular;
/*     */   }
/*     */   
/*     */   public String getAopDiagPostura() {
/* 180 */     return this.aopDiagPostura;
/*     */   }
/*     */   
/*     */   public void setAopDiagPostura(String aopDiagPostura) {
/* 184 */     this.aopDiagPostura = aopDiagPostura;
/*     */   }
/*     */   
/*     */   public int getAopDonacion() {
/* 188 */     return this.aopDonacion;
/*     */   }
/*     */   
/*     */   public void setAopDonacion(int aopDonacion) {
/* 192 */     this.aopDonacion = aopDonacion;
/*     */   }
/*     */   
/*     */   public Date getAopFecha() {
/* 196 */     return this.aopFecha;
/*     */   }
/*     */   
/*     */   public void setAopFecha(Date aopFecha) {
/* 200 */     this.aopFecha = aopFecha;
/*     */   }
/*     */   
/*     */   public String getAopHabAcomoda() {
/* 204 */     return this.aopHabAcomoda;
/*     */   }
/*     */   
/*     */   public void setAopHabAcomoda(String aopHabAcomoda) {
/* 208 */     this.aopHabAcomoda = aopHabAcomoda;
/*     */   }
/*     */   
/*     */   public String getAopHabBinocular() {
/* 212 */     return this.aopHabBinocular;
/*     */   }
/*     */   
/*     */   public void setAopHabBinocular(String aopHabBinocular) {
/* 216 */     this.aopHabBinocular = aopHabBinocular;
/*     */   }
/*     */   
/*     */   public String getAopHabMovocular() {
/* 220 */     return this.aopHabMovocular;
/*     */   }
/*     */   
/*     */   public void setAopHabMovocular(String aopHabMovocular) {
/* 224 */     this.aopHabMovocular = aopHabMovocular;
/*     */   }
/*     */   
/*     */   public Timestamp getAopHora() {
/* 228 */     return this.aopHora;
/*     */   }
/*     */   
/*     */   public void setAopHora(Timestamp aopHora) {
/* 232 */     this.aopHora = aopHora;
/*     */   }
/*     */   
/*     */   public String getAopManejjoPostura() {
/* 236 */     return this.aopManejjoPostura;
/*     */   }
/*     */   
/*     */   public void setAopManejjoPostura(String aopManejjoPostura) {
/* 240 */     this.aopManejjoPostura = aopManejjoPostura;
/*     */   }
/*     */   
/*     */   public double getAopMonto() {
/* 244 */     return this.aopMonto;
/*     */   }
/*     */   
/*     */   public void setAopMonto(double aopMonto) {
/* 248 */     this.aopMonto = aopMonto;
/*     */   }
/*     */   
/*     */   public String getAopOftalmoscopia() {
/* 252 */     return this.aopOftalmoscopia;
/*     */   }
/*     */   
/*     */   public void setAopOftalmoscopia(String aopOftalmoscopia) {
/* 256 */     this.aopOftalmoscopia = aopOftalmoscopia;
/*     */   }
/*     */   
/*     */   public String getAopSegAnterior() {
/* 260 */     return this.aopSegAnterior;
/*     */   }
/*     */   
/*     */   public void setAopSegAnterior(String aopSegAnterior) {
/* 264 */     this.aopSegAnterior = aopSegAnterior;
/*     */   }
/*     */   
/*     */   public String getAopTtoPostura() {
/* 268 */     return this.aopTtoPostura;
/*     */   }
/*     */   
/*     */   public void setAopTtoPostura(String aopTtoPostura) {
/* 272 */     this.aopTtoPostura = aopTtoPostura;
/*     */   }
/*     */   
/*     */   public String getAopVisionCromatica() {
/* 276 */     return this.aopVisionCromatica;
/*     */   }
/*     */   
/*     */   public void setAopVisionCromatica(String aopVisionCromatica) {
/* 280 */     this.aopVisionCromatica = aopVisionCromatica;
/*     */   }
/*     */   
/*     */   public int getIntId() {
/* 284 */     return this.intId;
/*     */   }
/*     */   
/*     */   public void setIntId(int intId) {
/* 288 */     this.intId = intId;
/*     */   }
/*     */   
/*     */   public String getMedId() {
/* 292 */     return this.medId;
/*     */   }
/*     */   
/*     */   public void setMedId(String medId) {
/* 296 */     this.medId = medId;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\AtencionOptometrica.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */