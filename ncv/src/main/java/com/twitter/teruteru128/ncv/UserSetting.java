package com.twitter.teruteru128.ncv;

import java.io.Serializable;
import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "UserSetting")
public class UserSetting implements Serializable {
  private static final long serialVersionUID = 0;

  /**
   * 
   */
  private List<User> user;

  @XmlElement(name = "user")
  public List<User> getUser() {
    return user;
  }

  public void setUser(List<User> users) {
    this.user = users;
  }

  public UserSetting() {
  }

}
