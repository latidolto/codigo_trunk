package com.latido.view.dao.infra;

import java.io.IOException;

import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;

public class UserDAO {
	private static UserDAO _UserDAO;
	private Part part;
	private byte[] bytes;
	
	private UserDAO() {
		
	}
	
	public static UserDAO getInstance() {
		if(_UserDAO == null)
			_UserDAO = new UserDAO();
		return _UserDAO;
	}

	/**
	 * @return the part
	 */
	public Part getPart() {
		return part;
	}

	/**
	 * @param part the part to set
	 */
	public void setPart(Part part) {
		if(part != null) {
			try {
				byte[] b = IOUtils.toByteArray( part.getInputStream() );
				this.setBytes(b);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		this.part = part;
	}

	/**
	 * @return the bytes
	 */
	public byte[] getBytes() {
		return bytes;
	}

	/**
	 * @param bytes the bytes to set
	 */
	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}
	
	
}
