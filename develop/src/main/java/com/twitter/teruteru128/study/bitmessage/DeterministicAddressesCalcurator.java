package com.twitter.teruteru128.study.bitmessage;

import java.lang.System.Logger;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.Arrays;
import java.util.function.BiFunction;

import com.twitter.teruteru128.study.bitmessage.genaddress.BMAddress;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 * @see https://github.com/Bitmessage/PyBitmessage/blob/6f35da4096770a668c4944c3024cd7ddb34be092/src/class_addressGenerator.py
 *      TODO: Functionにする 1変数関数だったり2変数関数だったりどうするんですかね？
 */
public class DeterministicAddressesCalcurator implements BiFunction<String, Integer, String> {

    @Override
    public String apply(String passphrase, Integer addressVersionNumber) {
        int streamNumber = 1;
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
        String address = BMAddress.encodeAddress(addressVersionNumber, streamNumber,
                Arrays.copyOf(cache64, Const.RIPEMD160_DIGEST_LENGTH));
        /*
         * BMAddressGenerator.exportAddress(new Response( new
         * KeyPair(Arrays.copyOf(potentialPrivSigningKey, Const.PRIVATE_KEY_LENGTH),
         * potentialPubSigningKey), new
         * KeyPair(Arrays.copyOf(potentialPrivEncryptionKey, Const.PRIVATE_KEY_LENGTH),
         * potentialPubEncryptionKey), Arrays.copyOf(cache64,
         * Const.RIPEMD160_DIGEST_LENGTH)));
         */
        return address;
    }

    public static void main(String[] args) throws Exception {
        Provider provider = Security.getProvider("BC");
        if (provider == null) {
            provider = new BouncyCastleProvider();
            Security.addProvider(provider);
        }
        var calcurator = new DeterministicAddressesCalcurator();
        var passphrase = "110101195306153019";
        String address3 = calcurator.apply(passphrase, 3);
        String address4 = calcurator.apply(passphrase, 4);
        System.getLogger("BM").log(Logger.Level.INFO, address3);
        System.getLogger("BM").log(Logger.Level.INFO, address4);
    }
}
