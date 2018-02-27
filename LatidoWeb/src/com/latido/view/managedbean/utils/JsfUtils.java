package com.latido.view.managedbean.utils;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

public class JsfUtils {
	public static void resfreshComponentById(String id){
		UIComponent component = findComponentById(id);
		//System.out.println(component);
		if(component != null){
			FacesContext.getCurrentInstance().getPartialViewContext().getRenderIds().add(component.getClientId());
		}
	}
	
	public static UIComponent findComponentById(String id){
		UIComponent comp = null;
		comp = findComponentInListById(FacesContext.getCurrentInstance().getViewRoot().getChildren(), id,comp);
		return comp;
	}
	
	public static void sendMessageToView_INFO(String msg) {
		FacesMessage fm = new FacesMessage();
		fm.setSeverity(FacesMessage.SEVERITY_INFO);
		fm.setSummary("");
		fm.setDetail(msg);
		FacesContext.getCurrentInstance().addMessage(null, fm);
	}
	
	public static void sendMessageToView_WARN(String msg) {
		FacesMessage fm = new FacesMessage();
		fm.setSeverity(FacesMessage.SEVERITY_WARN);
		fm.setSummary("");
		fm.setDetail(msg);
		FacesContext.getCurrentInstance().addMessage(null, fm);
	}
	
	public static void sendMessageToView_ERROR(String msg) {
		FacesMessage fm = new FacesMessage();
		fm.setSeverity(FacesMessage.SEVERITY_ERROR);
		fm.setSummary("");
		fm.setDetail(msg);
		FacesContext.getCurrentInstance().addMessage(null, fm);
	}
	
	private static UIComponent findComponentInListById(List<UIComponent> luic,String id,UIComponent comp){
		//UIComponent comp = null;
		if(luic != null){
			for(UIComponent component: luic) {
				//System.out.println(component.getClientId() + " ==? "+id);
				//System.out.println(component.getClientId().endsWith(id));
			    if(component.getClientId().endsWith(id)){
			    		comp = component;
			    		break;
			    }else if(component.getChildCount() > 0){
			    		comp = findComponentInListById(component.getChildren(), id,comp);
			    }
			}	
		}
		return comp;
	}
	
	
}
