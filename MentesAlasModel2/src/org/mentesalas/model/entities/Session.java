/*    */ package org.mentesalas.model.entities;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.JoinColumn;
/*    */ import javax.persistence.ManyToOne;
/*    */ import javax.persistence.NamedQuery;
/*    */ import javax.persistence.Temporal;
/*    */ import javax.persistence.TemporalType;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Entity
/*    */ @NamedQuery(name="Session.findAll", query="SELECT s FROM Session s")
/*    */ public class Session
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   @Id
/*    */   @Column(name="sess_id")
/*    */   private int sessId;
/*    */   @Temporal(TemporalType.DATE)
/*    */   @Column(name="sess_end")
/*    */   private Date sessEnd;
/*    */   @Temporal(TemporalType.DATE)
/*    */   @Column(name="sess_ini")
/*    */   private Date sessIni;
/*    */   @Column(name="sess_sess_id")
/*    */   private String sessSessId;
/*    */   @ManyToOne
/*    */   @JoinColumn(name="user_id")
/*    */   private User user;
/*    */   
/*    */   public int getSessId()
/*    */   {
/* 41 */     return this.sessId;
/*    */   }
/*    */   
/*    */   public void setSessId(int sessId) {
/* 45 */     this.sessId = sessId;
/*    */   }
/*    */   
/*    */   public Date getSessEnd() {
/* 49 */     return this.sessEnd;
/*    */   }
/*    */   
/*    */   public void setSessEnd(Date sessEnd) {
/* 53 */     this.sessEnd = sessEnd;
/*    */   }
/*    */   
/*    */   public Date getSessIni() {
/* 57 */     return this.sessIni;
/*    */   }
/*    */   
/*    */   public void setSessIni(Date sessIni) {
/* 61 */     this.sessIni = sessIni;
/*    */   }
/*    */   
/*    */   public String getSessSessId() {
/* 65 */     return this.sessSessId;
/*    */   }
/*    */   
/*    */   public void setSessSessId(String sessSessId) {
/* 69 */     this.sessSessId = sessSessId;
/*    */   }
/*    */   
/*    */   public User getUser() {
/* 73 */     return this.user;
/*    */   }
/*    */   
/*    */   public void setUser(User user) {
/* 77 */     this.user = user;
/*    */   }
/*    */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\Session.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */