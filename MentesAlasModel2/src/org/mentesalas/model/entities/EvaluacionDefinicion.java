/*     */ package org.mentesalas.model.entities;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.NamedQuery;
/*     */ import javax.persistence.Table;
/*     */ import javax.persistence.Temporal;
/*     */ import javax.persistence.TemporalType;
/*     */ import javax.persistence.Transient;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Entity
/*     */ @Table(name="evaluacion_definicion")
/*     */ @NamedQuery(name="EvaluacionDefinicion.findAll", query="SELECT e FROM EvaluacionDefinicion e")
/*     */ public class EvaluacionDefinicion
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="evaluacion_id")
/*     */   private int evaluacionId;
/*     */   private String comentarios;
/*     */   @Temporal(TemporalType.TIMESTAMP)
/*     */   @Column(name="evaluacion_fecha_creacion")
/*     */   private Date evaluacionFechaCreacion;
/*     */   @Temporal(TemporalType.TIMESTAMP)
/*     */   @Column(name="evaluacion_fecha_modificacion")
/*     */   private Date evaluacionFechaModificacion;
/*     */   @Column(name="evaluacion_tipo")
/*     */   private int evaluacionTipo;
/*     */   @Column(name="evaluacion_version")
/*     */   private int evaluacionVersion;
/*     */   @Column(name="usu_cve")
/*     */   private String usuCve;
/*     */   @Column(name="evaluacion_periodo")
/*     */   private Integer evaluacionPeriodo;
/*     */   @Transient
/*     */   private List<EvaluacionDefinicionPregunta> ledp;
/*     */   
/*     */   public int getEvaluacionId()
/*     */   {
/*  52 */     return this.evaluacionId;
/*     */   }
/*     */   
/*     */   public void setEvaluacionId(int evaluacionId) {
/*  56 */     this.evaluacionId = evaluacionId;
/*     */   }
/*     */   
/*     */   public String getComentarios() {
/*  60 */     return this.comentarios;
/*     */   }
/*     */   
/*     */   public void setComentarios(String comentarios) {
/*  64 */     this.comentarios = comentarios;
/*     */   }
/*     */   
/*     */   public Date getEvaluacionFechaCreacion() {
/*  68 */     return this.evaluacionFechaCreacion;
/*     */   }
/*     */   
/*     */   public void setEvaluacionFechaCreacion(Date evaluacionFechaCreacion) {
/*  72 */     this.evaluacionFechaCreacion = evaluacionFechaCreacion;
/*     */   }
/*     */   
/*     */   public Date getEvaluacionFechaModificacion() {
/*  76 */     return this.evaluacionFechaModificacion;
/*     */   }
/*     */   
/*     */   public void setEvaluacionFechaModificacion(Date evaluacionFechaModificacion) {
/*  80 */     this.evaluacionFechaModificacion = evaluacionFechaModificacion;
/*     */   }
/*     */   
/*     */   public int getEvaluacionTipo() {
/*  84 */     return this.evaluacionTipo;
/*     */   }
/*     */   
/*     */   public void setEvaluacionTipo(int evaluacionTipo) {
/*  88 */     this.evaluacionTipo = evaluacionTipo;
/*     */   }
/*     */   
/*     */   public int getEvaluacionVersion() {
/*  92 */     return this.evaluacionVersion;
/*     */   }
/*     */   
/*     */   public void setEvaluacionVersion(int evaluacionVersion) {
/*  96 */     this.evaluacionVersion = evaluacionVersion;
/*     */   }
/*     */   
/*     */   public String getUsuCve() {
/* 100 */     return this.usuCve;
/*     */   }
/*     */   
/*     */   public void setUsuCve(String usuCve) {
/* 104 */     this.usuCve = usuCve;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public Integer getEvaluacionPeriodo()
/*     */   {
/* 111 */     return this.evaluacionPeriodo;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void setEvaluacionPeriodo(Integer evaluacionPeriodo)
/*     */   {
/* 118 */     this.evaluacionPeriodo = evaluacionPeriodo;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public List<EvaluacionDefinicionPregunta> getLedp()
/*     */   {
/* 125 */     return this.ledp;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void setLedp(List<EvaluacionDefinicionPregunta> ledp)
/*     */   {
/* 132 */     this.ledp = ledp;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\EvaluacionDefinicion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */