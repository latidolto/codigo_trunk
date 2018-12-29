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
/*     */ @Table(name="evaluacion_direccion_general")
/*     */ @NamedQuery(name="EvaluacionDireccionGeneral.findAll", query="SELECT e FROM EvaluacionDireccionGeneral e")
/*     */ public class EvaluacionDireccionGeneral
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="EDG_ID")
/*     */   private int edgId;
/*     */   @Column(name="EDG_1")
/*     */   private int edg1;
/*     */   @Column(name="EDG_10")
/*     */   private int edg10;
/*     */   @Column(name="EDG_11")
/*     */   private int edg11;
/*     */   @Column(name="EDG_12")
/*     */   private int edg12;
/*     */   @Column(name="EDG_13")
/*     */   private int edg13;
/*     */   @Column(name="EDG_14")
/*     */   private int edg14;
/*     */   @Column(name="EDG_15")
/*     */   private int edg15;
/*     */   @Column(name="EDG_2")
/*     */   private int edg2;
/*     */   @Column(name="EDG_3")
/*     */   private int edg3;
/*     */   @Column(name="EDG_4")
/*     */   private int edg4;
/*     */   @Column(name="EDG_5")
/*     */   private int edg5;
/*     */   @Column(name="EDG_6")
/*     */   private int edg6;
/*     */   @Column(name="EDG_7")
/*     */   private int edg7;
/*     */   @Column(name="EDG_8")
/*     */   private int edg8;
/*     */   @Column(name="EDG_9")
/*     */   private int edg9;
/*     */   @Column(name="EDG_AUTO")
/*     */   private int edgAuto;
/*     */   @Column(name="EDG_ESTATUS")
/*     */   private int edgEstatus;
/*     */   @Column(name="EDG_EVALUADO")
/*     */   private String edgEvaluado;
/*     */   @Column(name="EDG_EVALUADOR")
/*     */   private String edgEvaluador;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="EDG_FECHA")
/*     */   private Date edgFecha;
/*     */   @Column(name="EDG_SUGERENCIAS")
/*     */   private String edgSugerencias;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="FEC_MOD")
/*     */   private Date fecMod;
/*     */   @Column(name="USU_CVE")
/*     */   private String usuCve;
/*     */   
/*     */   public int getEdgId()
/*     */   {
/*  97 */     return this.edgId;
/*     */   }
/*     */   
/*     */   public void setEdgId(int edgId) {
/* 101 */     this.edgId = edgId;
/*     */   }
/*     */   
/*     */   public int getEdg1() {
/* 105 */     return this.edg1;
/*     */   }
/*     */   
/*     */   public void setEdg1(int edg1) {
/* 109 */     this.edg1 = edg1;
/*     */   }
/*     */   
/*     */   public int getEdg10() {
/* 113 */     return this.edg10;
/*     */   }
/*     */   
/*     */   public void setEdg10(int edg10) {
/* 117 */     this.edg10 = edg10;
/*     */   }
/*     */   
/*     */   public int getEdg11() {
/* 121 */     return this.edg11;
/*     */   }
/*     */   
/*     */   public void setEdg11(int edg11) {
/* 125 */     this.edg11 = edg11;
/*     */   }
/*     */   
/*     */   public int getEdg12() {
/* 129 */     return this.edg12;
/*     */   }
/*     */   
/*     */   public void setEdg12(int edg12) {
/* 133 */     this.edg12 = edg12;
/*     */   }
/*     */   
/*     */   public int getEdg13() {
/* 137 */     return this.edg13;
/*     */   }
/*     */   
/*     */   public void setEdg13(int edg13) {
/* 141 */     this.edg13 = edg13;
/*     */   }
/*     */   
/*     */   public int getEdg14() {
/* 145 */     return this.edg14;
/*     */   }
/*     */   
/*     */   public void setEdg14(int edg14) {
/* 149 */     this.edg14 = edg14;
/*     */   }
/*     */   
/*     */   public int getEdg15() {
/* 153 */     return this.edg15;
/*     */   }
/*     */   
/*     */   public void setEdg15(int edg15) {
/* 157 */     this.edg15 = edg15;
/*     */   }
/*     */   
/*     */   public int getEdg2() {
/* 161 */     return this.edg2;
/*     */   }
/*     */   
/*     */   public void setEdg2(int edg2) {
/* 165 */     this.edg2 = edg2;
/*     */   }
/*     */   
/*     */   public int getEdg3() {
/* 169 */     return this.edg3;
/*     */   }
/*     */   
/*     */   public void setEdg3(int edg3) {
/* 173 */     this.edg3 = edg3;
/*     */   }
/*     */   
/*     */   public int getEdg4() {
/* 177 */     return this.edg4;
/*     */   }
/*     */   
/*     */   public void setEdg4(int edg4) {
/* 181 */     this.edg4 = edg4;
/*     */   }
/*     */   
/*     */   public int getEdg5() {
/* 185 */     return this.edg5;
/*     */   }
/*     */   
/*     */   public void setEdg5(int edg5) {
/* 189 */     this.edg5 = edg5;
/*     */   }
/*     */   
/*     */   public int getEdg6() {
/* 193 */     return this.edg6;
/*     */   }
/*     */   
/*     */   public void setEdg6(int edg6) {
/* 197 */     this.edg6 = edg6;
/*     */   }
/*     */   
/*     */   public int getEdg7() {
/* 201 */     return this.edg7;
/*     */   }
/*     */   
/*     */   public void setEdg7(int edg7) {
/* 205 */     this.edg7 = edg7;
/*     */   }
/*     */   
/*     */   public int getEdg8() {
/* 209 */     return this.edg8;
/*     */   }
/*     */   
/*     */   public void setEdg8(int edg8) {
/* 213 */     this.edg8 = edg8;
/*     */   }
/*     */   
/*     */   public int getEdg9() {
/* 217 */     return this.edg9;
/*     */   }
/*     */   
/*     */   public void setEdg9(int edg9) {
/* 221 */     this.edg9 = edg9;
/*     */   }
/*     */   
/*     */   public int getEdgAuto() {
/* 225 */     return this.edgAuto;
/*     */   }
/*     */   
/*     */   public void setEdgAuto(int edgAuto) {
/* 229 */     this.edgAuto = edgAuto;
/*     */   }
/*     */   
/*     */   public int getEdgEstatus() {
/* 233 */     return this.edgEstatus;
/*     */   }
/*     */   
/*     */   public void setEdgEstatus(int edgEstatus) {
/* 237 */     this.edgEstatus = edgEstatus;
/*     */   }
/*     */   
/*     */   public String getEdgEvaluado() {
/* 241 */     return this.edgEvaluado;
/*     */   }
/*     */   
/*     */   public void setEdgEvaluado(String edgEvaluado) {
/* 245 */     this.edgEvaluado = edgEvaluado;
/*     */   }
/*     */   
/*     */   public String getEdgEvaluador() {
/* 249 */     return this.edgEvaluador;
/*     */   }
/*     */   
/*     */   public void setEdgEvaluador(String edgEvaluador) {
/* 253 */     this.edgEvaluador = edgEvaluador;
/*     */   }
/*     */   
/*     */   public Date getEdgFecha() {
/* 257 */     return this.edgFecha;
/*     */   }
/*     */   
/*     */   public void setEdgFecha(Date edgFecha) {
/* 261 */     this.edgFecha = edgFecha;
/*     */   }
/*     */   
/*     */   public String getEdgSugerencias() {
/* 265 */     return this.edgSugerencias;
/*     */   }
/*     */   
/*     */   public void setEdgSugerencias(String edgSugerencias) {
/* 269 */     this.edgSugerencias = edgSugerencias;
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


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\EvaluacionDireccionGeneral.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */