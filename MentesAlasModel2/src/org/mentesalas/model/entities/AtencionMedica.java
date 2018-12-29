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
/*     */ @Entity
/*     */ @Table(name="atencion_medica")
/*     */ @NamedQuery(name="AtencionMedica.findAll", query="SELECT a FROM AtencionMedica a")
/*     */ public class AtencionMedica
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="AM_ID")
/*     */   private int amId;
/*     */   @Column(name="AM_ANTECEDENTES")
/*     */   private String amAntecedentes;
/*     */   @Column(name="AM_DIAGNOSTICO")
/*     */   private String amDiagnostico;
/*     */   @Column(name="AM_DONACION")
/*     */   private int amDonacion;
/*     */   @Column(name="AM_EN_TRATAMIENTO")
/*     */   private int amEnTratamiento;
/*     */   @Column(name="AM_ESPECIALIDAD")
/*     */   private String amEspecialidad;
/*     */   @Column(name="AM_ESTATUS")
/*     */   private int amEstatus;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="AM_FECHA")
/*     */   private Date amFecha;
/*     */   @Column(name="AM_INI_SINTOMAS")
/*     */   private String amIniSintomas;
/*     */   @Column(name="AM_MONTO")
/*     */   private double amMonto;
/*     */   @Column(name="AM_MOTIVO_CONSULTA")
/*     */   private String amMotivoConsulta;
/*     */   @Column(name="AM_RECOMENDACION")
/*     */   private String amRecomendacion;
/*     */   @Column(name="AM_SEGUIMIENTO")
/*     */   private String amSeguimiento;
/*     */   @Column(name="AM_TRATAMIENTO")
/*     */   private String amTratamiento;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="FEC_MOD")
/*     */   private Date fecMod;
/*     */   @Column(name="INT_ID")
/*     */   private int intId;
/*     */   @Column(name="MED_ID")
/*     */   private int medId;
/*     */   @Column(name="USU_CVE")
/*     */   private String usuCve;
/*     */   
/*     */   public int getAmId()
/*     */   {
/*  79 */     return this.amId;
/*     */   }
/*     */   
/*     */   public void setAmId(int amId) {
/*  83 */     this.amId = amId;
/*     */   }
/*     */   
/*     */   public String getAmAntecedentes() {
/*  87 */     return this.amAntecedentes;
/*     */   }
/*     */   
/*     */   public void setAmAntecedentes(String amAntecedentes) {
/*  91 */     this.amAntecedentes = amAntecedentes;
/*     */   }
/*     */   
/*     */   public String getAmDiagnostico() {
/*  95 */     return this.amDiagnostico;
/*     */   }
/*     */   
/*     */   public void setAmDiagnostico(String amDiagnostico) {
/*  99 */     this.amDiagnostico = amDiagnostico;
/*     */   }
/*     */   
/*     */   public int getAmDonacion() {
/* 103 */     return this.amDonacion;
/*     */   }
/*     */   
/*     */   public void setAmDonacion(int amDonacion) {
/* 107 */     this.amDonacion = amDonacion;
/*     */   }
/*     */   
/*     */   public int getAmEnTratamiento() {
/* 111 */     return this.amEnTratamiento;
/*     */   }
/*     */   
/*     */   public void setAmEnTratamiento(int amEnTratamiento) {
/* 115 */     this.amEnTratamiento = amEnTratamiento;
/*     */   }
/*     */   
/*     */   public String getAmEspecialidad() {
/* 119 */     return this.amEspecialidad;
/*     */   }
/*     */   
/*     */   public void setAmEspecialidad(String amEspecialidad) {
/* 123 */     this.amEspecialidad = amEspecialidad;
/*     */   }
/*     */   
/*     */   public int getAmEstatus() {
/* 127 */     return this.amEstatus;
/*     */   }
/*     */   
/*     */   public void setAmEstatus(int amEstatus) {
/* 131 */     this.amEstatus = amEstatus;
/*     */   }
/*     */   
/*     */   public Date getAmFecha() {
/* 135 */     return this.amFecha;
/*     */   }
/*     */   
/*     */   public void setAmFecha(Date amFecha) {
/* 139 */     this.amFecha = amFecha;
/*     */   }
/*     */   
/*     */   public String getAmIniSintomas() {
/* 143 */     return this.amIniSintomas;
/*     */   }
/*     */   
/*     */   public void setAmIniSintomas(String amIniSintomas) {
/* 147 */     this.amIniSintomas = amIniSintomas;
/*     */   }
/*     */   
/*     */   public double getAmMonto() {
/* 151 */     return this.amMonto;
/*     */   }
/*     */   
/*     */   public void setAmMonto(double amMonto) {
/* 155 */     this.amMonto = amMonto;
/*     */   }
/*     */   
/*     */   public String getAmMotivoConsulta() {
/* 159 */     return this.amMotivoConsulta;
/*     */   }
/*     */   
/*     */   public void setAmMotivoConsulta(String amMotivoConsulta) {
/* 163 */     this.amMotivoConsulta = amMotivoConsulta;
/*     */   }
/*     */   
/*     */   public String getAmRecomendacion() {
/* 167 */     return this.amRecomendacion;
/*     */   }
/*     */   
/*     */   public void setAmRecomendacion(String amRecomendacion) {
/* 171 */     this.amRecomendacion = amRecomendacion;
/*     */   }
/*     */   
/*     */   public String getAmSeguimiento() {
/* 175 */     return this.amSeguimiento;
/*     */   }
/*     */   
/*     */   public void setAmSeguimiento(String amSeguimiento) {
/* 179 */     this.amSeguimiento = amSeguimiento;
/*     */   }
/*     */   
/*     */   public String getAmTratamiento() {
/* 183 */     return this.amTratamiento;
/*     */   }
/*     */   
/*     */   public void setAmTratamiento(String amTratamiento) {
/* 187 */     this.amTratamiento = amTratamiento;
/*     */   }
/*     */   
/*     */   public Date getFecMod() {
/* 191 */     return this.fecMod;
/*     */   }
/*     */   
/*     */   public void setFecMod(Date fecMod) {
/* 195 */     this.fecMod = fecMod;
/*     */   }
/*     */   
/*     */   public int getIntId() {
/* 199 */     return this.intId;
/*     */   }
/*     */   
/*     */   public void setIntId(int intId) {
/* 203 */     this.intId = intId;
/*     */   }
/*     */   
/*     */   public int getMedId() {
/* 207 */     return this.medId;
/*     */   }
/*     */   
/*     */   public void setMedId(int medId) {
/* 211 */     this.medId = medId;
/*     */   }
/*     */   
/*     */   public String getUsuCve() {
/* 215 */     return this.usuCve;
/*     */   }
/*     */   
/*     */   public void setUsuCve(String usuCve) {
/* 219 */     this.usuCve = usuCve;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\AtencionMedica.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */