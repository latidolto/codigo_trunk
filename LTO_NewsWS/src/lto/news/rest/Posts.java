package lto.news.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import lto.news.entities.Post;
import lto.news.entities.Post_Imagen;
import lto.news.json.JSONUtils;
import lto.news.rest.utils.BasicValidation;

@Path("/Posts")
public class Posts { 
	@Context 
	private HttpServletRequest servletRequest;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
    public Response getPosts() {
		String remoteURL = servletRequest.getRemoteHost() +
						   servletRequest.getRemotePort() +
						   servletRequest.getRemoteUser() ;
		if(!BasicValidation.validateCall(remoteURL)) {
			return Response
	        	      .status(400)
	        	      .entity("Ha excedido el numero de llamadas desde su host..")
	        	      .build();
		}
		Post p = new Post();
		List<Object> lpost = p.getAll();
		for(Object obj : lpost) {
			List<Object> lpi = ((Post)obj).getImagenes();
			if(lpi != null) {
				for(Object opi : lpi) {
					((Post_Imagen)opi).getImagen64();
				}
			}
		}
		String jsonParsed = JSONUtils.javaCollectionToJSON(lpost);
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
