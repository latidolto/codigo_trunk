package lto.news.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Base64;


public class ImageHelper {
	public static final String INTERNAL_DIR = "/www/latido/news/images/";
	
	public static String getImageBase64(String imageId) {
		String image64 = null;
		String fileImageDir = INTERNAL_DIR + imageId;
		File fileImage = new File(fileImageDir);
		try {
			FileInputStream fileInputStreamReader = new FileInputStream(fileImage);
            byte[] bytes = new byte[(int)fileImage.length()];
            fileInputStreamReader.read(bytes);
            image64 = Base64.getEncoder().encodeToString(bytes);
            fileInputStreamReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return image64;
	}
}
