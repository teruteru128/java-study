package com.twitter.teruteru128.study;

import java.math.BigInteger;

import javax.xml.bind.DatatypeConverter;

import com.twitter.teruteru128.study.bitmessage.Structs;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println(DatatypeConverter.printHexBinary(Structs.encodeVarint(0x1)));
        System.out.println(DatatypeConverter.printHexBinary(Structs.encodeVarint(0x10)));
        System.out.println(DatatypeConverter.printHexBinary(Structs.encodeVarint(0x100)));
        System.out.println(DatatypeConverter.printHexBinary(Structs.encodeVarint(0x1000)));
        System.out.println(DatatypeConverter.printHexBinary(Structs.encodeVarint(0x010000)));
        System.out.println(DatatypeConverter.printHexBinary(Structs.encodeVarint(0x100000)));
        System.out.println(DatatypeConverter.printHexBinary(Structs.encodeVarint(0x10000000)));
        System.out.println(DatatypeConverter.printHexBinary(Structs.encodeVarint(0x1000000000L)));
        System.out.println(DatatypeConverter.printHexBinary(Structs.encodeVarint(0x100000000000L)));
        System.out.println(DatatypeConverter.printHexBinary(Structs.encodeVarint(0x10000000000000L)));
        System.out.println(DatatypeConverter.printHexBinary(Structs.encodeVarint(0x1000000000000000L)));
        System.out.println(DatatypeConverter.printHexBinary(Structs.encodeVarint(9223372036854775807L)));
        System.out.println(DatatypeConverter.printHexBinary(Structs.encodeVarint(BigInteger.valueOf(0x1))));
        System.out.println(DatatypeConverter.printHexBinary(Structs.encodeVarint(BigInteger.valueOf(0x10))));
        System.out.println(DatatypeConverter.printHexBinary(Structs.encodeVarint(BigInteger.valueOf(0x100))));
        System.out.println(DatatypeConverter.printHexBinary(Structs.encodeVarint(BigInteger.valueOf(0x1000))));
        System.out.println(DatatypeConverter.printHexBinary(Structs.encodeVarint(BigInteger.valueOf(0x010000)))); // !!
        System.out.println(DatatypeConverter.printHexBinary(Structs.encodeVarint(BigInteger.valueOf(0x100000)))); // !!
        System.out.println(DatatypeConverter.printHexBinary(Structs.encodeVarint(BigInteger.valueOf(0x10000000))));
        System.out.println(DatatypeConverter.printHexBinary(Structs.encodeVarint(BigInteger.valueOf(0x1000000000L)))); // !!
        System.out.println(DatatypeConverter.printHexBinary(Structs.encodeVarint(BigInteger.valueOf(0x100000000000L)))); // !!
        System.out.println(DatatypeConverter.printHexBinary(Structs.encodeVarint(BigInteger.valueOf(0x10000000000000L)))); // !!
        System.out.println(DatatypeConverter.printHexBinary(Structs.encodeVarint(BigInteger.valueOf(0x1000000000000000L))));
        System.out.println(DatatypeConverter.printHexBinary(Structs.encodeVarint(BigInteger.valueOf(9223372036854775807L))));
        System.out.println(DatatypeConverter.printHexBinary(Structs.encodeVarint(new BigInteger("18446744073709551615", 10))));
        System.out.println(DatatypeConverter.printHexBinary(Structs.encodeVarint(new BigInteger("18446744073709551616", 10))));
    }
}
