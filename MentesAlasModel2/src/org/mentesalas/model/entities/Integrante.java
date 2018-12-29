/*     */ package org.mentesalas.model.entities;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.Lob;
/*     */ import javax.persistence.NamedQuery;
/*     */ import javax.persistence.OneToMany;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Entity
/*     */ @Table(name="integrante")
/*     */ @NamedQuery(name="Integrante.findAll", query="SELECT i FROM Integrante i")
/*     */ public class Integrante
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="INT_ID")
/*     */   private int intId;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="FEC_MOD")
/*     */   private Date fecMod;
/*     */   @Column(name="INT_APE_MAT")
/*     */   private String intApeMat;
/*     */   @Column(name="INT_APE_PAT")
/*     */   private String intApePat;
/*     */   @Column(name="INT_ATE_MED")
/*     */   private int intAteMed;
/*     */   @Column(name="INT_ATR_FAM")
/*     */   private String intAtrFam;
/*     */   @Column(name="INT_CALLE")
/*     */   private String intCalle;
/*     */   @Column(name="INT_CALLE_PAL")
/*     */   private String intCallePal;
/*     */   @Column(name="INT_CALLE_TRA")
/*     */   private String intCalleTra;
/*     */   @Column(name="INT_CAR_GEN_CON")
/*     */   private String intCarGenCon;
/*     */   @Column(name="INT_CIUDAD")
/*     */   private String intCiudad;
/*     */   @Column(name="INT_COLONIA")
/*     */   private String intColonia;
/*     */   @Column(name="INT_CURP")
/*     */   private String intCurp;
/*     */   @Column(name="INT_DIAGNOSTICO")
/*     */   private String intDiagnostico;
/*     */   @Column(name="INT_ESC_MAX")
/*     */   private int intEscMax;
/*     */   @Column(name="INT_EST_CIV")
/*     */   private int intEstCiv;
/*     */   @Column(name="INT_ESTATUS")
/*     */   private int intEstatus;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="INT_FEC_NAC")
/*     */   private Date intFecNac;
/*     */   @Lob
/*     */   @Column(name="INT_FOTO")
/*     */   private byte[] intFoto;
/*     */   @Column(name="INT_LUG_FAM")
/*     */   private int intLugFam;
/*     */   @Column(name="INT_MEDICAMENTO")
/*     */   private String intMedicamento;
/*     */   @Column(name="INT_NOM")
/*     */   private String intNom;
/*     */   @Column(name="INT_PRE_PAD")
/*     */   private String intPrePad;
/*     */   @Column(name="INT_REQ_MED")
/*     */   private int intReqMed;
/*     */   @Column(name="INT_RFC")
/*     */   private String intRfc;
/*     */   @Column(name="INT_TEL_CEL")
/*     */   private String intTelCel;
/*     */   @Column(name="INT_TEL_FAM")
/*     */   private String intTelFam;
/*     */   @Column(name="INT_TELEFONO")
/*     */   private String intTelefono;
/*     */   @Column(name="INT_TIP_SAN")
/*     */   private int intTipSan;
/*     */   @Column(name="INT_TIP_SEG_SOC")
/*     */   private int intTipSegSoc;
/*     */   @Column(name="USU_CVE")
/*     */   private String usuCve;
/*     */   @OneToMany(mappedBy="integrante")
/*     */   private List<Agenda> agendas;
/*     */   @OneToMany(mappedBy="integrante")
/*     */   private List<Asistencia> asistencias;
/*     */   @OneToMany(mappedBy="integrante")
/*     */   private List<Entrevista> entrevistas;
/*     */   @OneToMany(mappedBy="integrante")
/*     */   private List<Evaluacion> evaluacions;
/*     */   @OneToMany(mappedBy="integrante")
/*     */   private List<Familiar> familiars;
/*     */   
/*     */   public int getIntId()
/*     */   {
/* 140 */     return this.intId;
/*     */   }
/*     */   
/*     */   public void setIntId(int intId) {
/* 144 */     this.intId = intId;
/*     */   }
/*     */   
/*     */   public Date getFecMod() {
/* 148 */     return this.fecMod;
/*     */   }
/*     */   
/*     */   public void setFecMod(Date fecMod) {
/* 152 */     this.fecMod = fecMod;
/*     */   }
/*     */   
/*     */   public String getIntApeMat() {
/* 156 */     return this.intApeMat;
/*     */   }
/*     */   
/*     */   public void setIntApeMat(String intApeMat) {
/* 160 */     this.intApeMat = intApeMat;
/*     */   }
/*     */   
/*     */   public String getIntApePat() {
/* 164 */     return this.intApePat;
/*     */   }
/*     */   
/*     */   public void setIntApePat(String intApePat) {
/* 168 */     this.intApePat = intApePat;
/*     */   }
/*     */   
/*     */   public int getIntAteMed() {
/* 172 */     return this.intAteMed;
/*     */   }
/*     */   
/*     */   public void setIntAteMed(int intAteMed) {
/* 176 */     this.intAteMed = intAteMed;
/*     */   }
/*     */   
/*     */   public String getIntAtrFam() {
/* 180 */     return this.intAtrFam;
/*     */   }
/*     */   
/*     */   public void setIntAtrFam(String intAtrFam) {
/* 184 */     this.intAtrFam = intAtrFam;
/*     */   }
/*     */   
/*     */   public String getIntCalle() {
/* 188 */     return this.intCalle;
/*     */   }
/*     */   
/*     */   public void setIntCalle(String intCalle) {
/* 192 */     this.intCalle = intCalle;
/*     */   }
/*     */   
/*     */   public String getIntCallePal() {
/* 196 */     return this.intCallePal;
/*     */   }
/*     */   
/*     */   public void setIntCallePal(String intCallePal) {
/* 200 */     this.intCallePal = intCallePal;
/*     */   }
/*     */   
/*     */   public String getIntCalleTra() {
/* 204 */     return this.intCalleTra;
/*     */   }
/*     */   
/*     */   public void setIntCalleTra(String intCalleTra) {
/* 208 */     this.intCalleTra = intCalleTra;
/*     */   }
/*     */   
/*     */   public String getIntCarGenCon() {
/* 212 */     return this.intCarGenCon;
/*     */   }
/*     */   
/*     */   public void setIntCarGenCon(String intCarGenCon) {
/* 216 */     this.intCarGenCon = intCarGenCon;
/*     */   }
/*     */   
/*     */   public String getIntCiudad() {
/* 220 */     return this.intCiudad;
/*     */   }
/*     */   
/*     */   public void setIntCiudad(String intCiudad) {
/* 224 */     this.intCiudad = intCiudad;
/*     */   }
/*     */   
/*     */   public String getIntColonia() {
/* 228 */     return this.intColonia;
/*     */   }
/*     */   
/*     */   public void setIntColonia(String intColonia) {
/* 232 */     this.intColonia = intColonia;
/*     */   }
/*     */   
/*     */   public String getIntCurp() {
/* 236 */     return this.intCurp;
/*     */   }
/*     */   
/*     */   public void setIntCurp(String intCurp) {
/* 240 */     this.intCurp = intCurp;
/*     */   }
/*     */   
/*     */   public String getIntDiagnostico() {
/* 244 */     return this.intDiagnostico;
/*     */   }
/*     */   
/*     */   public void setIntDiagnostico(String intDiagnostico) {
/* 248 */     this.intDiagnostico = intDiagnostico;
/*     */   }
/*     */   
/*     */   public int getIntEscMax() {
/* 252 */     return this.intEscMax;
/*     */   }
/*     */   
/*     */   public void setIntEscMax(int intEscMax) {
/* 256 */     this.intEscMax = intEscMax;
/*     */   }
/*     */   
/*     */   public int getIntEstCiv() {
/* 260 */     return this.intEstCiv;
/*     */   }
/*     */   
/*     */   public void setIntEstCiv(int intEstCiv) {
/* 264 */     this.intEstCiv = intEstCiv;
/*     */   }
/*     */   
/*     */   public int getIntEstatus() {
/* 268 */     return this.intEstatus;
/*     */   }
/*     */   
/*     */   public void setIntEstatus(int intEstatus) {
/* 272 */     this.intEstatus = intEstatus;
/*     */   }
/*     */   
/*     */   public Date getIntFecNac() {
/* 276 */     return this.intFecNac;
/*     */   }
/*     */   
/*     */   public void setIntFecNac(Date intFecNac) {
/* 280 */     this.intFecNac = intFecNac;
/*     */   }
/*     */   
/*     */   public byte[] getIntFoto() {
/* 284 */     return this.intFoto;
/*     */   }
/*     */   
/*     */   public void setIntFoto(byte[] intFoto) {
/* 288 */     this.intFoto = intFoto;
/*     */   }
/*     */   
/*     */   public int getIntLugFam() {
/* 292 */     return this.intLugFam;
/*     */   }
/*     */   
/*     */   public void setIntLugFam(int intLugFam) {
/* 296 */     this.intLugFam = intLugFam;
/*     */   }
/*     */   
/*     */   public String getIntMedicamento() {
/* 300 */     return this.intMedicamento;
/*     */   }
/*     */   
/*     */   public void setIntMedicamento(String intMedicamento) {
/* 304 */     this.intMedicamento = intMedicamento;
/*     */   }
/*     */   
/*     */   public String getIntNom() {
/* 308 */     return this.intNom;
/*     */   }
/*     */   
/*     */   public void setIntNom(String intNom) {
/* 312 */     this.intNom = intNom;
/*     */   }
/*     */   
/*     */   public String getIntPrePad() {
/* 316 */     return this.intPrePad;
/*     */   }
/*     */   
/*     */   public void setIntPrePad(String intPrePad) {
/* 320 */     this.intPrePad = intPrePad;
/*     */   }
/*     */   
/*     */   public int getIntReqMed() {
/* 324 */     return this.intReqMed;
/*     */   }
/*     */   
/*     */   public void setIntReqMed(int intReqMed) {
/* 328 */     this.intReqMed = intReqMed;
/*     */   }
/*     */   
/*     */   public String getIntRfc() {
/* 332 */     return this.intRfc;
/*     */   }
/*     */   
/*     */   public void setIntRfc(String intRfc) {
/* 336 */     this.intRfc = intRfc;
/*     */   }
/*     */   
/*     */   public String getIntTelCel() {
/* 340 */     return this.intTelCel;
/*     */   }
/*     */   
/*     */   public void setIntTelCel(String intTelCel) {
/* 344 */     this.intTelCel = intTelCel;
/*     */   }
/*     */   
/*     */   public String getIntTelFam() {
/* 348 */     return this.intTelFam;
/*     */   }
/*     */   
/*     */   public void setIntTelFam(String intTelFam) {
/* 352 */     this.intTelFam = intTelFam;
/*     */   }
/*     */   
/*     */   public String getIntTelefono() {
/* 356 */     return this.intTelefono;
/*     */   }
/*     */   
/*     */   public void setIntTelefono(String intTelefono) {
/* 360 */     this.intTelefono = intTelefono;
/*     */   }
/*     */   
/*     */   public int getIntTipSan() {
/* 364 */     return this.intTipSan;
/*     */   }
/*     */   
/*     */   public void setIntTipSan(int intTipSan) {
/* 368 */     this.intTipSan = intTipSan;
/*     */   }
/*     */   
/*     */   public int getIntTipSegSoc() {
/* 372 */     return this.intTipSegSoc;
/*     */   }
/*     */   
/*     */   public void setIntTipSegSoc(int intTipSegSoc) {
/* 376 */     this.intTipSegSoc = intTipSegSoc;
/*     */   }
/*     */   
/*     */   public String getUsuCve() {
/* 380 */     return this.usuCve;
/*     */   }
/*     */   
/*     */   public void setUsuCve(String usuCve) {
/* 384 */     this.usuCve = usuCve;
/*     */   }
/*     */   
/*     */   public List<Agenda> getAgendas() {
/* 388 */     return this.agendas;
/*     */   }
/*     */   
/*     */   public void setAgendas(List<Agenda> agendas) {
/* 392 */     this.agendas = agendas;
/*     */   }
/*     */   
/*     */   public Agenda addAgenda(Agenda agenda) {
/* 396 */     getAgendas().add(agenda);
/* 397 */     agenda.setIntegrante(this);
/*     */     
/* 399 */     return agenda;
/*     */   }
/*     */   
/*     */   public Agenda removeAgenda(Agenda agenda) {
/* 403 */     getAgendas().remove(agenda);
/* 404 */     agenda.setIntegrante(null);
/*     */     
/* 406 */     return agenda;
/*     */   }
/*     */   
/*     */   public List<Asistencia> getAsistencias() {
/* 410 */     return this.asistencias;
/*     */   }
/*     */   
/*     */   public void setAsistencias(List<Asistencia> asistencias) {
/* 414 */     this.asistencias = asistencias;
/*     */   }
/*     */   
/*     */   public Asistencia addAsistencia(Asistencia asistencia) {
/* 418 */     getAsistencias().add(asistencia);
/* 419 */     asistencia.setIntegrante(this);
/*     */     
/* 421 */     return asistencia;
/*     */   }
/*     */   
/*     */   public Asistencia removeAsistencia(Asistencia asistencia) {
/* 425 */     getAsistencias().remove(asistencia);
/* 426 */     asistencia.setIntegrante(null);
/*     */     
/* 428 */     return asistencia;
/*     */   }
/*     */   
/*     */   public List<Entrevista> getEntrevistas() {
/* 432 */     return this.entrevistas;
/*     */   }
/*     */   
/*     */   public void setEntrevistas(List<Entrevista> entrevistas) {
/* 436 */     this.entrevistas = entrevistas;
/*     */   }
/*     */   
/*     */   public Entrevista addEntrevista(Entrevista entrevista) {
/* 440 */     getEntrevistas().add(entrevista);
/* 441 */     entrevista.setIntegrante(this);
/*     */     
/* 443 */     return entrevista;
/*     */   }
/*     */   
/*     */   public Entrevista removeEntrevista(Entrevista entrevista) {
/* 447 */     getEntrevistas().remove(entrevista);
/* 448 */     entrevista.setIntegrante(null);
/*     */     
/* 450 */     return entrevista;
/*     */   }
/*     */   
/*     */   public List<Evaluacion> getEvaluacions() {
/* 454 */     return this.evaluacions;
/*     */   }
/*     */   
/*     */   public void setEvaluacions(List<Evaluacion> evaluacions) {
/* 458 */     this.evaluacions = evaluacions;
/*     */   }
/*     */   
/*     */   public Evaluacion addEvaluacion(Evaluacion evaluacion) {
/* 462 */     getEvaluacions().add(evaluacion);
/* 463 */     evaluacion.setIntegrante(this);
/*     */     
/* 465 */     return evaluacion;
/*     */   }
/*     */   
/*     */   public Evaluacion removeEvaluacion(Evaluacion evaluacion) {
/* 469 */     getEvaluacions().remove(evaluacion);
/* 470 */     evaluacion.setIntegrante(null);
/*     */     
/* 472 */     return evaluacion;
/*     */   }
/*     */   
/*     */   public List<Familiar> getFamiliars() {
/* 476 */     return this.familiars;
/*     */   }
/*     */   
/*     */   public void setFamiliars(List<Familiar> familiars) {
/* 480 */     this.familiars = familiars;
/*     */   }
/*     */   
/*     */   public Familiar addFamiliar(Familiar familiar) {
/* 484 */     getFamiliars().add(familiar);
/* 485 */     familiar.setIntegrante(this);
/*     */     
/* 487 */     return familiar;
/*     */   }
/*     */   
/*     */   public Familiar removeFamiliar(Familiar familiar) {
/* 491 */     getFamiliars().remove(familiar);
/* 492 */     familiar.setIntegrante(null);
/*     */     
/* 494 */     return familiar;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\Integrante.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */