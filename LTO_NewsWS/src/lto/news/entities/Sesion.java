package lto.news.entities;

import java.sql.Date;

public class Sesion {
	private Date ses_fecha;
	private String ses_id;
	private String usu_id;
	
	public Date getSes_fecha() {
		return ses_fecha;
	}
	public void setSes_fecha(Date ses_fecha) {
		this.ses_fecha = ses_fecha;
	}
	public String getSes_id() {
		return ses_id;
	}
	public void setSes_id(String ses_id) {
		this.ses_id = ses_id;
	}
	public String getUsu_id() {
		return usu_id;
	}
	public void setUsu_id(String usu_id) {
		this.usu_id = usu_id;
	}
	
}
