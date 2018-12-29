/*     */ package org.mentesalas.model.entities;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.List;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.NamedQuery;
/*     */ import javax.persistence.OneToMany;
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
/*     */ @NamedQuery(name="Pregunta.findAll", query="SELECT p FROM Pregunta p")
/*     */ public class Pregunta
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="pre_id")
/*     */   private int preId;
/*     */   @Column(name="pre_pregunta")
/*     */   private String prePregunta;
/*     */   @OneToMany(mappedBy="pregunta")
/*     */   private List<PreguntaRespuesta> preguntaRespuestas;
/*     */   @OneToMany(mappedBy="pregunta")
/*     */   private List<ProgramaPregunta> programaPreguntas;
/*     */   
/*     */   public int getPreId()
/*     */   {
/*  40 */     return this.preId;
/*     */   }
/*     */   
/*     */   public void setPreId(int preId) {
/*  44 */     this.preId = preId;
/*     */   }
/*     */   
/*     */   public String getPrePregunta() {
/*  48 */     return this.prePregunta;
/*     */   }
/*     */   
/*     */   public void setPrePregunta(String prePregunta) {
/*  52 */     this.prePregunta = prePregunta;
/*     */   }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<PreguntaRespuesta> getPreguntaRespuestas()
/*     */   {
/*  78 */     return this.preguntaRespuestas;
/*     */   }
/*     */   
/*     */   public void setPreguntaRespuestas(List<PreguntaRespuesta> preguntaRespuestas) {
/*  82 */     this.preguntaRespuestas = preguntaRespuestas;
/*     */   }
/*     */   
/*     */   public PreguntaRespuesta addPreguntaRespuesta(PreguntaRespuesta preguntaRespuesta) {
/*  86 */     getPreguntaRespuestas().add(preguntaRespuesta);
/*  87 */     preguntaRespuesta.setPregunta(this);
/*     */     
/*  89 */     return preguntaRespuesta;
/*     */   }
/*     */   
/*     */   public PreguntaRespuesta removePreguntaRespuesta(PreguntaRespuesta preguntaRespuesta) {
/*  93 */     getPreguntaRespuestas().remove(preguntaRespuesta);
/*  94 */     preguntaRespuesta.setPregunta(null);
/*     */     
/*  96 */     return preguntaRespuesta;
/*     */   }
/*     */   
/*     */   public List<ProgramaPregunta> getProgramaPreguntas() {
/* 100 */     return this.programaPreguntas;
/*     */   }
/*     */   
/*     */   public void setProgramaPreguntas(List<ProgramaPregunta> programaPreguntas) {
/* 104 */     this.programaPreguntas = programaPreguntas;
/*     */   }
/*     */   
/*     */   public ProgramaPregunta addProgramaPregunta(ProgramaPregunta programaPregunta) {
/* 108 */     getProgramaPreguntas().add(programaPregunta);
/* 109 */     programaPregunta.setPregunta(this);
/*     */     
/* 111 */     return programaPregunta;
/*     */   }
/*     */   
/*     */   public ProgramaPregunta removeProgramaPregunta(ProgramaPregunta programaPregunta) {
/* 115 */     getProgramaPreguntas().remove(programaPregunta);
/* 116 */     programaPregunta.setPregunta(null);
/*     */     
/* 118 */     return programaPregunta;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\Pregunta.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */