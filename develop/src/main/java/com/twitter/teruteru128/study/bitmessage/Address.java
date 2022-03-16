package com.twitter.teruteru128.study.bitmessage;

interface Address {
  byte[] getRipe();

  byte[] getSigningPrivateKey();

  byte[] getEncryptionPrivateKey();
}
