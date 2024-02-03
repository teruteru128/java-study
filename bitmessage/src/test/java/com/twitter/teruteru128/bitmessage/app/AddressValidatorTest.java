package com.twitter.teruteru128.bitmessage.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AddressValidatorTest {

    @Test
    void test1() {
        String address = "BM-2cW67GEKkHGonXKZLCzouLLxnLym3azS8r";
        assertTrue(AddressValidator.validate(address));
    }
}
