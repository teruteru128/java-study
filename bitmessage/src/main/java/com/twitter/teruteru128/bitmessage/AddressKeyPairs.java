package com.twitter.teruteru128.bitmessage;

import com.twitter.teruteru128.bitmessage.spec.KeyPair;

public class AddressKeyPairs {
  private byte[] ripe;
  private KeyPair signKeyPair;
  private KeyPair encKeyPair;

  public AddressKeyPairs(KeyPair signkeypair, KeyPair encKeyPair) {
    super();
  }

  public KeyPair getSignKeyPair() {
    return signKeyPair;
  }

  public KeyPair getEncKeyPair() {
    return encKeyPair;
  }

  public byte[] getRipe() {
    return ripe.clone();
  }

  public void setRipe(byte[] ripe) {
    this.ripe = ripe.clone();
  }
}
