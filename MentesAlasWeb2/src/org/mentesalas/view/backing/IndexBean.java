package org.mentesalas.view.backing;

import java.util.Map;
import javax.faces.component.UIComponent;
import javax.faces.event.ActionEvent;
import org.mentesalas.view.menu.MenuManager;
import org.mentesalas.view.util.JsfUtils;

public class IndexBean
{
  public void menuAction(ActionEvent ae)
  {
    String destiny = (String)ae.getComponent().getAttributes().get("destiny");
    MenuManager.getInstance().setLocation(destiny);
    JsfUtils.resfreshComponentById("frameLocation");
  }
  
  public String getLocation()
  {
    return MenuManager.getInstance().getLocation();
  }
  
  public String getDateAndUserData()
  {
    return MenuManager.getInstance().getCurrentDate() + " - " + MenuManager.getInstance().getCurrentUser();
  }
}
