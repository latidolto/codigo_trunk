package com.latido.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.commons.io.IOUtils;

public class EmailUtils {
	private static final String HOST = "smtp.gmail.com";
	private static final String PORT = "465";
	private static final String USER = "latidolaguna";
	private static final String PASS = "latido2018";
	private static final String FROM_ADDRESS = "latidolaguna-noreply@latidolaguna.com";
	
	private static Properties mailProperties;
	
	public static void main(String args[]) {
		//EmailUtils.sendSimpleEmail("ever.azdar@gmail.com","Kiubo Cabron",".....A huevo!!!....");
	}
	
	public static void sendSimpleEmail(String toAddress,String subject,String bodyMail) {
		Properties mailProps = getMailProperties();

		Session session = Session.getDefaultInstance(mailProps,
			new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(USER,PASS);
				}
			});

		try {

			Message message = new MimeMessage(session);
			
			message.setFrom(new InternetAddress(FROM_ADDRESS));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(toAddress));
			message.setSubject(subject);
			String body = getEmailTemplate();
			body = body.replace("$BODY_PART$", bodyMail);
			
			message.setContent(body, "text/html; charset=utf-8");

			Transport.send(message);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	private static Properties getMailProperties() {
		mailProperties = new Properties();
		mailProperties.put("mail.smtp.host", HOST);
		mailProperties.put("mail.smtp.socketFactory.port", PORT);
		mailProperties.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		mailProperties.put("mail.smtp.auth", "true");
		mailProperties.put("mail.smtp.port", PORT);
		
		return mailProperties;
	}
	
	private static String getEmailTemplate()  {
		String template = "";
		InputStream is = EmailUtils.class.getResourceAsStream("email_template.xml");
		try {
			template = IOUtils.toString(is, "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return template;
	}
}
