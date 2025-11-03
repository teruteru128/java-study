package com.github.teruteru128.study;

import java.util.concurrent.Callable;

/**
 * ByteBuffer版
 */
public class AddressCalc2 implements Callable<Void> {

  private final String[] args;

  public AddressCalc2(String[] args) {
    this.args = args;
  }

  @Override
  public Void call() throws Exception {
    if (args.length < 3) {
      throw new RuntimeException("引数が足りませぬぞ");
    }
    return null;
  }
}
