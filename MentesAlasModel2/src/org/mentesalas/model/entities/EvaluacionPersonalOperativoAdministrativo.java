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
/*     */ @Entity
/*     */ @Table(name="evaluacion_personal_operativo_administrativo")
/*     */ @NamedQuery(name="EvaluacionPersonalOperativoAdministrativo.findAll", query="SELECT e FROM EvaluacionPersonalOperativoAdministrativo e")
/*     */ public class EvaluacionPersonalOperativoAdministrativo
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="POA_ID")
/*     */   private int poaId;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="FEC_MOD")
/*     */   private Date fecMod;
/*     */   @Column(name="POA_1")
/*     */   private int poa1;
/*     */   @Column(name="POA_10")
/*     */   private int poa10;
/*     */   @Column(name="POA_11")
/*     */   private int poa11;
/*     */   @Column(name="POA_12")
/*     */   private int poa12;
/*     */   @Column(name="POA_13")
/*     */   private int poa13;
/*     */   @Column(name="POA_14")
/*     */   private int poa14;
/*     */   @Column(name="POA_15")
/*     */   private int poa15;
/*     */   @Column(name="POA_16")
/*     */   private int poa16;
/*     */   @Column(name="POA_17")
/*     */   private int poa17;
/*     */   @Column(name="POA_18")
/*     */   private int poa18;
/*     */   @Column(name="POA_19")
/*     */   private int poa19;
/*     */   @Column(name="POA_2")
/*     */   private int poa2;
/*     */   @Column(name="POA_20")
/*     */   private int poa20;
/*     */   @Column(name="POA_21")
/*     */   private int poa21;
/*     */   @Column(name="POA_22")
/*     */   private int poa22;
/*     */   @Column(name="POA_23")
/*     */   private int poa23;
/*     */   @Column(name="POA_24")
/*     */   private int poa24;
/*     */   @Column(name="POA_25")
/*     */   private int poa25;
/*     */   @Column(name="POA_3")
/*     */   private int poa3;
/*     */   @Column(name="POA_4")
/*     */   private int poa4;
/*     */   @Column(name="POA_5")
/*     */   private int poa5;
/*     */   @Column(name="POA_6")
/*     */   private int poa6;
/*     */   @Column(name="POA_7")
/*     */   private int poa7;
/*     */   @Column(name="POA_8")
/*     */   private int poa8;
/*     */   @Column(name="POA_9")
/*     */   private int poa9;
/*     */   @Column(name="POA_AUTO")
/*     */   private int poaAuto;
/*     */   @Column(name="POA_ESTATUS")
/*     */   private int poaEstatus;
/*     */   @Column(name="POA_EVALUADO")
/*     */   private String poaEvaluado;
/*     */   @Column(name="POA_EVALUADOR")
/*     */   private String poaEvaluador;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="POA_FECHA")
/*     */   private Date poaFecha;
/*     */   @Column(name="POA_SUGERENCIAS")
/*     */   private String poaSugerencias;
/*     */   @Column(name="USU_CVE")
/*     */   private String usuCve;
/*     */   
/*     */   public int getPoaId()
/*     */   {
/* 127 */     return this.poaId;
/*     */   }
/*     */   
/*     */   public void setPoaId(int poaId) {
/* 131 */     this.poaId = poaId;
/*     */   }
/*     */   
/*     */   public Date getFecMod() {
/* 135 */     return this.fecMod;
/*     */   }
/*     */   
/*     */   public void setFecMod(Date fecMod) {
/* 139 */     this.fecMod = fecMod;
/*     */   }
/*     */   
/*     */   public int getPoa1() {
/* 143 */     return this.poa1;
/*     */   }
/*     */   
/*     */   public void setPoa1(int poa1) {
/* 147 */     this.poa1 = poa1;
/*     */   }
/*     */   
/*     */   public int getPoa10() {
/* 151 */     return this.poa10;
/*     */   }
/*     */   
/*     */   public void setPoa10(int poa10) {
/* 155 */     this.poa10 = poa10;
/*     */   }
/*     */   
/*     */   public int getPoa11() {
/* 159 */     return this.poa11;
/*     */   }
/*     */   
/*     */   public void setPoa11(int poa11) {
/* 163 */     this.poa11 = poa11;
/*     */   }
/*     */   
/*     */   public int getPoa12() {
/* 167 */     return this.poa12;
/*     */   }
/*     */   
/*     */   public void setPoa12(int poa12) {
/* 171 */     this.poa12 = poa12;
/*     */   }
/*     */   
/*     */   public int getPoa13() {
/* 175 */     return this.poa13;
/*     */   }
/*     */   
/*     */   public void setPoa13(int poa13) {
/* 179 */     this.poa13 = poa13;
/*     */   }
/*     */   
/*     */   public int getPoa14() {
/* 183 */     return this.poa14;
/*     */   }
/*     */   
/*     */   public void setPoa14(int poa14) {
/* 187 */     this.poa14 = poa14;
/*     */   }
/*     */   
/*     */   public int getPoa15() {
/* 191 */     return this.poa15;
/*     */   }
/*     */   
/*     */   public void setPoa15(int poa15) {
/* 195 */     this.poa15 = poa15;
/*     */   }
/*     */   
/*     */   public int getPoa16() {
/* 199 */     return this.poa16;
/*     */   }
/*     */   
/*     */   public void setPoa16(int poa16) {
/* 203 */     this.poa16 = poa16;
/*     */   }
/*     */   
/*     */   public int getPoa17() {
/* 207 */     return this.poa17;
/*     */   }
/*     */   
/*     */   public void setPoa17(int poa17) {
/* 211 */     this.poa17 = poa17;
/*     */   }
/*     */   
/*     */   public int getPoa18() {
/* 215 */     return this.poa18;
/*     */   }
/*     */   
/*     */   public void setPoa18(int poa18) {
/* 219 */     this.poa18 = poa18;
/*     */   }
/*     */   
/*     */   public int getPoa19() {
/* 223 */     return this.poa19;
/*     */   }
/*     */   
/*     */   public void setPoa19(int poa19) {
/* 227 */     this.poa19 = poa19;
/*     */   }
/*     */   
/*     */   public int getPoa2() {
/* 231 */     return this.poa2;
/*     */   }
/*     */   
/*     */   public void setPoa2(int poa2) {
/* 235 */     this.poa2 = poa2;
/*     */   }
/*     */   
/*     */   public int getPoa20() {
/* 239 */     return this.poa20;
/*     */   }
/*     */   
/*     */   public void setPoa20(int poa20) {
/* 243 */     this.poa20 = poa20;
/*     */   }
/*     */   
/*     */   public int getPoa21() {
/* 247 */     return this.poa21;
/*     */   }
/*     */   
/*     */   public void setPoa21(int poa21) {
/* 251 */     this.poa21 = poa21;
/*     */   }
/*     */   
/*     */   public int getPoa22() {
/* 255 */     return this.poa22;
/*     */   }
/*     */   
/*     */   public void setPoa22(int poa22) {
/* 259 */     this.poa22 = poa22;
/*     */   }
/*     */   
/*     */   public int getPoa23() {
/* 263 */     return this.poa23;
/*     */   }
/*     */   
/*     */   public void setPoa23(int poa23) {
/* 267 */     this.poa23 = poa23;
/*     */   }
/*     */   
/*     */   public int getPoa24() {
/* 271 */     return this.poa24;
/*     */   }
/*     */   
/*     */   public void setPoa24(int poa24) {
/* 275 */     this.poa24 = poa24;
/*     */   }
/*     */   
/*     */   public int getPoa25() {
/* 279 */     return this.poa25;
/*     */   }
/*     */   
/*     */   public void setPoa25(int poa25) {
/* 283 */     this.poa25 = poa25;
/*     */   }
/*     */   
/*     */   public int getPoa3() {
/* 287 */     return this.poa3;
/*     */   }
/*     */   
/*     */   public void setPoa3(int poa3) {
/* 291 */     this.poa3 = poa3;
/*     */   }
/*     */   
/*     */   public int getPoa4() {
/* 295 */     return this.poa4;
/*     */   }
/*     */   
/*     */   public void setPoa4(int poa4) {
/* 299 */     this.poa4 = poa4;
/*     */   }
/*     */   
/*     */   public int getPoa5() {
/* 303 */     return this.poa5;
/*     */   }
/*     */   
/*     */   public void setPoa5(int poa5) {
/* 307 */     this.poa5 = poa5;
/*     */   }
/*     */   
/*     */   public int getPoa6() {
/* 311 */     return this.poa6;
/*     */   }
/*     */   
/*     */   public void setPoa6(int poa6) {
/* 315 */     this.poa6 = poa6;
/*     */   }
/*     */   
/*     */   public int getPoa7() {
/* 319 */     return this.poa7;
/*     */   }
/*     */   
/*     */   public void setPoa7(int poa7) {
/* 323 */     this.poa7 = poa7;
/*     */   }
/*     */   
/*     */   public int getPoa8() {
/* 327 */     return this.poa8;
/*     */   }
/*     */   
/*     */   public void setPoa8(int poa8) {
/* 331 */     this.poa8 = poa8;
/*     */   }
/*     */   
/*     */   public int getPoa9() {
/* 335 */     return this.poa9;
/*     */   }
/*     */   
/*     */   public void setPoa9(int poa9) {
/* 339 */     this.poa9 = poa9;
/*     */   }
/*     */   
/*     */   public int getPoaAuto() {
/* 343 */     return this.poaAuto;
/*     */   }
/*     */   
/*     */   public void setPoaAuto(int poaAuto) {
/* 347 */     this.poaAuto = poaAuto;
/*     */   }
/*     */   
/*     */   public int getPoaEstatus() {
/* 351 */     return this.poaEstatus;
/*     */   }
/*     */   
/*     */   public void setPoaEstatus(int poaEstatus) {
/* 355 */     this.poaEstatus = poaEstatus;
/*     */   }
/*     */   
/*     */   public String getPoaEvaluado() {
/* 359 */     return this.poaEvaluado;
/*     */   }
/*     */   
/*     */   public void setPoaEvaluado(String poaEvaluado) {
/* 363 */     this.poaEvaluado = poaEvaluado;
/*     */   }
/*     */   
/*     */   public String getPoaEvaluador() {
/* 367 */     return this.poaEvaluador;
/*     */   }
/*     */   
/*     */   public void setPoaEvaluador(String poaEvaluador) {
/* 371 */     this.poaEvaluador = poaEvaluador;
/*     */   }
/*     */   
/*     */   public Date getPoaFecha() {
/* 375 */     return this.poaFecha;
/*     */   }
/*     */   
/*     */   public void setPoaFecha(Date poaFecha) {
/* 379 */     this.poaFecha = poaFecha;
/*     */   }
/*     */   
/*     */   public String getPoaSugerencias() {
/* 383 */     return this.poaSugerencias;
/*     */   }
/*     */   
/*     */   public void setPoaSugerencias(String poaSugerencias) {
/* 387 */     this.poaSugerencias = poaSugerencias;
/*     */   }
/*     */   
/*     */   public String getUsuCve() {
/* 391 */     return this.usuCve;
/*     */   }
/*     */   
/*     */   public void setUsuCve(String usuCve) {
/* 395 */     this.usuCve = usuCve;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\EvaluacionPersonalOperativoAdministrativo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */