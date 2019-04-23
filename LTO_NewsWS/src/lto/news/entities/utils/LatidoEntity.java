package lto.news.entities.utils;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import lto.news.connection.ConnectionUtils;

public class LatidoEntity {
	
	public List<Object> getAll(){
		List<Object> rows = null;
		Connection conn = ConnectionUtils.connection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String query = "Select * from " + this.getTableName();
			ps = conn.prepareStatement(query, 1);
			rs = ps.executeQuery();
			rows = this.fillRows(rs);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			ConnectionUtils.closeThings(conn, ps, null, rs);
		}
		return rows;
	}
	
	public List<Object> fillRowsFromQuery(String query) {
		List<Object> rows = null;
		Connection conn = ConnectionUtils.connection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(query, 1);
			rs = ps.executeQuery();
			rows = this.fillRows(rs);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			ConnectionUtils.closeThings(conn, ps, null, rs);
		}
		return rows;
	}
	
	private List<Object> fillRows(ResultSet rs) {
		List<Object> rows = null;
		Object row = null;
		try {
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			Field[] fields = this.getAttributes();
			while(rs.next()) {
				row = this.getClass().newInstance();
				if(rows == null)
					rows = new ArrayList();
				for(Field field : fields) {
					field.setAccessible(true);
					if(field.get(row) instanceof Collection) {
						continue;
					}
					if(field.get(row) instanceof List) {
						continue;
					}
					if(field.get(row) instanceof ArrayList) {
						continue;
					}
					for(int i = 1 ; i <= columnCount ; i++) {
						if (field.getName().trim().equalsIgnoreCase(rsmd.getColumnName(i).trim())) {
							if( field.getType().isInstance(new java.sql.Date(0) ) ) {
								field.set(row, rs.getDate(i));
							} else {
								field.set(row, rs.getObject(i));
							}
						}
					}
				}
				rows.add(row);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionUtils.closeThings(null , null, null, rs);
		}
		return rows;
	}
	
	private String getTableName() {
		return this.getClass().getSimpleName().toLowerCase();
	}
	
	private Field[] getAttributes() {
		return this.getClass().getDeclaredFields();
	}
}
