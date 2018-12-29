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
/*     */ @Table(name="evaluacion_coordinaciones")
/*     */ @NamedQuery(name="EvaluacionCoordinacione.findAll", query="SELECT e FROM EvaluacionCoordinacione e")
/*     */ public class EvaluacionCoordinacione
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="COO_ID")
/*     */   private int cooId;
/*     */   @Column(name="COO_1")
/*     */   private int coo1;
/*     */   @Column(name="COO_10")
/*     */   private int coo10;
/*     */   @Column(name="COO_11")
/*     */   private int coo11;
/*     */   @Column(name="COO_12")
/*     */   private int coo12;
/*     */   @Column(name="COO_13")
/*     */   private int coo13;
/*     */   @Column(name="COO_14")
/*     */   private int coo14;
/*     */   @Column(name="COO_15")
/*     */   private int coo15;
/*     */   @Column(name="COO_16")
/*     */   private int coo16;
/*     */   @Column(name="COO_17")
/*     */   private int coo17;
/*     */   @Column(name="COO_18")
/*     */   private int coo18;
/*     */   @Column(name="COO_19")
/*     */   private int coo19;
/*     */   @Column(name="COO_2")
/*     */   private int coo2;
/*     */   @Column(name="COO_20")
/*     */   private int coo20;
/*     */   @Column(name="COO_21")
/*     */   private int coo21;
/*     */   @Column(name="COO_22")
/*     */   private int coo22;
/*     */   @Column(name="COO_23")
/*     */   private int coo23;
/*     */   @Column(name="COO_24")
/*     */   private int coo24;
/*     */   @Column(name="COO_25")
/*     */   private int coo25;
/*     */   @Column(name="COO_26")
/*     */   private int coo26;
/*     */   @Column(name="COO_3")
/*     */   private int coo3;
/*     */   @Column(name="COO_4")
/*     */   private int coo4;
/*     */   @Column(name="COO_5")
/*     */   private int coo5;
/*     */   @Column(name="COO_6")
/*     */   private int coo6;
/*     */   @Column(name="COO_7")
/*     */   private int coo7;
/*     */   @Column(name="COO_8")
/*     */   private int coo8;
/*     */   @Column(name="COO_9")
/*     */   private int coo9;
/*     */   @Column(name="COO_AUTO")
/*     */   private int cooAuto;
/*     */   @Column(name="COO_ESTATUS")
/*     */   private int cooEstatus;
/*     */   @Column(name="COO_EVALUADO")
/*     */   private String cooEvaluado;
/*     */   @Column(name="COO_EVALUADOR")
/*     */   private String cooEvaluador;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="COO_FECHA")
/*     */   private Date cooFecha;
/*     */   @Column(name="COO_SUGERENCIAS")
/*     */   private String cooSugerencias;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="FEC_MOD")
/*     */   private Date fecMod;
/*     */   @Column(name="USU_CVE")
/*     */   private String usuCve;
/*     */   
/*     */   public int getCooId()
/*     */   {
/* 130 */     return this.cooId;
/*     */   }
/*     */   
/*     */   public void setCooId(int cooId) {
/* 134 */     this.cooId = cooId;
/*     */   }
/*     */   
/*     */   public int getCoo1() {
/* 138 */     return this.coo1;
/*     */   }
/*     */   
/*     */   public void setCoo1(int coo1) {
/* 142 */     this.coo1 = coo1;
/*     */   }
/*     */   
/*     */   public int getCoo10() {
/* 146 */     return this.coo10;
/*     */   }
/*     */   
/*     */   public void setCoo10(int coo10) {
/* 150 */     this.coo10 = coo10;
/*     */   }
/*     */   
/*     */   public int getCoo11() {
/* 154 */     return this.coo11;
/*     */   }
/*     */   
/*     */   public void setCoo11(int coo11) {
/* 158 */     this.coo11 = coo11;
/*     */   }
/*     */   
/*     */   public int getCoo12() {
/* 162 */     return this.coo12;
/*     */   }
/*     */   
/*     */   public void setCoo12(int coo12) {
/* 166 */     this.coo12 = coo12;
/*     */   }
/*     */   
/*     */   public int getCoo13() {
/* 170 */     return this.coo13;
/*     */   }
/*     */   
/*     */   public void setCoo13(int coo13) {
/* 174 */     this.coo13 = coo13;
/*     */   }
/*     */   
/*     */   public int getCoo14() {
/* 178 */     return this.coo14;
/*     */   }
/*     */   
/*     */   public void setCoo14(int coo14) {
/* 182 */     this.coo14 = coo14;
/*     */   }
/*     */   
/*     */   public int getCoo15() {
/* 186 */     return this.coo15;
/*     */   }
/*     */   
/*     */   public void setCoo15(int coo15) {
/* 190 */     this.coo15 = coo15;
/*     */   }
/*     */   
/*     */   public int getCoo16() {
/* 194 */     return this.coo16;
/*     */   }
/*     */   
/*     */   public void setCoo16(int coo16) {
/* 198 */     this.coo16 = coo16;
/*     */   }
/*     */   
/*     */   public int getCoo17() {
/* 202 */     return this.coo17;
/*     */   }
/*     */   
/*     */   public void setCoo17(int coo17) {
/* 206 */     this.coo17 = coo17;
/*     */   }
/*     */   
/*     */   public int getCoo18() {
/* 210 */     return this.coo18;
/*     */   }
/*     */   
/*     */   public void setCoo18(int coo18) {
/* 214 */     this.coo18 = coo18;
/*     */   }
/*     */   
/*     */   public int getCoo19() {
/* 218 */     return this.coo19;
/*     */   }
/*     */   
/*     */   public void setCoo19(int coo19) {
/* 222 */     this.coo19 = coo19;
/*     */   }
/*     */   
/*     */   public int getCoo2() {
/* 226 */     return this.coo2;
/*     */   }
/*     */   
/*     */   public void setCoo2(int coo2) {
/* 230 */     this.coo2 = coo2;
/*     */   }
/*     */   
/*     */   public int getCoo20() {
/* 234 */     return this.coo20;
/*     */   }
/*     */   
/*     */   public void setCoo20(int coo20) {
/* 238 */     this.coo20 = coo20;
/*     */   }
/*     */   
/*     */   public int getCoo21() {
/* 242 */     return this.coo21;
/*     */   }
/*     */   
/*     */   public void setCoo21(int coo21) {
/* 246 */     this.coo21 = coo21;
/*     */   }
/*     */   
/*     */   public int getCoo22() {
/* 250 */     return this.coo22;
/*     */   }
/*     */   
/*     */   public void setCoo22(int coo22) {
/* 254 */     this.coo22 = coo22;
/*     */   }
/*     */   
/*     */   public int getCoo23() {
/* 258 */     return this.coo23;
/*     */   }
/*     */   
/*     */   public void setCoo23(int coo23) {
/* 262 */     this.coo23 = coo23;
/*     */   }
/*     */   
/*     */   public int getCoo24() {
/* 266 */     return this.coo24;
/*     */   }
/*     */   
/*     */   public void setCoo24(int coo24) {
/* 270 */     this.coo24 = coo24;
/*     */   }
/*     */   
/*     */   public int getCoo25() {
/* 274 */     return this.coo25;
/*     */   }
/*     */   
/*     */   public void setCoo25(int coo25) {
/* 278 */     this.coo25 = coo25;
/*     */   }
/*     */   
/*     */   public int getCoo26() {
/* 282 */     return this.coo26;
/*     */   }
/*     */   
/*     */   public void setCoo26(int coo26) {
/* 286 */     this.coo26 = coo26;
/*     */   }
/*     */   
/*     */   public int getCoo3() {
/* 290 */     return this.coo3;
/*     */   }
/*     */   
/*     */   public void setCoo3(int coo3) {
/* 294 */     this.coo3 = coo3;
/*     */   }
/*     */   
/*     */   public int getCoo4() {
/* 298 */     return this.coo4;
/*     */   }
/*     */   
/*     */   public void setCoo4(int coo4) {
/* 302 */     this.coo4 = coo4;
/*     */   }
/*     */   
/*     */   public int getCoo5() {
/* 306 */     return this.coo5;
/*     */   }
/*     */   
/*     */   public void setCoo5(int coo5) {
/* 310 */     this.coo5 = coo5;
/*     */   }
/*     */   
/*     */   public int getCoo6() {
/* 314 */     return this.coo6;
/*     */   }
/*     */   
/*     */   public void setCoo6(int coo6) {
/* 318 */     this.coo6 = coo6;
/*     */   }
/*     */   
/*     */   public int getCoo7() {
/* 322 */     return this.coo7;
/*     */   }
/*     */   
/*     */   public void setCoo7(int coo7) {
/* 326 */     this.coo7 = coo7;
/*     */   }
/*     */   
/*     */   public int getCoo8() {
/* 330 */     return this.coo8;
/*     */   }
/*     */   
/*     */   public void setCoo8(int coo8) {
/* 334 */     this.coo8 = coo8;
/*     */   }
/*     */   
/*     */   public int getCoo9() {
/* 338 */     return this.coo9;
/*     */   }
/*     */   
/*     */   public void setCoo9(int coo9) {
/* 342 */     this.coo9 = coo9;
/*     */   }
/*     */   
/*     */   public int getCooAuto() {
/* 346 */     return this.cooAuto;
/*     */   }
/*     */   
/*     */   public void setCooAuto(int cooAuto) {
/* 350 */     this.cooAuto = cooAuto;
/*     */   }
/*     */   
/*     */   public int getCooEstatus() {
/* 354 */     return this.cooEstatus;
/*     */   }
/*     */   
/*     */   public void setCooEstatus(int cooEstatus) {
/* 358 */     this.cooEstatus = cooEstatus;
/*     */   }
/*     */   
/*     */   public String getCooEvaluado() {
/* 362 */     return this.cooEvaluado;
/*     */   }
/*     */   
/*     */   public void setCooEvaluado(String cooEvaluado) {
/* 366 */     this.cooEvaluado = cooEvaluado;
/*     */   }
/*     */   
/*     */   public String getCooEvaluador() {
/* 370 */     return this.cooEvaluador;
/*     */   }
/*     */   
/*     */   public void setCooEvaluador(String cooEvaluador) {
/* 374 */     this.cooEvaluador = cooEvaluador;
/*     */   }
/*     */   
/*     */   public Date getCooFecha() {
/* 378 */     return this.cooFecha;
/*     */   }
/*     */   
/*     */   public void setCooFecha(Date cooFecha) {
/* 382 */     this.cooFecha = cooFecha;
/*     */   }
/*     */   
/*     */   public String getCooSugerencias() {
/* 386 */     return this.cooSugerencias;
/*     */   }
/*     */   
/*     */   public void setCooSugerencias(String cooSugerencias) {
/* 390 */     this.cooSugerencias = cooSugerencias;
/*     */   }
/*     */   
/*     */   public Date getFecMod() {
/* 394 */     return this.fecMod;
/*     */   }
/*     */   
/*     */   public void setFecMod(Date fecMod) {
/* 398 */     this.fecMod = fecMod;
/*     */   }
/*     */   
/*     */   public String getUsuCve() {
/* 402 */     return this.usuCve;
/*     */   }
/*     */   
/*     */   public void setUsuCve(String usuCve) {
/* 406 */     this.usuCve = usuCve;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\EvaluacionCoordinacione.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */