package com.github.teruteru128.bitmessage.genaddress;

import java.math.BigInteger;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.Arrays;
import java.util.HexFormat;

import com.github.teruteru128.bitmessage.spec.AddressFactory;
import com.github.teruteru128.bitmessage.spec.KeyPair;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import com.github.teruteru128.bitmessage.Const;

public class RawKeyConverter {

    static {
        // RIPEMD160のためにプロバイダを追加
        Provider provider = Security.getProvider("BC");
        if (provider == null) {
            Security.addProvider(provider = new BouncyCastleProvider());
        }
    }

    private static byte[] convertPublicKey(byte[] privateKey) {
        return Const.SEC_P256_K1_G.multiply(new BigInteger(1, privateKey)).normalize()
                .getEncoded(false);
    }

    public static void main(String[] args) throws NoSuchAlgorithmException, DigestException {
        var format = HexFormat.of();
        final byte[] inputRipe = format.parseHex("00AEA57C192EA1A7E71FCCD70EBD219F5CF5D11A");
        final byte[] privateSigningKey = format
                .parseHex("78245a8b9d8fd679d567368537e5e079ea21dd7855a53baba54c69b70a8dc0a6");
        final byte[] privateEncrytionKey = format
                .parseHex("ae6819a4de5ee0bccfe99263b1987972b8b059d289d54657d80822507a0fc72c");

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

        final String address4 = AddressFactory.encodeAddress(4, 1, ripe);
        System.out.print("ripe : ");
        System.out.print(format.formatHex(ripe));
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
