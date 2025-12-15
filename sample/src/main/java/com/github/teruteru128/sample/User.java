package com.github.teruteru128.sample;

import java.io.Serializable;

public class User implements Serializable {

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
}
