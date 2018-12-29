/*    */ package org.mentesalas.model.entities;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Embeddable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Embeddable
/*    */ public class EvaluacionRespuestasDetallePK
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   @Column(name="evaluacion_respuestas_id")
/*    */   private int evaluacionRespuestasId;
/*    */   @Column(name="evaluacion_orden_pregunta")
/*    */   private int evaluacionOrdenPregunta;
/*    */   
/*    */   public int getEvaluacionRespuestasId()
/*    */   {
/* 24 */     return this.evaluacionRespuestasId;
/*    */   }
/*    */   
/* 27 */   public void setEvaluacionRespuestasId(int evaluacionRespuestasId) { this.evaluacionRespuestasId = evaluacionRespuestasId; }
/*    */   
/*    */   public int getEvaluacionOrdenPregunta() {
/* 30 */     return this.evaluacionOrdenPregunta;
/*    */   }
/*    */   
/* 33 */   public void setEvaluacionOrdenPregunta(int evaluacionOrdenPregunta) { this.evaluacionOrdenPregunta = evaluacionOrdenPregunta; }
/*    */   
/*    */   public boolean equals(Object other)
/*    */   {
/* 37 */     if (this == other) {
/* 38 */       return true;
/*    */     }
/* 40 */     if (!(other instanceof EvaluacionRespuestasDetallePK)) {
/* 41 */       return false;
/*    */     }
/* 43 */     EvaluacionRespuestasDetallePK castOther = (EvaluacionRespuestasDetallePK)other;
/* 44 */     return 
/* 45 */       (this.evaluacionRespuestasId == castOther.evaluacionRespuestasId) && 
/* 46 */       (this.evaluacionOrdenPregunta == castOther.evaluacionOrdenPregunta);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 50 */     int prime = 31;
/* 51 */     int hash = 17;
/* 52 */     hash = hash * 31 + this.evaluacionRespuestasId;
/* 53 */     hash = hash * 31 + this.evaluacionOrdenPregunta;
/*    */     
/* 55 */     return hash;
/*    */   }
/*    */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\EvaluacionRespuestasDetallePK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */