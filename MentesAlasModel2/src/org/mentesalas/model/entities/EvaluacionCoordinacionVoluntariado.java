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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Entity
/*     */ @Table(name="evaluacion_coordinacion_voluntariado")
/*     */ @NamedQuery(name="EvaluacionCoordinacionVoluntariado.findAll", query="SELECT e FROM EvaluacionCoordinacionVoluntariado e")
/*     */ public class EvaluacionCoordinacionVoluntariado
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="ECV_ID")
/*     */   private int ecvId;
/*     */   @Column(name="ECV_1")
/*     */   private int ecv1;
/*     */   @Column(name="ECV_10")
/*     */   private int ecv10;
/*     */   @Column(name="ECV_11")
/*     */   private int ecv11;
/*     */   @Column(name="ECV_12")
/*     */   private int ecv12;
/*     */   @Column(name="ECV_13")
/*     */   private int ecv13;
/*     */   @Column(name="ECV_14")
/*     */   private int ecv14;
/*     */   @Column(name="ECV_15")
/*     */   private int ecv15;
/*     */   @Column(name="ECV_16")
/*     */   private int ecv16;
/*     */   @Column(name="ECV_2")
/*     */   private int ecv2;
/*     */   @Column(name="ECV_3")
/*     */   private int ecv3;
/*     */   @Column(name="ECV_4")
/*     */   private int ecv4;
/*     */   @Column(name="ECV_5")
/*     */   private int ecv5;
/*     */   @Column(name="ECV_6")
/*     */   private int ecv6;
/*     */   @Column(name="ECV_7")
/*     */   private int ecv7;
/*     */   @Column(name="ECV_8")
/*     */   private int ecv8;
/*     */   @Column(name="ECV_9")
/*     */   private int ecv9;
/*     */   @Column(name="ECV_ESTATUS")
/*     */   private int ecvEstatus;
/*     */   @Column(name="ECV_EVALUADO")
/*     */   private String ecvEvaluado;
/*     */   @Column(name="ECV_EVALUADOR")
/*     */   private String ecvEvaluador;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="ECV_FECHA")
/*     */   private Date ecvFecha;
/*     */   @Column(name="ECV_SUGERENCIAS")
/*     */   private String ecvSugerencias;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="FEC_MOD")
/*     */   private Date fecMod;
/*     */   @Column(name="USU_CVE")
/*     */   private String usuCve;
/*     */   
/*     */   public int getEcvId()
/*     */   {
/*  97 */     return this.ecvId;
/*     */   }
/*     */   
/*     */   public void setEcvId(int ecvId) {
/* 101 */     this.ecvId = ecvId;
/*     */   }
/*     */   
/*     */   public int getEcv1() {
/* 105 */     return this.ecv1;
/*     */   }
/*     */   
/*     */   public void setEcv1(int ecv1) {
/* 109 */     this.ecv1 = ecv1;
/*     */   }
/*     */   
/*     */   public int getEcv10() {
/* 113 */     return this.ecv10;
/*     */   }
/*     */   
/*     */   public void setEcv10(int ecv10) {
/* 117 */     this.ecv10 = ecv10;
/*     */   }
/*     */   
/*     */   public int getEcv11() {
/* 121 */     return this.ecv11;
/*     */   }
/*     */   
/*     */   public void setEcv11(int ecv11) {
/* 125 */     this.ecv11 = ecv11;
/*     */   }
/*     */   
/*     */   public int getEcv12() {
/* 129 */     return this.ecv12;
/*     */   }
/*     */   
/*     */   public void setEcv12(int ecv12) {
/* 133 */     this.ecv12 = ecv12;
/*     */   }
/*     */   
/*     */   public int getEcv13() {
/* 137 */     return this.ecv13;
/*     */   }
/*     */   
/*     */   public void setEcv13(int ecv13) {
/* 141 */     this.ecv13 = ecv13;
/*     */   }
/*     */   
/*     */   public int getEcv14() {
/* 145 */     return this.ecv14;
/*     */   }
/*     */   
/*     */   public void setEcv14(int ecv14) {
/* 149 */     this.ecv14 = ecv14;
/*     */   }
/*     */   
/*     */   public int getEcv15() {
/* 153 */     return this.ecv15;
/*     */   }
/*     */   
/*     */   public void setEcv15(int ecv15) {
/* 157 */     this.ecv15 = ecv15;
/*     */   }
/*     */   
/*     */   public int getEcv16() {
/* 161 */     return this.ecv16;
/*     */   }
/*     */   
/*     */   public void setEcv16(int ecv16) {
/* 165 */     this.ecv16 = ecv16;
/*     */   }
/*     */   
/*     */   public int getEcv2() {
/* 169 */     return this.ecv2;
/*     */   }
/*     */   
/*     */   public void setEcv2(int ecv2) {
/* 173 */     this.ecv2 = ecv2;
/*     */   }
/*     */   
/*     */   public int getEcv3() {
/* 177 */     return this.ecv3;
/*     */   }
/*     */   
/*     */   public void setEcv3(int ecv3) {
/* 181 */     this.ecv3 = ecv3;
/*     */   }
/*     */   
/*     */   public int getEcv4() {
/* 185 */     return this.ecv4;
/*     */   }
/*     */   
/*     */   public void setEcv4(int ecv4) {
/* 189 */     this.ecv4 = ecv4;
/*     */   }
/*     */   
/*     */   public int getEcv5() {
/* 193 */     return this.ecv5;
/*     */   }
/*     */   
/*     */   public void setEcv5(int ecv5) {
/* 197 */     this.ecv5 = ecv5;
/*     */   }
/*     */   
/*     */   public int getEcv6() {
/* 201 */     return this.ecv6;
/*     */   }
/*     */   
/*     */   public void setEcv6(int ecv6) {
/* 205 */     this.ecv6 = ecv6;
/*     */   }
/*     */   
/*     */   public int getEcv7() {
/* 209 */     return this.ecv7;
/*     */   }
/*     */   
/*     */   public void setEcv7(int ecv7) {
/* 213 */     this.ecv7 = ecv7;
/*     */   }
/*     */   
/*     */   public int getEcv8() {
/* 217 */     return this.ecv8;
/*     */   }
/*     */   
/*     */   public void setEcv8(int ecv8) {
/* 221 */     this.ecv8 = ecv8;
/*     */   }
/*     */   
/*     */   public int getEcv9() {
/* 225 */     return this.ecv9;
/*     */   }
/*     */   
/*     */   public void setEcv9(int ecv9) {
/* 229 */     this.ecv9 = ecv9;
/*     */   }
/*     */   
/*     */   public int getEcvEstatus() {
/* 233 */     return this.ecvEstatus;
/*     */   }
/*     */   
/*     */   public void setEcvEstatus(int ecvEstatus) {
/* 237 */     this.ecvEstatus = ecvEstatus;
/*     */   }
/*     */   
/*     */   public String getEcvEvaluado() {
/* 241 */     return this.ecvEvaluado;
/*     */   }
/*     */   
/*     */   public void setEcvEvaluado(String ecvEvaluado) {
/* 245 */     this.ecvEvaluado = ecvEvaluado;
/*     */   }
/*     */   
/*     */   public String getEcvEvaluador() {
/* 249 */     return this.ecvEvaluador;
/*     */   }
/*     */   
/*     */   public void setEcvEvaluador(String ecvEvaluador) {
/* 253 */     this.ecvEvaluador = ecvEvaluador;
/*     */   }
/*     */   
/*     */   public Date getEcvFecha() {
/* 257 */     return this.ecvFecha;
/*     */   }
/*     */   
/*     */   public void setEcvFecha(Date ecvFecha) {
/* 261 */     this.ecvFecha = ecvFecha;
/*     */   }
/*     */   
/*     */   public String getEcvSugerencias() {
/* 265 */     return this.ecvSugerencias;
/*     */   }
/*     */   
/*     */   public void setEcvSugerencias(String ecvSugerencias) {
/* 269 */     this.ecvSugerencias = ecvSugerencias;
/*     */   }
/*     */   
/*     */   public Date getFecMod() {
/* 273 */     return this.fecMod;
/*     */   }
/*     */   
/*     */   public void setFecMod(Date fecMod) {
/* 277 */     this.fecMod = fecMod;
/*     */   }
/*     */   
/*     */   public String getUsuCve() {
/* 281 */     return this.usuCve;
/*     */   }
/*     */   
/*     */   public void setUsuCve(String usuCve) {
/* 285 */     this.usuCve = usuCve;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\EvaluacionCoordinacionVoluntariado.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */