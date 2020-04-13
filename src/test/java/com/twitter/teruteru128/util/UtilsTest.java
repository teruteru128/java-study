package com.twitter.teruteru128.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UtilsTest {
    public UtilsTest() {
        super();
    }

    @Test
    public void toBinStringTest() {
        assertEquals(Utils.toBinString((byte) 0x5A), "01011010");
        assertEquals(Utils.toBinString((short) 0x5A), "0000000001011010");
        assertEquals(Utils.toBinString((int) 0x5A), "00000000000000000000000001011010");
        assertEquals(Utils.toBinString((long) 0x5A), "0000000000000000000000000000000000000000000000000000000001011010");
        assertEquals(Utils.toBinString(0x1p0f), "00111111100000000000000000000000");
        assertEquals(Utils.toBinString(0x1p0), "0011111111110000000000000000000000000000000000000000000000000000");
    }
}
