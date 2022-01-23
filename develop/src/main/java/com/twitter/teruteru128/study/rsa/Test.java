package com.twitter.teruteru128.study.rsa;

import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import jakarta.xml.bind.DatatypeConverter;

public class Test {

    public static void main(String[] args) {
        try {
            var kpg = KeyPairGenerator.getInstance("RSA");
            kpg.initialize(4096, SecureRandom.getInstance("SHA1PRNG"));
            var pair = kpg.generateKeyPair();
            System.out.println(DatatypeConverter.printHexBinary(pair.getPrivate().getEncoded()));
            System.out.println(pair.getPrivate().getFormat());
            System.out.println(DatatypeConverter.printHexBinary(pair.getPublic().getEncoded()));
            System.out.println(pair.getPublic().getFormat());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

}
