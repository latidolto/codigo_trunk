/*     */ package org.mentesalas.model.entities;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.JoinColumn;
/*     */ import javax.persistence.ManyToOne;
/*     */ import javax.persistence.NamedQuery;
/*     */ import javax.persistence.OneToMany;
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
/*     */ @Entity
/*     */ @NamedQuery(name="Programa.findAll", query="SELECT p FROM Programa p")
/*     */ public class Programa
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="PRO_ID")
/*     */   private int proId;
/*     */   @Column(name="PRO_DESCRIPCION")
/*     */   private String proDescripcion;
/*     */   @Column(name="PRO_ESTATUS")
/*     */   private int proEstatus;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="PRO_FEC_REG")
/*     */   private Date proFecReg;
/*     */   @Column(name="PRO_NOMBRE")
/*     */   private String proNombre;
/*     */   @OneToMany(mappedBy="programa")
/*     */   private List<Evaluacion> evaluacions;
/*     */   @ManyToOne
/*     */   @JoinColumn(name="PRO_USU_ID_REG")
/*     */   private User user;
/*     */   @OneToMany(mappedBy="programa")
/*     */   private List<ProgramaPregunta> programaPreguntas;
/*     */   
/*     */   public int getProId()
/*     */   {
/*  53 */     return this.proId;
/*     */   }
/*     */   
/*     */   public void setProId(int proId) {
/*  57 */     this.proId = proId;
/*     */   }
/*     */   
/*     */   public String getProDescripcion() {
/*  61 */     return this.proDescripcion;
/*     */   }
/*     */   
/*     */   public void setProDescripcion(String proDescripcion) {
/*  65 */     this.proDescripcion = proDescripcion;
/*     */   }
/*     */   
/*     */   public int getProEstatus() {
/*  69 */     return this.proEstatus;
/*     */   }
/*     */   
/*     */   public void setProEstatus(int proEstatus) {
/*  73 */     this.proEstatus = proEstatus;
/*     */   }
/*     */   
/*     */   public Date getProFecReg() {
/*  77 */     return this.proFecReg;
/*     */   }
/*     */   
/*     */   public void setProFecReg(Date proFecReg) {
/*  81 */     this.proFecReg = proFecReg;
/*     */   }
/*     */   
/*     */   public String getProNombre() {
/*  85 */     return this.proNombre;
/*     */   }
/*     */   
/*     */   public void setProNombre(String proNombre) {
/*  89 */     this.proNombre = proNombre;
/*     */   }
/*     */   
/*     */   public List<Evaluacion> getEvaluacions() {
/*  93 */     return this.evaluacions;
/*     */   }
/*     */   
/*     */   public void setEvaluacions(List<Evaluacion> evaluacions) {
/*  97 */     this.evaluacions = evaluacions;
/*     */   }
/*     */   
/*     */   public Evaluacion addEvaluacion(Evaluacion evaluacion) {
/* 101 */     getEvaluacions().add(evaluacion);
/* 102 */     evaluacion.setPrograma(this);
/*     */     
/* 104 */     return evaluacion;
/*     */   }
/*     */   
/*     */   public Evaluacion removeEvaluacion(Evaluacion evaluacion) {
/* 108 */     getEvaluacions().remove(evaluacion);
/* 109 */     evaluacion.setPrograma(null);
/*     */     
/* 111 */     return evaluacion;
/*     */   }
/*     */   
/*     */   public User getUser() {
/* 115 */     return this.user;
/*     */   }
/*     */   
/*     */   public void setUser(User user) {
/* 119 */     this.user = user;
/*     */   }
/*     */   
/*     */   public List<ProgramaPregunta> getProgramaPreguntas() {
/* 123 */     return this.programaPreguntas;
/*     */   }
/*     */   
/*     */   public void setProgramaPreguntas(List<ProgramaPregunta> programaPreguntas) {
/* 127 */     this.programaPreguntas = programaPreguntas;
/*     */   }
/*     */   
/*     */   public ProgramaPregunta addProgramaPregunta(ProgramaPregunta programaPregunta) {
/* 131 */     getProgramaPreguntas().add(programaPregunta);
/* 132 */     programaPregunta.setPrograma(this);
/*     */     
/* 134 */     return programaPregunta;
/*     */   }
/*     */   
/*     */   public ProgramaPregunta removeProgramaPregunta(ProgramaPregunta programaPregunta) {
/* 138 */     getProgramaPreguntas().remove(programaPregunta);
/* 139 */     programaPregunta.setPrograma(null);
/*     */     
/* 141 */     return programaPregunta;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\Programa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */