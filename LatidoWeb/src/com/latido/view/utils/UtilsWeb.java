package com.latido.view.utils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.jboss.resteasy.util.Hex;

public class UtilsWeb {
	public static void main(String args[]) {
		System.out.println(UtilsWeb.convertSimpleMD5("meinhertz"));
	}
	
	public static String convertSimpleMD5(String toConvert) {
		String converted = null;
		byte[] hash = null;
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            InputStream stream = new ByteArrayInputStream(toConvert.getBytes(StandardCharsets.UTF_8));
            DigestInputStream inputStream = new DigestInputStream(stream, md5);
            while (inputStream.read() != -1);
            		hash = md5.digest();
            	converted = 	new String(Hex.encodeHex(hash));
        } catch (NoSuchAlgorithmException | IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
		return converted;
	} 
}
