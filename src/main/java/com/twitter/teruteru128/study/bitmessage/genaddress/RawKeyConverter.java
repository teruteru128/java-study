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
        final byte[] inputRipe = DatatypeConverter.parseHexBinary("000000003ea1a3d7bdaae62832fc367ed4fb5284");
        final byte[] privateSigningKey = DatatypeConverter
                .parseHexBinary("c904ba4d973b94b3dd3c38a70f6c898745502df4cef1017b2b9544f6a171d63b");
        final byte[] privateEncrytionKey = DatatypeConverter
                .parseHexBinary("fc061ce82e9b49141e6fe7fdf37c7aa21de8c054be89ef44f2076a5b3321462c");

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
