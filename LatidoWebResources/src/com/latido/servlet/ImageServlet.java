package com.latido.servlet;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ImageServlet extends HttpServlet {
	public static final String IMG_PARAM_NAME = "IMG_PATH";
	

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String filePath = request.getParameter(IMG_PARAM_NAME);
		//System.out.println(filePath);
		response.setContentType("image/jpeg");
		ServletOutputStream out;
		out = response.getOutputStream();
		FileInputStream fin = new FileInputStream(filePath);

		BufferedInputStream bin = new BufferedInputStream(fin);
		BufferedOutputStream bout = new BufferedOutputStream(out);
		int ch = 0;
		;
		while ((ch = bin.read()) != -1) {
			bout.write(ch);
		}
		bin.close();
		fin.close();
		bout.close();
		out.close();
	}

}
