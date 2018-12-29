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
/*     */ @Table(name="proyecto_recaudacion")
/*     */ @NamedQuery(name="ProyectoRecaudacion.findAll", query="SELECT p FROM ProyectoRecaudacion p")
/*     */ public class ProyectoRecaudacion
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="PRE_ID")
/*     */   private int preId;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="FEC_MOD")
/*     */   private Date fecMod;
/*     */   @Column(name="PRE_BANCO")
/*     */   private String preBanco;
/*     */   @Column(name="PRE_COINV")
/*     */   private int preCoinv;
/*     */   @Column(name="PRE_COINV_CUAN")
/*     */   private int preCoinvCuan;
/*     */   @Column(name="PRE_CONT_FUEN")
/*     */   private String preContFuen;
/*     */   @Column(name="PRE_CONTAC_BAN")
/*     */   private String preContacBan;
/*     */   @Column(name="PRE_CORR_BAN")
/*     */   private String preCorrBan;
/*     */   @Column(name="PRE_CORR_FUEN")
/*     */   private String preCorrFuen;
/*     */   @Column(name="PRE_CUEN_EXC")
/*     */   private int preCuenExc;
/*     */   @Column(name="PRE_ESTATUS")
/*     */   private int preEstatus;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="PRE_FECH_FIN")
/*     */   private Date preFechFin;
/*     */   @Column(name="PRE_FUEN_FINA")
/*     */   private int preFuenFina;
/*     */   @Column(name="PRE_FUEN_NOM")
/*     */   private String preFuenNom;
/*     */   @Column(name="PRE_MET")
/*     */   private String preMet;
/*     */   @Column(name="PRE_MON_RECI")
/*     */   private double preMonReci;
/*     */   @Column(name="PRE_MON_SOL")
/*     */   private double preMonSol;
/*     */   @Column(name="PRE_MOTIVOS")
/*     */   private String preMotivos;
/*     */   @Column(name="PRE_NO_CUEN")
/*     */   private String preNoCuen;
/*     */   @Column(name="PRE_NOM_COMP_CONT")
/*     */   private String preNomCompCont;
/*     */   @Column(name="PRE_NOM_PROY")
/*     */   private String preNomProy;
/*     */   @Column(name="PRE_OBJ")
/*     */   private String preObj;
/*     */   @Column(name="PRE_OTRA_CUANTO")
/*     */   private int preOtraCuanto;
/*     */   @Column(name="PRE_OTRA_FUEN")
/*     */   private int preOtraFuen;
/*     */   @Column(name="PRE_OTRA_QUIEN")
/*     */   private String preOtraQuien;
/*     */   @Column(name="PRE_PAG_WEB")
/*     */   private String prePagWeb;
/*     */   @Column(name="PRE_RESUL")
/*     */   private String preResul;
/*     */   @Column(name="PRE_STATUS")
/*     */   private int preStatus;
/*     */   @Column(name="PRE_SUCURSAL")
/*     */   private String preSucursal;
/*     */   @Column(name="PRE_TEL_BAN")
/*     */   private String preTelBan;
/*     */   @Column(name="PRE_TEL_FUEN")
/*     */   private String preTelFuen;
/*     */   @Column(name="PRE_TIP_REC")
/*     */   private int preTipRec;
/*     */   @Column(name="PRE_TIPO_CUEN")
/*     */   private String preTipoCuen;
/*     */   @Column(name="USU_CVE")
/*     */   private String usuCve;
/*     */   
/*     */   public int getPreId()
/*     */   {
/* 127 */     return this.preId;
/*     */   }
/*     */   
/*     */   public void setPreId(int preId) {
/* 131 */     this.preId = preId;
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
/*     */   public String getPreBanco() {
/* 143 */     return this.preBanco;
/*     */   }
/*     */   
/*     */   public void setPreBanco(String preBanco) {
/* 147 */     this.preBanco = preBanco;
/*     */   }
/*     */   
/*     */   public int getPreCoinv() {
/* 151 */     return this.preCoinv;
/*     */   }
/*     */   
/*     */   public void setPreCoinv(int preCoinv) {
/* 155 */     this.preCoinv = preCoinv;
/*     */   }
/*     */   
/*     */   public int getPreCoinvCuan() {
/* 159 */     return this.preCoinvCuan;
/*     */   }
/*     */   
/*     */   public void setPreCoinvCuan(int preCoinvCuan) {
/* 163 */     this.preCoinvCuan = preCoinvCuan;
/*     */   }
/*     */   
/*     */   public String getPreContFuen() {
/* 167 */     return this.preContFuen;
/*     */   }
/*     */   
/*     */   public void setPreContFuen(String preContFuen) {
/* 171 */     this.preContFuen = preContFuen;
/*     */   }
/*     */   
/*     */   public String getPreContacBan() {
/* 175 */     return this.preContacBan;
/*     */   }
/*     */   
/*     */   public void setPreContacBan(String preContacBan) {
/* 179 */     this.preContacBan = preContacBan;
/*     */   }
/*     */   
/*     */   public String getPreCorrBan() {
/* 183 */     return this.preCorrBan;
/*     */   }
/*     */   
/*     */   public void setPreCorrBan(String preCorrBan) {
/* 187 */     this.preCorrBan = preCorrBan;
/*     */   }
/*     */   
/*     */   public String getPreCorrFuen() {
/* 191 */     return this.preCorrFuen;
/*     */   }
/*     */   
/*     */   public void setPreCorrFuen(String preCorrFuen) {
/* 195 */     this.preCorrFuen = preCorrFuen;
/*     */   }
/*     */   
/*     */   public int getPreCuenExc() {
/* 199 */     return this.preCuenExc;
/*     */   }
/*     */   
/*     */   public void setPreCuenExc(int preCuenExc) {
/* 203 */     this.preCuenExc = preCuenExc;
/*     */   }
/*     */   
/*     */   public int getPreEstatus() {
/* 207 */     return this.preEstatus;
/*     */   }
/*     */   
/*     */   public void setPreEstatus(int preEstatus) {
/* 211 */     this.preEstatus = preEstatus;
/*     */   }
/*     */   
/*     */   public Date getPreFechFin() {
/* 215 */     return this.preFechFin;
/*     */   }
/*     */   
/*     */   public void setPreFechFin(Date preFechFin) {
/* 219 */     this.preFechFin = preFechFin;
/*     */   }
/*     */   
/*     */   public int getPreFuenFina() {
/* 223 */     return this.preFuenFina;
/*     */   }
/*     */   
/*     */   public void setPreFuenFina(int preFuenFina) {
/* 227 */     this.preFuenFina = preFuenFina;
/*     */   }
/*     */   
/*     */   public String getPreFuenNom() {
/* 231 */     return this.preFuenNom;
/*     */   }
/*     */   
/*     */   public void setPreFuenNom(String preFuenNom) {
/* 235 */     this.preFuenNom = preFuenNom;
/*     */   }
/*     */   
/*     */   public String getPreMet() {
/* 239 */     return this.preMet;
/*     */   }
/*     */   
/*     */   public void setPreMet(String preMet) {
/* 243 */     this.preMet = preMet;
/*     */   }
/*     */   
/*     */   public double getPreMonReci() {
/* 247 */     return this.preMonReci;
/*     */   }
/*     */   
/*     */   public void setPreMonReci(double preMonReci) {
/* 251 */     this.preMonReci = preMonReci;
/*     */   }
/*     */   
/*     */   public double getPreMonSol() {
/* 255 */     return this.preMonSol;
/*     */   }
/*     */   
/*     */   public void setPreMonSol(double preMonSol) {
/* 259 */     this.preMonSol = preMonSol;
/*     */   }
/*     */   
/*     */   public String getPreMotivos() {
/* 263 */     return this.preMotivos;
/*     */   }
/*     */   
/*     */   public void setPreMotivos(String preMotivos) {
/* 267 */     this.preMotivos = preMotivos;
/*     */   }
/*     */   
/*     */   public String getPreNoCuen() {
/* 271 */     return this.preNoCuen;
/*     */   }
/*     */   
/*     */   public void setPreNoCuen(String preNoCuen) {
/* 275 */     this.preNoCuen = preNoCuen;
/*     */   }
/*     */   
/*     */   public String getPreNomCompCont() {
/* 279 */     return this.preNomCompCont;
/*     */   }
/*     */   
/*     */   public void setPreNomCompCont(String preNomCompCont) {
/* 283 */     this.preNomCompCont = preNomCompCont;
/*     */   }
/*     */   
/*     */   public String getPreNomProy() {
/* 287 */     return this.preNomProy;
/*     */   }
/*     */   
/*     */   public void setPreNomProy(String preNomProy) {
/* 291 */     this.preNomProy = preNomProy;
/*     */   }
/*     */   
/*     */   public String getPreObj() {
/* 295 */     return this.preObj;
/*     */   }
/*     */   
/*     */   public void setPreObj(String preObj) {
/* 299 */     this.preObj = preObj;
/*     */   }
/*     */   
/*     */   public int getPreOtraCuanto() {
/* 303 */     return this.preOtraCuanto;
/*     */   }
/*     */   
/*     */   public void setPreOtraCuanto(int preOtraCuanto) {
/* 307 */     this.preOtraCuanto = preOtraCuanto;
/*     */   }
/*     */   
/*     */   public int getPreOtraFuen() {
/* 311 */     return this.preOtraFuen;
/*     */   }
/*     */   
/*     */   public void setPreOtraFuen(int preOtraFuen) {
/* 315 */     this.preOtraFuen = preOtraFuen;
/*     */   }
/*     */   
/*     */   public String getPreOtraQuien() {
/* 319 */     return this.preOtraQuien;
/*     */   }
/*     */   
/*     */   public void setPreOtraQuien(String preOtraQuien) {
/* 323 */     this.preOtraQuien = preOtraQuien;
/*     */   }
/*     */   
/*     */   public String getPrePagWeb() {
/* 327 */     return this.prePagWeb;
/*     */   }
/*     */   
/*     */   public void setPrePagWeb(String prePagWeb) {
/* 331 */     this.prePagWeb = prePagWeb;
/*     */   }
/*     */   
/*     */   public String getPreResul() {
/* 335 */     return this.preResul;
/*     */   }
/*     */   
/*     */   public void setPreResul(String preResul) {
/* 339 */     this.preResul = preResul;
/*     */   }
/*     */   
/*     */   public int getPreStatus() {
/* 343 */     return this.preStatus;
/*     */   }
/*     */   
/*     */   public void setPreStatus(int preStatus) {
/* 347 */     this.preStatus = preStatus;
/*     */   }
/*     */   
/*     */   public String getPreSucursal() {
/* 351 */     return this.preSucursal;
/*     */   }
/*     */   
/*     */   public void setPreSucursal(String preSucursal) {
/* 355 */     this.preSucursal = preSucursal;
/*     */   }
/*     */   
/*     */   public String getPreTelBan() {
/* 359 */     return this.preTelBan;
/*     */   }
/*     */   
/*     */   public void setPreTelBan(String preTelBan) {
/* 363 */     this.preTelBan = preTelBan;
/*     */   }
/*     */   
/*     */   public String getPreTelFuen() {
/* 367 */     return this.preTelFuen;
/*     */   }
/*     */   
/*     */   public void setPreTelFuen(String preTelFuen) {
/* 371 */     this.preTelFuen = preTelFuen;
/*     */   }
/*     */   
/*     */   public int getPreTipRec() {
/* 375 */     return this.preTipRec;
/*     */   }
/*     */   
/*     */   public void setPreTipRec(int preTipRec) {
/* 379 */     this.preTipRec = preTipRec;
/*     */   }
/*     */   
/*     */   public String getPreTipoCuen() {
/* 383 */     return this.preTipoCuen;
/*     */   }
/*     */   
/*     */   public void setPreTipoCuen(String preTipoCuen) {
/* 387 */     this.preTipoCuen = preTipoCuen;
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


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\ProyectoRecaudacion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */