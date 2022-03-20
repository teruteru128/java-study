package com.twitter.teruteru128.collatz;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * 
 */
public class DBMainTest {

    @Test
    void testIsPow() {
        assertTrue(DBMain.isPow(3486784401L, 3));
    }
}
