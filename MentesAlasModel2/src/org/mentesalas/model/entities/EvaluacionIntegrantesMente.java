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
/*     */ @Table(name="evaluacion_integrantes_mentes")
/*     */ @NamedQuery(name="EvaluacionIntegrantesMente.findAll", query="SELECT e FROM EvaluacionIntegrantesMente e")
/*     */ public class EvaluacionIntegrantesMente
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="EIM_ID")
/*     */   private int eimId;
/*     */   @Column(name="EIM_1")
/*     */   private int eim1;
/*     */   @Column(name="EIM_10")
/*     */   private int eim10;
/*     */   @Column(name="EIM_10P")
/*     */   private int eim10p;
/*     */   @Column(name="EIM_11")
/*     */   private int eim11;
/*     */   @Column(name="EIM_11P")
/*     */   private int eim11p;
/*     */   @Column(name="EIM_12")
/*     */   private int eim12;
/*     */   @Column(name="EIM_12P")
/*     */   private int eim12p;
/*     */   @Column(name="EIM_13")
/*     */   private int eim13;
/*     */   @Column(name="EIM_13P")
/*     */   private int eim13p;
/*     */   @Column(name="EIM_14")
/*     */   private int eim14;
/*     */   @Column(name="EIM_14P")
/*     */   private int eim14p;
/*     */   @Column(name="EIM_15")
/*     */   private int eim15;
/*     */   @Column(name="EIM_15P")
/*     */   private int eim15p;
/*     */   @Column(name="EIM_16")
/*     */   private int eim16;
/*     */   @Column(name="EIM_16P")
/*     */   private int eim16p;
/*     */   @Column(name="EIM_17")
/*     */   private int eim17;
/*     */   @Column(name="EIM_17P")
/*     */   private int eim17p;
/*     */   @Column(name="EIM_18")
/*     */   private int eim18;
/*     */   @Column(name="EIM_18P")
/*     */   private int eim18p;
/*     */   @Column(name="EIM_19")
/*     */   private int eim19;
/*     */   @Column(name="EIM_19P")
/*     */   private int eim19p;
/*     */   @Column(name="EIM_2")
/*     */   private int eim2;
/*     */   @Column(name="EIM_20")
/*     */   private int eim20;
/*     */   @Column(name="EIM_20P")
/*     */   private int eim20p;
/*     */   @Column(name="EIM_21")
/*     */   private int eim21;
/*     */   @Column(name="EIM_21P")
/*     */   private int eim21p;
/*     */   @Column(name="EIM_22")
/*     */   private int eim22;
/*     */   @Column(name="EIM_22P")
/*     */   private int eim22p;
/*     */   @Column(name="EIM_2P")
/*     */   private int eim2p;
/*     */   @Column(name="EIM_3")
/*     */   private int eim3;
/*     */   @Column(name="EIM_3P")
/*     */   private int eim3p;
/*     */   @Column(name="EIM_4")
/*     */   private int eim4;
/*     */   @Column(name="EIM_4P")
/*     */   private int eim4p;
/*     */   @Column(name="EIM_5")
/*     */   private int eim5;
/*     */   @Column(name="EIM_5P")
/*     */   private int eim5p;
/*     */   @Column(name="EIM_6")
/*     */   private int eim6;
/*     */   @Column(name="EIM_6P")
/*     */   private int eim6p;
/*     */   @Column(name="EIM_7")
/*     */   private int eim7;
/*     */   @Column(name="EIM_7P")
/*     */   private int eim7p;
/*     */   @Column(name="EIM_8")
/*     */   private int eim8;
/*     */   @Column(name="EIM_8P")
/*     */   private int eim8p;
/*     */   @Column(name="EIM_9")
/*     */   private int eim9;
/*     */   @Column(name="EIM_9P")
/*     */   private int eim9p;
/*     */   @Column(name="EIM_ALIMENTOS")
/*     */   private int eimAlimentos;
/*     */   @Column(name="EIM_APRECURSOS")
/*     */   private int eimAprecursos;
/*     */   @Column(name="EIM_CMEJORAS")
/*     */   private String eimCmejoras;
/*     */   @Column(name="EIM_COORDI")
/*     */   private int eimCoordi;
/*     */   @Column(name="EIM_CVALIOSAS")
/*     */   private String eimCvaliosas;
/*     */   @Column(name="EIM_ESTATUS")
/*     */   private int eimEstatus;
/*     */   @Column(name="EIM_EVALUADOR")
/*     */   private String eimEvaluador;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="EIM_FECHA")
/*     */   private Date eimFecha;
/*     */   @Column(name="EIM_INSTALACIONES")
/*     */   private int eimInstalaciones;
/*     */   @Column(name="EIM_PERSONAL")
/*     */   private int eimPersonal;
/*     */   @Column(name="EIM_PMEJORAS")
/*     */   private String eimPmejoras;
/*     */   @Column(name="EIM_PVALIOSAS")
/*     */   private String eimPvaliosas;
/*     */   @Column(name="EIM_SUGEINSTA")
/*     */   private String eimSugeinsta;
/*     */   @Column(name="EIM_SUGEPROG")
/*     */   private String eimSugeprog;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="FEC_MOD")
/*     */   private Date fecMod;
/*     */   @Column(name="USU_CVE")
/*     */   private String usuCve;
/*     */   
/*     */   public int getEimId()
/*     */   {
/* 205 */     return this.eimId;
/*     */   }
/*     */   
/*     */   public void setEimId(int eimId) {
/* 209 */     this.eimId = eimId;
/*     */   }
/*     */   
/*     */   public int getEim1() {
/* 213 */     return this.eim1;
/*     */   }
/*     */   
/*     */   public void setEim1(int eim1) {
/* 217 */     this.eim1 = eim1;
/*     */   }
/*     */   
/*     */   public int getEim10() {
/* 221 */     return this.eim10;
/*     */   }
/*     */   
/*     */   public void setEim10(int eim10) {
/* 225 */     this.eim10 = eim10;
/*     */   }
/*     */   
/*     */   public int getEim10p() {
/* 229 */     return this.eim10p;
/*     */   }
/*     */   
/*     */   public void setEim10p(int eim10p) {
/* 233 */     this.eim10p = eim10p;
/*     */   }
/*     */   
/*     */   public int getEim11() {
/* 237 */     return this.eim11;
/*     */   }
/*     */   
/*     */   public void setEim11(int eim11) {
/* 241 */     this.eim11 = eim11;
/*     */   }
/*     */   
/*     */   public int getEim11p() {
/* 245 */     return this.eim11p;
/*     */   }
/*     */   
/*     */   public void setEim11p(int eim11p) {
/* 249 */     this.eim11p = eim11p;
/*     */   }
/*     */   
/*     */   public int getEim12() {
/* 253 */     return this.eim12;
/*     */   }
/*     */   
/*     */   public void setEim12(int eim12) {
/* 257 */     this.eim12 = eim12;
/*     */   }
/*     */   
/*     */   public int getEim12p() {
/* 261 */     return this.eim12p;
/*     */   }
/*     */   
/*     */   public void setEim12p(int eim12p) {
/* 265 */     this.eim12p = eim12p;
/*     */   }
/*     */   
/*     */   public int getEim13() {
/* 269 */     return this.eim13;
/*     */   }
/*     */   
/*     */   public void setEim13(int eim13) {
/* 273 */     this.eim13 = eim13;
/*     */   }
/*     */   
/*     */   public int getEim13p() {
/* 277 */     return this.eim13p;
/*     */   }
/*     */   
/*     */   public void setEim13p(int eim13p) {
/* 281 */     this.eim13p = eim13p;
/*     */   }
/*     */   
/*     */   public int getEim14() {
/* 285 */     return this.eim14;
/*     */   }
/*     */   
/*     */   public void setEim14(int eim14) {
/* 289 */     this.eim14 = eim14;
/*     */   }
/*     */   
/*     */   public int getEim14p() {
/* 293 */     return this.eim14p;
/*     */   }
/*     */   
/*     */   public void setEim14p(int eim14p) {
/* 297 */     this.eim14p = eim14p;
/*     */   }
/*     */   
/*     */   public int getEim15() {
/* 301 */     return this.eim15;
/*     */   }
/*     */   
/*     */   public void setEim15(int eim15) {
/* 305 */     this.eim15 = eim15;
/*     */   }
/*     */   
/*     */   public int getEim15p() {
/* 309 */     return this.eim15p;
/*     */   }
/*     */   
/*     */   public void setEim15p(int eim15p) {
/* 313 */     this.eim15p = eim15p;
/*     */   }
/*     */   
/*     */   public int getEim16() {
/* 317 */     return this.eim16;
/*     */   }
/*     */   
/*     */   public void setEim16(int eim16) {
/* 321 */     this.eim16 = eim16;
/*     */   }
/*     */   
/*     */   public int getEim16p() {
/* 325 */     return this.eim16p;
/*     */   }
/*     */   
/*     */   public void setEim16p(int eim16p) {
/* 329 */     this.eim16p = eim16p;
/*     */   }
/*     */   
/*     */   public int getEim17() {
/* 333 */     return this.eim17;
/*     */   }
/*     */   
/*     */   public void setEim17(int eim17) {
/* 337 */     this.eim17 = eim17;
/*     */   }
/*     */   
/*     */   public int getEim17p() {
/* 341 */     return this.eim17p;
/*     */   }
/*     */   
/*     */   public void setEim17p(int eim17p) {
/* 345 */     this.eim17p = eim17p;
/*     */   }
/*     */   
/*     */   public int getEim18() {
/* 349 */     return this.eim18;
/*     */   }
/*     */   
/*     */   public void setEim18(int eim18) {
/* 353 */     this.eim18 = eim18;
/*     */   }
/*     */   
/*     */   public int getEim18p() {
/* 357 */     return this.eim18p;
/*     */   }
/*     */   
/*     */   public void setEim18p(int eim18p) {
/* 361 */     this.eim18p = eim18p;
/*     */   }
/*     */   
/*     */   public int getEim19() {
/* 365 */     return this.eim19;
/*     */   }
/*     */   
/*     */   public void setEim19(int eim19) {
/* 369 */     this.eim19 = eim19;
/*     */   }
/*     */   
/*     */   public int getEim19p() {
/* 373 */     return this.eim19p;
/*     */   }
/*     */   
/*     */   public void setEim19p(int eim19p) {
/* 377 */     this.eim19p = eim19p;
/*     */   }
/*     */   
/*     */   public int getEim2() {
/* 381 */     return this.eim2;
/*     */   }
/*     */   
/*     */   public void setEim2(int eim2) {
/* 385 */     this.eim2 = eim2;
/*     */   }
/*     */   
/*     */   public int getEim20() {
/* 389 */     return this.eim20;
/*     */   }
/*     */   
/*     */   public void setEim20(int eim20) {
/* 393 */     this.eim20 = eim20;
/*     */   }
/*     */   
/*     */   public int getEim20p() {
/* 397 */     return this.eim20p;
/*     */   }
/*     */   
/*     */   public void setEim20p(int eim20p) {
/* 401 */     this.eim20p = eim20p;
/*     */   }
/*     */   
/*     */   public int getEim21() {
/* 405 */     return this.eim21;
/*     */   }
/*     */   
/*     */   public void setEim21(int eim21) {
/* 409 */     this.eim21 = eim21;
/*     */   }
/*     */   
/*     */   public int getEim21p() {
/* 413 */     return this.eim21p;
/*     */   }
/*     */   
/*     */   public void setEim21p(int eim21p) {
/* 417 */     this.eim21p = eim21p;
/*     */   }
/*     */   
/*     */   public int getEim22() {
/* 421 */     return this.eim22;
/*     */   }
/*     */   
/*     */   public void setEim22(int eim22) {
/* 425 */     this.eim22 = eim22;
/*     */   }
/*     */   
/*     */   public int getEim22p() {
/* 429 */     return this.eim22p;
/*     */   }
/*     */   
/*     */   public void setEim22p(int eim22p) {
/* 433 */     this.eim22p = eim22p;
/*     */   }
/*     */   
/*     */   public int getEim2p() {
/* 437 */     return this.eim2p;
/*     */   }
/*     */   
/*     */   public void setEim2p(int eim2p) {
/* 441 */     this.eim2p = eim2p;
/*     */   }
/*     */   
/*     */   public int getEim3() {
/* 445 */     return this.eim3;
/*     */   }
/*     */   
/*     */   public void setEim3(int eim3) {
/* 449 */     this.eim3 = eim3;
/*     */   }
/*     */   
/*     */   public int getEim3p() {
/* 453 */     return this.eim3p;
/*     */   }
/*     */   
/*     */   public void setEim3p(int eim3p) {
/* 457 */     this.eim3p = eim3p;
/*     */   }
/*     */   
/*     */   public int getEim4() {
/* 461 */     return this.eim4;
/*     */   }
/*     */   
/*     */   public void setEim4(int eim4) {
/* 465 */     this.eim4 = eim4;
/*     */   }
/*     */   
/*     */   public int getEim4p() {
/* 469 */     return this.eim4p;
/*     */   }
/*     */   
/*     */   public void setEim4p(int eim4p) {
/* 473 */     this.eim4p = eim4p;
/*     */   }
/*     */   
/*     */   public int getEim5() {
/* 477 */     return this.eim5;
/*     */   }
/*     */   
/*     */   public void setEim5(int eim5) {
/* 481 */     this.eim5 = eim5;
/*     */   }
/*     */   
/*     */   public int getEim5p() {
/* 485 */     return this.eim5p;
/*     */   }
/*     */   
/*     */   public void setEim5p(int eim5p) {
/* 489 */     this.eim5p = eim5p;
/*     */   }
/*     */   
/*     */   public int getEim6() {
/* 493 */     return this.eim6;
/*     */   }
/*     */   
/*     */   public void setEim6(int eim6) {
/* 497 */     this.eim6 = eim6;
/*     */   }
/*     */   
/*     */   public int getEim6p() {
/* 501 */     return this.eim6p;
/*     */   }
/*     */   
/*     */   public void setEim6p(int eim6p) {
/* 505 */     this.eim6p = eim6p;
/*     */   }
/*     */   
/*     */   public int getEim7() {
/* 509 */     return this.eim7;
/*     */   }
/*     */   
/*     */   public void setEim7(int eim7) {
/* 513 */     this.eim7 = eim7;
/*     */   }
/*     */   
/*     */   public int getEim7p() {
/* 517 */     return this.eim7p;
/*     */   }
/*     */   
/*     */   public void setEim7p(int eim7p) {
/* 521 */     this.eim7p = eim7p;
/*     */   }
/*     */   
/*     */   public int getEim8() {
/* 525 */     return this.eim8;
/*     */   }
/*     */   
/*     */   public void setEim8(int eim8) {
/* 529 */     this.eim8 = eim8;
/*     */   }
/*     */   
/*     */   public int getEim8p() {
/* 533 */     return this.eim8p;
/*     */   }
/*     */   
/*     */   public void setEim8p(int eim8p) {
/* 537 */     this.eim8p = eim8p;
/*     */   }
/*     */   
/*     */   public int getEim9() {
/* 541 */     return this.eim9;
/*     */   }
/*     */   
/*     */   public void setEim9(int eim9) {
/* 545 */     this.eim9 = eim9;
/*     */   }
/*     */   
/*     */   public int getEim9p() {
/* 549 */     return this.eim9p;
/*     */   }
/*     */   
/*     */   public void setEim9p(int eim9p) {
/* 553 */     this.eim9p = eim9p;
/*     */   }
/*     */   
/*     */   public int getEimAlimentos() {
/* 557 */     return this.eimAlimentos;
/*     */   }
/*     */   
/*     */   public void setEimAlimentos(int eimAlimentos) {
/* 561 */     this.eimAlimentos = eimAlimentos;
/*     */   }
/*     */   
/*     */   public int getEimAprecursos() {
/* 565 */     return this.eimAprecursos;
/*     */   }
/*     */   
/*     */   public void setEimAprecursos(int eimAprecursos) {
/* 569 */     this.eimAprecursos = eimAprecursos;
/*     */   }
/*     */   
/*     */   public String getEimCmejoras() {
/* 573 */     return this.eimCmejoras;
/*     */   }
/*     */   
/*     */   public void setEimCmejoras(String eimCmejoras) {
/* 577 */     this.eimCmejoras = eimCmejoras;
/*     */   }
/*     */   
/*     */   public int getEimCoordi() {
/* 581 */     return this.eimCoordi;
/*     */   }
/*     */   
/*     */   public void setEimCoordi(int eimCoordi) {
/* 585 */     this.eimCoordi = eimCoordi;
/*     */   }
/*     */   
/*     */   public String getEimCvaliosas() {
/* 589 */     return this.eimCvaliosas;
/*     */   }
/*     */   
/*     */   public void setEimCvaliosas(String eimCvaliosas) {
/* 593 */     this.eimCvaliosas = eimCvaliosas;
/*     */   }
/*     */   
/*     */   public int getEimEstatus() {
/* 597 */     return this.eimEstatus;
/*     */   }
/*     */   
/*     */   public void setEimEstatus(int eimEstatus) {
/* 601 */     this.eimEstatus = eimEstatus;
/*     */   }
/*     */   
/*     */   public String getEimEvaluador() {
/* 605 */     return this.eimEvaluador;
/*     */   }
/*     */   
/*     */   public void setEimEvaluador(String eimEvaluador) {
/* 609 */     this.eimEvaluador = eimEvaluador;
/*     */   }
/*     */   
/*     */   public Date getEimFecha() {
/* 613 */     return this.eimFecha;
/*     */   }
/*     */   
/*     */   public void setEimFecha(Date eimFecha) {
/* 617 */     this.eimFecha = eimFecha;
/*     */   }
/*     */   
/*     */   public int getEimInstalaciones() {
/* 621 */     return this.eimInstalaciones;
/*     */   }
/*     */   
/*     */   public void setEimInstalaciones(int eimInstalaciones) {
/* 625 */     this.eimInstalaciones = eimInstalaciones;
/*     */   }
/*     */   
/*     */   public int getEimPersonal() {
/* 629 */     return this.eimPersonal;
/*     */   }
/*     */   
/*     */   public void setEimPersonal(int eimPersonal) {
/* 633 */     this.eimPersonal = eimPersonal;
/*     */   }
/*     */   
/*     */   public String getEimPmejoras() {
/* 637 */     return this.eimPmejoras;
/*     */   }
/*     */   
/*     */   public void setEimPmejoras(String eimPmejoras) {
/* 641 */     this.eimPmejoras = eimPmejoras;
/*     */   }
/*     */   
/*     */   public String getEimPvaliosas() {
/* 645 */     return this.eimPvaliosas;
/*     */   }
/*     */   
/*     */   public void setEimPvaliosas(String eimPvaliosas) {
/* 649 */     this.eimPvaliosas = eimPvaliosas;
/*     */   }
/*     */   
/*     */   public String getEimSugeinsta() {
/* 653 */     return this.eimSugeinsta;
/*     */   }
/*     */   
/*     */   public void setEimSugeinsta(String eimSugeinsta) {
/* 657 */     this.eimSugeinsta = eimSugeinsta;
/*     */   }
/*     */   
/*     */   public String getEimSugeprog() {
/* 661 */     return this.eimSugeprog;
/*     */   }
/*     */   
/*     */   public void setEimSugeprog(String eimSugeprog) {
/* 665 */     this.eimSugeprog = eimSugeprog;
/*     */   }
/*     */   
/*     */   public Date getFecMod() {
/* 669 */     return this.fecMod;
/*     */   }
/*     */   
/*     */   public void setFecMod(Date fecMod) {
/* 673 */     this.fecMod = fecMod;
/*     */   }
/*     */   
/*     */   public String getUsuCve() {
/* 677 */     return this.usuCve;
/*     */   }
/*     */   
/*     */   public void setUsuCve(String usuCve) {
/* 681 */     this.usuCve = usuCve;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\EvaluacionIntegrantesMente.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */