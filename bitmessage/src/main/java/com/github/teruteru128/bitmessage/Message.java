package com.github.teruteru128.bitmessage;

import java.util.concurrent.atomic.AtomicLong;

public record Message(String to, String from, String subject, String message, int encodingType,
                      int ttl) {

  private static final AtomicLong COUNTER = new AtomicLong();

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
    var i = COUNTER.incrementAndGet();
    if (i <= 8L || i % 10000L == 0) {
      System.err.printf("message hashcode: %08x%n", System.identityHashCode(this));
    }
  }
}
