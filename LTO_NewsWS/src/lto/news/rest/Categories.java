package lto.news.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import lto.news.entities.Categoria;
import lto.news.json.JSONUtils;
import lto.news.rest.utils.BasicValidation;

@Path("/Categories")
public class Categories {
	@Context 
	private HttpServletRequest servletRequest;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
    public Response getCategories(String catId) {
		String remoteURL = servletRequest.getRemoteHost() +
						   servletRequest.getRemotePort() +
						   servletRequest.getRemoteUser() ;
		if(!BasicValidation.validateCall(remoteURL)) {
			return Response
	        	      .status(400)
	        	      .entity("Ha excedido el numero de llamadas desde su host..")
	        	      .build();
		}
		Categoria cat = new Categoria();
		List<Object> lcat = null;
		if( catId != null && !catId.trim().equalsIgnoreCase("")) {
			lcat = cat.fillRowsFromQuery("Select * from categoria where cat_id = '"+catId+"'");
		} else {
			lcat = cat.getAll();	
		}
		String jsonParsed = JSONUtils.javaCollectionToJSON(lcat);
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
