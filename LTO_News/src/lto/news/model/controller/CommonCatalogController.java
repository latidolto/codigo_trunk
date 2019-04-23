package lto.news.model.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.latido.model.utils.Parameter;

import lto.news.model.entities.Post;

public class CommonCatalogController extends LtoController {
	
	public CommonCatalogController(String keyMem) {
		super(keyMem);
	}

	/**LOGICA DE APLICACION*/
	public Post getCurrentPost() {
		return (Post) this.getLtoServicesFacade().getEjb(Post.class.getName());
	}

	public Post getPostById(Long id) {
		Post post = null;
		Map<String,Long> params = new HashMap<String,Long>();
		params.put("p_clave", id);
		List<Post> lc = this.getLtoServicesFacade().getListFromParameters(Post.class.getName(), "findById", params);
		if(lc != null)
			post = lc.get(0);
		return post;
	}
	
	public List<Post> getPostsByParams(Parameter... params){
		return this.getLtoServicesFacade().getListFromParameters(Post.class, params);
	}
	/***********************/

	public void setCurrentPost(Post post) {
		this.getLtoServicesFacade().setEjb(Post.class.getName(), post);
	}

	public void savePost(Post post) {
		if(post != null) {
			Boolean isPersist = post.getId() == null ? true : false;
			if(isPersist) {
				post.setId(UUID.randomUUID().toString().substring(0, 31));
				post.setFecha(new Date(System.currentTimeMillis()));
				post.setVistas(0);
				this.getLtoServicesFacade().persistEjb(post);
			} else {
				this.getLtoServicesFacade().mergeEjb(post);
			}
		} else {
			Logger log = Logger.getLogger(this.getClass().getName());
			log.log(Level.SEVERE, "No es posible guardar el post por que la entidad es nula.");
		}
		
	}
}
