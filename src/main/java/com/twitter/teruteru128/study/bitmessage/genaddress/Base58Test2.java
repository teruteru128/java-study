package com.twitter.teruteru128.study.bitmessage.genaddress;

import javax.xml.bind.DatatypeConverter;

class Base58Test2 {

    private static byte[] parse(String a) {
        return DatatypeConverter.parseHexBinary(a);
    }

    public static void main(String[] args) {
        var private_key = parse(
                "000111d38e5fc9071ffcd20b4a763cc9ae4f252bb4e48fd66a835e252ada93ff480d6dd43dc62a641155a5");

        Base58 base58 = new Base58();
        var key = base58.encode(private_key);
        assert ("123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz".equals(key));
        System.out.println(key);
    }
}
