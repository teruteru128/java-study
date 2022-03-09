package com.twitter.teruteru128.tor.s2k;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Objects;

import jakarta.xml.bind.DatatypeConverter;

class EncryptedKey {
  private static String DEFAULT_PREFIX = "16";
  private String prefix;
  private byte[] salt;
  private byte[] hash;

  private EncryptedKey(String prefix, byte[] salt, byte[] hash) {
    this.prefix = prefix;
    this.salt = salt;
    this.hash = hash;
  }

  public static EncryptedKey getInstance(String s) {
    Objects.requireNonNull(s);
    if (s.length() != 61) {
      throw new IllegalArgumentException("Invalid Length " + s);
    }
    if (!s.startsWith("16:")) {
      throw new IllegalArgumentException("Unsupported Prefix");
    }
    byte[] bytes = DatatypeConverter.parseHexBinary(s.substring(3));
    if (bytes[8] != 0x60) {
      throw new IllegalArgumentException("Invalid Indicator");
    }
    byte[] salt = Arrays.copyOfRange(bytes, 0, 8);
    byte[] hash = Arrays.copyOfRange(bytes, 9, bytes.length);
    return new EncryptedKey(DEFAULT_PREFIX, salt, hash);
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

  public static EncryptedKey getInstanceFromPassword(String secret) {
    byte[] salt = new byte[8];
    random.nextBytes(salt);
    return hashWithSalt(secret, salt);
  }

  public static EncryptedKey hashWithSalt(String secret, byte[] salt) {
    byte[] hash = getSaltedHash(salt, (byte) 0x60, secret);
    return new EncryptedKey(DEFAULT_PREFIX, salt, hash);
  }

  public String getPrefix() {
    return prefix;
  }

  public byte[] getSalt() {
    return salt.clone();
  }

  public byte[] getHash() {
    return hash.clone();
  }

  public byte getIndicator() {
    return 0x60;
  }

  public boolean validate(String secret) {
    EncryptedKey other = hashWithSalt(secret, getSalt());
    return Arrays.equals(hash, other.hash);
  }

  @Override
  public String toString() {
    return new StringBuilder(prefix).append(":").append(DatatypeConverter.printHexBinary(salt))
        .append(Integer.toString(getIndicator(), 16).toUpperCase())
        .append(DatatypeConverter.printHexBinary(hash)).toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((prefix == null) ? 0 : prefix.hashCode());
    result = prime * result + Arrays.hashCode(salt);
    result = prime * result + Arrays.hashCode(hash);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    EncryptedKey other = (EncryptedKey) obj;
    if (!Arrays.equals(hash, other.hash))
      return false;
    if (prefix == null) {
      if (other.prefix != null)
        return false;
    } else if (!prefix.equals(other.prefix))
      return false;
    if (!Arrays.equals(salt, other.salt))
      return false;
    return true;
  }

  private static final int EXPBIAS = 6;

  public static byte[] getSaltedHash(byte[] salt, byte c, String secret) {
      try {
          MessageDigest d = MessageDigest.getInstance("SHA-1");
          int count = (16 + (c & 15)) << ((c >> 4) + EXPBIAS);
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
