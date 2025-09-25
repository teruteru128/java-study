package com.github.teruteru128.bitmessage;

import java.util.concurrent.atomic.AtomicLong;

public record Message(String to, String from, String subject, String message, int encodingType,
                      int ttl) {

  private static final AtomicLong counter = new AtomicLong();

  public Message(String to, String from, String subject, String message) {
    this(to, from, subject, message, 2, 345600);
  }

  public Message(String to, String from, String subject, String message, int ttl) {
    this(to, from, subject, message, 2, ttl);
  }

  public Message {
    if (encodingType != 2) {
      throw new IllegalArgumentException("encoding type MUST be 2");
    }
    ttl = Math.clamp(ttl, 3600, 2419200);
    var i = counter.incrementAndGet();
    if (i <= 100L || i % 10000L == 0) {
      System.err.printf("%08x%n", System.identityHashCode(this));
    }
  }
}
