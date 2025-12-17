package com.github.teruteru128.sample.user.register;

public class RegisterFailException extends RuntimeException {

  public RegisterFailException(String message) {
    super(message);
  }
  public RegisterFailException(String message, Throwable cause) {
    super(message, cause);
  }
}
