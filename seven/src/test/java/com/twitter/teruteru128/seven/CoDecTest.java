package com.twitter.teruteru128.seven;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CoDecTest {

    @Test
    public void encodeTest() {
        assertEquals(CoDec.encode("テスト"), "110000011010011011000001000110101100000111100110");
    }

    @Test
    public void decodeTest() {
        assertEquals(CoDec.decode("110000011010011011000001000110101100000111100110"), "テスト");
    }
}
