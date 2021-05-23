package com.twitter.teruteru128.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

public class ArraysTest {

    @Test
    public void toHexStringTestByteArray() {
        assertEquals("e4bcafe696b9e381aee5a1a9", Arrays.toHexString("伯方の塩".getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    public void toHexStringTestCharArray() {
        assertEquals("4f2f65b9306e5869", Arrays.toHexString("伯方の塩".toCharArray()));
    }
}
