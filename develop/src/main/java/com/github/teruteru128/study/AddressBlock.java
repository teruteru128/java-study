package com.github.teruteru128.study;

public record AddressBlock(int version, String privateSigningKey, String privateEncryptionKey) {

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof AddressBlock(
        int version1, String signingKey, String encryptionKey
    ))) {
      return false;
    }

    return version == version1 && privateSigningKey.equals(signingKey)
           && privateEncryptionKey.equals(encryptionKey);
  }

  @Override
  public int hashCode() {
    int result = version;
    result = 31 * result + privateSigningKey.hashCode();
    result = 31 * result + privateEncryptionKey.hashCode();
    return result;
  }

}
