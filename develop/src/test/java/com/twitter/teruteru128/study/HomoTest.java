package com.twitter.teruteru128.study;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HomoTest {

    @Test
    void getHomo() {
        assertThrows(IllegalArgumentException.class, () -> {
            Homo.getHomo(-1);
        });
        assertArrayEquals("┌( ^o^)┐".toCharArray(), Homo.getHomo(0));
        assertArrayEquals("┌(┌ ^o^)┐".toCharArray(), Homo.getHomo(1));
        assertArrayEquals(("┌(" + "┌".repeat(100) + " ^o^)┐").toCharArray(), Homo.getHomo(100));
    }
}
