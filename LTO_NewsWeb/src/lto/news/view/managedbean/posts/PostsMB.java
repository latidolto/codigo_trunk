package lto.news.view.managedbean.posts;

import java.util.List;

import javax.faces.event.ActionEvent;

import com.latido.security.LatidoSecurityManager;
import com.latido.view.managedbean.utils.CommonManagedBean;
import com.latido.view.managedbean.utils.JsfUtils;

import lto.news.dispatcher.LtoNewsDispatcher;
import lto.news.model.controller.CommonCatalogController;
import lto.news.model.entities.Post;

public class PostsMB extends CommonManagedBean{
	public static final String RESOURCE_NAME = "LTO_NEWS_POSTS";
	
	public PostsMB() {
		super();
		//super(RESOURCE_NAME);
	}
	
	public CommonCatalogController getCommonCatalogController() {
		return (CommonCatalogController) LtoNewsDispatcher.getControllerInstance(LtoNewsDispatcher.COMMON_CATALOG_CONTROLLER, this.getSessionKey());
	}
	
	public Post getPost() {
		return this.getCommonCatalogController().getCurrentPost();
	}
	
	public List<Post> getPosts() {
		return this.getCommonCatalogController().getPostsByParams();
	}
	/**
	 * Events on the page to handle main action on the button bar or the grid for a common catalog
	 * */
	public void onSelect(Post row, String typeOfSelection, String indexes) {
		this.getCommonCatalogController().setCurrentPost(row);
		JsfUtils.resfreshComponentById("formPanel");
	}
	
	public void newAction(ActionEvent ae) {
		this.getCommonCatalogController().setCurrentPost(new Post());
		JsfUtils.resfreshComponentById("formPanel");
	}
	
	public void saveAction(ActionEvent ae) {
		Post Post = getPost();
		Post.setUsuario(LatidoSecurityManager.getUserInLine() == null ? "1" : LatidoSecurityManager.getUserInLine());
		getCommonCatalogController().savePost(Post);
		this.getCommonCatalogController().setCurrentPost(new Post());
		JsfUtils.sendMessageToView_INFO("Guardado Exitoso.");
		JsfUtils.resfreshComponentById("mainForm");
	}
	
	public void clearAction(ActionEvent ae) {
		this.getCommonCatalogController().setCurrentPost(new Post());
		JsfUtils.resfreshComponentById("mainForm");
	}	
	/*********************************************************************************************/
}
