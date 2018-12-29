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
/*     */ @Table(name="atencion_especializada")
/*     */ @NamedQuery(name="AtencionEspecializada.findAll", query="SELECT a FROM AtencionEspecializada a")
/*     */ public class AtencionEspecializada
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="AES_ID")
/*     */   private int aesId;
/*     */   @Column(name="AES_DURACION")
/*     */   private int aesDuracion;
/*     */   @Column(name="AES_ESPECIALIDAD")
/*     */   private String aesEspecialidad;
/*     */   @Column(name="AES_ESPECIALISTA")
/*     */   private String aesEspecialista;
/*     */   @Column(name="AES_ESTATUS")
/*     */   private int aesEstatus;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="AES_FECHACON")
/*     */   private Date aesFechacon;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="AES_FECHASOL")
/*     */   private Date aesFechasol;
/*     */   @Column(name="AES_LUGAR")
/*     */   private String aesLugar;
/*     */   @Column(name="AES_MOTIVO")
/*     */   private String aesMotivo;
/*     */   @Column(name="AES_OBSGEN")
/*     */   private String aesObsgen;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="AES_PROXCIT")
/*     */   private Date aesProxcit;
/*     */   @Column(name="AES_SINTOMAS")
/*     */   private String aesSintomas;
/*     */   @Column(name="AES_TRATAMIENTO")
/*     */   private String aesTratamiento;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="FEC_MOD")
/*     */   private Date fecMod;
/*     */   @Column(name="INT_ID")
/*     */   private int intId;
/*     */   @Column(name="USU_CVE")
/*     */   private String usuCve;
/*     */   
/*     */   public int getAesId()
/*     */   {
/*  75 */     return this.aesId;
/*     */   }
/*     */   
/*     */   public void setAesId(int aesId) {
/*  79 */     this.aesId = aesId;
/*     */   }
/*     */   
/*     */   public int getAesDuracion() {
/*  83 */     return this.aesDuracion;
/*     */   }
/*     */   
/*     */   public void setAesDuracion(int aesDuracion) {
/*  87 */     this.aesDuracion = aesDuracion;
/*     */   }
/*     */   
/*     */   public String getAesEspecialidad() {
/*  91 */     return this.aesEspecialidad;
/*     */   }
/*     */   
/*     */   public void setAesEspecialidad(String aesEspecialidad) {
/*  95 */     this.aesEspecialidad = aesEspecialidad;
/*     */   }
/*     */   
/*     */   public String getAesEspecialista() {
/*  99 */     return this.aesEspecialista;
/*     */   }
/*     */   
/*     */   public void setAesEspecialista(String aesEspecialista) {
/* 103 */     this.aesEspecialista = aesEspecialista;
/*     */   }
/*     */   
/*     */   public int getAesEstatus() {
/* 107 */     return this.aesEstatus;
/*     */   }
/*     */   
/*     */   public void setAesEstatus(int aesEstatus) {
/* 111 */     this.aesEstatus = aesEstatus;
/*     */   }
/*     */   
/*     */   public Date getAesFechacon() {
/* 115 */     return this.aesFechacon;
/*     */   }
/*     */   
/*     */   public void setAesFechacon(Date aesFechacon) {
/* 119 */     this.aesFechacon = aesFechacon;
/*     */   }
/*     */   
/*     */   public Date getAesFechasol() {
/* 123 */     return this.aesFechasol;
/*     */   }
/*     */   
/*     */   public void setAesFechasol(Date aesFechasol) {
/* 127 */     this.aesFechasol = aesFechasol;
/*     */   }
/*     */   
/*     */   public String getAesLugar() {
/* 131 */     return this.aesLugar;
/*     */   }
/*     */   
/*     */   public void setAesLugar(String aesLugar) {
/* 135 */     this.aesLugar = aesLugar;
/*     */   }
/*     */   
/*     */   public String getAesMotivo() {
/* 139 */     return this.aesMotivo;
/*     */   }
/*     */   
/*     */   public void setAesMotivo(String aesMotivo) {
/* 143 */     this.aesMotivo = aesMotivo;
/*     */   }
/*     */   
/*     */   public String getAesObsgen() {
/* 147 */     return this.aesObsgen;
/*     */   }
/*     */   
/*     */   public void setAesObsgen(String aesObsgen) {
/* 151 */     this.aesObsgen = aesObsgen;
/*     */   }
/*     */   
/*     */   public Date getAesProxcit() {
/* 155 */     return this.aesProxcit;
/*     */   }
/*     */   
/*     */   public void setAesProxcit(Date aesProxcit) {
/* 159 */     this.aesProxcit = aesProxcit;
/*     */   }
/*     */   
/*     */   public String getAesSintomas() {
/* 163 */     return this.aesSintomas;
/*     */   }
/*     */   
/*     */   public void setAesSintomas(String aesSintomas) {
/* 167 */     this.aesSintomas = aesSintomas;
/*     */   }
/*     */   
/*     */   public String getAesTratamiento() {
/* 171 */     return this.aesTratamiento;
/*     */   }
/*     */   
/*     */   public void setAesTratamiento(String aesTratamiento) {
/* 175 */     this.aesTratamiento = aesTratamiento;
/*     */   }
/*     */   
/*     */   public Date getFecMod() {
/* 179 */     return this.fecMod;
/*     */   }
/*     */   
/*     */   public void setFecMod(Date fecMod) {
/* 183 */     this.fecMod = fecMod;
/*     */   }
/*     */   
/*     */   public int getIntId() {
/* 187 */     return this.intId;
/*     */   }
/*     */   
/*     */   public void setIntId(int intId) {
/* 191 */     this.intId = intId;
/*     */   }
/*     */   
/*     */   public String getUsuCve() {
/* 195 */     return this.usuCve;
/*     */   }
/*     */   
/*     */   public void setUsuCve(String usuCve) {
/* 199 */     this.usuCve = usuCve;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\AtencionEspecializada.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */