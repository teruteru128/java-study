package com.twitter.teruteru128.bitmessage;

interface DeterministicAddresses extends Address {
  long getSigningKeyNonce();

  long getEncryptionKeyNonce();
}
