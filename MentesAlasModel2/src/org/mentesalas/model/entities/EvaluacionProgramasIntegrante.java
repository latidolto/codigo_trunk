/*     */ package org.mentesalas.model.entities;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.Lob;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Entity
/*     */ @Table(name="evaluacion_programas_integrante")
/*     */ @NamedQuery(name="EvaluacionProgramasIntegrante.findAll", query="SELECT e FROM EvaluacionProgramasIntegrante e")
/*     */ public class EvaluacionProgramasIntegrante
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   @Id
/*     */   @Column(name="EPI_ID")
/*     */   private int epiId;
/*     */   @Column(name="EPI_ASISTENCIA")
/*     */   private int epiAsistencia;
/*     */   @Column(name="EPI_ATENCION")
/*     */   private int epiAtencion;
/*     */   @Column(name="EPI_AUTONOMIA")
/*     */   private int epiAutonomia;
/*     */   @Column(name="EPI_COLABORA")
/*     */   private int epiColabora;
/*     */   @Column(name="EPI_DISPOSI")
/*     */   private int epiDisposi;
/*     */   @Column(name="EPI_ENTUSIAS")
/*     */   private int epiEntusias;
/*     */   @Column(name="EPI_ESTATUSS")
/*     */   private int epiEstatuss;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="EPI_FECHA")
/*     */   private Date epiFecha;
/*     */   @Lob
/*     */   @Column(name="EPI_FOTO")
/*     */   private byte[] epiFoto;
/*     */   @Column(name="EPI_LOGROS")
/*     */   private String epiLogros;
/*     */   @Column(name="EPI_NECESIDADES")
/*     */   private String epiNecesidades;
/*     */   @Column(name="EPI_OBSERACTI")
/*     */   private String epiObseracti;
/*     */   @Column(name="EPI_OBSERVA")
/*     */   private String epiObserva;
/*     */   @Column(name="EPI_PARTICIPA")
/*     */   private int epiParticipa;
/*     */   @Column(name="EPI_PERIODO")
/*     */   private int epiPeriodo;
/*     */   @Column(name="EPI_PROGRAMA")
/*     */   private int epiPrograma;
/*     */   @Column(name="EPI_RETOS")
/*     */   private String epiRetos;
/*     */   @Column(name="EPI_TALLER")
/*     */   private int epiTaller;
/*     */   @Column(name="EPI_TALLERISTA")
/*     */   private String epiTallerista;
/*     */   @Column(name="EPI_TGRUPAL")
/*     */   private int epiTgrupal;
/*     */   @Column(name="EPI_TINDIVIDUAL")
/*     */   private int epiTindividual;
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="FEC_MOD")
/*     */   private Date fecMod;
/*     */   @Column(name="INT_ID")
/*     */   private int intId;
/*     */   @Column(name="USU_CVE")
/*     */   private String usuCve;
/*     */   
/*     */   public int getEpiId()
/*     */   {
/* 101 */     return this.epiId;
/*     */   }
/*     */   
/*     */   public void setEpiId(int epiId) {
/* 105 */     this.epiId = epiId;
/*     */   }
/*     */   
/*     */   public int getEpiAsistencia() {
/* 109 */     return this.epiAsistencia;
/*     */   }
/*     */   
/*     */   public void setEpiAsistencia(int epiAsistencia) {
/* 113 */     this.epiAsistencia = epiAsistencia;
/*     */   }
/*     */   
/*     */   public int getEpiAtencion() {
/* 117 */     return this.epiAtencion;
/*     */   }
/*     */   
/*     */   public void setEpiAtencion(int epiAtencion) {
/* 121 */     this.epiAtencion = epiAtencion;
/*     */   }
/*     */   
/*     */   public int getEpiAutonomia() {
/* 125 */     return this.epiAutonomia;
/*     */   }
/*     */   
/*     */   public void setEpiAutonomia(int epiAutonomia) {
/* 129 */     this.epiAutonomia = epiAutonomia;
/*     */   }
/*     */   
/*     */   public int getEpiColabora() {
/* 133 */     return this.epiColabora;
/*     */   }
/*     */   
/*     */   public void setEpiColabora(int epiColabora) {
/* 137 */     this.epiColabora = epiColabora;
/*     */   }
/*     */   
/*     */   public int getEpiDisposi() {
/* 141 */     return this.epiDisposi;
/*     */   }
/*     */   
/*     */   public void setEpiDisposi(int epiDisposi) {
/* 145 */     this.epiDisposi = epiDisposi;
/*     */   }
/*     */   
/*     */   public int getEpiEntusias() {
/* 149 */     return this.epiEntusias;
/*     */   }
/*     */   
/*     */   public void setEpiEntusias(int epiEntusias) {
/* 153 */     this.epiEntusias = epiEntusias;
/*     */   }
/*     */   
/*     */   public int getEpiEstatuss() {
/* 157 */     return this.epiEstatuss;
/*     */   }
/*     */   
/*     */   public void setEpiEstatuss(int epiEstatuss) {
/* 161 */     this.epiEstatuss = epiEstatuss;
/*     */   }
/*     */   
/*     */   public Date getEpiFecha() {
/* 165 */     return this.epiFecha;
/*     */   }
/*     */   
/*     */   public void setEpiFecha(Date epiFecha) {
/* 169 */     this.epiFecha = epiFecha;
/*     */   }
/*     */   
/*     */   public byte[] getEpiFoto() {
/* 173 */     return this.epiFoto;
/*     */   }
/*     */   
/*     */   public void setEpiFoto(byte[] epiFoto) {
/* 177 */     this.epiFoto = epiFoto;
/*     */   }
/*     */   
/*     */   public String getEpiLogros() {
/* 181 */     return this.epiLogros;
/*     */   }
/*     */   
/*     */   public void setEpiLogros(String epiLogros) {
/* 185 */     this.epiLogros = epiLogros;
/*     */   }
/*     */   
/*     */   public String getEpiNecesidades() {
/* 189 */     return this.epiNecesidades;
/*     */   }
/*     */   
/*     */   public void setEpiNecesidades(String epiNecesidades) {
/* 193 */     this.epiNecesidades = epiNecesidades;
/*     */   }
/*     */   
/*     */   public String getEpiObseracti() {
/* 197 */     return this.epiObseracti;
/*     */   }
/*     */   
/*     */   public void setEpiObseracti(String epiObseracti) {
/* 201 */     this.epiObseracti = epiObseracti;
/*     */   }
/*     */   
/*     */   public String getEpiObserva() {
/* 205 */     return this.epiObserva;
/*     */   }
/*     */   
/*     */   public void setEpiObserva(String epiObserva) {
/* 209 */     this.epiObserva = epiObserva;
/*     */   }
/*     */   
/*     */   public int getEpiParticipa() {
/* 213 */     return this.epiParticipa;
/*     */   }
/*     */   
/*     */   public void setEpiParticipa(int epiParticipa) {
/* 217 */     this.epiParticipa = epiParticipa;
/*     */   }
/*     */   
/*     */   public int getEpiPeriodo() {
/* 221 */     return this.epiPeriodo;
/*     */   }
/*     */   
/*     */   public void setEpiPeriodo(int epiPeriodo) {
/* 225 */     this.epiPeriodo = epiPeriodo;
/*     */   }
/*     */   
/*     */   public int getEpiPrograma() {
/* 229 */     return this.epiPrograma;
/*     */   }
/*     */   
/*     */   public void setEpiPrograma(int epiPrograma) {
/* 233 */     this.epiPrograma = epiPrograma;
/*     */   }
/*     */   
/*     */   public String getEpiRetos() {
/* 237 */     return this.epiRetos;
/*     */   }
/*     */   
/*     */   public void setEpiRetos(String epiRetos) {
/* 241 */     this.epiRetos = epiRetos;
/*     */   }
/*     */   
/*     */   public int getEpiTaller() {
/* 245 */     return this.epiTaller;
/*     */   }
/*     */   
/*     */   public void setEpiTaller(int epiTaller) {
/* 249 */     this.epiTaller = epiTaller;
/*     */   }
/*     */   
/*     */   public String getEpiTallerista() {
/* 253 */     return this.epiTallerista;
/*     */   }
/*     */   
/*     */   public void setEpiTallerista(String epiTallerista) {
/* 257 */     this.epiTallerista = epiTallerista;
/*     */   }
/*     */   
/*     */   public int getEpiTgrupal() {
/* 261 */     return this.epiTgrupal;
/*     */   }
/*     */   
/*     */   public void setEpiTgrupal(int epiTgrupal) {
/* 265 */     this.epiTgrupal = epiTgrupal;
/*     */   }
/*     */   
/*     */   public int getEpiTindividual() {
/* 269 */     return this.epiTindividual;
/*     */   }
/*     */   
/*     */   public void setEpiTindividual(int epiTindividual) {
/* 273 */     this.epiTindividual = epiTindividual;
/*     */   }
/*     */   
/*     */   public Date getFecMod() {
/* 277 */     return this.fecMod;
/*     */   }
/*     */   
/*     */   public void setFecMod(Date fecMod) {
/* 281 */     this.fecMod = fecMod;
/*     */   }
/*     */   
/*     */   public int getIntId() {
/* 285 */     return this.intId;
/*     */   }
/*     */   
/*     */   public void setIntId(int intId) {
/* 289 */     this.intId = intId;
/*     */   }
/*     */   
/*     */   public String getUsuCve() {
/* 293 */     return this.usuCve;
/*     */   }
/*     */   
/*     */   public void setUsuCve(String usuCve) {
/* 297 */     this.usuCve = usuCve;
/*     */   }
/*     */ }


/* Location:              D:\Desarrollo\Respaldos\MentesAlas2Model.jar!\org\mentesalas\model\entities\EvaluacionProgramasIntegrante.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */