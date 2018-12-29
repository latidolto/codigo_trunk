/*     */ package org.mentesalas.model.entities;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.Lob;
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
/*     */ @Table(name="servicios_laboratorio")
/*     */ @NamedQuery(name="ServiciosLaboratorio.findAll", query="SELECT s FROM ServiciosLaboratorio s")
/*     */ public class ServiciosLaboratorio
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="SLA_ID")
/*     */   private int slaId;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="FEC_MOD")
/*     */   private Date fecMod;
/*     */   @Column(name="INT_ID")
/*     */   private int intId;
/*     */   @Column(name="MED_ID")
/*     */   private int medId;
/*     */   @Column(name="SLA_DONACION")
/*     */   private int slaDonacion;
/*     */   @Column(name="SLA_ESTATUS")
/*     */   private int slaEstatus;
/*     */   @Column(name="SLA_ESTUDIO")
/*     */   private String slaEstudio;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="SLA_FECHA")
/*     */   private Date slaFecha;
/*     */   @Lob
/*     */   @Column(name="SLA_FOTO")
/*     */   private byte[] slaFoto;
/*     */   @Column(name="SLA_LAB")
/*     */   private String slaLab;
/*     */   @Column(name="SLA_MONTO")
/*     */   private double slaMonto;
/*     */   @Column(name="SLA_OBSERVACIONES")
/*     */   private String slaObservaciones;
/*     */   @Column(name="USU_CVE")
/*     */   private String usuCve;
/*     */   
/*     */   public int getSlaId()
/*     */   {
/*  65 */     return this.slaId;
/*     */   }
/*     */   
/*     */   public void setSlaId(int slaId) {
/*  69 */     this.slaId = slaId;
/*     */   }
/*     */   
/*     */   public Date getFecMod() {
/*  73 */     return this.fecMod;
/*     */   }
/*     */   
/*     */   public void setFecMod(Date fecMod) {
/*  77 */     this.fecMod = fecMod;
/*     */   }
/*     */   
/*     */   public int getIntId() {
/*  81 */     return this.intId;
/*     */   }
/*     */   
/*     */   public void setIntId(int intId) {
/*  85 */     this.intId = intId;
/*     */   }
/*     */   
/*     */   public int getMedId() {
/*  89 */     return this.medId;
/*     */   }
/*     */   
/*     */   public void setMedId(int medId) {
/*  93 */     this.medId = medId;
/*     */   }
/*     */   
/*     */   public int getSlaDonacion() {
/*  97 */     return this.slaDonacion;
/*     */   }
/*     */   
/*     */   public void setSlaDonacion(int slaDonacion) {
/* 101 */     this.slaDonacion = slaDonacion;
/*     */   }
/*     */   
/*     */   public int getSlaEstatus() {
/* 105 */     return this.slaEstatus;
/*     */   }
/*     */   
/*     */   public void setSlaEstatus(int slaEstatus) {
/* 109 */     this.slaEstatus = slaEstatus;
/*     */   }
/*     */   
/*     */   public String getSlaEstudio() {
/* 113 */     return this.slaEstudio;
/*     */   }
/*     */   
/*     */   public void setSlaEstudio(String slaEstudio) {
/* 117 */     this.slaEstudio = slaEstudio;
/*     */   }
/*     */   
/*     */   public Date getSlaFecha() {
/* 121 */     return this.slaFecha;
/*     */   }
/*     */   
/*     */   public void setSlaFecha(Date slaFecha) {
/* 125 */     this.slaFecha = slaFecha;
/*     */   }
/*     */   
/*     */   public byte[] getSlaFoto() {
/* 129 */     return this.slaFoto;
/*     */   }
/*     */   
/*     */   public void setSlaFoto(byte[] slaFoto) {
/* 133 */     this.slaFoto = slaFoto;
/*     */   }
/*     */   
/*     */   public String getSlaLab() {
/* 137 */     return this.slaLab;
/*     */   }
/*     */   
/*     */   public void setSlaLab(String slaLab) {
/* 141 */     this.slaLab = slaLab;
/*     */   }
/*     */   
/*     */   public double getSlaMonto() {
/* 145 */     return this.slaMonto;
/*     */   }
/*     */   
/*     */   public void setSlaMonto(double slaMonto) {
/* 149 */     this.slaMonto = slaMonto;
/*     */   }
/*     */   
/*     */   public String getSlaObservaciones() {
/* 153 */     return this.slaObservaciones;
/*     */   }
/*     */   
/*     */   public void setSlaObservaciones(String slaObservaciones) {
/* 157 */     this.slaObservaciones = slaObservaciones;
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


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\ServiciosLaboratorio.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */