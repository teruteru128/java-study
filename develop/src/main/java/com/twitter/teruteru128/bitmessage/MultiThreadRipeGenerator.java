package com.twitter.teruteru128.bitmessage;

import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.function.Function;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class MultiThreadRipeGenerator implements Function<AddressKeyPairs, AddressKeyPairs> {
  private static final ThreadLocal<MessageDigest> SHA512_THREAD_LOCAL;
  private static final ThreadLocal<MessageDigest> RIPEMD160_THREAD_LOCAL;
  private static final ThreadLocal<byte[]> SHA512_BUFFER_THREAD_LOCAL;
  private static final ThreadLocal<byte[]> RIPEMD160_BUFFER_THREAD_LOCAL;
  static {
    if (Security.getProvider("BC") == null) {
      Security.addProvider(new BouncyCastleProvider());
    }
    SHA512_THREAD_LOCAL = new ThreadLocal<>() {
      @Override
      protected MessageDigest initialValue() {
        try {
          return MessageDigest.getInstance("SHA512");
        } catch (NoSuchAlgorithmException e) {
          throw new InternalError(e);
        }
      }
    };
    RIPEMD160_THREAD_LOCAL = new ThreadLocal<>() {
      @Override
      protected MessageDigest initialValue() {
        try {
          return MessageDigest.getInstance("RIPEMD160");
        } catch (NoSuchAlgorithmException e) {
          throw new InternalError(e);
        }
      }
    };
    SHA512_BUFFER_THREAD_LOCAL = new ThreadLocal<>() {
      @Override
      protected byte[] initialValue() {
        return new byte[Const.SHA512_DIGEST_LENGTH];
      }
    };
    RIPEMD160_BUFFER_THREAD_LOCAL = new ThreadLocal<>() {
      @Override
      protected byte[] initialValue() {
        return new byte[Const.RIPEMD160_DIGEST_LENGTH];
      }
    };
  }

  public MultiThreadRipeGenerator() {
  }

  @Override
  public AddressKeyPairs apply(AddressKeyPairs t) {
    MessageDigest sha512 = SHA512_THREAD_LOCAL.get();
    MessageDigest ripemd160 = RIPEMD160_THREAD_LOCAL.get();
    byte[] cache64 = SHA512_BUFFER_THREAD_LOCAL.get();
    byte[] ripe = RIPEMD160_BUFFER_THREAD_LOCAL.get();
    sha512.update(t.getSignKeyPair().getPublicKey());
    sha512.update(t.getEncKeyPair().getPublicKey());
    try {
      sha512.digest(cache64, 0, Const.SHA512_DIGEST_LENGTH);
    } catch (DigestException e) {
      throw new InternalError(e);
    }
    ripemd160.update(cache64);
    try {
      ripemd160.digest(ripe, 0, Const.RIPEMD160_DIGEST_LENGTH);
    } catch (DigestException e) {
      throw new InternalError(e);
    }
    t.setRipe(ripe);
    return t;
  }
}
