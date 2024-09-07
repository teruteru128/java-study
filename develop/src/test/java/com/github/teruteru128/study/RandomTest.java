package com.github.teruteru128.study;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.random.RandomGenerator;
import org.junit.jupiter.api.Test;

/**
 * @see <a href="https://oohira.github.io/junit5-doc-jp/user-guide/#writing-tests">テストを書く</a>
 */
public class RandomTest {

    @Test
    public void myFirstTest() {
        assertEquals(2, 1 + 1);
    }

    @Test
    void nextDouble() {
        assertEquals(0.5, Random.nextDouble(RandomGenerator.getDefault()), 0.5);
    }
}
