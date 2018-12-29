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
/*    */ @Table(name="role_function")
/*    */ @NamedQuery(name="RoleFunction.findAll", query="SELECT r FROM RoleFunction r")
/*    */ public class RoleFunction
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   @Id
/*    */   @Column(name="rfun_id")
/*    */   private int rfunId;
/*    */   @Column(name="rfun_name")
/*    */   private String rfunName;
/*    */   @Column(name="rfun_servlet")
/*    */   private String rfunServlet;
/*    */   @Column(name="rfun_target")
/*    */   private String rfunTarget;
/*    */   @ManyToOne
/*    */   @JoinColumn(name="role_id")
/*    */   private Role role;
/*    */   
/*    */   public int getRfunId()
/*    */   {
/* 39 */     return this.rfunId;
/*    */   }
/*    */   
/*    */   public void setRfunId(int rfunId) {
/* 43 */     this.rfunId = rfunId;
/*    */   }
/*    */   
/*    */   public String getRfunName() {
/* 47 */     return this.rfunName;
/*    */   }
/*    */   
/*    */   public void setRfunName(String rfunName) {
/* 51 */     this.rfunName = rfunName;
/*    */   }
/*    */   
/*    */   public String getRfunServlet() {
/* 55 */     return this.rfunServlet;
/*    */   }
/*    */   
/*    */   public void setRfunServlet(String rfunServlet) {
/* 59 */     this.rfunServlet = rfunServlet;
/*    */   }
/*    */   
/*    */   public String getRfunTarget() {
/* 63 */     return this.rfunTarget;
/*    */   }
/*    */   
/*    */   public void setRfunTarget(String rfunTarget) {
/* 67 */     this.rfunTarget = rfunTarget;
/*    */   }
/*    */   
/*    */   public Role getRole() {
/* 71 */     return this.role;
/*    */   }
/*    */   
/*    */   public void setRole(Role role) {
/* 75 */     this.role = role;
/*    */   }
/*    */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\RoleFunction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */