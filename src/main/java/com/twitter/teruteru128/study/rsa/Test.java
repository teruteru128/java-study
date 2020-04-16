package com.twitter.teruteru128.study.rsa;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import com.twitter.teruteru128.util.Arrays;

public class Test {

    public static void main(String[] args) {
        try {
            KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
            kpg.initialize(4096, SecureRandom.getInstance("SHA1PRNG"));
            KeyPair kp = kpg.generateKeyPair();
            System.out.println(Arrays.toHexString(kp.getPrivate().getEncoded()));
            System.out.println(kp.getPrivate().getFormat());
            System.out.println(Arrays.toHexString(kp.getPublic().getEncoded()));
            System.out.println(kp.getPublic().getFormat());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

}
