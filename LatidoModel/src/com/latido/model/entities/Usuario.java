package com.latido.model.entities;

import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the Usuario database table.
 * 
 */
@Entity
@Table(name="Usuario")
@NamedQueries ( {
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u") ,
@NamedQuery(name="Usuario.findUser", query="SELECT u FROM Usuario u where u.clave = :p_clave and u.password = :p_pass"),
@NamedQuery(name="Usuario.findUserByUsername", query="SELECT u FROM Usuario u where u.clave = :p_username ") 
} )
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer idUsuario;

	private String apellidoMaterno;

	private String apellidoPaterno;

	@Lob
	private byte[] avatar;

	private String clave;

	private int estatus;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecMod;

	private String nombre;

	private String password;

	private String usuCve;
	
	private int idSistema;
	
	@Transient
	private List<UsuRol> usuRol;
	
	@Transient
	private String srcTempImg;


	public Usuario() {
	}

	public String getApellidoMaterno() {
		return this.apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getApellidoPaterno() {
		return this.apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public byte[] getAvatar() {
		return this.avatar;
	}

	public void setAvatar(byte[] avatar) {
		this.avatar = avatar;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public int getEstatus() {
		return this.estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

	public Date getFecMod() {
		return this.fecMod;
	}

	public void setFecMod(Date fecMod) {
		this.fecMod = fecMod;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsuCve() {
		return this.usuCve;
	}

	public void setUsuCve(String usuCve) {
		this.usuCve = usuCve;
	}

	/**
	 * @return the idUsuario
	 */
	public Integer getIdUsuario() {
		return idUsuario;
	}

	/**
	 * @param idUsuario the idUsuario to set
	 */
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 * @return the usuRol
	 */
	public List<UsuRol> getUsuRol() {
		return usuRol;
	}

	/**
	 * @param usuRol the usuRol to set
	 */
	public void setUsuRol(List<UsuRol> usuRol) {
		this.usuRol = usuRol;
	}

	/**
	 * @return the idSistema
	 */
	public int getIdSistema() {
		return idSistema;
	}

	/**
	 * @param idSistema the idSistema to set
	 */
	public void setIdSistema(int idSistema) {
		this.idSistema = idSistema;
	}

	/**
	 * @return the srcTempImg
	 */
	public String getSrcTempImg() {
		if(this.avatar != null && this.srcTempImg == null) {
			try  {
				File f = File.createTempFile("avatar",".jpg");
				String filePath = f.getAbsolutePath();
				FileOutputStream fos = new FileOutputStream(filePath);
			    fos.write(this.avatar);
			    fos.close();
			    srcTempImg = filePath;
			   
			    //System.out.println(srcTempImg);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return srcTempImg;
	}

	/**
	 * @param srcTempImg the srcTempImg to set
	 */
	public void setSrcTempImg(String srcTempImg) {
		//this.srcTempImg = srcTempImg;
	}

}