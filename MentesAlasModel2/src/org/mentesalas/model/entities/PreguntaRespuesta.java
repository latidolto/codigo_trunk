/*    */ package org.mentesalas.model.entities;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.JoinColumn;
/*    */ import javax.persistence.ManyToOne;
/*    */ import javax.persistence.NamedQuery;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Entity
/*    */ @Table(name="pregunta_respuesta")
/*    */ @NamedQuery(name="PreguntaRespuesta.findAll", query="SELECT p FROM PreguntaRespuesta p")
/*    */ public class PreguntaRespuesta
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   @Id
/*    */   @Column(name="PRR_ID")
/*    */   private int prrId;
/*    */   @Column(name="PRR_ORDEN")
/*    */   private int prrOrden;
/*    */   @Column(name="PRR_RESPUESTA")
/*    */   private String prrRespuesta;
/*    */   @ManyToOne
/*    */   @JoinColumn(name="PRE_ID")
/*    */   private Pregunta pregunta;
/*    */   
/*    */   public int getPrrId()
/*    */   {
/* 36 */     return this.prrId;
/*    */   }
/*    */   
/*    */   public void setPrrId(int prrId) {
/* 40 */     this.prrId = prrId;
/*    */   }
/*    */   
/*    */   public int getPrrOrden() {
/* 44 */     return this.prrOrden;
/*    */   }
/*    */   
/*    */   public void setPrrOrden(int prrOrden) {
/* 48 */     this.prrOrden = prrOrden;
/*    */   }
/*    */   
/*    */   public String getPrrRespuesta() {
/* 52 */     return this.prrRespuesta;
/*    */   }
/*    */   
/*    */   public void setPrrRespuesta(String prrRespuesta) {
/* 56 */     this.prrRespuesta = prrRespuesta;
/*    */   }
/*    */   
/*    */   public Pregunta getPregunta() {
/* 60 */     return this.pregunta;
/*    */   }
/*    */   
/*    */   public void setPregunta(Pregunta pregunta) {
/* 64 */     this.pregunta = pregunta;
/*    */   }
/*    */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\PreguntaRespuesta.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */