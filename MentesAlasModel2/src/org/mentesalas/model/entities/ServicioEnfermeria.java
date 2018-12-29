/*    */ package org.mentesalas.model.entities;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.NamedQuery;
/*    */ import javax.persistence.Table;
/*    */ import javax.persistence.Temporal;
/*    */ import javax.persistence.TemporalType;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Entity
/*    */ @Table(name="servicio_enfermeria")
/*    */ @NamedQuery(name="ServicioEnfermeria.findAll", query="SELECT s FROM ServicioEnfermeria s")
/*    */ public class ServicioEnfermeria
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   @Id
/*    */   @Column(name="SER_ID")
/*    */   private int serId;
/*    */   @Column(name="INT_ID")
/*    */   private int intId;
/*    */   @Temporal(TemporalType.TIMESTAMP)
/*    */   @Column(name="SER_FECHA")
/*    */   private Date serFecha;
/*    */   @Temporal(TemporalType.TIMESTAMP)
/*    */   @Column(name="SER_FECHA_PROXREV")
/*    */   private Date serFechaProxrev;
/*    */   @Column(name="SER_ID_SERVICIO")
/*    */   private String serIdServicio;
/*    */   
/*    */   public int getSerId()
/*    */   {
/* 40 */     return this.serId;
/*    */   }
/*    */   
/*    */   public void setSerId(int serId) {
/* 44 */     this.serId = serId;
/*    */   }
/*    */   
/*    */   public int getIntId() {
/* 48 */     return this.intId;
/*    */   }
/*    */   
/*    */   public void setIntId(int intId) {
/* 52 */     this.intId = intId;
/*    */   }
/*    */   
/*    */   public Date getSerFecha() {
/* 56 */     return this.serFecha;
/*    */   }
/*    */   
/*    */   public void setSerFecha(Date serFecha) {
/* 60 */     this.serFecha = serFecha;
/*    */   }
/*    */   
/*    */   public Date getSerFechaProxrev() {
/* 64 */     return this.serFechaProxrev;
/*    */   }
/*    */   
/*    */   public void setSerFechaProxrev(Date serFechaProxrev) {
/* 68 */     this.serFechaProxrev = serFechaProxrev;
/*    */   }
/*    */   
/*    */   public String getSerIdServicio() {
/* 72 */     return this.serIdServicio;
/*    */   }
/*    */   
/*    */   public void setSerIdServicio(String serIdServicio) {
/* 76 */     this.serIdServicio = serIdServicio;
/*    */   }
/*    */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\ServicioEnfermeria.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */