package lto.news.rest;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import lto.news.helper.ImageHelper;
import lto.news.rest.utils.BasicValidation;

@Path("/Images")
public class Images {
	@Context 
	private HttpServletRequest servletRequest;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
    public Response getImages(String imageId) {
		String remoteURL = servletRequest.getRemoteHost() +
				   servletRequest.getRemotePort() +
				   servletRequest.getRemoteUser() ;
		if(!BasicValidation.validateCall(remoteURL)) {
			return Response
		 	      .status(400)
		 	      .entity("Ha excedido el numero de llamadas desde su host..")
		 	      .build();
		}
		String resultString = ImageHelper.getImageBase64(imageId);
        return Response
        	      .status(200)
        	      .header("Access-Control-Allow-Origin", "*")
        	      .header("Access-Control-Allow-Credentials", "true")
        	      .header("Access-Control-Allow-Headers",
        	        "origin, content-type, accept, authorization")
        	      .header("Access-Control-Allow-Methods", 
        	        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        	      .entity(resultString)
        	      .build();
	}
}
