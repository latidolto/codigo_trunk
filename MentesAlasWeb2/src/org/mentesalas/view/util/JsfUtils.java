package org.mentesalas.view.util;

import java.util.Collection;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.context.PartialViewContext;

public class JsfUtils {
  public static void resfreshComponentById(String id)
  {
    UIComponent component = findComponentById(id);
    if (component != null) {
      FacesContext.getCurrentInstance().getPartialViewContext().getRenderIds().add(component.getClientId());
    }
  }
  
  public static UIComponent findComponentById(String id)
  {
    UIComponent comp = null;
    comp = findComponentInListById(FacesContext.getCurrentInstance().getViewRoot().getChildren(), id, comp);
    return comp;
  }
  
  private static UIComponent findComponentInListById(List<UIComponent> luic, String id, UIComponent comp)
  {
    if (luic != null) {
      for (UIComponent component : luic)
      {
        if (component.getClientId().endsWith(id))
        {
          comp = component;
          break;
        }
        if (component.getChildCount() > 0) {
          comp = findComponentInListById(component.getChildren(), id, comp);
        }
      }
    }
    return comp;
  }
  
  public static class JSfMessages {
	  public static void info(String mssg) {
		  FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO, "Mensaje de Informacion", mssg);
		  FacesContext fc = FacesContext.getCurrentInstance();
		  fc.addMessage(null, fm);
	  }
	  
	  public static void warn(String mssg) {
		  FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_WARN, "Mensaje de Advertencia", mssg);
		  FacesContext fc = FacesContext.getCurrentInstance();
		  fc.addMessage(null, fm);
	  }
	  
	  public static void error(String mssg) {
		  FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Mensaje de Error", mssg);
		  FacesContext fc = FacesContext.getCurrentInstance();
		  fc.addMessage(null, fm);
	  }
	  
	  public static void fatal(String mssg) {
		  FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error Fatal", mssg);
		  FacesContext fc = FacesContext.getCurrentInstance();
		  fc.addMessage(null, fm);
	  }
  }
  
}
