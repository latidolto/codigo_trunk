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
/*     */ @Entity
/*     */ @Table(name="terapia_psicologica_grupal")
/*     */ @NamedQuery(name="TerapiaPsicologicaGrupal.findAll", query="SELECT t FROM TerapiaPsicologicaGrupal t")
/*     */ public class TerapiaPsicologicaGrupal
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="TPG_ID")
/*     */   private int tpgId;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="FEC_MOD")
/*     */   private Date fecMod;
/*     */   @Column(name="TPG_CIERRE")
/*     */   private String tpgCierre;
/*     */   @Column(name="TPG_DURACION")
/*     */   private int tpgDuracion;
/*     */   @Column(name="TPG_ESTATUS")
/*     */   private int tpgEstatus;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="TPG_FECHA")
/*     */   private Date tpgFecha;
/*     */   @Column(name="TPG_OBSGEN")
/*     */   private String tpgObsgen;
/*     */   @Column(name="TPG_PARTICIPA")
/*     */   private String tpgParticipa;
/*     */   @Column(name="TPG_SESION")
/*     */   private int tpgSesion;
/*     */   @Column(name="TPG_TEMA")
/*     */   private String tpgTema;
/*     */   @Column(name="TPG_TEMCONT")
/*     */   private String tpgTemcont;
/*     */   @Column(name="USU_CVE")
/*     */   private String usuCve;
/*     */   
/*     */   public int getTpgId()
/*     */   {
/*  61 */     return this.tpgId;
/*     */   }
/*     */   
/*     */   public void setTpgId(int tpgId) {
/*  65 */     this.tpgId = tpgId;
/*     */   }
/*     */   
/*     */   public Date getFecMod() {
/*  69 */     return this.fecMod;
/*     */   }
/*     */   
/*     */   public void setFecMod(Date fecMod) {
/*  73 */     this.fecMod = fecMod;
/*     */   }
/*     */   
/*     */   public String getTpgCierre() {
/*  77 */     return this.tpgCierre;
/*     */   }
/*     */   
/*     */   public void setTpgCierre(String tpgCierre) {
/*  81 */     this.tpgCierre = tpgCierre;
/*     */   }
/*     */   
/*     */   public int getTpgDuracion() {
/*  85 */     return this.tpgDuracion;
/*     */   }
/*     */   
/*     */   public void setTpgDuracion(int tpgDuracion) {
/*  89 */     this.tpgDuracion = tpgDuracion;
/*     */   }
/*     */   
/*     */   public int getTpgEstatus() {
/*  93 */     return this.tpgEstatus;
/*     */   }
/*     */   
/*     */   public void setTpgEstatus(int tpgEstatus) {
/*  97 */     this.tpgEstatus = tpgEstatus;
/*     */   }
/*     */   
/*     */   public Date getTpgFecha() {
/* 101 */     return this.tpgFecha;
/*     */   }
/*     */   
/*     */   public void setTpgFecha(Date tpgFecha) {
/* 105 */     this.tpgFecha = tpgFecha;
/*     */   }
/*     */   
/*     */   public String getTpgObsgen() {
/* 109 */     return this.tpgObsgen;
/*     */   }
/*     */   
/*     */   public void setTpgObsgen(String tpgObsgen) {
/* 113 */     this.tpgObsgen = tpgObsgen;
/*     */   }
/*     */   
/*     */   public String getTpgParticipa() {
/* 117 */     return this.tpgParticipa;
/*     */   }
/*     */   
/*     */   public void setTpgParticipa(String tpgParticipa) {
/* 121 */     this.tpgParticipa = tpgParticipa;
/*     */   }
/*     */   
/*     */   public int getTpgSesion() {
/* 125 */     return this.tpgSesion;
/*     */   }
/*     */   
/*     */   public void setTpgSesion(int tpgSesion) {
/* 129 */     this.tpgSesion = tpgSesion;
/*     */   }
/*     */   
/*     */   public String getTpgTema() {
/* 133 */     return this.tpgTema;
/*     */   }
/*     */   
/*     */   public void setTpgTema(String tpgTema) {
/* 137 */     this.tpgTema = tpgTema;
/*     */   }
/*     */   
/*     */   public String getTpgTemcont() {
/* 141 */     return this.tpgTemcont;
/*     */   }
/*     */   
/*     */   public void setTpgTemcont(String tpgTemcont) {
/* 145 */     this.tpgTemcont = tpgTemcont;
/*     */   }
/*     */   
/*     */   public String getUsuCve() {
/* 149 */     return this.usuCve;
/*     */   }
/*     */   
/*     */   public void setUsuCve(String usuCve) {
/* 153 */     this.usuCve = usuCve;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\TerapiaPsicologicaGrupal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */