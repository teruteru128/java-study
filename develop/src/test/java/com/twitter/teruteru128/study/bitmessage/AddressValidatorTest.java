package com.twitter.teruteru128.study.bitmessage;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.twitter.teruteru128.study.bitmessage.AddressValidator;

class AddressValidatorTest {

    @Test
    void test1() {
        String address = "BM-NBJxKhQmidR2TBtD3H74yZhDHpzZ7TXM";
        assertTrue(AddressValidator.validate(address));
    }
}
