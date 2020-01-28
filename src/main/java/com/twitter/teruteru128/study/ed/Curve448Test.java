package com.twitter.teruteru128.study.ed;

import java.security.KeyPairGenerator;
import java.security.spec.NamedParameterSpec;

class Curve448Test {

    public static void main(String[] args) throws Exception {
        var keyPairGenerator = KeyPairGenerator.getInstance("XDH");
        var x448Spec = new NamedParameterSpec("X448");
        keyPairGenerator.initialize(x448Spec);
        System.out.println(keyPairGenerator);
        var x25519Spec = new NamedParameterSpec("X25519");
        keyPairGenerator.initialize(x25519Spec);
        System.out.println(keyPairGenerator);
    }
}
