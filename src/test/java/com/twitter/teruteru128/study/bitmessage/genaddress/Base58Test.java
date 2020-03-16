package com.twitter.teruteru128.study.bitmessage.genaddress;

import static org.junit.Assert.assertEquals;

import javax.xml.bind.DatatypeConverter;

import org.junit.jupiter.api.Test;

public class Base58Test {

    public Base58Test() {
    }

    private byte[] parse(String a) {
        return DatatypeConverter.parseHexBinary(a);
    }

    @Test
    public void encodeTest() {
        var private_key = parse(
                "000111d38e5fc9071ffcd20b4a763cc9ae4f252bb4e48fd66a835e252ada93ff480d6dd43dc62a641155a5");

        Base58 base58 = new Base58();
        var key = base58.encode(private_key);
        assertEquals("123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz", key);
    }
}
