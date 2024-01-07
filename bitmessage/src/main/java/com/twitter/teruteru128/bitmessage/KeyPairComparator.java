package com.twitter.teruteru128.bitmessage;

import java.util.Arrays;
import java.util.Comparator;

import com.twitter.teruteru128.bitmessage.spec.KeyPair;

/**
 * KeyPairComparator
 */
public class KeyPairComparator implements Comparator<KeyPair> {

  @Override
  public int compare(KeyPair o1, KeyPair o2) {
    return Arrays.compare(o1.getPublicKey(), o2.getPublicKey());
  }
}