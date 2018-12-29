/*     */ package org.mentesalas.model.entities;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.JoinColumn;
/*     */ import javax.persistence.ManyToOne;
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
/*     */ @Entity
/*     */ @NamedQuery(name="Entrevista.findAll", query="SELECT e FROM Entrevista e")
/*     */ public class Entrevista
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="ENT_ID")
/*     */   private int entId;
/*     */   @Column(name="ENT_CAPACIDADES")
/*     */   private String entCapacidades;
/*     */   @Column(name="ENT_CENT_ACU")
/*     */   private String entCentAcu;
/*     */   @Column(name="ENT_ESTATUS")
/*     */   private int entEstatus;
/*     */   @Temporal(TemporalType.TIMESTAMP)
/*     */   @Column(name="ENT_FECHA")
/*     */   private Date entFecha;
/*     */   @Column(name="ENT_IMP_GEN")
/*     */   private String entImpGen;
/*     */   @Column(name="ENT_NO_CUBRE")
/*     */   private String entNoCubre;
/*     */   @Column(name="ENT_PAD_PROB")
/*     */   private String entPadProb;
/*     */   @Column(name="ENT_SI_CUBRE")
/*     */   private String entSiCubre;
/*     */   @Column(name="ENT_SOLO_ACOM")
/*     */   private int entSoloAcom;
/*     */   @Temporal(TemporalType.TIMESTAMP)
/*     */   @Column(name="FEC_MOD")
/*     */   private Date fecMod;
/*     */   @Column(name="USU_CVE")
/*     */   private String usuCve;
/*     */   @ManyToOne
/*     */   @JoinColumn(name="INT_ID")
/*     */   private Integrante integrante;
/*     */   
/*     */   public int getEntId()
/*     */   {
/*  65 */     return this.entId;
/*     */   }
/*     */   
/*     */   public void setEntId(int entId) {
/*  69 */     this.entId = entId;
/*     */   }
/*     */   
/*     */   public String getEntCapacidades() {
/*  73 */     return this.entCapacidades;
/*     */   }
/*     */   
/*     */   public void setEntCapacidades(String entCapacidades) {
/*  77 */     this.entCapacidades = entCapacidades;
/*     */   }
/*     */   
/*     */   public String getEntCentAcu() {
/*  81 */     return this.entCentAcu;
/*     */   }
/*     */   
/*     */   public void setEntCentAcu(String entCentAcu) {
/*  85 */     this.entCentAcu = entCentAcu;
/*     */   }
/*     */   
/*     */   public int getEntEstatus() {
/*  89 */     return this.entEstatus;
/*     */   }
/*     */   
/*     */   public void setEntEstatus(int entEstatus) {
/*  93 */     this.entEstatus = entEstatus;
/*     */   }
/*     */   
/*     */   public Date getEntFecha() {
/*  97 */     return this.entFecha;
/*     */   }
/*     */   
/*     */   public void setEntFecha(Date entFecha) {
/* 101 */     this.entFecha = entFecha;
/*     */   }
/*     */   
/*     */   public String getEntImpGen() {
/* 105 */     return this.entImpGen;
/*     */   }
/*     */   
/*     */   public void setEntImpGen(String entImpGen) {
/* 109 */     this.entImpGen = entImpGen;
/*     */   }
/*     */   
/*     */   public String getEntNoCubre() {
/* 113 */     return this.entNoCubre;
/*     */   }
/*     */   
/*     */   public void setEntNoCubre(String entNoCubre) {
/* 117 */     this.entNoCubre = entNoCubre;
/*     */   }
/*     */   
/*     */   public String getEntPadProb() {
/* 121 */     return this.entPadProb;
/*     */   }
/*     */   
/*     */   public void setEntPadProb(String entPadProb) {
/* 125 */     this.entPadProb = entPadProb;
/*     */   }
/*     */   
/*     */   public String getEntSiCubre() {
/* 129 */     return this.entSiCubre;
/*     */   }
/*     */   
/*     */   public void setEntSiCubre(String entSiCubre) {
/* 133 */     this.entSiCubre = entSiCubre;
/*     */   }
/*     */   
/*     */   public int getEntSoloAcom() {
/* 137 */     return this.entSoloAcom;
/*     */   }
/*     */   
/*     */   public void setEntSoloAcom(int entSoloAcom) {
/* 141 */     this.entSoloAcom = entSoloAcom;
/*     */   }
/*     */   
/*     */   public Date getFecMod() {
/* 145 */     return this.fecMod;
/*     */   }
/*     */   
/*     */   public void setFecMod(Date fecMod) {
/* 149 */     this.fecMod = fecMod;
/*     */   }
/*     */   
/*     */   public String getUsuCve() {
/* 153 */     return this.usuCve;
/*     */   }
/*     */   
/*     */   public void setUsuCve(String usuCve) {
/* 157 */     this.usuCve = usuCve;
/*     */   }
/*     */   
/*     */   public Integrante getIntegrante() {
/* 161 */     return this.integrante;
/*     */   }
/*     */   
/*     */   public void setIntegrante(Integrante integrante) {
/* 165 */     this.integrante = integrante;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\Entrevista.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */