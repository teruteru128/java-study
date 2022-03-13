package com.twitter.teruteru128.study.bitmessage;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.Arrays;
import java.util.function.Function;

import com.twitter.teruteru128.study.bitmessage.genaddress.BMAddress;
import com.twitter.teruteru128.study.bitmessage.genaddress.BMAddressGenerator;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 * @see https://github.com/Bitmessage/PyBitmessage/blob/a5773999fe1d6791bfc0cbb830527a5b29b84f5d/src/class_addressGenerator.py
 */
public class DeterministicAddressesGenerator implements Function<String, byte[]> {

    static {
        if (Security.getProvider("BC") == null) {
            Security.addProvider(new BouncyCastleProvider());
        }
    }

    @Override
    public byte[] apply(String passphrase) {
        int numberOfNullBytesDemandedOnFrontOfRipeHash = 1;
        int signingKeyNonce = 0;
        int encryptionKeyNonce = 1;
        MessageDigest sha512 = null;
        MessageDigest ripemd160 = null;
        try {
            sha512 = MessageDigest.getInstance("sha-512");
            ripemd160 = MessageDigest.getInstance("RIPEMD160");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
        final byte[] potentialPrivSigningKey = new byte[64];
        byte[] potentialPubSigningKey = null;
        final byte[] potentialPrivEncryptionKey = new byte[64];
        byte[] potentialPubEncryptionKey = null;

        int nlz = 0;
        final byte[] cache64 = new byte[Const.SHA512_DIGEST_LENGTH];
        final byte[] passphraseBytes = passphrase.getBytes(StandardCharsets.UTF_8);
        for (; nlz < numberOfNullBytesDemandedOnFrontOfRipeHash; signingKeyNonce += 2, encryptionKeyNonce += 2) {
            sha512.update(passphraseBytes);
            sha512.update(Structs.encodeVarint(signingKeyNonce));
            try {
                sha512.digest(potentialPrivSigningKey, 0, Const.SHA512_DIGEST_LENGTH);
            } catch (DigestException e) {
                e.printStackTrace();
            }
            sha512.update(passphraseBytes);
            sha512.update(Structs.encodeVarint(encryptionKeyNonce));
            try {
                sha512.digest(potentialPrivEncryptionKey, 0, Const.SHA512_DIGEST_LENGTH);
            } catch (DigestException e) {
                e.printStackTrace();
            }
            potentialPubSigningKey = Const.G
                    .multiply(new BigInteger(1, potentialPrivSigningKey, 0, Const.PRIVATE_KEY_LENGTH)).normalize()
                    .getEncoded(false);
            potentialPubEncryptionKey = Const.G
                    .multiply(new BigInteger(1, potentialPrivEncryptionKey, 0, Const.PRIVATE_KEY_LENGTH)).normalize()
                    .getEncoded(false);
            sha512.update(potentialPubSigningKey);
            sha512.update(potentialPubEncryptionKey);
            try {
                sha512.digest(cache64, 0, Const.SHA512_DIGEST_LENGTH);
            } catch (DigestException e) {
                e.printStackTrace();
            }
            ripemd160.update(cache64);
            try {
                ripemd160.digest(cache64, 0, Const.RIPEMD160_DIGEST_LENGTH);
            } catch (DigestException e) {
                e.printStackTrace();
            }
            for (nlz = 0; cache64[nlz] == 0 && nlz < Const.RIPEMD160_DIGEST_LENGTH; nlz++) {
            }
        }
        System.out.println(BMAddressGenerator.encodeWIF(Arrays.copyOf(potentialPrivSigningKey, 32)));
        System.out.println(BMAddressGenerator.encodeWIF(Arrays.copyOf(potentialPrivEncryptionKey, 32)));
        return Arrays.copyOf(cache64, Const.RIPEMD160_DIGEST_LENGTH);
    }

    public static void main(String[] args) throws Exception {
        var calcurator = new DeterministicAddressesGenerator();
        var passphrase = "UVB-76";
        var ripe = calcurator.apply(passphrase);
        var address3 = BMAddress.encodeAddress(3, 1, ripe);
        var address4 = BMAddress.encodeAddress(4, 1, ripe);
        System.out.println(address3);
        System.out.println(address4);
    }
}
