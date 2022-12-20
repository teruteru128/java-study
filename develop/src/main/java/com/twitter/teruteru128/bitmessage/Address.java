package com.twitter.teruteru128.bitmessage;

interface Address {
  byte[] getRipe();

  byte[] getSigningPrivateKey();

  byte[] getEncryptionPrivateKey();
}
