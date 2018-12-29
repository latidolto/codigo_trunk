/*    */ package org.mentesalas.model.entities;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.EmbeddedId;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.Lob;
/*    */ import javax.persistence.NamedQuery;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Entity
/*    */ @Table(name="evaluacion_respuestas_detalle")
/*    */ @NamedQuery(name="EvaluacionRespuestasDetalle.findAll", query="SELECT e FROM EvaluacionRespuestasDetalle e")
/*    */ public class EvaluacionRespuestasDetalle
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   @EmbeddedId
/*    */   private EvaluacionRespuestasDetallePK id;
/*    */   @Column(name="respuesta_bien_regular_malo")
/*    */   private int respuestaBienRegularMalo;
/*    */   @Lob
/*    */   @Column(name="respuesta_comentarios")
/*    */   private String respuestaComentarios;
/*    */   @Column(name="respuesta_excelente_malo")
/*    */   private int respuestaExcelenteMalo;
/*    */   @Column(name="respuesta_si_no")
/*    */   private int respuestaSiNo;
/*    */   @Column(name="respuesta_si_no_nose")
/*    */   private int respuestaSiNoNose;
/*    */   @Column(name="respuesta_uno_a_cinco")
/*    */   private int respuestaUnoACinco;
/*    */   
/*    */   public EvaluacionRespuestasDetallePK getId()
/*    */   {
/* 43 */     return this.id;
/*    */   }
/*    */   
/*    */   public void setId(EvaluacionRespuestasDetallePK id) {
/* 47 */     this.id = id;
/*    */   }
/*    */   
/*    */   public int getRespuestaBienRegularMalo() {
/* 51 */     return this.respuestaBienRegularMalo;
/*    */   }
/*    */   
/*    */   public void setRespuestaBienRegularMalo(int respuestaBienRegularMalo) {
/* 55 */     this.respuestaBienRegularMalo = respuestaBienRegularMalo;
/*    */   }
/*    */   
/*    */   public String getRespuestaComentarios() {
/* 59 */     return this.respuestaComentarios;
/*    */   }
/*    */   
/*    */   public void setRespuestaComentarios(String respuestaComentarios) {
/* 63 */     this.respuestaComentarios = respuestaComentarios;
/*    */   }
/*    */   
/*    */   public int getRespuestaExcelenteMalo() {
/* 67 */     return this.respuestaExcelenteMalo;
/*    */   }
/*    */   
/*    */   public void setRespuestaExcelenteMalo(int respuestaExcelenteMalo) {
/* 71 */     this.respuestaExcelenteMalo = respuestaExcelenteMalo;
/*    */   }
/*    */   
/*    */   public int getRespuestaSiNo() {
/* 75 */     return this.respuestaSiNo;
/*    */   }
/*    */   
/*    */   public void setRespuestaSiNo(int respuestaSiNo) {
/* 79 */     this.respuestaSiNo = respuestaSiNo;
/*    */   }
/*    */   
/*    */   public int getRespuestaSiNoNose() {
/* 83 */     return this.respuestaSiNoNose;
/*    */   }
/*    */   
/*    */   public void setRespuestaSiNoNose(int respuestaSiNoNose) {
/* 87 */     this.respuestaSiNoNose = respuestaSiNoNose;
/*    */   }
/*    */   
/*    */   public int getRespuestaUnoACinco() {
/* 91 */     return this.respuestaUnoACinco;
/*    */   }
/*    */   
/*    */   public void setRespuestaUnoACinco(int respuestaUnoACinco) {
/* 95 */     this.respuestaUnoACinco = respuestaUnoACinco;
/*    */   }
/*    */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\EvaluacionRespuestasDetalle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */