package lto.news.connection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionUtils {
	
	public static Connection connection() {
		Connection conn = null;
		try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost/lto_news?" +
            	                                   "user=root&password=meinhertz&serverTimezone=UTC");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		return conn;
	}
	
	public static void closeThings(Connection conn, PreparedStatement ps, CallableStatement cs, ResultSet rs) {
		if(conn != null) {
			try { conn.close(); } catch (Exception ex) {}
		}
		if(ps != null) {
			try { ps.close(); } catch (Exception ex) {}
		}
		if(cs != null) {
			try { cs.close(); } catch (Exception ex) {}
		}
		if(rs != null) {
			try { rs.close(); } catch (Exception ex) {}
		}
	}
}	
