package com.twitter.teruteru128.study;

import java.security.KeyPairGenerator;
import java.security.spec.NamedParameterSpec;

import javax.crypto.KeyAgreement;

class Poop {

    public static void main(String[] args) throws Exception {
        String p = "\uD83D\uDCA9";
        System.out.println(p);
        var generator = KeyPairGenerator.getInstance("XDH");
        NamedParameterSpec parameterSpec = new NamedParameterSpec("X25519");
        generator.initialize(parameterSpec);
        System.out.println(generator);
        var keyPair = generator.generateKeyPair();
        System.out.println(keyPair.getPrivate());
        System.out.println(keyPair.getPublic());
        KeyAgreement agreement = KeyAgreement.getInstance("XDH");
        agreement.init(keyPair.getPrivate());
    }
}
