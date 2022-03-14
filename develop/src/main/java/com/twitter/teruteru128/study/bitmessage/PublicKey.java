package com.twitter.teruteru128.study.bitmessage;

import java.io.Serializable;

/**
 * PublicKey
 */
public class PublicKey implements Serializable {

    byte[] key;

    public PublicKey(byte[] key) {
        this.key = key;
    }

    public byte[] getKey() {
      return key;
    }
}
