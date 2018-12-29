/*      */ package org.mentesalas.model.entities;
/*      */ 
/*      */ import java.io.Serializable;
/*      */ import java.util.Date;
/*      */ import javax.persistence.Column;
/*      */ import javax.persistence.Entity;
/*      */ import javax.persistence.Id;
/*      */ import javax.persistence.NamedQuery;
/*      */ import javax.persistence.Table;
/*      */ import javax.persistence.Temporal;
/*      */ import javax.persistence.TemporalType;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Entity
/*      */ @Table(name="evaluacion_familias_mentes")
/*      */ @NamedQuery(name="EvaluacionFamiliasMente.findAll", query="SELECT e FROM EvaluacionFamiliasMente e")
/*      */ public class EvaluacionFamiliasMente
/*      */   implements Serializable
/*      */ {
/*      */   private static final long serialVersionUID = 1L;
/*      */   @Id
/*      */   @Column(name="EFM_ID")
/*      */   private int efmId;
/*      */   @Column(name="EFM_1")
/*      */   private int efm1;
/*      */   @Column(name="EFM_10")
/*      */   private int efm10;
/*      */   @Column(name="EFM_10P")
/*      */   private int efm10p;
/*      */   @Column(name="EFM_11")
/*      */   private int efm11;
/*      */   @Column(name="EFM_11P")
/*      */   private int efm11p;
/*      */   @Column(name="EFM_12")
/*      */   private int efm12;
/*      */   @Column(name="EFM_12P")
/*      */   private int efm12p;
/*      */   @Column(name="EFM_13")
/*      */   private int efm13;
/*      */   @Column(name="EFM_13P")
/*      */   private int efm13p;
/*      */   @Column(name="EFM_14")
/*      */   private int efm14;
/*      */   @Column(name="EFM_14P")
/*      */   private int efm14p;
/*      */   @Column(name="EFM_15")
/*      */   private int efm15;
/*      */   @Column(name="EFM_15P")
/*      */   private int efm15p;
/*      */   @Column(name="EFM_16")
/*      */   private int efm16;
/*      */   @Column(name="EFM_16P")
/*      */   private int efm16p;
/*      */   @Column(name="EFM_17")
/*      */   private int efm17;
/*      */   @Column(name="EFM_17P")
/*      */   private int efm17p;
/*      */   @Column(name="EFM_18")
/*      */   private int efm18;
/*      */   @Column(name="EFM_18P")
/*      */   private int efm18p;
/*      */   @Column(name="EFM_19")
/*      */   private int efm19;
/*      */   @Column(name="EFM_19P")
/*      */   private int efm19p;
/*      */   @Column(name="EFM_2")
/*      */   private int efm2;
/*      */   @Column(name="EFM_20")
/*      */   private int efm20;
/*      */   @Column(name="EFM_20P")
/*      */   private int efm20p;
/*      */   @Column(name="EFM_21")
/*      */   private int efm21;
/*      */   @Column(name="EFM_21P")
/*      */   private int efm21p;
/*      */   @Column(name="EFM_22")
/*      */   private int efm22;
/*      */   @Column(name="EFM_22P")
/*      */   private int efm22p;
/*      */   @Column(name="EFM_23")
/*      */   private int efm23;
/*      */   @Column(name="EFM_23P")
/*      */   private int efm23p;
/*      */   @Column(name="EFM_24")
/*      */   private int efm24;
/*      */   @Column(name="EFM_24P")
/*      */   private int efm24p;
/*      */   @Column(name="EFM_25")
/*      */   private int efm25;
/*      */   @Column(name="EFM_25P")
/*      */   private int efm25p;
/*      */   @Column(name="EFM_26")
/*      */   private int efm26;
/*      */   @Column(name="EFM_27")
/*      */   private int efm27;
/*      */   @Column(name="EFM_28")
/*      */   private int efm28;
/*      */   @Column(name="EFM_29")
/*      */   private int efm29;
/*      */   @Column(name="EFM_2P")
/*      */   private int efm2p;
/*      */   @Column(name="EFM_3")
/*      */   private int efm3;
/*      */   @Column(name="EFM_30")
/*      */   private int efm30;
/*      */   @Column(name="EFM_31")
/*      */   private int efm31;
/*      */   @Column(name="EFM_32")
/*      */   private int efm32;
/*      */   @Column(name="EFM_33")
/*      */   private int efm33;
/*      */   @Column(name="EFM_33C")
/*      */   private int efm33c;
/*      */   @Column(name="EFM_34")
/*      */   private int efm34;
/*      */   @Column(name="EFM_34C")
/*      */   private int efm34c;
/*      */   @Column(name="EFM_35")
/*      */   private int efm35;
/*      */   @Column(name="EFM_35C")
/*      */   private int efm35c;
/*      */   @Column(name="EFM_36")
/*      */   private int efm36;
/*      */   @Column(name="EFM_36C")
/*      */   private int efm36c;
/*      */   @Column(name="EFM_37")
/*      */   private int efm37;
/*      */   @Column(name="EFM_37C")
/*      */   private int efm37c;
/*      */   @Column(name="EFM_38")
/*      */   private int efm38;
/*      */   @Column(name="EFM_39")
/*      */   private int efm39;
/*      */   @Column(name="EFM_3P")
/*      */   private int efm3p;
/*      */   @Column(name="EFM_4")
/*      */   private int efm4;
/*      */   @Column(name="EFM_40")
/*      */   private int efm40;
/*      */   @Column(name="EFM_41")
/*      */   private int efm41;
/*      */   @Column(name="EFM_42")
/*      */   private int efm42;
/*      */   @Column(name="EFM_43")
/*      */   private int efm43;
/*      */   @Column(name="EFM_44")
/*      */   private int efm44;
/*      */   @Column(name="EFM_45")
/*      */   private int efm45;
/*      */   @Column(name="EFM_46")
/*      */   private int efm46;
/*      */   @Column(name="EFM_47")
/*      */   private int efm47;
/*      */   @Column(name="EFM_48")
/*      */   private int efm48;
/*      */   @Column(name="EFM_49")
/*      */   private int efm49;
/*      */   @Column(name="EFM_4P")
/*      */   private int efm4p;
/*      */   @Column(name="EFM_5")
/*      */   private int efm5;
/*      */   @Column(name="EFM_50")
/*      */   private int efm50;
/*      */   @Column(name="EFM_5P")
/*      */   private int efm5p;
/*      */   @Column(name="EFM_6")
/*      */   private int efm6;
/*      */   @Column(name="EFM_6P")
/*      */   private int efm6p;
/*      */   @Column(name="EFM_7")
/*      */   private int efm7;
/*      */   @Column(name="EFM_7P")
/*      */   private int efm7p;
/*      */   @Column(name="EFM_8")
/*      */   private int efm8;
/*      */   @Column(name="EFM_8P")
/*      */   private int efm8p;
/*      */   @Column(name="EFM_9")
/*      */   private int efm9;
/*      */   @Column(name="EFM_9P")
/*      */   private int efm9p;
/*      */   @Column(name="EFM_COMENCOHA")
/*      */   private String efmComencoha;
/*      */   @Column(name="EFM_COMENCOOR")
/*      */   private String efmComencoor;
/*      */   @Column(name="EFM_COMENEXP")
/*      */   private String efmComenexp;
/*      */   @Column(name="EFM_COMENFISA")
/*      */   private String efmComenfisa;
/*      */   @Column(name="EFM_COMENINPRO")
/*      */   private String efmComeninpro;
/*      */   @Column(name="EFM_COMENINST")
/*      */   private String efmComeninst;
/*      */   @Column(name="EFM_COMENPERS")
/*      */   private String efmComenpers;
/*      */   @Column(name="EFM_COMENPRAC")
/*      */   private String efmComenprac;
/*      */   @Column(name="EFM_COMENREC")
/*      */   private String efmComenrec;
/*      */   @Column(name="EFM_COMENSOAF")
/*      */   private String efmComensoaf;
/*      */   @Column(name="EFM_COMENTALL")
/*      */   private String efmComentall;
/*      */   @Column(name="EFM_ESTATUS")
/*      */   private int efmEstatus;
/*      */   @Column(name="EFM_EVALUADOR")
/*      */   private String efmEvaluador;
/*      */   @Temporal(TemporalType.DATE)
/*      */   @Column(name="EFM_FECHA")
/*      */   private Date efmFecha;
/*      */   @Column(name="EFM_SUGECOM")
/*      */   private String efmSugecom;
/*      */   @Temporal(TemporalType.DATE)
/*      */   @Column(name="FEC_MOD")
/*      */   private Date fecMod;
/*      */   @Column(name="USU_CVE")
/*      */   private String usuCve;
/*      */   
/*      */   public int getEfmId()
/*      */   {
/*  316 */     return this.efmId;
/*      */   }
/*      */   
/*      */   public void setEfmId(int efmId) {
/*  320 */     this.efmId = efmId;
/*      */   }
/*      */   
/*      */   public int getEfm1() {
/*  324 */     return this.efm1;
/*      */   }
/*      */   
/*      */   public void setEfm1(int efm1) {
/*  328 */     this.efm1 = efm1;
/*      */   }
/*      */   
/*      */   public int getEfm10() {
/*  332 */     return this.efm10;
/*      */   }
/*      */   
/*      */   public void setEfm10(int efm10) {
/*  336 */     this.efm10 = efm10;
/*      */   }
/*      */   
/*      */   public int getEfm10p() {
/*  340 */     return this.efm10p;
/*      */   }
/*      */   
/*      */   public void setEfm10p(int efm10p) {
/*  344 */     this.efm10p = efm10p;
/*      */   }
/*      */   
/*      */   public int getEfm11() {
/*  348 */     return this.efm11;
/*      */   }
/*      */   
/*      */   public void setEfm11(int efm11) {
/*  352 */     this.efm11 = efm11;
/*      */   }
/*      */   
/*      */   public int getEfm11p() {
/*  356 */     return this.efm11p;
/*      */   }
/*      */   
/*      */   public void setEfm11p(int efm11p) {
/*  360 */     this.efm11p = efm11p;
/*      */   }
/*      */   
/*      */   public int getEfm12() {
/*  364 */     return this.efm12;
/*      */   }
/*      */   
/*      */   public void setEfm12(int efm12) {
/*  368 */     this.efm12 = efm12;
/*      */   }
/*      */   
/*      */   public int getEfm12p() {
/*  372 */     return this.efm12p;
/*      */   }
/*      */   
/*      */   public void setEfm12p(int efm12p) {
/*  376 */     this.efm12p = efm12p;
/*      */   }
/*      */   
/*      */   public int getEfm13() {
/*  380 */     return this.efm13;
/*      */   }
/*      */   
/*      */   public void setEfm13(int efm13) {
/*  384 */     this.efm13 = efm13;
/*      */   }
/*      */   
/*      */   public int getEfm13p() {
/*  388 */     return this.efm13p;
/*      */   }
/*      */   
/*      */   public void setEfm13p(int efm13p) {
/*  392 */     this.efm13p = efm13p;
/*      */   }
/*      */   
/*      */   public int getEfm14() {
/*  396 */     return this.efm14;
/*      */   }
/*      */   
/*      */   public void setEfm14(int efm14) {
/*  400 */     this.efm14 = efm14;
/*      */   }
/*      */   
/*      */   public int getEfm14p() {
/*  404 */     return this.efm14p;
/*      */   }
/*      */   
/*      */   public void setEfm14p(int efm14p) {
/*  408 */     this.efm14p = efm14p;
/*      */   }
/*      */   
/*      */   public int getEfm15() {
/*  412 */     return this.efm15;
/*      */   }
/*      */   
/*      */   public void setEfm15(int efm15) {
/*  416 */     this.efm15 = efm15;
/*      */   }
/*      */   
/*      */   public int getEfm15p() {
/*  420 */     return this.efm15p;
/*      */   }
/*      */   
/*      */   public void setEfm15p(int efm15p) {
/*  424 */     this.efm15p = efm15p;
/*      */   }
/*      */   
/*      */   public int getEfm16() {
/*  428 */     return this.efm16;
/*      */   }
/*      */   
/*      */   public void setEfm16(int efm16) {
/*  432 */     this.efm16 = efm16;
/*      */   }
/*      */   
/*      */   public int getEfm16p() {
/*  436 */     return this.efm16p;
/*      */   }
/*      */   
/*      */   public void setEfm16p(int efm16p) {
/*  440 */     this.efm16p = efm16p;
/*      */   }
/*      */   
/*      */   public int getEfm17() {
/*  444 */     return this.efm17;
/*      */   }
/*      */   
/*      */   public void setEfm17(int efm17) {
/*  448 */     this.efm17 = efm17;
/*      */   }
/*      */   
/*      */   public int getEfm17p() {
/*  452 */     return this.efm17p;
/*      */   }
/*      */   
/*      */   public void setEfm17p(int efm17p) {
/*  456 */     this.efm17p = efm17p;
/*      */   }
/*      */   
/*      */   public int getEfm18() {
/*  460 */     return this.efm18;
/*      */   }
/*      */   
/*      */   public void setEfm18(int efm18) {
/*  464 */     this.efm18 = efm18;
/*      */   }
/*      */   
/*      */   public int getEfm18p() {
/*  468 */     return this.efm18p;
/*      */   }
/*      */   
/*      */   public void setEfm18p(int efm18p) {
/*  472 */     this.efm18p = efm18p;
/*      */   }
/*      */   
/*      */   public int getEfm19() {
/*  476 */     return this.efm19;
/*      */   }
/*      */   
/*      */   public void setEfm19(int efm19) {
/*  480 */     this.efm19 = efm19;
/*      */   }
/*      */   
/*      */   public int getEfm19p() {
/*  484 */     return this.efm19p;
/*      */   }
/*      */   
/*      */   public void setEfm19p(int efm19p) {
/*  488 */     this.efm19p = efm19p;
/*      */   }
/*      */   
/*      */   public int getEfm2() {
/*  492 */     return this.efm2;
/*      */   }
/*      */   
/*      */   public void setEfm2(int efm2) {
/*  496 */     this.efm2 = efm2;
/*      */   }
/*      */   
/*      */   public int getEfm20() {
/*  500 */     return this.efm20;
/*      */   }
/*      */   
/*      */   public void setEfm20(int efm20) {
/*  504 */     this.efm20 = efm20;
/*      */   }
/*      */   
/*      */   public int getEfm20p() {
/*  508 */     return this.efm20p;
/*      */   }
/*      */   
/*      */   public void setEfm20p(int efm20p) {
/*  512 */     this.efm20p = efm20p;
/*      */   }
/*      */   
/*      */   public int getEfm21() {
/*  516 */     return this.efm21;
/*      */   }
/*      */   
/*      */   public void setEfm21(int efm21) {
/*  520 */     this.efm21 = efm21;
/*      */   }
/*      */   
/*      */   public int getEfm21p() {
/*  524 */     return this.efm21p;
/*      */   }
/*      */   
/*      */   public void setEfm21p(int efm21p) {
/*  528 */     this.efm21p = efm21p;
/*      */   }
/*      */   
/*      */   public int getEfm22() {
/*  532 */     return this.efm22;
/*      */   }
/*      */   
/*      */   public void setEfm22(int efm22) {
/*  536 */     this.efm22 = efm22;
/*      */   }
/*      */   
/*      */   public int getEfm22p() {
/*  540 */     return this.efm22p;
/*      */   }
/*      */   
/*      */   public void setEfm22p(int efm22p) {
/*  544 */     this.efm22p = efm22p;
/*      */   }
/*      */   
/*      */   public int getEfm23() {
/*  548 */     return this.efm23;
/*      */   }
/*      */   
/*      */   public void setEfm23(int efm23) {
/*  552 */     this.efm23 = efm23;
/*      */   }
/*      */   
/*      */   public int getEfm23p() {
/*  556 */     return this.efm23p;
/*      */   }
/*      */   
/*      */   public void setEfm23p(int efm23p) {
/*  560 */     this.efm23p = efm23p;
/*      */   }
/*      */   
/*      */   public int getEfm24() {
/*  564 */     return this.efm24;
/*      */   }
/*      */   
/*      */   public void setEfm24(int efm24) {
/*  568 */     this.efm24 = efm24;
/*      */   }
/*      */   
/*      */   public int getEfm24p() {
/*  572 */     return this.efm24p;
/*      */   }
/*      */   
/*      */   public void setEfm24p(int efm24p) {
/*  576 */     this.efm24p = efm24p;
/*      */   }
/*      */   
/*      */   public int getEfm25() {
/*  580 */     return this.efm25;
/*      */   }
/*      */   
/*      */   public void setEfm25(int efm25) {
/*  584 */     this.efm25 = efm25;
/*      */   }
/*      */   
/*      */   public int getEfm25p() {
/*  588 */     return this.efm25p;
/*      */   }
/*      */   
/*      */   public void setEfm25p(int efm25p) {
/*  592 */     this.efm25p = efm25p;
/*      */   }
/*      */   
/*      */   public int getEfm26() {
/*  596 */     return this.efm26;
/*      */   }
/*      */   
/*      */   public void setEfm26(int efm26) {
/*  600 */     this.efm26 = efm26;
/*      */   }
/*      */   
/*      */   public int getEfm27() {
/*  604 */     return this.efm27;
/*      */   }
/*      */   
/*      */   public void setEfm27(int efm27) {
/*  608 */     this.efm27 = efm27;
/*      */   }
/*      */   
/*      */   public int getEfm28() {
/*  612 */     return this.efm28;
/*      */   }
/*      */   
/*      */   public void setEfm28(int efm28) {
/*  616 */     this.efm28 = efm28;
/*      */   }
/*      */   
/*      */   public int getEfm29() {
/*  620 */     return this.efm29;
/*      */   }
/*      */   
/*      */   public void setEfm29(int efm29) {
/*  624 */     this.efm29 = efm29;
/*      */   }
/*      */   
/*      */   public int getEfm2p() {
/*  628 */     return this.efm2p;
/*      */   }
/*      */   
/*      */   public void setEfm2p(int efm2p) {
/*  632 */     this.efm2p = efm2p;
/*      */   }
/*      */   
/*      */   public int getEfm3() {
/*  636 */     return this.efm3;
/*      */   }
/*      */   
/*      */   public void setEfm3(int efm3) {
/*  640 */     this.efm3 = efm3;
/*      */   }
/*      */   
/*      */   public int getEfm30() {
/*  644 */     return this.efm30;
/*      */   }
/*      */   
/*      */   public void setEfm30(int efm30) {
/*  648 */     this.efm30 = efm30;
/*      */   }
/*      */   
/*      */   public int getEfm31() {
/*  652 */     return this.efm31;
/*      */   }
/*      */   
/*      */   public void setEfm31(int efm31) {
/*  656 */     this.efm31 = efm31;
/*      */   }
/*      */   
/*      */   public int getEfm32() {
/*  660 */     return this.efm32;
/*      */   }
/*      */   
/*      */   public void setEfm32(int efm32) {
/*  664 */     this.efm32 = efm32;
/*      */   }
/*      */   
/*      */   public int getEfm33() {
/*  668 */     return this.efm33;
/*      */   }
/*      */   
/*      */   public void setEfm33(int efm33) {
/*  672 */     this.efm33 = efm33;
/*      */   }
/*      */   
/*      */   public int getEfm33c() {
/*  676 */     return this.efm33c;
/*      */   }
/*      */   
/*      */   public void setEfm33c(int efm33c) {
/*  680 */     this.efm33c = efm33c;
/*      */   }
/*      */   
/*      */   public int getEfm34() {
/*  684 */     return this.efm34;
/*      */   }
/*      */   
/*      */   public void setEfm34(int efm34) {
/*  688 */     this.efm34 = efm34;
/*      */   }
/*      */   
/*      */   public int getEfm34c() {
/*  692 */     return this.efm34c;
/*      */   }
/*      */   
/*      */   public void setEfm34c(int efm34c) {
/*  696 */     this.efm34c = efm34c;
/*      */   }
/*      */   
/*      */   public int getEfm35() {
/*  700 */     return this.efm35;
/*      */   }
/*      */   
/*      */   public void setEfm35(int efm35) {
/*  704 */     this.efm35 = efm35;
/*      */   }
/*      */   
/*      */   public int getEfm35c() {
/*  708 */     return this.efm35c;
/*      */   }
/*      */   
/*      */   public void setEfm35c(int efm35c) {
/*  712 */     this.efm35c = efm35c;
/*      */   }
/*      */   
/*      */   public int getEfm36() {
/*  716 */     return this.efm36;
/*      */   }
/*      */   
/*      */   public void setEfm36(int efm36) {
/*  720 */     this.efm36 = efm36;
/*      */   }
/*      */   
/*      */   public int getEfm36c() {
/*  724 */     return this.efm36c;
/*      */   }
/*      */   
/*      */   public void setEfm36c(int efm36c) {
/*  728 */     this.efm36c = efm36c;
/*      */   }
/*      */   
/*      */   public int getEfm37() {
/*  732 */     return this.efm37;
/*      */   }
/*      */   
/*      */   public void setEfm37(int efm37) {
/*  736 */     this.efm37 = efm37;
/*      */   }
/*      */   
/*      */   public int getEfm37c() {
/*  740 */     return this.efm37c;
/*      */   }
/*      */   
/*      */   public void setEfm37c(int efm37c) {
/*  744 */     this.efm37c = efm37c;
/*      */   }
/*      */   
/*      */   public int getEfm38() {
/*  748 */     return this.efm38;
/*      */   }
/*      */   
/*      */   public void setEfm38(int efm38) {
/*  752 */     this.efm38 = efm38;
/*      */   }
/*      */   
/*      */   public int getEfm39() {
/*  756 */     return this.efm39;
/*      */   }
/*      */   
/*      */   public void setEfm39(int efm39) {
/*  760 */     this.efm39 = efm39;
/*      */   }
/*      */   
/*      */   public int getEfm3p() {
/*  764 */     return this.efm3p;
/*      */   }
/*      */   
/*      */   public void setEfm3p(int efm3p) {
/*  768 */     this.efm3p = efm3p;
/*      */   }
/*      */   
/*      */   public int getEfm4() {
/*  772 */     return this.efm4;
/*      */   }
/*      */   
/*      */   public void setEfm4(int efm4) {
/*  776 */     this.efm4 = efm4;
/*      */   }
/*      */   
/*      */   public int getEfm40() {
/*  780 */     return this.efm40;
/*      */   }
/*      */   
/*      */   public void setEfm40(int efm40) {
/*  784 */     this.efm40 = efm40;
/*      */   }
/*      */   
/*      */   public int getEfm41() {
/*  788 */     return this.efm41;
/*      */   }
/*      */   
/*      */   public void setEfm41(int efm41) {
/*  792 */     this.efm41 = efm41;
/*      */   }
/*      */   
/*      */   public int getEfm42() {
/*  796 */     return this.efm42;
/*      */   }
/*      */   
/*      */   public void setEfm42(int efm42) {
/*  800 */     this.efm42 = efm42;
/*      */   }
/*      */   
/*      */   public int getEfm43() {
/*  804 */     return this.efm43;
/*      */   }
/*      */   
/*      */   public void setEfm43(int efm43) {
/*  808 */     this.efm43 = efm43;
/*      */   }
/*      */   
/*      */   public int getEfm44() {
/*  812 */     return this.efm44;
/*      */   }
/*      */   
/*      */   public void setEfm44(int efm44) {
/*  816 */     this.efm44 = efm44;
/*      */   }
/*      */   
/*      */   public int getEfm45() {
/*  820 */     return this.efm45;
/*      */   }
/*      */   
/*      */   public void setEfm45(int efm45) {
/*  824 */     this.efm45 = efm45;
/*      */   }
/*      */   
/*      */   public int getEfm46() {
/*  828 */     return this.efm46;
/*      */   }
/*      */   
/*      */   public void setEfm46(int efm46) {
/*  832 */     this.efm46 = efm46;
/*      */   }
/*      */   
/*      */   public int getEfm47() {
/*  836 */     return this.efm47;
/*      */   }
/*      */   
/*      */   public void setEfm47(int efm47) {
/*  840 */     this.efm47 = efm47;
/*      */   }
/*      */   
/*      */   public int getEfm48() {
/*  844 */     return this.efm48;
/*      */   }
/*      */   
/*      */   public void setEfm48(int efm48) {
/*  848 */     this.efm48 = efm48;
/*      */   }
/*      */   
/*      */   public int getEfm49() {
/*  852 */     return this.efm49;
/*      */   }
/*      */   
/*      */   public void setEfm49(int efm49) {
/*  856 */     this.efm49 = efm49;
/*      */   }
/*      */   
/*      */   public int getEfm4p() {
/*  860 */     return this.efm4p;
/*      */   }
/*      */   
/*      */   public void setEfm4p(int efm4p) {
/*  864 */     this.efm4p = efm4p;
/*      */   }
/*      */   
/*      */   public int getEfm5() {
/*  868 */     return this.efm5;
/*      */   }
/*      */   
/*      */   public void setEfm5(int efm5) {
/*  872 */     this.efm5 = efm5;
/*      */   }
/*      */   
/*      */   public int getEfm50() {
/*  876 */     return this.efm50;
/*      */   }
/*      */   
/*      */   public void setEfm50(int efm50) {
/*  880 */     this.efm50 = efm50;
/*      */   }
/*      */   
/*      */   public int getEfm5p() {
/*  884 */     return this.efm5p;
/*      */   }
/*      */   
/*      */   public void setEfm5p(int efm5p) {
/*  888 */     this.efm5p = efm5p;
/*      */   }
/*      */   
/*      */   public int getEfm6() {
/*  892 */     return this.efm6;
/*      */   }
/*      */   
/*      */   public void setEfm6(int efm6) {
/*  896 */     this.efm6 = efm6;
/*      */   }
/*      */   
/*      */   public int getEfm6p() {
/*  900 */     return this.efm6p;
/*      */   }
/*      */   
/*      */   public void setEfm6p(int efm6p) {
/*  904 */     this.efm6p = efm6p;
/*      */   }
/*      */   
/*      */   public int getEfm7() {
/*  908 */     return this.efm7;
/*      */   }
/*      */   
/*      */   public void setEfm7(int efm7) {
/*  912 */     this.efm7 = efm7;
/*      */   }
/*      */   
/*      */   public int getEfm7p() {
/*  916 */     return this.efm7p;
/*      */   }
/*      */   
/*      */   public void setEfm7p(int efm7p) {
/*  920 */     this.efm7p = efm7p;
/*      */   }
/*      */   
/*      */   public int getEfm8() {
/*  924 */     return this.efm8;
/*      */   }
/*      */   
/*      */   public void setEfm8(int efm8) {
/*  928 */     this.efm8 = efm8;
/*      */   }
/*      */   
/*      */   public int getEfm8p() {
/*  932 */     return this.efm8p;
/*      */   }
/*      */   
/*      */   public void setEfm8p(int efm8p) {
/*  936 */     this.efm8p = efm8p;
/*      */   }
/*      */   
/*      */   public int getEfm9() {
/*  940 */     return this.efm9;
/*      */   }
/*      */   
/*      */   public void setEfm9(int efm9) {
/*  944 */     this.efm9 = efm9;
/*      */   }
/*      */   
/*      */   public int getEfm9p() {
/*  948 */     return this.efm9p;
/*      */   }
/*      */   
/*      */   public void setEfm9p(int efm9p) {
/*  952 */     this.efm9p = efm9p;
/*      */   }
/*      */   
/*      */   public String getEfmComencoha() {
/*  956 */     return this.efmComencoha;
/*      */   }
/*      */   
/*      */   public void setEfmComencoha(String efmComencoha) {
/*  960 */     this.efmComencoha = efmComencoha;
/*      */   }
/*      */   
/*      */   public String getEfmComencoor() {
/*  964 */     return this.efmComencoor;
/*      */   }
/*      */   
/*      */   public void setEfmComencoor(String efmComencoor) {
/*  968 */     this.efmComencoor = efmComencoor;
/*      */   }
/*      */   
/*      */   public String getEfmComenexp() {
/*  972 */     return this.efmComenexp;
/*      */   }
/*      */   
/*      */   public void setEfmComenexp(String efmComenexp) {
/*  976 */     this.efmComenexp = efmComenexp;
/*      */   }
/*      */   
/*      */   public String getEfmComenfisa() {
/*  980 */     return this.efmComenfisa;
/*      */   }
/*      */   
/*      */   public void setEfmComenfisa(String efmComenfisa) {
/*  984 */     this.efmComenfisa = efmComenfisa;
/*      */   }
/*      */   
/*      */   public String getEfmComeninpro() {
/*  988 */     return this.efmComeninpro;
/*      */   }
/*      */   
/*      */   public void setEfmComeninpro(String efmComeninpro) {
/*  992 */     this.efmComeninpro = efmComeninpro;
/*      */   }
/*      */   
/*      */   public String getEfmComeninst() {
/*  996 */     return this.efmComeninst;
/*      */   }
/*      */   
/*      */   public void setEfmComeninst(String efmComeninst) {
/* 1000 */     this.efmComeninst = efmComeninst;
/*      */   }
/*      */   
/*      */   public String getEfmComenpers() {
/* 1004 */     return this.efmComenpers;
/*      */   }
/*      */   
/*      */   public void setEfmComenpers(String efmComenpers) {
/* 1008 */     this.efmComenpers = efmComenpers;
/*      */   }
/*      */   
/*      */   public String getEfmComenprac() {
/* 1012 */     return this.efmComenprac;
/*      */   }
/*      */   
/*      */   public void setEfmComenprac(String efmComenprac) {
/* 1016 */     this.efmComenprac = efmComenprac;
/*      */   }
/*      */   
/*      */   public String getEfmComenrec() {
/* 1020 */     return this.efmComenrec;
/*      */   }
/*      */   
/*      */   public void setEfmComenrec(String efmComenrec) {
/* 1024 */     this.efmComenrec = efmComenrec;
/*      */   }
/*      */   
/*      */   public String getEfmComensoaf() {
/* 1028 */     return this.efmComensoaf;
/*      */   }
/*      */   
/*      */   public void setEfmComensoaf(String efmComensoaf) {
/* 1032 */     this.efmComensoaf = efmComensoaf;
/*      */   }
/*      */   
/*      */   public String getEfmComentall() {
/* 1036 */     return this.efmComentall;
/*      */   }
/*      */   
/*      */   public void setEfmComentall(String efmComentall) {
/* 1040 */     this.efmComentall = efmComentall;
/*      */   }
/*      */   
/*      */   public int getEfmEstatus() {
/* 1044 */     return this.efmEstatus;
/*      */   }
/*      */   
/*      */   public void setEfmEstatus(int efmEstatus) {
/* 1048 */     this.efmEstatus = efmEstatus;
/*      */   }
/*      */   
/*      */   public String getEfmEvaluador() {
/* 1052 */     return this.efmEvaluador;
/*      */   }
/*      */   
/*      */   public void setEfmEvaluador(String efmEvaluador) {
/* 1056 */     this.efmEvaluador = efmEvaluador;
/*      */   }
/*      */   
/*      */   public Date getEfmFecha() {
/* 1060 */     return this.efmFecha;
/*      */   }
/*      */   
/*      */   public void setEfmFecha(Date efmFecha) {
/* 1064 */     this.efmFecha = efmFecha;
/*      */   }
/*      */   
/*      */   public String getEfmSugecom() {
/* 1068 */     return this.efmSugecom;
/*      */   }
/*      */   
/*      */   public void setEfmSugecom(String efmSugecom) {
/* 1072 */     this.efmSugecom = efmSugecom;
/*      */   }
/*      */   
/*      */   public Date getFecMod() {
/* 1076 */     return this.fecMod;
/*      */   }
/*      */   
/*      */   public void setFecMod(Date fecMod) {
/* 1080 */     this.fecMod = fecMod;
/*      */   }
/*      */   
/*      */   public String getUsuCve() {
/* 1084 */     return this.usuCve;
/*      */   }
/*      */   
/*      */   public void setUsuCve(String usuCve) {
/* 1088 */     this.usuCve = usuCve;
/*      */   }
/*      */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\EvaluacionFamiliasMente.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */