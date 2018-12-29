/*     */ package org.mentesalas.model.entities;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.io.Serializable;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.EmbeddedId;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.Lob;
/*     */ import javax.persistence.NamedQueries;
/*     */ import javax.persistence.Table;
/*     */ import javax.persistence.Transient;
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
/*     */ @Table(name="evaluacion_definicion_pregunta")
/*     */ @NamedQueries({@javax.persistence.NamedQuery(name="EvaluacionDefinicionPregunta.findAll", query="SELECT e FROM EvaluacionDefinicionPregunta e "), @javax.persistence.NamedQuery(name="EvaluacionDefinicionPregunta.findByEvalId", query="SELECT e FROM EvaluacionDefinicionPregunta e where e.id.evaluacionId = :p_evalId order by e.id.evaluacionPreguntaOrden")})
/*     */ public class EvaluacionDefinicionPregunta
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @EmbeddedId
/*     */   private EvaluacionDefinicionPreguntaPK id;
/*     */   @Lob
/*     */   @Column(name="evaluacion_pregunta")
/*     */   private String evaluacionPregunta;
/*     */   @Column(name="evaluacion_respuesta_bien_regular_malo")
/*     */   private int evaluacionRespuestaBienRegularMalo;
/*     */   @Column(name="evaluacion_respuesta_comentarios")
/*     */   private int evaluacionRespuestaComentarios;
/*     */   @Column(name="evaluacion_respuesta_excelente_malo")
/*     */   private int evaluacionRespuestaExcelenteMalo;
/*     */   @Column(name="evaluacion_respuesta_si_no")
/*     */   private int evaluacionRespuestaSiNo;
/*     */   @Column(name="evaluacion_respuesta_si_no_nose")
/*     */   private int evaluacionRespuestaSiNoNose;
/*     */   @Column(name="evaluacion_respuesta_uno_a_cinco")
/*     */   private int evaluacionRespuestaUnoACinco;
/*     */   @Transient
/*     */   private Integer tipoPregunta;
/*     */   @Transient
/*     */   private boolean tieneComentarios;
/*     */   
/*     */   public EvaluacionDefinicionPreguntaPK getId()
/*     */   {
/*  55 */     return this.id;
/*     */   }
/*     */   
/*     */   public void setId(EvaluacionDefinicionPreguntaPK id) {
/*  59 */     this.id = id;
/*     */   }
/*     */   
/*     */   public String getEvaluacionPregunta() {
/*  63 */     return this.evaluacionPregunta;
/*     */   }
/*     */   
/*     */   public void setEvaluacionPregunta(String evaluacionPregunta) {
/*  67 */     this.evaluacionPregunta = evaluacionPregunta;
/*     */   }
/*     */   
/*     */   public int getEvaluacionRespuestaBienRegularMalo() {
/*  71 */     return this.evaluacionRespuestaBienRegularMalo;
/*     */   }
/*     */   
/*     */   public void setEvaluacionRespuestaBienRegularMalo(int evaluacionRespuestaBienRegularMalo) {
/*  75 */     this.evaluacionRespuestaBienRegularMalo = evaluacionRespuestaBienRegularMalo;
/*     */   }
/*     */   
/*     */   public int getEvaluacionRespuestaComentarios() {
/*  79 */     return this.evaluacionRespuestaComentarios;
/*     */   }
/*     */   
/*     */   public void setEvaluacionRespuestaComentarios(int evaluacionRespuestaComentarios) {
/*  83 */     this.evaluacionRespuestaComentarios = evaluacionRespuestaComentarios;
/*     */   }
/*     */   
/*     */   public int getEvaluacionRespuestaExcelenteMalo() {
/*  87 */     return this.evaluacionRespuestaExcelenteMalo;
/*     */   }
/*     */   
/*     */   public void setEvaluacionRespuestaExcelenteMalo(int evaluacionRespuestaExcelenteMalo) {
/*  91 */     this.evaluacionRespuestaExcelenteMalo = evaluacionRespuestaExcelenteMalo;
/*     */   }
/*     */   
/*     */   public int getEvaluacionRespuestaSiNo() {
/*  95 */     return this.evaluacionRespuestaSiNo;
/*     */   }
/*     */   
/*     */   public void setEvaluacionRespuestaSiNo(int evaluacionRespuestaSiNo) {
/*  99 */     this.evaluacionRespuestaSiNo = evaluacionRespuestaSiNo;
/*     */   }
/*     */   
/*     */   public int getEvaluacionRespuestaSiNoNose() {
/* 103 */     return this.evaluacionRespuestaSiNoNose;
/*     */   }
/*     */   
/*     */   public void setEvaluacionRespuestaSiNoNose(int evaluacionRespuestaSiNoNose) {
/* 107 */     this.evaluacionRespuestaSiNoNose = evaluacionRespuestaSiNoNose;
/*     */   }
/*     */   
/*     */   public int getEvaluacionRespuestaUnoACinco() {
/* 111 */     return this.evaluacionRespuestaUnoACinco;
/*     */   }
/*     */   
/*     */   public void setEvaluacionRespuestaUnoACinco(int evaluacionRespuestaUnoACinco) {
/* 115 */     this.evaluacionRespuestaUnoACinco = evaluacionRespuestaUnoACinco;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public int getTipoPregunta()
/*     */   {
/* 122 */     if (this.tipoPregunta == null) {
/* 123 */       System.out.println("Es nulo y setea el valor inicial");
/* 124 */       this.tipoPregunta = Integer.valueOf(0);
/* 125 */       if (this.evaluacionRespuestaBienRegularMalo == 1)
/* 126 */         this.tipoPregunta = Integer.valueOf(0);
/* 127 */       if (this.evaluacionRespuestaExcelenteMalo == 1)
/* 128 */         this.tipoPregunta = Integer.valueOf(1);
/* 129 */       if (this.evaluacionRespuestaSiNo == 1)
/* 130 */         this.tipoPregunta = Integer.valueOf(2);
/* 131 */       if (this.evaluacionRespuestaSiNoNose == 1)
/* 132 */         this.tipoPregunta = Integer.valueOf(3);
/* 133 */       if (this.evaluacionRespuestaUnoACinco == 1)
/* 134 */         this.tipoPregunta = Integer.valueOf(4);
/* 135 */       if (this.evaluacionRespuestaComentarios == 1) {
/* 136 */         this.tipoPregunta = Integer.valueOf(5);
/*     */       }
/*     */     }
/* 139 */     return this.tipoPregunta.intValue();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTipoPregunta(int tipoPregunta)
/*     */   {
/* 147 */     this.tipoPregunta = Integer.valueOf(tipoPregunta);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public boolean isTieneComentarios()
/*     */   {
/* 154 */     if (this.evaluacionRespuestaComentarios == 1)
/* 155 */       this.tieneComentarios = true;
/* 156 */     return this.tieneComentarios;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTieneComentarios(boolean tieneComentarios)
/*     */   {
/* 164 */     this.tieneComentarios = tieneComentarios;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\EvaluacionDefinicionPregunta.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */