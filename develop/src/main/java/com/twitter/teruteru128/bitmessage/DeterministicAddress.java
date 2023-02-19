package com.twitter.teruteru128.bitmessage;

public interface DeterministicAddress extends Address {
  long getSigningKeyNonce();

  long getEncryptionKeyNonce();
}
