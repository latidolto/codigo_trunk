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
/*    */ 
/*    */ 
/*    */ @Entity
/*    */ @Table(name="nombre_de_la_tabla")
/*    */ @NamedQuery(name="NombreDeLaTabla.findAll", query="SELECT n FROM NombreDeLaTabla n")
/*    */ public class NombreDeLaTabla
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   @Id
/*    */   @Column(name="ABS_ID")
/*    */   private int absId;
/*    */   @Column(name="ABS_ESTATUS")
/*    */   private int absEstatus;
/*    */   @Temporal(TemporalType.DATE)
/*    */   @Column(name="ABS_FECHA")
/*    */   private Date absFecha;
/*    */   @Column(name="ABS_MONTO")
/*    */   private double absMonto;
/*    */   @Column(name="ABS_NOMBRE")
/*    */   private String absNombre;
/*    */   @Temporal(TemporalType.DATE)
/*    */   @Column(name="FEC_MOD")
/*    */   private Date fecMod;
/*    */   @Column(name="USU_CVE")
/*    */   private String usuCve;
/*    */   
/*    */   public int getAbsId()
/*    */   {
/* 46 */     return this.absId;
/*    */   }
/*    */   
/*    */   public void setAbsId(int absId) {
/* 50 */     this.absId = absId;
/*    */   }
/*    */   
/*    */   public int getAbsEstatus() {
/* 54 */     return this.absEstatus;
/*    */   }
/*    */   
/*    */   public void setAbsEstatus(int absEstatus) {
/* 58 */     this.absEstatus = absEstatus;
/*    */   }
/*    */   
/*    */   public Date getAbsFecha() {
/* 62 */     return this.absFecha;
/*    */   }
/*    */   
/*    */   public void setAbsFecha(Date absFecha) {
/* 66 */     this.absFecha = absFecha;
/*    */   }
/*    */   
/*    */   public double getAbsMonto() {
/* 70 */     return this.absMonto;
/*    */   }
/*    */   
/*    */   public void setAbsMonto(double absMonto) {
/* 74 */     this.absMonto = absMonto;
/*    */   }
/*    */   
/*    */   public String getAbsNombre() {
/* 78 */     return this.absNombre;
/*    */   }
/*    */   
/*    */   public void setAbsNombre(String absNombre) {
/* 82 */     this.absNombre = absNombre;
/*    */   }
/*    */   
/*    */   public Date getFecMod() {
/* 86 */     return this.fecMod;
/*    */   }
/*    */   
/*    */   public void setFecMod(Date fecMod) {
/* 90 */     this.fecMod = fecMod;
/*    */   }
/*    */   
/*    */   public String getUsuCve() {
/* 94 */     return this.usuCve;
/*    */   }
/*    */   
/*    */   public void setUsuCve(String usuCve) {
/* 98 */     this.usuCve = usuCve;
/*    */   }
/*    */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\NombreDeLaTabla.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */