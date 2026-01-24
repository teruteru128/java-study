package com.github.teruteru128.study;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * @see <a href="https://oohira.github.io/junit5-doc-jp/user-guide/#writing-tests">テストを書く</a>
 */
public class MyRandomTest {

    @Test
    public void myFirstTest() {
        assertEquals(2, 1 + 1);
    }

    @Test
    void nextDouble() {
        var random = new DeterministicRandom();
        random.addLong(0);
        random.addBoolean(true);
        var value = MyRandom.nextDouble(random);
        // 0以上1未満であることをチェック (0.0 <= value < 1.0)
        assertTrue(value >= 0.0 && value < 1.0,
            "値は0以上1未満であるべきです: " + value);
    }
}
