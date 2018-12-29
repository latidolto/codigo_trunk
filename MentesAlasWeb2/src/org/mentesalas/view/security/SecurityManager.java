package org.mentesalas.view.security;

public class SecurityManager
{
  private static SecurityManager _SecurityManager;
  private String userName;
  private String userFullName;
  
  public static SecurityManager getInstance()
  {
    if (_SecurityManager == null) {
      _SecurityManager = new SecurityManager();
    }
    return _SecurityManager;
  }
  
  public String getUserName()
  {
    if (this.userName == null) {
      return "anonymous";
    }
    return this.userName;
  }
  
  public void setUserName(String userName)
  {
    this.userName = userName;
  }
  
  public String getUserFullName()
  {
    return this.userFullName;
  }
  
  public void setUserFullName(String userFullName)
  {
    this.userFullName = userFullName;
  }
}
