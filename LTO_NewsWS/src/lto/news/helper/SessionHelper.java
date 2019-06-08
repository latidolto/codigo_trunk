package lto.news.helper;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import lto.news.connection.ConnectionUtils;

public class SessionHelper {
	
	public static void registerSession(String session, String usuId) {
		String insert = "insert into sesion (ses_fecha,ses_id,usu_id) values (?,?,?)";
		PreparedStatement ps = null;
		Connection conn = null;
		try {
			conn = ConnectionUtils.connection();
			ps = conn.prepareStatement(insert, 1);
			ps.setObject(1, new Date(System.currentTimeMillis()));
			ps.setObject(2, session);
			ps.setObject(3, usuId);
			
			ps.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {ps.close();} catch(Exception e) {}
			try {conn.close();} catch(Exception e) {}
			
		}
	}

}
