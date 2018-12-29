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
/*     */ @Entity
/*     */ @Table(name="atencion_seguimiento_familiar")
/*     */ @NamedQuery(name="AtencionSeguimientoFamiliar.findAll", query="SELECT a FROM AtencionSeguimientoFamiliar a")
/*     */ public class AtencionSeguimientoFamiliar
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="ASF_ID")
/*     */   private int asfId;
/*     */   @Column(name="ASF_ACUERCOMUN")
/*     */   private String asfAcuercomun;
/*     */   @Column(name="ASF_ACUERFAM")
/*     */   private String asfAcuerfam;
/*     */   @Column(name="ASF_ESTATUS")
/*     */   private int asfEstatus;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="ASF_FECHA")
/*     */   private Date asfFecha;
/*     */   @Column(name="ASF_INFOREL")
/*     */   private String asfInforel;
/*     */   @Column(name="ASF_MOTIVO")
/*     */   private String asfMotivo;
/*     */   @Column(name="ASF_PARENTESCO")
/*     */   private String asfParentesco;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="ASF_PROXCITA")
/*     */   private Date asfProxcita;
/*     */   @Column(name="ASF_QUIEN")
/*     */   private String asfQuien;
/*     */   @Column(name="ASF_SESION")
/*     */   private int asfSesion;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="FEC_MOD")
/*     */   private Date fecMod;
/*     */   @Column(name="USU_CVE")
/*     */   private String usuCve;
/*     */   
/*     */   public int getAsfId()
/*     */   {
/*  65 */     return this.asfId;
/*     */   }
/*     */   
/*     */   public void setAsfId(int asfId) {
/*  69 */     this.asfId = asfId;
/*     */   }
/*     */   
/*     */   public String getAsfAcuercomun() {
/*  73 */     return this.asfAcuercomun;
/*     */   }
/*     */   
/*     */   public void setAsfAcuercomun(String asfAcuercomun) {
/*  77 */     this.asfAcuercomun = asfAcuercomun;
/*     */   }
/*     */   
/*     */   public String getAsfAcuerfam() {
/*  81 */     return this.asfAcuerfam;
/*     */   }
/*     */   
/*     */   public void setAsfAcuerfam(String asfAcuerfam) {
/*  85 */     this.asfAcuerfam = asfAcuerfam;
/*     */   }
/*     */   
/*     */   public int getAsfEstatus() {
/*  89 */     return this.asfEstatus;
/*     */   }
/*     */   
/*     */   public void setAsfEstatus(int asfEstatus) {
/*  93 */     this.asfEstatus = asfEstatus;
/*     */   }
/*     */   
/*     */   public Date getAsfFecha() {
/*  97 */     return this.asfFecha;
/*     */   }
/*     */   
/*     */   public void setAsfFecha(Date asfFecha) {
/* 101 */     this.asfFecha = asfFecha;
/*     */   }
/*     */   
/*     */   public String getAsfInforel() {
/* 105 */     return this.asfInforel;
/*     */   }
/*     */   
/*     */   public void setAsfInforel(String asfInforel) {
/* 109 */     this.asfInforel = asfInforel;
/*     */   }
/*     */   
/*     */   public String getAsfMotivo() {
/* 113 */     return this.asfMotivo;
/*     */   }
/*     */   
/*     */   public void setAsfMotivo(String asfMotivo) {
/* 117 */     this.asfMotivo = asfMotivo;
/*     */   }
/*     */   
/*     */   public String getAsfParentesco() {
/* 121 */     return this.asfParentesco;
/*     */   }
/*     */   
/*     */   public void setAsfParentesco(String asfParentesco) {
/* 125 */     this.asfParentesco = asfParentesco;
/*     */   }
/*     */   
/*     */   public Date getAsfProxcita() {
/* 129 */     return this.asfProxcita;
/*     */   }
/*     */   
/*     */   public void setAsfProxcita(Date asfProxcita) {
/* 133 */     this.asfProxcita = asfProxcita;
/*     */   }
/*     */   
/*     */   public String getAsfQuien() {
/* 137 */     return this.asfQuien;
/*     */   }
/*     */   
/*     */   public void setAsfQuien(String asfQuien) {
/* 141 */     this.asfQuien = asfQuien;
/*     */   }
/*     */   
/*     */   public int getAsfSesion() {
/* 145 */     return this.asfSesion;
/*     */   }
/*     */   
/*     */   public void setAsfSesion(int asfSesion) {
/* 149 */     this.asfSesion = asfSesion;
/*     */   }
/*     */   
/*     */   public Date getFecMod() {
/* 153 */     return this.fecMod;
/*     */   }
/*     */   
/*     */   public void setFecMod(Date fecMod) {
/* 157 */     this.fecMod = fecMod;
/*     */   }
/*     */   
/*     */   public String getUsuCve() {
/* 161 */     return this.usuCve;
/*     */   }
/*     */   
/*     */   public void setUsuCve(String usuCve) {
/* 165 */     this.usuCve = usuCve;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\AtencionSeguimientoFamiliar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */