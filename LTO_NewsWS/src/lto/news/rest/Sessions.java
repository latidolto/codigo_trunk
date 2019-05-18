package lto.news.rest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import lto.news.entities.Sesion;
import lto.news.helper.SessionHelper;
import lto.news.json.JSONUtils;

@Path("/Sessions")
public class Sessions {
	
	@POST
	public void postSession(String session) {
		Sesion sesion = (Sesion) JSONUtils.JSONToJava(Sesion.class, session);
		if(sesion != null) {
			SessionHelper.registerSession(sesion.getSes_id(), sesion.getUsu_id());
		}
	}
}
