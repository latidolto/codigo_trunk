package com.latido.model.views.DAO.prospecto;

import java.io.IOException;
import java.io.InputStream;
import javax.servlet.http.Part;

public class DocumentacionDAO {
	private static DocumentacionDAO _documentacionDAO;
	private Part part;
	private byte[] bytes;

	private DocumentacionDAO() {
	}

	public static DocumentacionDAO getInstance() {
		if (_documentacionDAO == null) {
			_documentacionDAO = new DocumentacionDAO();
		}
		return _documentacionDAO;
	}

	public Part getPart() {
		return this.part;
	}

	public void setPart(Part part) {
		if (part != null) {
		}
		this.part = part;
	}

	public byte[] getBytes() {
		return this.bytes;
	}

	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}
}
