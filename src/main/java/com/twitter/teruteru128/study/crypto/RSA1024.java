package com.twitter.teruteru128.study.crypto;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

import com.twitter.teruteru128.study.rsa.util.Const;

class RSA1024 {

    /**
     * @param args
     * @throws Exception
     * @see https://en.wikipedia.org/wiki/RSA_numbers#RSA-1024
     */
    public static void main(String[] args) throws Exception {
        BigInteger n = Const.N;
        BigInteger e = BigInteger.valueOf(65537);

        RSAPublicKeySpec pubSpec = new RSAPublicKeySpec(n, e);
        // System.out.println(n.bitLength());

        KeyFactory factory = KeyFactory.getInstance("RSA");
        PublicKey pubKey = factory.generatePublic(pubSpec);
        // System.out.println(pubKey);

        X509EncodedKeySpec x509Spec = factory.getKeySpec(pubKey, X509EncodedKeySpec.class);
        System.out.write(Base64.getMimeEncoder().encode(x509Spec.getEncoded()));
    }

}
