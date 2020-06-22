package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.math.BigInteger;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.Arrays;

import com.twitter.teruteru128.study.bitmessage.Const;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import jakarta.xml.bind.DatatypeConverter;

class RawKeyConverter {
    public static void main(String[] args) throws NoSuchAlgorithmException, DigestException {
        // RIPEMD160のためにプロバイダを追加
        Provider provider = Security.getProvider("BC");
        if (provider == null) {
            Security.addProvider(provider = new BouncyCastleProvider());
        }
        final byte[] inputRipe = DatatypeConverter.parseHexBinary("0000006FC4393057B704A7FD278C33D95DE3E9B0");
        final byte[] privateSigningKey = DatatypeConverter
                .parseHexBinary("8e2dd1c3a8c7740c5140d4d641bf191df606092a672fe4e32c138f12df14b7bc");
        final byte[] privateEncrytionKey = DatatypeConverter
                .parseHexBinary("92f5045ff8e43afbafcc56b063c0a34c856c6f67e0dab6e605aa7901529d09c9");

        final byte[] pubSigningKey = Const.G.multiply(new BigInteger(1, privateSigningKey)).normalize().getEncoded(false);
        final byte[] pubEncryptionKey = Const.G.multiply(new BigInteger(1, privateEncrytionKey)).normalize()
                .getEncoded(false);
        final MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
        final MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");
        final byte[] sha512hash = new byte[Const.SHA512_DIGEST_LENGTH];
        final byte[] ripe = new byte[Const.RIPEMD160_DIGEST_LENGTH];
        sha512.update(pubSigningKey, 0, Const.PUBLIC_KEY_LENGTH);
        sha512.update(pubEncryptionKey, 0, Const.PUBLIC_KEY_LENGTH);
        sha512.digest(sha512hash, 0, Const.SHA512_DIGEST_LENGTH);
        ripemd160.update(sha512hash, 0, Const.SHA512_DIGEST_LENGTH);
        ripemd160.digest(ripe, 0, Const.RIPEMD160_DIGEST_LENGTH);

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
            BMAddressGenerator.exportAddress(response);
        }
    }
}
