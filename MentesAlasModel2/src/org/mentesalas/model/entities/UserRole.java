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
/*    */ @Table(name="user_role")
/*    */ @NamedQuery(name="UserRole.findAll", query="SELECT u FROM UserRole u")
/*    */ public class UserRole
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   @Id
/*    */   @Column(name="urol_id")
/*    */   private int urolId;
/*    */   @ManyToOne
/*    */   @JoinColumn(name="role_id")
/*    */   private Role role;
/*    */   @ManyToOne
/*    */   @JoinColumn(name="user_id")
/*    */   private User user;
/*    */   
/*    */   public int getUrolId()
/*    */   {
/* 35 */     return this.urolId;
/*    */   }
/*    */   
/*    */   public void setUrolId(int urolId) {
/* 39 */     this.urolId = urolId;
/*    */   }
/*    */   
/*    */   public Role getRole() {
/* 43 */     return this.role;
/*    */   }
/*    */   
/*    */   public void setRole(Role role) {
/* 47 */     this.role = role;
/*    */   }
/*    */   
/*    */   public User getUser() {
/* 51 */     return this.user;
/*    */   }
/*    */   
/*    */   public void setUser(User user) {
/* 55 */     this.user = user;
/*    */   }
/*    */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\UserRole.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */