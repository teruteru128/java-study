package com.twitter.teruteru128.tor.s2k;

import java.util.Arrays;

public class EncryptedKeyValidator {

  public boolean validate(EncryptedKey key, String secret) {
    EncryptedKey other = EncryptedKeyGenerator.hashWithSalt(secret, key.getSalt());
    return Arrays.equals(key.getHash(), other.getHash());
  }
  
}
