package lto.news.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import lto.news.entities.Noticia;
import lto.news.helper.NoticiaHelper;
import lto.news.json.JSONUtils;
import lto.news.rest.utils.BasicValidation;

@Path("/News")
public class News {
	@Context 
	private HttpServletRequest servletRequest;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
    public Response getNews(String strNoticia) {
		String remoteURL = servletRequest.getRemoteHost() +
				   servletRequest.getRemotePort() +
				   servletRequest.getRemoteUser() ;
		/*if(!BasicValidation.validateCall(remoteURL)) {
			return Response
		 	      .status(400)
		 	      .entity("Ha excedido el numero de llamadas desde su host..")
		 	      .build();
		}*/
		Noticia noticia = (Noticia) JSONUtils.JSONToJava(Noticia.class, strNoticia);
		List<Noticia> lnot = NoticiaHelper.getFullNews(noticia);
		String jsonParsed = JSONUtils.javaCollectionToJSON(lnot);
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
