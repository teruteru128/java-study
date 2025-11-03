package com.github.teruteru128.study;

import java.util.concurrent.Callable;

/**
 * GPU対応版
 */
public class AddressCalc3 implements Callable<Void> {

  private final String[] args;

  public AddressCalc3(String[] args) {
    this.args = args;
  }

  @Override
  public Void call() throws Exception {
    return null;
  }
}
