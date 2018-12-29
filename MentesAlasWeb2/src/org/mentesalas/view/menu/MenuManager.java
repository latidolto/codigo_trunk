package org.mentesalas.view.menu;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.mentesalas.view.security.SecurityManager;

public class MenuManager
{
  private static MenuManager _MenuManager;
  private String location;
  
  public static MenuManager getInstance()
  {
    if (_MenuManager == null) {
      _MenuManager = new MenuManager();
    }
    return _MenuManager;
  }
  
  public String getLocation()
  {
    return this.location;
  }
  
  public void setLocation(String location)
  {
    this.location = location;
  }
  
  public String getCurrentDate()
  {
    String sdate = "";
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    sdate = sdf.format(new Date(System.currentTimeMillis()));
    return sdate;
  }
  
  public String getCurrentUser()
  {
    return SecurityManager.getInstance().getUserName();
  }
}
