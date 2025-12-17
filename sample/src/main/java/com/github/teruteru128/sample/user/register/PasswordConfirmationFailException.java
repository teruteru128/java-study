package com.github.teruteru128.sample.user.register;

public class PasswordConfirmationFailException extends IllegalArgumentException {

  public PasswordConfirmationFailException(String message) {
    super(message);
  }
}
