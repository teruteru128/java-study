package com.twitter.teruteru128.study.bitmessage;

interface DeterministicAddresses extends Address {
  long getSigningKeyNonce();

  long getEncryptionKeyNonce();
}
