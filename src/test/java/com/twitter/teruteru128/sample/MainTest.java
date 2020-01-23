package com.twitter.teruteru128.sample;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @see https://oohira.github.io/junit5-doc-jp/user-guide/#writing-tests
*/
public class MainTest{
    @Test
    void myFirstTest(){
        assertEquals(2, 1+1);
    }
}
