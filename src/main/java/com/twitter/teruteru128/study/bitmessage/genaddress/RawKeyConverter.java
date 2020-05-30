package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.math.BigInteger;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.Arrays;

import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import jakarta.xml.bind.DatatypeConverter;

class RawKeyConverter {
    public static void main(String[] args) throws NoSuchAlgorithmException, DigestException {
        // RIPEMD160のためにプロバイダを追加
        Provider provider = Security.getProvider("BC");
        if (provider == null) {
            Security.addProvider(provider = new BouncyCastleProvider());
        }
        // ripe = 00000d9663f57318b4e52288bfdc8b3c23e84de1
        // private signing key =
        // 684dc32a7343005b94a3350045e190cc09df6e2684de81f517397a3655167120
        // private encrytion key =
        // 8c518358935fccf4beb4b808e13acf48c6a9ad27827eaf1df31cc3c6db3d2f09
        final byte[] inputRipe = DatatypeConverter.parseHexBinary("0000000502cb9c65c1b7ec5f56dd925b6f0051d2");
        final byte[] privateSigningKey = DatatypeConverter
                .parseHexBinary("9a2faa5bdf7725452e0037a94390e538f3335bfce2e0d8683c3a3cda8d7b2956");
        final byte[] privateEncrytionKey = DatatypeConverter
                .parseHexBinary("c1752d82a74904e438dffb40c54b43d5387a42dd6f9437b9bb474d91f2450e8c");

        final var g = CustomNamedCurves.getByName("secp256k1").getG();
        final byte[] pubSigningKey = g.multiply(new BigInteger(1, privateSigningKey)).normalize().getEncoded(false);
        final byte[] pubEncryptionKey = g.multiply(new BigInteger(1, privateEncrytionKey)).normalize()
                .getEncoded(false);
        final MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
        final MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");
        final byte[] sha512hash = new byte[64];
        final byte[] ripe = new byte[20];
        sha512.update(pubSigningKey, 0, 65);
        sha512.update(pubEncryptionKey, 0, 65);
        sha512.digest(sha512hash, 0, 64);
        ripemd160.update(sha512hash, 0, 64);
        ripemd160.digest(ripe, 0, 20);

        final String address4 = BMAddress.encodeAddress(4, 1, ripe);
        System.out.print("ripe : ");
        System.out.print(DatatypeConverter.printHexBinary(ripe));
        boolean isMatch = Arrays.equals(ripe, inputRipe);
        System.out.print(" (");
        System.out.print(isMatch ? "match" : "not match");
        System.out.println(")");
        System.out.print("v4 address calculated from ripe : ");
        System.out.println(address4);
        System.out.println();
        if (isMatch) {
            final Response response = new Response(new KeyPair(privateSigningKey, pubSigningKey),
                    new KeyPair(privateEncrytionKey, pubEncryptionKey), ripe);
            BMAddressGenerator.exportAddressToStdout(response);
        }
    }
}
