package com.twitter.teruteru128.study.bitmessage;

class NoSuchResultException extends RuntimeException {

  protected NoSuchResultException() {
  }

  public NoSuchResultException(String message) {
    super(message);
  }

  public NoSuchResultException(Throwable cause) {
    super(cause);
  }

  public NoSuchResultException(String message, Throwable cause) {
    super(message, cause);
  }

}
