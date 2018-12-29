/*     */ package org.mentesalas.model.entities;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.Id;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ @Entity
/*     */ @NamedQuery(name="Fisioterapia.findAll", query="SELECT f FROM Fisioterapia f")
/*     */ public class Fisioterapia
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="FIS_ID")
/*     */   private int fisId;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="FEC_MOD")
/*     */   private Date fecMod;
/*     */   @Column(name="FIS_ADAPTA")
/*     */   private String fisAdapta;
/*     */   @Column(name="FIS_BIPEDO")
/*     */   private String fisBipedo;
/*     */   @Column(name="FIS_ESTATUS")
/*     */   private int fisEstatus;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="FIS_FECHA")
/*     */   private Date fisFecha;
/*     */   @Column(name="FIS_MARCHA")
/*     */   private String fisMarcha;
/*     */   @Column(name="FIS_METAS")
/*     */   private String fisMetas;
/*     */   @Column(name="FIS_OBSERVA")
/*     */   private String fisObserva;
/*     */   @Column(name="FIS_PRONO")
/*     */   private String fisProno;
/*     */   @Column(name="FIS_SEDENTE")
/*     */   private String fisSedente;
/*     */   @Column(name="FIS_SUPINO")
/*     */   private String fisSupino;
/*     */   @Column(name="INT_ID")
/*     */   private int intId;
/*     */   @Column(name="TER_ID")
/*     */   private int terId;
/*     */   @Column(name="USU_CVE")
/*     */   private String usuCve;
/*     */   
/*     */   public int getFisId()
/*     */   {
/*  69 */     return this.fisId;
/*     */   }
/*     */   
/*     */   public void setFisId(int fisId) {
/*  73 */     this.fisId = fisId;
/*     */   }
/*     */   
/*     */   public Date getFecMod() {
/*  77 */     return this.fecMod;
/*     */   }
/*     */   
/*     */   public void setFecMod(Date fecMod) {
/*  81 */     this.fecMod = fecMod;
/*     */   }
/*     */   
/*     */   public String getFisAdapta() {
/*  85 */     return this.fisAdapta;
/*     */   }
/*     */   
/*     */   public void setFisAdapta(String fisAdapta) {
/*  89 */     this.fisAdapta = fisAdapta;
/*     */   }
/*     */   
/*     */   public String getFisBipedo() {
/*  93 */     return this.fisBipedo;
/*     */   }
/*     */   
/*     */   public void setFisBipedo(String fisBipedo) {
/*  97 */     this.fisBipedo = fisBipedo;
/*     */   }
/*     */   
/*     */   public int getFisEstatus() {
/* 101 */     return this.fisEstatus;
/*     */   }
/*     */   
/*     */   public void setFisEstatus(int fisEstatus) {
/* 105 */     this.fisEstatus = fisEstatus;
/*     */   }
/*     */   
/*     */   public Date getFisFecha() {
/* 109 */     return this.fisFecha;
/*     */   }
/*     */   
/*     */   public void setFisFecha(Date fisFecha) {
/* 113 */     this.fisFecha = fisFecha;
/*     */   }
/*     */   
/*     */   public String getFisMarcha() {
/* 117 */     return this.fisMarcha;
/*     */   }
/*     */   
/*     */   public void setFisMarcha(String fisMarcha) {
/* 121 */     this.fisMarcha = fisMarcha;
/*     */   }
/*     */   
/*     */   public String getFisMetas() {
/* 125 */     return this.fisMetas;
/*     */   }
/*     */   
/*     */   public void setFisMetas(String fisMetas) {
/* 129 */     this.fisMetas = fisMetas;
/*     */   }
/*     */   
/*     */   public String getFisObserva() {
/* 133 */     return this.fisObserva;
/*     */   }
/*     */   
/*     */   public void setFisObserva(String fisObserva) {
/* 137 */     this.fisObserva = fisObserva;
/*     */   }
/*     */   
/*     */   public String getFisProno() {
/* 141 */     return this.fisProno;
/*     */   }
/*     */   
/*     */   public void setFisProno(String fisProno) {
/* 145 */     this.fisProno = fisProno;
/*     */   }
/*     */   
/*     */   public String getFisSedente() {
/* 149 */     return this.fisSedente;
/*     */   }
/*     */   
/*     */   public void setFisSedente(String fisSedente) {
/* 153 */     this.fisSedente = fisSedente;
/*     */   }
/*     */   
/*     */   public String getFisSupino() {
/* 157 */     return this.fisSupino;
/*     */   }
/*     */   
/*     */   public void setFisSupino(String fisSupino) {
/* 161 */     this.fisSupino = fisSupino;
/*     */   }
/*     */   
/*     */   public int getIntId() {
/* 165 */     return this.intId;
/*     */   }
/*     */   
/*     */   public void setIntId(int intId) {
/* 169 */     this.intId = intId;
/*     */   }
/*     */   
/*     */   public int getTerId() {
/* 173 */     return this.terId;
/*     */   }
/*     */   
/*     */   public void setTerId(int terId) {
/* 177 */     this.terId = terId;
/*     */   }
/*     */   
/*     */   public String getUsuCve() {
/* 181 */     return this.usuCve;
/*     */   }
/*     */   
/*     */   public void setUsuCve(String usuCve) {
/* 185 */     this.usuCve = usuCve;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\Fisioterapia.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */