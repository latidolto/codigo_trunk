package lto.news.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import lto.news.connection.ConnectionUtils;
import lto.news.entities.CommonEntity;

public class CommonHelper {
	
	public static List<CommonEntity> getEntity(CommonEntity entity ){
		List<CommonEntity> entities = null; 
		String query = "Select * from " + entity.getName() + " ";
		if(entity.getAttributes() != null) {
			 boolean isFirst = true;
			 for(CommonEntity.CommonAttribute attribute : entity.getAttributes()) {
				 if (isFirst) {
					 query += "Where " + attribute.getName();
					 
					 isFirst = false;
				 } else {
					 query += "And " + attribute.getName();
				 }
				 if(attribute.getOperand() == CommonEntity.CommonAttribute.OPER_EQ) {
					 query += " = ?";
				 }
				 if(attribute.getOperand() == CommonEntity.CommonAttribute.OPER_NEQ) {
					 query += " <> ?";
				 }
				 if(attribute.getOperand() == CommonEntity.CommonAttribute.OPER_LIKE) {
					 query += " like ?";
				 }
				 if(attribute.getOperand() == CommonEntity.CommonAttribute.OPER_BETWEEN) {
					 query += " between ? and ? ";
				 }
			 }
		}
		Connection conn = ConnectionUtils.connection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(query, 1);
			if (entity.getAttributes() != null) {
				int index = 1;
				for(CommonEntity.CommonAttribute attribute : entity.getAttributes()) {
					if(attribute.getOperand() == CommonEntity.CommonAttribute.OPER_BETWEEN) {
						ps.setObject(index++, attribute.getValue());
						ps.setObject(index++, attribute.getSecondValue());
					} else {
						ps.setObject(index++, attribute.getValue());					
					}
				}
			}
			rs = ps.executeQuery();
			while(rs.next()) {
				if(entities == null) {
					entities = new ArrayList<CommonEntity>();
				}
				int columnCount = rs.getMetaData().getColumnCount();
				
				CommonEntity newEntity = new CommonEntity();
				entity.setName(entity.getName());
				
				List<CommonEntity.CommonAttribute> attrs = new ArrayList<CommonEntity.CommonAttribute>();
				for(int i = 1 ; i <= columnCount ; i++) {
					CommonEntity.CommonAttribute attr = newEntity.new CommonAttribute();
					attr.setName(rs.getMetaData().getColumnName(i));
					attr.setValue(rs.getObject(i));
					attrs.add(attr);
				}
				
				newEntity.setAttributes(attrs);
				entities.add(newEntity);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			ConnectionUtils.closeThings(conn, ps, null, rs);
		}
		return entities;
	}
	
	public static boolean insertEntity(CommonEntity entity) throws Exception {
		boolean inserted = false;
		if(entity == null) {
			throw new Exception("No se puede hacer una insercion con una entidad nula");
		}
		String insert = "Insert into " +entity.getName()+  " values (";
		if (entity.getAttributes()!=null) {
			boolean isFirst = true;
			for(CommonEntity.CommonAttribute attr : entity.getAttributes()) {
				if (isFirst) {
					insert += "?";
					isFirst = false;
				} else {
					insert += ",?";
				}
			}
			insert += ")";
			Connection conn = ConnectionUtils.connection();
			PreparedStatement ps = null;
			try {
				ps = conn.prepareStatement(insert, 1);
				int index = 1;
				for(CommonEntity.CommonAttribute attr : entity.getAttributes()) {
					ps.setObject(index++, attr.getValue());
				}
				inserted = ps.executeUpdate() > 0;
			} catch (Exception ex) {
				ex.printStackTrace();
			} finally {
				ConnectionUtils.closeThings(conn, ps, null, null);
			}
		} else {
			throw new Exception("No se puede insertar una entidad sin atributos");
		}
		return inserted;
	}
	
	public static boolean updateEntity(CommonEntity entity) throws Exception {
		boolean updated = false;
		if(entity == null) {
			throw new Exception("No se puede hacer una actualizacion con una entidad nula");
		}
		String update = "Update "+ entity.getName() +" Set ";
		if (entity.getAttributes()!=null) {
			boolean isFirst = true;
			CommonEntity.CommonAttribute attrId = null;
			for(CommonEntity.CommonAttribute attr : entity.getAttributes()) {
				if (attr.getIsID()) {
					attrId = attr;
				} else {
					if (isFirst) {
						update +=  attr.getName() + " = ? ";
						isFirst = false;
					} else {
						update += "," + attr.getName() + " = ? ";
					}
				}
			}
			if(attrId != null) {
				update += "Where " + attrId.getName() +" = ? ";
			} else {
				throw new Exception("No se puede actualizar una entidad sin el id");
			}
			Connection conn = ConnectionUtils.connection();
			PreparedStatement ps = null;
			try {
				ps = conn.prepareStatement(update, 1);
				int index = 1;
				for(CommonEntity.CommonAttribute attr : entity.getAttributes()) {
					if (!attr.getIsID()) {
						ps.setObject(index++, attr.getValue());
					}
				}
				ps.setObject(index++, attrId.getValue());
				updated = ps.executeUpdate() > 0;
			} catch (Exception ex) {
				ex.printStackTrace();
			} finally {
				ConnectionUtils.closeThings(conn, ps, null, null);
			}
		} else {
			throw new Exception("No se puede actualizar una entidad sin atributos");
		}
		return updated;
	}

}
