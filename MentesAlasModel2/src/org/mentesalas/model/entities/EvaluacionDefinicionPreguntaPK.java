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
/*    */ @Embeddable
/*    */ public class EvaluacionDefinicionPreguntaPK
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   @Column(name="evaluacion_id")
/*    */   private int evaluacionId;
/*    */   @Column(name="evaluacion_pregunta_orden")
/*    */   private int evaluacionPreguntaOrden;
/*    */   
/*    */   public EvaluacionDefinicionPreguntaPK() {}
/*    */   
/*    */   public EvaluacionDefinicionPreguntaPK(int evaluacionId, int evaluacionPreguntaOrden)
/*    */   {
/* 25 */     setEvaluacionId(evaluacionId);
/* 26 */     setEvaluacionPreguntaOrden(evaluacionPreguntaOrden);
/*    */   }
/*    */   
/*    */   public int getEvaluacionId() {
/* 30 */     return this.evaluacionId;
/*    */   }
/*    */   
/* 33 */   public void setEvaluacionId(int evaluacionId) { this.evaluacionId = evaluacionId; }
/*    */   
/*    */   public int getEvaluacionPreguntaOrden() {
/* 36 */     return this.evaluacionPreguntaOrden;
/*    */   }
/*    */   
/* 39 */   public void setEvaluacionPreguntaOrden(int evaluacionPreguntaOrden) { this.evaluacionPreguntaOrden = evaluacionPreguntaOrden; }
/*    */   
/*    */   public boolean equals(Object other)
/*    */   {
/* 43 */     if (this == other) {
/* 44 */       return true;
/*    */     }
/* 46 */     if (!(other instanceof EvaluacionDefinicionPreguntaPK)) {
/* 47 */       return false;
/*    */     }
/* 49 */     EvaluacionDefinicionPreguntaPK castOther = (EvaluacionDefinicionPreguntaPK)other;
/* 50 */     return 
/* 51 */       (this.evaluacionId == castOther.evaluacionId) && 
/* 52 */       (this.evaluacionPreguntaOrden == castOther.evaluacionPreguntaOrden);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 56 */     int prime = 31;
/* 57 */     int hash = 17;
/* 58 */     hash = hash * 31 + this.evaluacionId;
/* 59 */     hash = hash * 31 + this.evaluacionPreguntaOrden;
/*    */     
/* 61 */     return hash;
/*    */   }
/*    */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\EvaluacionDefinicionPreguntaPK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */