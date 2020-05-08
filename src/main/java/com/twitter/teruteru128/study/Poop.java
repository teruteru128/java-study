package com.twitter.teruteru128.study;

import java.security.KeyPairGenerator;
import java.security.spec.ECGenParameterSpec;

import javax.crypto.KeyAgreement;

class Poop {

    public static void main(String[] args) throws Exception {
        // U+1F4A9
        String p = "\uD83D\uDCA9";
        System.out.println(p);
        System.out.printf("%#08x%n", p.codePointAt(0));
        var generator = KeyPairGenerator.getInstance("EC");
        ECGenParameterSpec parameterSpec = new ECGenParameterSpec("secp256k1");
        generator.initialize(parameterSpec);
        System.out.println(generator);
        var keyPair = generator.generateKeyPair();
        System.out.println(keyPair.getPrivate());
        System.out.println(keyPair.getPublic());
        KeyAgreement agreement = KeyAgreement.getInstance("ECDH");
        agreement.init(keyPair.getPrivate());
    }
}
