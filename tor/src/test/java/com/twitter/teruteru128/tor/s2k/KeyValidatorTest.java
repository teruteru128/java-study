package com.twitter.teruteru128.tor.s2k;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class KeyValidatorTest {
  public KeyValidatorTest() {
  }

  @Test
  public void validate() {
    var generator = new EncryptedKeyGenerator();
    var hash = generator.getInstance("ride the wild Pony");
    var validator = new EncryptedKeyValidator();
    assertTrue(validator.validate(hash, "ride the wild Pony"));
    assertFalse(validator.validate(hash, "some other password"));
    var factory = new EncryptedKeyFactory();
    assertEquals(factory.getInstance(hash.toString()), hash);
    hash = factory.getInstance("16:17AEC9679C42F075600CF835CE02ECAB6D297F27D233E150D3EA71DB9A");
    assertTrue(validator.validate(hash, "test"), "test failed!");
  }
}
