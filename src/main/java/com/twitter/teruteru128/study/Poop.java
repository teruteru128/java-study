package com.twitter.teruteru128.study;

import java.security.KeyPairGenerator;
import java.security.Security;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

class Poop {

    public static void main(String[] args) throws Exception {
        String p = "\uD83D\uDCA9";
        System.out.println(p);
        var provider = Security.getProvider("BC");
        if(provider == null){
            Security.addProvider(provider = new BouncyCastleProvider());
        }
        var generator = KeyPairGenerator.getInstance("Ed25519");
        System.out.println(generator);
        var keyPair = generator.generateKeyPair();
        System.out.println(keyPair.getPrivate());
        System.out.println(keyPair.getPublic());
    }
}
