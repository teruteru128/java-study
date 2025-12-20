package com.github.teruteru128.sample.user.login;

public class UserNotFoundException extends IllegalArgumentException {

  public UserNotFoundException(String message) {
    super(message);
  }
  public UserNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }
}
