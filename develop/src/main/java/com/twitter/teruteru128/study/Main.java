package com.twitter.teruteru128.study;

import java.security.Security;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 * Main
 */
public class Main {

    static {
        if (Security.getProvider("BC") == null) {
            Security.addProvider(new BouncyCastleProvider());
        }
    }

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
    }

}
