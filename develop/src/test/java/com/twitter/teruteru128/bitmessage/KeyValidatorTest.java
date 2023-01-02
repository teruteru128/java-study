package com.twitter.teruteru128.bitmessage;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.twitter.teruteru128.bitmessage.KeyValidator;

/**
 * KeyValidator
 */
class KeyValidatorTest {

    @Test
    void test1() {
        String address = "BM-NBJxKhQmidR2TBtD3H74yZhDHpzZ7TXM";
        String privSigningKeyWIF = "5KSKK9tJfuMrkUfwBqGS3ktfPix5zZBtgxAao2GtKeUgJNpEo6R";
        String privEncryptionKeyWIF = "5KUoQKDmcmAKpjaas3k9U6bGFN5Nz937zqLqDDo1sNUqeJCiMZn";
        var v = new KeyValidator();
        assertTrue(v.validate(address, privSigningKeyWIF, privEncryptionKeyWIF));
    }
}
