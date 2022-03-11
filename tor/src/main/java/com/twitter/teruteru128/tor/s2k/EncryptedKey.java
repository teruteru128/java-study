package com.twitter.teruteru128.tor.s2k;

interface EncryptedKey {
  public static final String DEFAULT_PREFIX = "16";
  public static final byte DEFAULT_INDICATOR = 0x60;

  public String getPrefix();

  public byte[] getSalt();

  public byte[] getHash();

  public byte getIndicator();

}
