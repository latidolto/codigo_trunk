package lto.news.rest;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import lto.news.entities.User;
import lto.news.helper.UsersHelper;
import lto.news.json.JSONUtils;
import lto.news.rest.utils.BasicValidation;

@Path("/Users")
public class Users {
	@Context 
	private HttpServletRequest servletRequest;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUsers(String user) {
		String remoteURL = servletRequest.getRemoteHost() +
						   servletRequest.getRemotePort() +
						   servletRequest.getRemoteUser() ;
		if(!BasicValidation.validateCall(remoteURL)) {
			return Response
		 	      .status(400)
		 	      .entity("Ha excedido el numero de llamadas desde su host..")
		 	      .build();
		}
		User userParam = (User) JSONUtils.JSONToJava(User.class , user);
		userParam = UsersHelper.validateUser(userParam);
		String jsonParsed = JSONUtils.javaToJSON(userParam);
        return Response
        	      .status(200)
        	      .header("Access-Control-Allow-Origin", "*")
        	      .header("Access-Control-Allow-Credentials", "true")
        	      .header("Access-Control-Allow-Headers",
        	        "origin, content-type, accept, authorization")
        	      .header("Access-Control-Allow-Methods", 
        	        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        	      .entity(jsonParsed)
        	      .build();
	}
}
