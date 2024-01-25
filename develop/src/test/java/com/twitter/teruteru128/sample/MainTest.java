package com.twitter.teruteru128.sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @see <a href="https://oohira.github.io/junit5-doc-jp/user-guide/#writing-tests">テストを書く</a>
 */
public class MainTest {

    @Test
    public void myFirstTest() {
        assertEquals(2, 1 + 1);
    }
}
