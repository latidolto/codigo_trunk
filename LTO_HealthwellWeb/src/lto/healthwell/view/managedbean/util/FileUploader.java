package lto.healthwell.view.managedbean.util;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;

public class FileUploader {
	private static FileUploader fu;
	private static Map<String , FileUploader> cachedFU;
	
	private String keyMem;
	private Part file;
	
	private FileUploader(String keyMem) {
		this.keyMem = keyMem;
	}
	
	public static FileUploader getInstance(String keyMem) {
		if(cachedFU == null) {
			cachedFU = new HashMap<>();
			fu = new FileUploader(keyMem);
			cachedFU.put(keyMem, fu);
		} else {
			if(cachedFU.get(keyMem) == null) {
				fu = new FileUploader(keyMem);
				cachedFU.put(keyMem, fu);
			} else {
				fu = cachedFU.get(keyMem);
			}
		}
		return fu;
	}

	public Part getFile() {
		return file;
	}

	public void setFile(Part file) {
		this.file = file;
	}
	
	public byte[] fileToByteArray() throws Exception {
		byte[] bytes = null;
		if(this.file != null && this.file.getInputStream() != null) {
			bytes = IOUtils.toByteArray(this.file.getInputStream());
		}
		return bytes;
	}

}
