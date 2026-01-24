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

        // コーナーケース1: mantissa == 0 && exp == 0 && random.nextBoolean() == true -> return 1.0
        random.addLong(0);
        random.addBoolean(true);
        var value = MyRandom.nextDouble(random);
        // 0以上1未満であることをチェック (0.0 <= value < 1.0)
        assertTrue(value >= 0.0 && value < 1.0,
            "値は0以上1未満であるべきです: " + value);

        // コーナーケース2: initial exponent == -12 && 16回以上連続 nextLong() == -1
        random.addLong(0xfff0000000000000L);
        random.addLong(-1);
        random.addLong(-1);
        random.addLong(-1);
        random.addLong(-1);
        random.addLong(-1);
        random.addLong(-1);
        random.addLong(-1);
        random.addLong(-1);
        random.addLong(-1);
        random.addLong(-1);
        random.addLong(-1);
        random.addLong(-1);
        random.addLong(-1);
        random.addLong(-1);
        random.addLong(-1);
        random.addLong(-1);
        // 無限ループ再現は不可能なので打ち切り
        random.addLong(0);
        var value1 = MyRandom.nextDouble(random);
        // 0以上1未満であることをチェック (0.0 <= value < 1.0)
        assertTrue(value1 >= 0.0 && value1 < 1.0,
            "値は0以上1未満であるべきです: " + value1);
    }
}
