package com.github.teruteru128.sample.user.register;

public class PasswordTooShortException extends IllegalArgumentException {

  public PasswordTooShortException(String message) {
    super(message);
  }
}
