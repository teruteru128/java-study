package com.twitter.teruteru128.ncv.usersetting;

import java.io.Serializable;
import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "UserSetting", namespace = "http://posite-c.jp/niconamacommentviewer/usersetting/")
public class UserSetting implements Serializable {
  private static final long serialVersionUID = 0;

  /**
   * 
   */
  private List<User> user;

  public UserSetting() {
  }

  public UserSetting(List<User> user) {
    this.user = user;
  }

  @XmlElement(name = "user")
  public List<User> getUser() {
    return user;
  }

  public void setUser(List<User> users) {
    this.user = users;
  }

}
