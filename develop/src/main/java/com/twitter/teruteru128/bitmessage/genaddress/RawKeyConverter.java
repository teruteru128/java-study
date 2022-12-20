package com.twitter.teruteru128.bitmessage.genaddress;

import java.math.BigInteger;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.Arrays;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import com.twitter.teruteru128.bitmessage.Const;
import com.twitter.teruteru128.bitmessage.spec.BMAddress;
import com.twitter.teruteru128.bitmessage.spec.KeyPair;

import jakarta.xml.bind.DatatypeConverter;

public class RawKeyConverter {

    static {
        // RIPEMD160のためにプロバイダを追加
        Provider provider = Security.getProvider("BC");
        if (provider == null) {
            Security.addProvider(provider = new BouncyCastleProvider());
        }
    }

    private static byte[] convertPublicKey(byte[] privateKey) {
        return Const.G.multiply(new BigInteger(1, privateKey)).normalize()
                .getEncoded(false);
    }

    public static void main(String[] args) throws NoSuchAlgorithmException, DigestException {
        final byte[] inputRipe = DatatypeConverter.parseHexBinary("00AEA57C192EA1A7E71FCCD70EBD219F5CF5D11A");
        final byte[] privateSigningKey = DatatypeConverter
                .parseHexBinary("78245a8b9d8fd679d567368537e5e079ea21dd7855a53baba54c69b70a8dc0a6");
        final byte[] privateEncrytionKey = DatatypeConverter
                .parseHexBinary("ae6819a4de5ee0bccfe99263b1987972b8b059d289d54657d80822507a0fc72c");

        final byte[] pubSigningKey = convertPublicKey(privateSigningKey);
        final byte[] pubEncryptionKey = convertPublicKey(privateEncrytionKey);
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
            System.out.println(BMAddressGenerator.encodeWIF(privateSigningKey));
            System.out.println(BMAddressGenerator.encodeWIF(privateEncrytionKey));
        }
    }
}
