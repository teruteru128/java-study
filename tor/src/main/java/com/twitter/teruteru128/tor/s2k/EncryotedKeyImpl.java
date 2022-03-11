package com.twitter.teruteru128.tor.s2k;

import java.util.Arrays;

import jakarta.xml.bind.DatatypeConverter;

class EncryptedKeyImpl implements EncryptedKey {
  protected String prefix;
  protected byte[] salt;
  protected byte indicator;
  protected byte[] hash;

  public EncryptedKeyImpl(String prefix, byte[] salt, byte indicator, byte[] hash) {
    this.prefix = prefix;
    this.salt = salt;
    this.indicator = indicator;
    this.hash = hash;
  }

  public EncryptedKeyImpl(String prefix, byte[] salt, byte[] hash) {
    this(prefix, salt, DEFAULT_INDICATOR, hash);
  }

  public EncryptedKeyImpl(byte[] salt, byte[] hash) {
    this(DEFAULT_PREFIX, salt, hash);
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
    return indicator;
  }

  @Override
  public String toString() {
    return new StringBuilder(prefix).append(":").append(DatatypeConverter.printHexBinary(salt))
        .append(Integer.toString(indicator, 16).toUpperCase())
        .append(DatatypeConverter.printHexBinary(hash)).toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + Arrays.hashCode(hash);
    result = prime * result + indicator;
    result = prime * result + ((prefix == null) ? 0 : prefix.hashCode());
    result = prime * result + Arrays.hashCode(salt);
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
    EncryptedKeyImpl other = (EncryptedKeyImpl) obj;
    if (!Arrays.equals(hash, other.hash))
      return false;
    if (indicator != other.indicator)
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

}