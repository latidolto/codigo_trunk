/*    */ package org.mentesalas.model;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.mentesalas.model.entities.EvaluacionDefinicionPregunta;
/*    */ 
/*    */ public class MentesAlasFacade extends PenolesFacadeUtil
/*    */ {
/*    */   private static MentesAlasFacade _MentesAlasFacade;
/*    */   private List<EvaluacionDefinicionPregunta> ledp;
/*    */   
/*    */   private MentesAlasFacade()
/*    */   {
/* 14 */     super("MentesAlas2Model");
/*    */   }
/*    */   
/*    */   public static MentesAlasFacade getInstance() {
/* 18 */     if (_MentesAlasFacade == null) {
/* 19 */       _MentesAlasFacade = new MentesAlasFacade();
/* 20 */       Object[] regEjb = {
/* 21 */         new org.mentesalas.model.entities.Evaluacion(), 
/* 22 */         new org.mentesalas.model.entities.EvaluacionDefinicion(), 
/* 23 */         new org.mentesalas.model.entities.Multivaluada(), 
/* 24 */         new EvaluacionDefinicionPregunta(), 
/* 25 */         new org.mentesalas.model.entities.Integrante() };
/*    */       
/* 27 */       _MentesAlasFacade.registerEJB(regEjb);
/*    */     }
/* 29 */     return _MentesAlasFacade;
/*    */   }
/*    */   
/*    */   public List<org.mentesalas.model.entities.Multivaluada> getMultivaluada(String clave) {
/* 33 */     Map params = new java.util.HashMap();
/* 34 */     params.put("p_mulClave", clave);
/* 35 */     return getListFromParameters(org.mentesalas.model.entities.Multivaluada.class.getName(), "findByCommonKey", params);
/*    */   }
/*    */   
/*    */   public List<EvaluacionDefinicionPregunta> getPreguntas(int evalId) {
/* 39 */     Map params = new java.util.HashMap();
/* 40 */     params.put("p_evalId", Integer.valueOf(evalId));
/* 41 */     return getListFromParameters(EvaluacionDefinicionPregunta.class.getName(), "findByEvalId", params);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public List<EvaluacionDefinicionPregunta> getLedp()
/*    */   {
/* 48 */     return this.ledp;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public void setLedp(List<EvaluacionDefinicionPregunta> ledp)
/*    */   {
/* 55 */     this.ledp = ledp;
/*    */   }
/*    */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\MentesAlasFacade.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */