/*     */ package org.mentesalas.model.entities;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.NamedQueries;
/*     */ import javax.persistence.Temporal;
/*     */ import javax.persistence.TemporalType;
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
/*     */ 
/*     */ @Entity
/*     */ @NamedQueries({@javax.persistence.NamedQuery(name="Multivaluada.findAll", query="SELECT m FROM Multivaluada m"), @javax.persistence.NamedQuery(name="Multivaluada.findByCommonKey", query="SELECT m FROM Multivaluada m Where m.mulClave = :p_mulClave")})
/*     */ public class Multivaluada
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="MUL_ID")
/*     */   private int mulId;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="FEC_MOD")
/*     */   private Date fecMod;
/*     */   @Column(name="MUL_CLAVE")
/*     */   private String mulClave;
/*     */   @Column(name="MUL_DESCRIPCION")
/*     */   private String mulDescripcion;
/*     */   @Column(name="MUL_ESTATUS")
/*     */   private int mulEstatus;
/*     */   @Column(name="MUL_VALOR")
/*     */   private String mulValor;
/*     */   @Column(name="USU_CVE")
/*     */   private String usuCve;
/*     */   
/*     */   public int getMulId()
/*     */   {
/*  54 */     return this.mulId;
/*     */   }
/*     */   
/*     */   public void setMulId(int mulId) {
/*  58 */     this.mulId = mulId;
/*     */   }
/*     */   
/*     */   public Date getFecMod() {
/*  62 */     return this.fecMod;
/*     */   }
/*     */   
/*     */   public void setFecMod(Date fecMod) {
/*  66 */     this.fecMod = fecMod;
/*     */   }
/*     */   
/*     */   public String getMulClave() {
/*  70 */     return this.mulClave;
/*     */   }
/*     */   
/*     */   public void setMulClave(String mulClave) {
/*  74 */     this.mulClave = mulClave;
/*     */   }
/*     */   
/*     */   public String getMulDescripcion() {
/*  78 */     return this.mulDescripcion;
/*     */   }
/*     */   
/*     */   public void setMulDescripcion(String mulDescripcion) {
/*  82 */     this.mulDescripcion = mulDescripcion;
/*     */   }
/*     */   
/*     */   public int getMulEstatus() {
/*  86 */     return this.mulEstatus;
/*     */   }
/*     */   
/*     */   public void setMulEstatus(int mulEstatus) {
/*  90 */     this.mulEstatus = mulEstatus;
/*     */   }
/*     */   
/*     */   public String getMulValor() {
/*  94 */     return this.mulValor;
/*     */   }
/*     */   
/*     */   public void setMulValor(String mulValor) {
/*  98 */     this.mulValor = mulValor;
/*     */   }
/*     */   
/*     */   public String getUsuCve() {
/* 102 */     return this.usuCve;
/*     */   }
/*     */   
/*     */   public void setUsuCve(String usuCve) {
/* 106 */     this.usuCve = usuCve;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\Multivaluada.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */