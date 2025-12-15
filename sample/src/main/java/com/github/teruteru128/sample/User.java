package com.github.teruteru128.sample;

import java.io.Serial;
import java.io.Serializable;

public class User implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;
  private long user_id = -1;
  private String username = null;
  private String email = null;
  private LogInStatus logInStatus = LogInStatus.NOT_LOGGED_IN;

  public User() {
  }

  public LogInStatus getLogInStatus() {
    return logInStatus;
  }

  public void setLogInStatus(LogInStatus logInStatus) {
    this.logInStatus = logInStatus;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public long getUser_id() {
    return user_id;
  }

  public void setUser_id(long user_id) {
    this.user_id = user_id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void logout() {
    setEmail(null);
    setUser_id(-1);
    setUsername(null);
    setLogInStatus(LogInStatus.NOT_LOGGED_IN);
  }
}
