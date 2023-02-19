package com.twitter.teruteru128.bitmessage;

public interface Address {
  byte[] getRipe();

  byte[] getSigningPrivateKey();

  byte[] getEncryptionPrivateKey();
}
