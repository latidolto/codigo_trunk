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
/*     */ @Entity
/*     */ @Table(name="registro_programas")
/*     */ @NamedQuery(name="RegistroPrograma.findAll", query="SELECT r FROM RegistroPrograma r")
/*     */ public class RegistroPrograma
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="RPR_ID")
/*     */   private int rprId;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="FEC_MOD")
/*     */   private Date fecMod;
/*     */   @Column(name="RPR_ESTATUS")
/*     */   private int rprEstatus;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="RPR_FECHA")
/*     */   private Date rprFecha;
/*     */   @Column(name="RPR_HORAS")
/*     */   private int rprHoras;
/*     */   @Column(name="RPR_LOGGRU")
/*     */   private String rprLoggru;
/*     */   @Column(name="RPR_LOGIND")
/*     */   private String rprLogind;
/*     */   @Column(name="RPR_METAS")
/*     */   private String rprMetas;
/*     */   @Column(name="RPR_OBJESP")
/*     */   private String rprObjesp;
/*     */   @Column(name="RPR_OBJGEN")
/*     */   private String rprObjgen;
/*     */   @Column(name="RPR_PROGRAMA")
/*     */   private String rprPrograma;
/*     */   @Column(name="RPR_RESPONSABLE")
/*     */   private String rprResponsable;
/*     */   @Column(name="RPR_SESION")
/*     */   private int rprSesion;
/*     */   @Column(name="RPR_TALLER")
/*     */   private String rprTaller;
/*     */   @Column(name="RPR_TEMAS")
/*     */   private String rprTemas;
/*     */   @Column(name="USU_CVE")
/*     */   private String usuCve;
/*     */   
/*     */   public int getRprId()
/*     */   {
/*  73 */     return this.rprId;
/*     */   }
/*     */   
/*     */   public void setRprId(int rprId) {
/*  77 */     this.rprId = rprId;
/*     */   }
/*     */   
/*     */   public Date getFecMod() {
/*  81 */     return this.fecMod;
/*     */   }
/*     */   
/*     */   public void setFecMod(Date fecMod) {
/*  85 */     this.fecMod = fecMod;
/*     */   }
/*     */   
/*     */   public int getRprEstatus() {
/*  89 */     return this.rprEstatus;
/*     */   }
/*     */   
/*     */   public void setRprEstatus(int rprEstatus) {
/*  93 */     this.rprEstatus = rprEstatus;
/*     */   }
/*     */   
/*     */   public Date getRprFecha() {
/*  97 */     return this.rprFecha;
/*     */   }
/*     */   
/*     */   public void setRprFecha(Date rprFecha) {
/* 101 */     this.rprFecha = rprFecha;
/*     */   }
/*     */   
/*     */   public int getRprHoras() {
/* 105 */     return this.rprHoras;
/*     */   }
/*     */   
/*     */   public void setRprHoras(int rprHoras) {
/* 109 */     this.rprHoras = rprHoras;
/*     */   }
/*     */   
/*     */   public String getRprLoggru() {
/* 113 */     return this.rprLoggru;
/*     */   }
/*     */   
/*     */   public void setRprLoggru(String rprLoggru) {
/* 117 */     this.rprLoggru = rprLoggru;
/*     */   }
/*     */   
/*     */   public String getRprLogind() {
/* 121 */     return this.rprLogind;
/*     */   }
/*     */   
/*     */   public void setRprLogind(String rprLogind) {
/* 125 */     this.rprLogind = rprLogind;
/*     */   }
/*     */   
/*     */   public String getRprMetas() {
/* 129 */     return this.rprMetas;
/*     */   }
/*     */   
/*     */   public void setRprMetas(String rprMetas) {
/* 133 */     this.rprMetas = rprMetas;
/*     */   }
/*     */   
/*     */   public String getRprObjesp() {
/* 137 */     return this.rprObjesp;
/*     */   }
/*     */   
/*     */   public void setRprObjesp(String rprObjesp) {
/* 141 */     this.rprObjesp = rprObjesp;
/*     */   }
/*     */   
/*     */   public String getRprObjgen() {
/* 145 */     return this.rprObjgen;
/*     */   }
/*     */   
/*     */   public void setRprObjgen(String rprObjgen) {
/* 149 */     this.rprObjgen = rprObjgen;
/*     */   }
/*     */   
/*     */   public String getRprPrograma() {
/* 153 */     return this.rprPrograma;
/*     */   }
/*     */   
/*     */   public void setRprPrograma(String rprPrograma) {
/* 157 */     this.rprPrograma = rprPrograma;
/*     */   }
/*     */   
/*     */   public String getRprResponsable() {
/* 161 */     return this.rprResponsable;
/*     */   }
/*     */   
/*     */   public void setRprResponsable(String rprResponsable) {
/* 165 */     this.rprResponsable = rprResponsable;
/*     */   }
/*     */   
/*     */   public int getRprSesion() {
/* 169 */     return this.rprSesion;
/*     */   }
/*     */   
/*     */   public void setRprSesion(int rprSesion) {
/* 173 */     this.rprSesion = rprSesion;
/*     */   }
/*     */   
/*     */   public String getRprTaller() {
/* 177 */     return this.rprTaller;
/*     */   }
/*     */   
/*     */   public void setRprTaller(String rprTaller) {
/* 181 */     this.rprTaller = rprTaller;
/*     */   }
/*     */   
/*     */   public String getRprTemas() {
/* 185 */     return this.rprTemas;
/*     */   }
/*     */   
/*     */   public void setRprTemas(String rprTemas) {
/* 189 */     this.rprTemas = rprTemas;
/*     */   }
/*     */   
/*     */   public String getUsuCve() {
/* 193 */     return this.usuCve;
/*     */   }
/*     */   
/*     */   public void setUsuCve(String usuCve) {
/* 197 */     this.usuCve = usuCve;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\RegistroPrograma.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */