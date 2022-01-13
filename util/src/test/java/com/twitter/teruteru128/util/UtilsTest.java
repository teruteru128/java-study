package com.twitter.teruteru128.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UtilsTest {
    public UtilsTest() {
        super();
    }

    @Test
    public void toBinStringTest() {
        assertEquals("01011010", Utils.toBinString((byte) 0x5A));
        assertEquals("0000000001011010", Utils.toBinString((short) 0x5A));
        assertEquals("00000000000000000000000001011010", Utils.toBinString((int) 0x5A));
        assertEquals("0000000000000000000000000000000000000000000000000000000001011010", Utils.toBinString((long) 0x5A));
        assertEquals("00111111100000000000000000000000", Utils.toBinString(0x1p0f));
        assertEquals("0011111111110000000000000000000000000000000000000000000000000000", Utils.toBinString(0x1p0));
    }
}
