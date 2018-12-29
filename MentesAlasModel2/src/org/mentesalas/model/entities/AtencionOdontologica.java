/*     */ package org.mentesalas.model.entities;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.sql.Timestamp;
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
/*     */ @Entity
/*     */ @Table(name="atencion_odontologica")
/*     */ @NamedQuery(name="AtencionOdontologica.findAll", query="SELECT a FROM AtencionOdontologica a")
/*     */ public class AtencionOdontologica
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="AOD_ID")
/*     */   private int aodId;
/*     */   @Column(name="AOD_ANTECEDENTES")
/*     */   private String aodAntecedentes;
/*     */   @Column(name="AOD_DONACION")
/*     */   private int aodDonacion;
/*     */   @Temporal(TemporalType.TIMESTAMP)
/*     */   @Column(name="AOD_FECHA")
/*     */   private Date aodFecha;
/*     */   @Column(name="AOD_HORA")
/*     */   private Timestamp aodHora;
/*     */   @Column(name="AOD_MONTO")
/*     */   private double aodMonto;
/*     */   @Column(name="AOD_MOTIVO_CONSULTA")
/*     */   private String aodMotivoConsulta;
/*     */   @Column(name="AOD_SEGUIMIENTO")
/*     */   private String aodSeguimiento;
/*     */   @Column(name="AOD_TRATAMIENTO")
/*     */   private String aodTratamiento;
/*     */   @Column(name="IND_ID")
/*     */   private int indId;
/*     */   @Column(name="MED_ID")
/*     */   private int medId;
/*     */   
/*     */   public int getAodId()
/*     */   {
/*  58 */     return this.aodId;
/*     */   }
/*     */   
/*     */   public void setAodId(int aodId) {
/*  62 */     this.aodId = aodId;
/*     */   }
/*     */   
/*     */   public String getAodAntecedentes() {
/*  66 */     return this.aodAntecedentes;
/*     */   }
/*     */   
/*     */   public void setAodAntecedentes(String aodAntecedentes) {
/*  70 */     this.aodAntecedentes = aodAntecedentes;
/*     */   }
/*     */   
/*     */   public int getAodDonacion() {
/*  74 */     return this.aodDonacion;
/*     */   }
/*     */   
/*     */   public void setAodDonacion(int aodDonacion) {
/*  78 */     this.aodDonacion = aodDonacion;
/*     */   }
/*     */   
/*     */   public Date getAodFecha() {
/*  82 */     return this.aodFecha;
/*     */   }
/*     */   
/*     */   public void setAodFecha(Date aodFecha) {
/*  86 */     this.aodFecha = aodFecha;
/*     */   }
/*     */   
/*     */   public Timestamp getAodHora() {
/*  90 */     return this.aodHora;
/*     */   }
/*     */   
/*     */   public void setAodHora(Timestamp aodHora) {
/*  94 */     this.aodHora = aodHora;
/*     */   }
/*     */   
/*     */   public double getAodMonto() {
/*  98 */     return this.aodMonto;
/*     */   }
/*     */   
/*     */   public void setAodMonto(double aodMonto) {
/* 102 */     this.aodMonto = aodMonto;
/*     */   }
/*     */   
/*     */   public String getAodMotivoConsulta() {
/* 106 */     return this.aodMotivoConsulta;
/*     */   }
/*     */   
/*     */   public void setAodMotivoConsulta(String aodMotivoConsulta) {
/* 110 */     this.aodMotivoConsulta = aodMotivoConsulta;
/*     */   }
/*     */   
/*     */   public String getAodSeguimiento() {
/* 114 */     return this.aodSeguimiento;
/*     */   }
/*     */   
/*     */   public void setAodSeguimiento(String aodSeguimiento) {
/* 118 */     this.aodSeguimiento = aodSeguimiento;
/*     */   }
/*     */   
/*     */   public String getAodTratamiento() {
/* 122 */     return this.aodTratamiento;
/*     */   }
/*     */   
/*     */   public void setAodTratamiento(String aodTratamiento) {
/* 126 */     this.aodTratamiento = aodTratamiento;
/*     */   }
/*     */   
/*     */   public int getIndId() {
/* 130 */     return this.indId;
/*     */   }
/*     */   
/*     */   public void setIndId(int indId) {
/* 134 */     this.indId = indId;
/*     */   }
/*     */   
/*     */   public int getMedId() {
/* 138 */     return this.medId;
/*     */   }
/*     */   
/*     */   public void setMedId(int medId) {
/* 142 */     this.medId = medId;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\AtencionOdontologica.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */