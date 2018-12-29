/*     */ package org.mentesalas.model.entities;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.List;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.NamedQuery;
/*     */ import javax.persistence.OneToMany;
/*     */ import javax.persistence.Table;
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
/*     */ @Entity
/*     */ @Table(name="users")
/*     */ @NamedQuery(name="User.findAll", query="SELECT u FROM User u")
/*     */ public class User
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="user_id")
/*     */   private int userId;
/*     */   @Column(name="user_active")
/*     */   private int userActive;
/*     */   @Column(name="user_email")
/*     */   private String userEmail;
/*     */   @Column(name="user_login")
/*     */   private String userLogin;
/*     */   @Column(name="user_name")
/*     */   private String userName;
/*     */   @Column(name="user_passwd")
/*     */   private String userPasswd;
/*     */   @Column(name="user_type")
/*     */   private int userType;
/*     */   @OneToMany(mappedBy="user")
/*     */   private List<Evaluacion> evaluacions;
/*     */   @OneToMany(mappedBy="user")
/*     */   private List<Programa> programas;
/*     */   @OneToMany(mappedBy="user")
/*     */   private List<Session> sessions;
/*     */   @OneToMany(mappedBy="user")
/*     */   private List<UserRole> userRoles;
/*     */   
/*     */   public int getUserId()
/*     */   {
/*  61 */     return this.userId;
/*     */   }
/*     */   
/*     */   public void setUserId(int userId) {
/*  65 */     this.userId = userId;
/*     */   }
/*     */   
/*     */   public int getUserActive() {
/*  69 */     return this.userActive;
/*     */   }
/*     */   
/*     */   public void setUserActive(int userActive) {
/*  73 */     this.userActive = userActive;
/*     */   }
/*     */   
/*     */   public String getUserEmail() {
/*  77 */     return this.userEmail;
/*     */   }
/*     */   
/*     */   public void setUserEmail(String userEmail) {
/*  81 */     this.userEmail = userEmail;
/*     */   }
/*     */   
/*     */   public String getUserLogin() {
/*  85 */     return this.userLogin;
/*     */   }
/*     */   
/*     */   public void setUserLogin(String userLogin) {
/*  89 */     this.userLogin = userLogin;
/*     */   }
/*     */   
/*     */   public String getUserName() {
/*  93 */     return this.userName;
/*     */   }
/*     */   
/*     */   public void setUserName(String userName) {
/*  97 */     this.userName = userName;
/*     */   }
/*     */   
/*     */   public String getUserPasswd() {
/* 101 */     return this.userPasswd;
/*     */   }
/*     */   
/*     */   public void setUserPasswd(String userPasswd) {
/* 105 */     this.userPasswd = userPasswd;
/*     */   }
/*     */   
/*     */   public int getUserType() {
/* 109 */     return this.userType;
/*     */   }
/*     */   
/*     */   public void setUserType(int userType) {
/* 113 */     this.userType = userType;
/*     */   }
/*     */   
/*     */   public List<Evaluacion> getEvaluacions() {
/* 117 */     return this.evaluacions;
/*     */   }
/*     */   
/*     */   public void setEvaluacions(List<Evaluacion> evaluacions) {
/* 121 */     this.evaluacions = evaluacions;
/*     */   }
/*     */   
/*     */   public Evaluacion addEvaluacion(Evaluacion evaluacion) {
/* 125 */     getEvaluacions().add(evaluacion);
/* 126 */     evaluacion.setUser(this);
/*     */     
/* 128 */     return evaluacion;
/*     */   }
/*     */   
/*     */   public Evaluacion removeEvaluacion(Evaluacion evaluacion) {
/* 132 */     getEvaluacions().remove(evaluacion);
/* 133 */     evaluacion.setUser(null);
/*     */     
/* 135 */     return evaluacion;
/*     */   }
/*     */   
/*     */   public List<Programa> getProgramas() {
/* 139 */     return this.programas;
/*     */   }
/*     */   
/*     */   public void setProgramas(List<Programa> programas) {
/* 143 */     this.programas = programas;
/*     */   }
/*     */   
/*     */   public Programa addPrograma(Programa programa) {
/* 147 */     getProgramas().add(programa);
/* 148 */     programa.setUser(this);
/*     */     
/* 150 */     return programa;
/*     */   }
/*     */   
/*     */   public Programa removePrograma(Programa programa) {
/* 154 */     getProgramas().remove(programa);
/* 155 */     programa.setUser(null);
/*     */     
/* 157 */     return programa;
/*     */   }
/*     */   
/*     */   public List<Session> getSessions() {
/* 161 */     return this.sessions;
/*     */   }
/*     */   
/*     */   public void setSessions(List<Session> sessions) {
/* 165 */     this.sessions = sessions;
/*     */   }
/*     */   
/*     */   public Session addSession(Session session) {
/* 169 */     getSessions().add(session);
/* 170 */     session.setUser(this);
/*     */     
/* 172 */     return session;
/*     */   }
/*     */   
/*     */   public Session removeSession(Session session) {
/* 176 */     getSessions().remove(session);
/* 177 */     session.setUser(null);
/*     */     
/* 179 */     return session;
/*     */   }
/*     */   
/*     */   public List<UserRole> getUserRoles() {
/* 183 */     return this.userRoles;
/*     */   }
/*     */   
/*     */   public void setUserRoles(List<UserRole> userRoles) {
/* 187 */     this.userRoles = userRoles;
/*     */   }
/*     */   
/*     */   public UserRole addUserRole(UserRole userRole) {
/* 191 */     getUserRoles().add(userRole);
/* 192 */     userRole.setUser(this);
/*     */     
/* 194 */     return userRole;
/*     */   }
/*     */   
/*     */   public UserRole removeUserRole(UserRole userRole) {
/* 198 */     getUserRoles().remove(userRole);
/* 199 */     userRole.setUser(null);
/*     */     
/* 201 */     return userRole;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\User.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */