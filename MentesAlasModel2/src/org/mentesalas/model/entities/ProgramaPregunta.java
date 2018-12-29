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
/*    */ 
/*    */ @Entity
/*    */ @Table(name="programa_pregunta")
/*    */ @NamedQuery(name="ProgramaPregunta.findAll", query="SELECT p FROM ProgramaPregunta p")
/*    */ public class ProgramaPregunta
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   @Id
/*    */   @Column(name="PRP_ID")
/*    */   private int prpId;
/*    */   @Column(name="EPP_ORDEN")
/*    */   private int eppOrden;
/*    */   @ManyToOne
/*    */   @JoinColumn(name="PRE_ID")
/*    */   private Pregunta pregunta;
/*    */   @ManyToOne
/*    */   @JoinColumn(name="PRO_ID")
/*    */   private Programa programa;
/*    */   
/*    */   public int getPrpId()
/*    */   {
/* 38 */     return this.prpId;
/*    */   }
/*    */   
/*    */   public void setPrpId(int prpId) {
/* 42 */     this.prpId = prpId;
/*    */   }
/*    */   
/*    */   public int getEppOrden() {
/* 46 */     return this.eppOrden;
/*    */   }
/*    */   
/*    */   public void setEppOrden(int eppOrden) {
/* 50 */     this.eppOrden = eppOrden;
/*    */   }
/*    */   
/*    */   public Pregunta getPregunta() {
/* 54 */     return this.pregunta;
/*    */   }
/*    */   
/*    */   public void setPregunta(Pregunta pregunta) {
/* 58 */     this.pregunta = pregunta;
/*    */   }
/*    */   
/*    */   public Programa getPrograma() {
/* 62 */     return this.programa;
/*    */   }
/*    */   
/*    */   public void setPrograma(Programa programa) {
/* 66 */     this.programa = programa;
/*    */   }
/*    */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\ProgramaPregunta.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */