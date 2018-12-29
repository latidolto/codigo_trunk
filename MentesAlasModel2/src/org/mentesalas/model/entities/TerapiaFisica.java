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
/*     */ @Entity
/*     */ @Table(name="terapia_fisica")
/*     */ @NamedQuery(name="TerapiaFisica.findAll", query="SELECT t FROM TerapiaFisica t")
/*     */ public class TerapiaFisica
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="TP_ID")
/*     */   private int tpId;
/*     */   @Column(name="INT_ID")
/*     */   private int intId;
/*     */   @Column(name="TP_ACTIVIDAD")
/*     */   private String tpActividad;
/*     */   @Column(name="TP_ASISTENCIA")
/*     */   private int tpAsistencia;
/*     */   @Temporal(TemporalType.TIMESTAMP)
/*     */   @Column(name="TP_FECHA")
/*     */   private Date tpFecha;
/*     */   @Column(name="TP_FOTO_MENSUAL")
/*     */   private String tpFotoMensual;
/*     */   @Temporal(TemporalType.TIMESTAMP)
/*     */   @Column(name="TP_HORA")
/*     */   private Date tpHora;
/*     */   @Column(name="TP_LOGROS")
/*     */   private String tpLogros;
/*     */   @Column(name="TP_NOTAS")
/*     */   private String tpNotas;
/*     */   
/*     */   public int getTpId()
/*     */   {
/*  52 */     return this.tpId;
/*     */   }
/*     */   
/*     */   public void setTpId(int tpId) {
/*  56 */     this.tpId = tpId;
/*     */   }
/*     */   
/*     */   public int getIntId() {
/*  60 */     return this.intId;
/*     */   }
/*     */   
/*     */   public void setIntId(int intId) {
/*  64 */     this.intId = intId;
/*     */   }
/*     */   
/*     */   public String getTpActividad() {
/*  68 */     return this.tpActividad;
/*     */   }
/*     */   
/*     */   public void setTpActividad(String tpActividad) {
/*  72 */     this.tpActividad = tpActividad;
/*     */   }
/*     */   
/*     */   public int getTpAsistencia() {
/*  76 */     return this.tpAsistencia;
/*     */   }
/*     */   
/*     */   public void setTpAsistencia(int tpAsistencia) {
/*  80 */     this.tpAsistencia = tpAsistencia;
/*     */   }
/*     */   
/*     */   public Date getTpFecha() {
/*  84 */     return this.tpFecha;
/*     */   }
/*     */   
/*     */   public void setTpFecha(Date tpFecha) {
/*  88 */     this.tpFecha = tpFecha;
/*     */   }
/*     */   
/*     */   public String getTpFotoMensual() {
/*  92 */     return this.tpFotoMensual;
/*     */   }
/*     */   
/*     */   public void setTpFotoMensual(String tpFotoMensual) {
/*  96 */     this.tpFotoMensual = tpFotoMensual;
/*     */   }
/*     */   
/*     */   public Date getTpHora() {
/* 100 */     return this.tpHora;
/*     */   }
/*     */   
/*     */   public void setTpHora(Date tpHora) {
/* 104 */     this.tpHora = tpHora;
/*     */   }
/*     */   
/*     */   public String getTpLogros() {
/* 108 */     return this.tpLogros;
/*     */   }
/*     */   
/*     */   public void setTpLogros(String tpLogros) {
/* 112 */     this.tpLogros = tpLogros;
/*     */   }
/*     */   
/*     */   public String getTpNotas() {
/* 116 */     return this.tpNotas;
/*     */   }
/*     */   
/*     */   public void setTpNotas(String tpNotas) {
/* 120 */     this.tpNotas = tpNotas;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\TerapiaFisica.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */