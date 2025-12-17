package com.github.teruteru128.sample.user.register;

public class UserAlreadyExistsException extends IllegalArgumentException {

  public UserAlreadyExistsException(String message) {
    super(message);
  }
}
