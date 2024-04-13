package com.github.teruteru128.sample;

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

public class Curve25519Sample implements Sample {

    private static final HexFormat format = HexFormat.of();

    public void xdh(byte[] pri, byte[] pub)
            throws NoSuchAlgorithmException, InvalidKeySpecException, InvalidKeyException {
        var factory = KeyFactory.getInstance("X25519");
        var s0 = new XECPrivateKeySpec(NamedParameterSpec.X25519, pri);
        var s1 = new XECPublicKeySpec(NamedParameterSpec.X25519, new BigInteger(1, pub));

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

    public void eddsa(byte[] pri, byte[] pub)
            throws NoSuchAlgorithmException, InvalidKeySpecException, InvalidKeyException, SignatureException {
        var factory = KeyFactory.getInstance("Ed25519");
        var sig = Signature.getInstance("Ed25519");

        var privateKeySpec = new EdECPrivateKeySpec(NamedParameterSpec.ED25519, pri);
        var prik = (EdECPrivateKey) factory.generatePrivate(privateKeySpec);

        var point = new EdECPoint(false, new BigInteger(pub));
        var publicKeySpec = new EdECPublicKeySpec(NamedParameterSpec.ED25519, point);
        var pubk = (EdECPublicKey) factory.generatePublic(publicKeySpec);

        var prispec = factory.getKeySpec(prik, EdECPrivateKeySpec.class);
        var pubspec = factory.getKeySpec(pubk, EdECPublicKeySpec.class);

        System.out.printf("private key: %s%n", format.formatHex(prispec.getBytes()));
        var eDECpoint = pubspec.getPoint();
        System.out.printf("public key: %b, %x%n", eDECpoint.isXOdd(), eDECpoint.getY());

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

    @Override
    public void sample()
            throws NoSuchAlgorithmException, InvalidKeySpecException, InvalidKeyException, SignatureException {
        var pri = format.parseHex(
                "86575b7afeb80e1d8ba7b295e06edc0de9fc53fb90981daebbecef93c6ff1a8c");
        var pub = format.parseHex("1e6d78bf292bae807135fe2385c72ac353151a6cfed6bf573edb45278053558f");
        eddsa(pri, pub);
        xdh(pri, pub);
    }

}
