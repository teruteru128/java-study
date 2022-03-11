package com.twitter.teruteru128.tor.s2k;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import jakarta.xml.bind.DatatypeConverter;

public class EncryptedKeyTest {

  @Test
  void getInstanceSuccess() {
    var factory = new EncryptedKeyFactory();
    var key = factory.getInstance("16:85EE955FF128F01260A1CFA5C3BE947A512B8EFAD1BC410671E3DBBA2D");
    assertArrayEquals(key.getSalt(), DatatypeConverter.parseHexBinary("85EE955FF128F012"));
    assertArrayEquals(key.getHash(), DatatypeConverter.parseHexBinary("A1CFA5C3BE947A512B8EFAD1BC410671E3DBBA2D"));
    key = factory.getInstance("16:72FAE4A168BFD4B960381AF76E8204863A3A3C2FE96D48B4D6D92B9D16");
    assertArrayEquals(key.getSalt(), DatatypeConverter.parseHexBinary("72FAE4A168BFD4B9"));
    assertArrayEquals(key.getHash(), DatatypeConverter.parseHexBinary("381AF76E8204863A3A3C2FE96D48B4D6D92B9D16"));
  }

  @Test
  void getInstanceFail() {
    var factory = new EncryptedKeyFactory();
    // Invalid start
    assertThrows(IllegalArgumentException.class,
        () -> factory.getInstance("15:85EE955FF128F01260A1CFA5C3BE947A512B8EFAD1BC410671E3DBBA2D"));
    // Wrong length
    assertThrows(IllegalArgumentException.class,
        () -> factory.getInstance("16:85EE955FF128F01260A1CFA5C3BE947A512B8EFAD1BC410671E3DBBA2"));
    assertThrows(IllegalArgumentException.class,
        () -> factory.getInstance("16:85EE955FF128F01260A1CFA5C3BE947A512B8EFAD1BC410671E3DBBA2D0"));
    // Wrong indicator
    assertThrows(IllegalArgumentException.class,
        () -> factory.getInstance("16:85EE955FF128F01261A1CFA5C3BE947A512B8EFAD1BC410671E3DBBA2D"));
    // Ok
    assertNotNull(factory.getInstance("16:85EE955FF128F01260A1CFA5C3BE947A512B8EFAD1BC410671E3DBBA2D"));
  }
}
