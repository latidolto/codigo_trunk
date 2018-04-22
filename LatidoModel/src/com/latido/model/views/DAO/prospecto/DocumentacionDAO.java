package com.latido.model.views.DAO.prospecto;

import java.io.IOException;
import java.io.InputStream;
import javax.servlet.http.Part;
import org.apache.commons.io.IOUtils;

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
			try {
				byte[] b = IOUtils.toByteArray((InputStream) part.getInputStream());
				this.setBytes(b);
			} catch (IOException e) {
				e.printStackTrace();
			}
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
