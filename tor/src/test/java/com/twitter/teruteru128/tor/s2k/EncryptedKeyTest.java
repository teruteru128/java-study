package com.twitter.teruteru128.tor.s2k;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import jakarta.xml.bind.DatatypeConverter;

public class EncryptedKeyTest {

  @Test
  void getInstanceSuccess() {
    var key = EncryptedKey.getInstance("16:85EE955FF128F01260A1CFA5C3BE947A512B8EFAD1BC410671E3DBBA2D");
    assertArrayEquals(key.getSalt(), DatatypeConverter.parseHexBinary("85EE955FF128F012"));
    assertArrayEquals(key.getHash(), DatatypeConverter.parseHexBinary("A1CFA5C3BE947A512B8EFAD1BC410671E3DBBA2D"));
    key = EncryptedKey.getInstance("16:72FAE4A168BFD4B960381AF76E8204863A3A3C2FE96D48B4D6D92B9D16");
    assertArrayEquals(key.getSalt(), DatatypeConverter.parseHexBinary("72FAE4A168BFD4B9"));
    assertArrayEquals(key.getHash(), DatatypeConverter.parseHexBinary("381AF76E8204863A3A3C2FE96D48B4D6D92B9D16"));
  }

  @Test
  void getInstanceFail() {
    // Invalid start
    assertThrows(IllegalArgumentException.class,
        () -> EncryptedKey.getInstance("15:85EE955FF128F01260A1CFA5C3BE947A512B8EFAD1BC410671E3DBBA2D"));
    // Wrong length
    assertThrows(IllegalArgumentException.class,
        () -> EncryptedKey.getInstance("16:85EE955FF128F01260A1CFA5C3BE947A512B8EFAD1BC410671E3DBBA2"));
    assertThrows(IllegalArgumentException.class,
        () -> EncryptedKey.getInstance("16:85EE955FF128F01260A1CFA5C3BE947A512B8EFAD1BC410671E3DBBA2D0"));
    // Wrong indicator
    assertThrows(IllegalArgumentException.class,
        () -> EncryptedKey.getInstance("16:85EE955FF128F01261A1CFA5C3BE947A512B8EFAD1BC410671E3DBBA2D"));
    // Ok
    assertNotNull(EncryptedKey.getInstance("16:85EE955FF128F01260A1CFA5C3BE947A512B8EFAD1BC410671E3DBBA2D"));
  }

  @Test
  public void validate() {
    var password = "ride the wild Pony";
    var hash = EncryptedKey.getInstanceFromPassword(password);
    assertTrue(hash.validate(password));
    assertFalse(hash.validate("some other password"));
    assertEquals(EncryptedKey.getInstance(hash.toString()), hash);
    hash = EncryptedKey.getInstance("16:17AEC9679C42F075600CF835CE02ECAB6D297F27D233E150D3EA71DB9A");
    assertTrue(hash.validate("test"), "test failed!");
  }
}
