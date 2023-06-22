package com.twitter.teruteru128.study;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.EdECPrivateKey;
import java.security.interfaces.EdECPublicKey;
import java.security.interfaces.XECPrivateKey;
import java.security.interfaces.XECPublicKey;
import java.security.spec.EdECPoint;
import java.security.spec.EdECPrivateKeySpec;
import java.security.spec.EdECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.NamedParameterSpec;
import java.security.spec.XECPrivateKeySpec;
import java.security.spec.XECPublicKeySpec;
import java.util.HexFormat;

import javax.crypto.KeyAgreement;

public class Curve25519Sample {

    public static void x(byte[] pri, byte[] pub)
            throws NoSuchAlgorithmException, InvalidKeySpecException, InvalidKeyException {
        var format = HexFormat.of();
        var factory = KeyFactory.getInstance("X25519");
        var s0 = new XECPrivateKeySpec(NamedParameterSpec.X25519, pri);
        var s1 = new XECPublicKeySpec(NamedParameterSpec.X25519, new BigInteger(pub));
    
        var ag = KeyAgreement.getInstance("X25519");
    
        var prik = (XECPrivateKey) factory.generatePrivate(s0);
        var pubk = (XECPublicKey) factory.generatePublic(s1);
    
        var prispec = factory.getKeySpec(prik, XECPrivateKeySpec.class);
        var pubspec = factory.getKeySpec(pubk, XECPublicKeySpec.class);
    
        System.out.printf("private key: %s%n", format.formatHex(prispec.getScalar()));
        System.out.printf("public key: %x%n", pubspec.getU());
    
        ag.init(prik);
    
        ag.doPhase(pubk, true);
    
        var sec = ag.generateSecret();
        System.out.printf("%s%n", format.formatHex(sec));
    }

    public static void ed(byte[] pri, byte[] pub)
            throws NoSuchAlgorithmException, InvalidKeySpecException, InvalidKeyException, SignatureException {
        var format = HexFormat.of();
        var factory = KeyFactory.getInstance("Ed25519");
        var s0 = new EdECPrivateKeySpec(NamedParameterSpec.ED25519, pri);
        var s1 = new EdECPublicKeySpec(NamedParameterSpec.ED25519, new EdECPoint(false, new BigInteger(pub)));
        var sig = Signature.getInstance("Ed25519");
    
        var prik = (EdECPrivateKey) factory.generatePrivate(s0);
        var pubk = (EdECPublicKey) factory.generatePublic(s1);
    
        var prispec = factory.getKeySpec(prik, EdECPrivateKeySpec.class);
        var pubspec = factory.getKeySpec(pubk, EdECPublicKeySpec.class);
    
        System.out.printf("private key: %s%n", format.formatHex(prispec.getBytes()));
        var point = pubspec.getPoint();
        System.out.printf("public key: %b, %x%n", point.isXOdd(), point.getY());
    
        sig.initSign(prik);
    
        var msg = "brown fox jumps over the lazy dog".getBytes(StandardCharsets.UTF_8);
        sig.update(msg);
    
        var hash = sig.sign();
        System.out.printf("%s%n", format.formatHex(hash));
    
        sig.initVerify(pubk);
    
        sig.update(msg);
    
        var b = sig.verify(hash);
        System.out.println(b);
    }

    public static void sample()
            throws NoSuchAlgorithmException, InvalidKeySpecException, InvalidKeyException, SignatureException {
        var format = HexFormat.of();
        var pri = format.parseHex(
                "86575b7afeb80e1d8ba7b295e06edc0de9fc53fb90981daebbecef93c6ff1a8c");
        var pub = format.parseHex("1e6d78bf292bae807135fe2385c72ac353151a6cfed6bf573edb45278053558f");
        ed(pri, pub);
        x(pri, pub);
    }
    
}
