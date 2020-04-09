package com.twitter.teruteru128.study.bitmessage;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.Arrays;
import java.util.concurrent.Callable;

import com.twitter.teruteru128.study.bitmessage.genaddress.BMAddress;

import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 * @see https://github.com/Bitmessage/PyBitmessage/blob/6f35da4096770a668c4944c3024cd7ddb34be092/src/class_addressGenerator.py
 */
class DeterministicAddressesCalcurator implements Callable<String> {

    private String passphrase;

    public DeterministicAddressesCalcurator() {
        this("Bit_Message_JA");
    }

    public DeterministicAddressesCalcurator(String passphrase) {
        super();
        this.passphrase = passphrase;
    }

    @Override
    public String call() throws NoSuchAlgorithmException, UnsupportedEncodingException, DigestException {
        String deterministicPassphrase = passphrase;
        int nonceTrialsPerByte = 0;
        int payloadLengthExtraBytes = 0;
        int adderssVersionNumber = 4;
        int streamNumber = 1;
        int numberOfAddressesToMake = 1;
        int numberOfNullBytesDemandedOnFrontOfRipeHash = 1;
        int signingKeyNonce = 0;
        int encryptionKeyNonce = 1;
        int numberOfAddressesWeHadToMakeBeforeWeFoundOneWithTheCorrectRipePrefix = 0;
        MessageDigest sha512 = MessageDigest.getInstance("sha-512");
        MessageDigest ripemd = MessageDigest.getInstance("RIPEMD160");
        byte[] potentialPrivSigningKey = null;
        byte[] potentialPrivEncryptionKey = null;
        var g = CustomNamedCurves.getByName("secp256k1").getG();

        int nlz = 0;
        byte[] ripe = new byte[20];
        byte[] passphraseBytes = deterministicPassphrase.getBytes("UTF-8");
        do {
            numberOfAddressesWeHadToMakeBeforeWeFoundOneWithTheCorrectRipePrefix += 1;
            sha512.update(passphraseBytes);
            sha512.update(Structs.encodeVarint(signingKeyNonce));
            potentialPrivSigningKey = Arrays.copyOfRange(sha512.digest(), 0, 32);
            sha512.update(passphraseBytes);
            sha512.update(Structs.encodeVarint(encryptionKeyNonce));
            potentialPrivEncryptionKey = Arrays.copyOfRange(sha512.digest(), 0, 32);
            byte[] potentialPubSigningKey = g.multiply(new BigInteger(1, potentialPrivSigningKey)).normalize().getEncoded(false);
            byte[] potentialPubEncryptionKey = g.multiply(new BigInteger(1, potentialPrivEncryptionKey)).normalize().getEncoded(false);
            signingKeyNonce += 2;
            encryptionKeyNonce += 2;
            sha512.update(potentialPubSigningKey);
            sha512.update(potentialPubEncryptionKey);
            ripemd.update(sha512.digest());
            ripemd.digest(ripe, 0, 20);
            for (nlz = 0; ripe[nlz] == 0 && nlz < 20; nlz++) {
            }
        } while (nlz != numberOfNullBytesDemandedOnFrontOfRipeHash);
        BMAddress bmaddress = new BMAddress();
        String address = bmaddress.encodeAddress(adderssVersionNumber, streamNumber, ripe);
        return address;
    }

    public static void main(String[] args) throws Exception {
        Provider provider = Security.getProvider("BC");
        if (provider == null) {
            Security.addProvider(provider = new BouncyCastleProvider());
        }
        var calcurator = new DeterministicAddressesCalcurator("bm_newsg");
        System.out.println(calcurator.call());
    }
}
