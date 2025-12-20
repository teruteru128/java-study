package com.github.teruteru128.sample.user;

import java.io.Serial;
import java.io.Serializable;

public class UserPasswordCredential implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;
  private long user_id = -1;
  private String hash = null;
  private String salt = null;

  public UserPasswordCredential() {}

  public UserPasswordCredential(long user_id, String hash, String salt) {
    this.user_id = user_id;
    this.hash = hash;
    this.salt = salt;
  }

  public long getUser_id() {
    return user_id;
  }

  public void setUser_id(long user_id) {
    this.user_id = user_id;
  }

  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public String getSalt() {
    return salt;
  }

  public void setSalt(String salt) {
    this.salt = salt;
  }
}
