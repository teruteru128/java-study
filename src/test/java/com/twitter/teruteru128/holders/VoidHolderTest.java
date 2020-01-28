package com.twitter.teruteru128.holders;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class VoidHolderTest {

    @Test
    public void test() {
        assertNotNull(VoidHolder.getInstance());
    }
}
