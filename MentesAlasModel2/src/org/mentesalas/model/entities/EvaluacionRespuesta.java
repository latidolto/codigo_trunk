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
/*     */ @Table(name="evaluacion_respuestas")
/*     */ @NamedQuery(name="EvaluacionRespuesta.findAll", query="SELECT e FROM EvaluacionRespuesta e")
/*     */ public class EvaluacionRespuesta
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="evaluacion_respuesta_id")
/*     */   private int evaluacionRespuestaId;
/*     */   @Column(name="evaluacion_autoevaluacion")
/*     */   private byte evaluacionAutoevaluacion;
/*     */   @Column(name="evaluacion_definicion_id")
/*     */   private int evaluacionDefinicionId;
/*     */   @Temporal(TemporalType.TIMESTAMP)
/*     */   @Column(name="fecha_creacion")
/*     */   private Date fechaCreacion;
/*     */   @Temporal(TemporalType.TIMESTAMP)
/*     */   @Column(name="fecha_evaluacion")
/*     */   private Date fechaEvaluacion;
/*     */   @Temporal(TemporalType.TIMESTAMP)
/*     */   @Column(name="fecha_modificacion")
/*     */   private Date fechaModificacion;
/*     */   @Column(name="persona_evaluada")
/*     */   private String personaEvaluada;
/*     */   @Column(name="persona_evaluadora")
/*     */   private String personaEvaluadora;
/*     */   @Column(name="usu_cve")
/*     */   private String usuCve;
/*     */   
/*     */   public int getEvaluacionRespuestaId()
/*     */   {
/*  53 */     return this.evaluacionRespuestaId;
/*     */   }
/*     */   
/*     */   public void setEvaluacionRespuestaId(int evaluacionRespuestaId) {
/*  57 */     this.evaluacionRespuestaId = evaluacionRespuestaId;
/*     */   }
/*     */   
/*     */   public byte getEvaluacionAutoevaluacion() {
/*  61 */     return this.evaluacionAutoevaluacion;
/*     */   }
/*     */   
/*     */   public void setEvaluacionAutoevaluacion(byte evaluacionAutoevaluacion) {
/*  65 */     this.evaluacionAutoevaluacion = evaluacionAutoevaluacion;
/*     */   }
/*     */   
/*     */   public int getEvaluacionDefinicionId() {
/*  69 */     return this.evaluacionDefinicionId;
/*     */   }
/*     */   
/*     */   public void setEvaluacionDefinicionId(int evaluacionDefinicionId) {
/*  73 */     this.evaluacionDefinicionId = evaluacionDefinicionId;
/*     */   }
/*     */   
/*     */   public Date getFechaCreacion() {
/*  77 */     return this.fechaCreacion;
/*     */   }
/*     */   
/*     */   public void setFechaCreacion(Date fechaCreacion) {
/*  81 */     this.fechaCreacion = fechaCreacion;
/*     */   }
/*     */   
/*     */   public Date getFechaEvaluacion() {
/*  85 */     return this.fechaEvaluacion;
/*     */   }
/*     */   
/*     */   public void setFechaEvaluacion(Date fechaEvaluacion) {
/*  89 */     this.fechaEvaluacion = fechaEvaluacion;
/*     */   }
/*     */   
/*     */   public Date getFechaModificacion() {
/*  93 */     return this.fechaModificacion;
/*     */   }
/*     */   
/*     */   public void setFechaModificacion(Date fechaModificacion) {
/*  97 */     this.fechaModificacion = fechaModificacion;
/*     */   }
/*     */   
/*     */   public String getPersonaEvaluada() {
/* 101 */     return this.personaEvaluada;
/*     */   }
/*     */   
/*     */   public void setPersonaEvaluada(String personaEvaluada) {
/* 105 */     this.personaEvaluada = personaEvaluada;
/*     */   }
/*     */   
/*     */   public String getPersonaEvaluadora() {
/* 109 */     return this.personaEvaluadora;
/*     */   }
/*     */   
/*     */   public void setPersonaEvaluadora(String personaEvaluadora) {
/* 113 */     this.personaEvaluadora = personaEvaluadora;
/*     */   }
/*     */   
/*     */   public String getUsuCve() {
/* 117 */     return this.usuCve;
/*     */   }
/*     */   
/*     */   public void setUsuCve(String usuCve) {
/* 121 */     this.usuCve = usuCve;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\EvaluacionRespuesta.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */