package lto.news.helper;

import java.util.List;

import lto.news.entities.User;

public class UsersHelper {
	
	public static User validateUser(User user) {
		if(user != null) {
			String query = "Select * from usuario "
						 + "where usu_correo = '"+user.getUsu_correo()+"' "
						 + "and usu_contrasena = '"+user.getUsu_contrasena()+"' ";
			List<Object> lo = (new User()).fillRowsFromQuery(query);
			if(lo != null && lo.size() > 0) {
				return (User) lo.get(0);
			}
			return null;
		}
		return null;		
	}

}
