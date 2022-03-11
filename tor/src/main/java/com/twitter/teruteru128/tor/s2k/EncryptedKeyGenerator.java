package com.twitter.teruteru128.tor.s2k;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * create instance from raw password.
 * test -> 16:17AEC9679C42F075600CF835CE02ECAB6D297F27D233E150D3EA71DB9A
 * 
 * @see https://gist.github.com/antitree/3962751/d7110ef3767f64b1f10750da6ddf0a7ad4337709
 * @see https://github.com/torproject/tor/blob/4f02812242d1fd90d859eb98ac3fb1ed182f18cf/src/lib/crypt_ops/crypto_s2k.c#L203
 */
public class EncryptedKeyGenerator {

    public EncryptedKeyGenerator() {
    }

    private static final SecureRandom random;
    static {
      SecureRandom r = null;
      try {
        r = SecureRandom.getInstanceStrong();
      } catch (NoSuchAlgorithmException e) {
        e.printStackTrace();
        r = new SecureRandom();
      } finally {
        random = r;
      }
    }

    public EncryptedKey getInstance(String secret) {
      byte[] salt = new byte[8];
      random.nextBytes(salt);
      return hashWithSalt(secret, salt);
    }

    public static EncryptedKey hashWithSalt(String secret, byte[] salt) {
      return hashWithSalt(secret, EncryptedKey.DEFAULT_PREFIX, salt, EncryptedKey.DEFAULT_INDICATOR);
    }

    public static EncryptedKey hashWithSalt(String secret, String prefix, byte[] salt, byte indicator) {
      byte[] hash = EncryptedKeyFactory.getSaltedHash(salt, indicator, secret);
      return new EncryptedKeyImpl(prefix, salt, hash);
    }

}
