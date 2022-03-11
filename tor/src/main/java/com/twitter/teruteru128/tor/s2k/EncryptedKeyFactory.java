package com.twitter.teruteru128.tor.s2k;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Objects;

import jakarta.xml.bind.DatatypeConverter;

/**
 * create instance from hashed password
 */
public class EncryptedKeyFactory {
  public EncryptedKeyFactory() {
  }

  /**
   * 
   * @param hashedPassword
   * @return
   */
  public EncryptedKey getInstance(String hashedPassword) {
    Objects.requireNonNull(hashedPassword);
    if (hashedPassword.length() != 61) {
      throw new IllegalArgumentException("Invalid Length " + hashedPassword);
    }
    if (!hashedPassword.startsWith("16:")) {
      throw new IllegalArgumentException("Unsupported Prefix");
    }
    byte[] bytes = DatatypeConverter.parseHexBinary(hashedPassword.substring(3));
    if (bytes[8] != 0x60) {
      throw new IllegalArgumentException("Invalid Indicator");
    }
    byte[] salt = Arrays.copyOfRange(bytes, 0, 8);
    byte[] hash = Arrays.copyOfRange(bytes, 9, bytes.length);
    return new EncryptedKeyImpl(salt, hash);
  }

  private static final int EXPBIAS = 6;

  public static byte[] getSaltedHash(byte[] salt, byte c, String secret) {
    try {
      MessageDigest d = MessageDigest.getInstance("SHA-1");
      int count = (16 + (c & 15)) << ((c >> 4) + EXPBIAS);
      System.out.printf("count is %d%n", count);
      byte[] secretBytes = secret.getBytes();
      int input_len = salt.length + secretBytes.length;
      byte[] input = new byte[input_len];
      System.arraycopy(salt, 0, input, 0, salt.length);
      System.arraycopy(secretBytes, 0, input, salt.length, secretBytes.length);
      while (count > 0) {
        if (count > input_len) {
          d.update(input);
          count -= input_len;
        } else {
          d.update(input, 0, count);
          count = 0;
        }
      }
      return d.digest();
    } catch (NoSuchAlgorithmException e) {
      throw new RuntimeException(e);
    }
  }
}
