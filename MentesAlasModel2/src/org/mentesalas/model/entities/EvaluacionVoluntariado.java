/*     */ package org.mentesalas.model.entities;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.NamedQuery;
/*     */ import javax.persistence.Table;
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
/*     */ @Entity
/*     */ @Table(name="evaluacion_voluntariado")
/*     */ @NamedQuery(name="EvaluacionVoluntariado.findAll", query="SELECT e FROM EvaluacionVoluntariado e")
/*     */ public class EvaluacionVoluntariado
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="EVO_ID")
/*     */   private int evoId;
/*     */   @Column(name="EVO_1")
/*     */   private int evo1;
/*     */   @Column(name="EVO_2")
/*     */   private int evo2;
/*     */   @Column(name="EVO_3")
/*     */   private int evo3;
/*     */   @Column(name="EVO_4")
/*     */   private int evo4;
/*     */   @Column(name="EVO_5")
/*     */   private int evo5;
/*     */   @Column(name="EVO_6")
/*     */   private int evo6;
/*     */   @Column(name="EVO_7")
/*     */   private int evo7;
/*     */   @Column(name="EVO_AUTO")
/*     */   private String evoAuto;
/*     */   @Column(name="EVO_ESTATUS")
/*     */   private int evoEstatus;
/*     */   @Column(name="EVO_EVALUADO")
/*     */   private String evoEvaluado;
/*     */   @Column(name="EVO_EVALUADOR")
/*     */   private String evoEvaluador;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="EVO_FECHA")
/*     */   private Date evoFecha;
/*     */   @Column(name="EVO_SUGERENCIAS")
/*     */   private String evoSugerencias;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="FEC_MOD")
/*     */   private Date fecMod;
/*     */   @Column(name="USU_CVE")
/*     */   private String usuCve;
/*     */   
/*     */   public int getEvoId()
/*     */   {
/*  73 */     return this.evoId;
/*     */   }
/*     */   
/*     */   public void setEvoId(int evoId) {
/*  77 */     this.evoId = evoId;
/*     */   }
/*     */   
/*     */   public int getEvo1() {
/*  81 */     return this.evo1;
/*     */   }
/*     */   
/*     */   public void setEvo1(int evo1) {
/*  85 */     this.evo1 = evo1;
/*     */   }
/*     */   
/*     */   public int getEvo2() {
/*  89 */     return this.evo2;
/*     */   }
/*     */   
/*     */   public void setEvo2(int evo2) {
/*  93 */     this.evo2 = evo2;
/*     */   }
/*     */   
/*     */   public int getEvo3() {
/*  97 */     return this.evo3;
/*     */   }
/*     */   
/*     */   public void setEvo3(int evo3) {
/* 101 */     this.evo3 = evo3;
/*     */   }
/*     */   
/*     */   public int getEvo4() {
/* 105 */     return this.evo4;
/*     */   }
/*     */   
/*     */   public void setEvo4(int evo4) {
/* 109 */     this.evo4 = evo4;
/*     */   }
/*     */   
/*     */   public int getEvo5() {
/* 113 */     return this.evo5;
/*     */   }
/*     */   
/*     */   public void setEvo5(int evo5) {
/* 117 */     this.evo5 = evo5;
/*     */   }
/*     */   
/*     */   public int getEvo6() {
/* 121 */     return this.evo6;
/*     */   }
/*     */   
/*     */   public void setEvo6(int evo6) {
/* 125 */     this.evo6 = evo6;
/*     */   }
/*     */   
/*     */   public int getEvo7() {
/* 129 */     return this.evo7;
/*     */   }
/*     */   
/*     */   public void setEvo7(int evo7) {
/* 133 */     this.evo7 = evo7;
/*     */   }
/*     */   
/*     */   public String getEvoAuto() {
/* 137 */     return this.evoAuto;
/*     */   }
/*     */   
/*     */   public void setEvoAuto(String evoAuto) {
/* 141 */     this.evoAuto = evoAuto;
/*     */   }
/*     */   
/*     */   public int getEvoEstatus() {
/* 145 */     return this.evoEstatus;
/*     */   }
/*     */   
/*     */   public void setEvoEstatus(int evoEstatus) {
/* 149 */     this.evoEstatus = evoEstatus;
/*     */   }
/*     */   
/*     */   public String getEvoEvaluado() {
/* 153 */     return this.evoEvaluado;
/*     */   }
/*     */   
/*     */   public void setEvoEvaluado(String evoEvaluado) {
/* 157 */     this.evoEvaluado = evoEvaluado;
/*     */   }
/*     */   
/*     */   public String getEvoEvaluador() {
/* 161 */     return this.evoEvaluador;
/*     */   }
/*     */   
/*     */   public void setEvoEvaluador(String evoEvaluador) {
/* 165 */     this.evoEvaluador = evoEvaluador;
/*     */   }
/*     */   
/*     */   public Date getEvoFecha() {
/* 169 */     return this.evoFecha;
/*     */   }
/*     */   
/*     */   public void setEvoFecha(Date evoFecha) {
/* 173 */     this.evoFecha = evoFecha;
/*     */   }
/*     */   
/*     */   public String getEvoSugerencias() {
/* 177 */     return this.evoSugerencias;
/*     */   }
/*     */   
/*     */   public void setEvoSugerencias(String evoSugerencias) {
/* 181 */     this.evoSugerencias = evoSugerencias;
/*     */   }
/*     */   
/*     */   public Date getFecMod() {
/* 185 */     return this.fecMod;
/*     */   }
/*     */   
/*     */   public void setFecMod(Date fecMod) {
/* 189 */     this.fecMod = fecMod;
/*     */   }
/*     */   
/*     */   public String getUsuCve() {
/* 193 */     return this.usuCve;
/*     */   }
/*     */   
/*     */   public void setUsuCve(String usuCve) {
/* 197 */     this.usuCve = usuCve;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\EvaluacionVoluntariado.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */