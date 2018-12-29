/*    */ package org.mentesalas.model.entities;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.List;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.NamedQuery;
/*    */ import javax.persistence.OneToMany;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Entity
/*    */ @Table(name="roles")
/*    */ @NamedQuery(name="Role.findAll", query="SELECT r FROM Role r")
/*    */ public class Role
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   @Id
/*    */   @Column(name="role_id")
/*    */   private int roleId;
/*    */   @Column(name="role_name")
/*    */   private String roleName;
/*    */   @OneToMany(mappedBy="role")
/*    */   private List<RoleFunction> roleFunctions;
/*    */   @OneToMany(mappedBy="role")
/*    */   private List<UserRole> userRoles;
/*    */   
/*    */   public int getRoleId()
/*    */   {
/* 37 */     return this.roleId;
/*    */   }
/*    */   
/*    */   public void setRoleId(int roleId) {
/* 41 */     this.roleId = roleId;
/*    */   }
/*    */   
/*    */   public String getRoleName() {
/* 45 */     return this.roleName;
/*    */   }
/*    */   
/*    */   public void setRoleName(String roleName) {
/* 49 */     this.roleName = roleName;
/*    */   }
/*    */   
/*    */   public List<RoleFunction> getRoleFunctions() {
/* 53 */     return this.roleFunctions;
/*    */   }
/*    */   
/*    */   public void setRoleFunctions(List<RoleFunction> roleFunctions) {
/* 57 */     this.roleFunctions = roleFunctions;
/*    */   }
/*    */   
/*    */   public RoleFunction addRoleFunction(RoleFunction roleFunction) {
/* 61 */     getRoleFunctions().add(roleFunction);
/* 62 */     roleFunction.setRole(this);
/*    */     
/* 64 */     return roleFunction;
/*    */   }
/*    */   
/*    */   public RoleFunction removeRoleFunction(RoleFunction roleFunction) {
/* 68 */     getRoleFunctions().remove(roleFunction);
/* 69 */     roleFunction.setRole(null);
/*    */     
/* 71 */     return roleFunction;
/*    */   }
/*    */   
/*    */   public List<UserRole> getUserRoles() {
/* 75 */     return this.userRoles;
/*    */   }
/*    */   
/*    */   public void setUserRoles(List<UserRole> userRoles) {
/* 79 */     this.userRoles = userRoles;
/*    */   }
/*    */   
/*    */   public UserRole addUserRole(UserRole userRole) {
/* 83 */     getUserRoles().add(userRole);
/* 84 */     userRole.setRole(this);
/*    */     
/* 86 */     return userRole;
/*    */   }
/*    */   
/*    */   public UserRole removeUserRole(UserRole userRole) {
/* 90 */     getUserRoles().remove(userRole);
/* 91 */     userRole.setRole(null);
/*    */     
/* 93 */     return userRole;
/*    */   }
/*    */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\Role.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */