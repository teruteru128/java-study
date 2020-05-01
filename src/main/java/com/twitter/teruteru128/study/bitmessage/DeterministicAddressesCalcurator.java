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

import com.twitter.teruteru128.study.bitmessage.genaddress.AddressGenerator;
import com.twitter.teruteru128.study.bitmessage.genaddress.BMAddress;
import com.twitter.teruteru128.study.bitmessage.genaddress.KeyPair;
import com.twitter.teruteru128.study.bitmessage.genaddress.Response;

import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 * @see https://github.com/Bitmessage/PyBitmessage/blob/6f35da4096770a668c4944c3024cd7ddb34be092/src/class_addressGenerator.py
 */
class DeterministicAddressesCalcurator implements Callable<String> {

    private String passphrase;
    private int adderssVersionNumber = 4;

    public DeterministicAddressesCalcurator() {
        this("Bit_Message_JA");
    }

    public DeterministicAddressesCalcurator(String passphrase) {
        this(passphrase, 4);
    }

    public DeterministicAddressesCalcurator(String passphrase, int adderssVersionNumber) {
        super();
        this.passphrase = passphrase;
        this.adderssVersionNumber = adderssVersionNumber;
    }

    @Override
    public String call() throws NoSuchAlgorithmException, UnsupportedEncodingException, DigestException {
        String deterministicPassphrase = this.passphrase;
        int nonceTrialsPerByte = 0;
        int payloadLengthExtraBytes = 0;
        int adderssVersionNumber = this.adderssVersionNumber;
        int streamNumber = 1;
        int numberOfAddressesToMake = 1;
        int numberOfNullBytesDemandedOnFrontOfRipeHash = 1;
        int signingKeyNonce = 0;
        int encryptionKeyNonce = 1;
        int numberOfAddressesWeHadToMakeBeforeWeFoundOneWithTheCorrectRipePrefix = 0;
        MessageDigest sha512 = MessageDigest.getInstance("sha-512");
        MessageDigest ripemd = MessageDigest.getInstance("RIPEMD160");
        final byte[] potentialPrivSigningKey = new byte[64];
        byte[] potentialPubSigningKey = null;
        final byte[] potentialPrivEncryptionKey = new byte[64];
        byte[] potentialPubEncryptionKey = null;
        final var g = CustomNamedCurves.getByName("secp256k1").getG();

        int nlz = 0;
        final byte[] sha512hash = new byte[64];
        final byte[] ripe = new byte[20];
        final byte[] passphraseBytes = deterministicPassphrase.getBytes("UTF-8");
        for(;nlz < numberOfNullBytesDemandedOnFrontOfRipeHash;signingKeyNonce += 2, encryptionKeyNonce += 2) {
            numberOfAddressesWeHadToMakeBeforeWeFoundOneWithTheCorrectRipePrefix += 1;
            sha512.update(passphraseBytes);
            sha512.update(Structs.encodeVarint(signingKeyNonce));
            sha512.digest(potentialPrivSigningKey, 0, 64);
            sha512.update(passphraseBytes);
            sha512.update(Structs.encodeVarint(encryptionKeyNonce));
            sha512.digest(potentialPrivEncryptionKey, 0, 64);
            potentialPubSigningKey = g.multiply(new BigInteger(1, potentialPrivSigningKey, 0, 32)).normalize().getEncoded(false);
            potentialPubEncryptionKey = g.multiply(new BigInteger(1, potentialPrivEncryptionKey, 0, 32)).normalize().getEncoded(false);
            sha512.update(potentialPubSigningKey);
            sha512.update(potentialPubEncryptionKey);
            sha512.digest(sha512hash, 0, 64);
            ripemd.update(sha512hash);
            ripemd.digest(ripe, 0, 20);
            for (nlz = 0; ripe[nlz] == 0 && nlz < 20; nlz++) {
            }
        }
        BMAddress bmaddress = new BMAddress();
        String address = bmaddress.encodeAddress(adderssVersionNumber, streamNumber, ripe);
        //AddressGenerator.exportAddress(new Response(new KeyPair(Arrays.copyOf(potentialPrivSigningKey, 32), potentialPubSigningKey), new KeyPair(Arrays.copyOf(potentialPrivEncryptionKey, 32), potentialPubEncryptionKey), ripe));
        return address;
    }

    public static void main(String[] args) throws Exception {
        Provider provider = Security.getProvider("BC");
        if (provider == null) {
            Security.addProvider(provider = new BouncyCastleProvider());
        }
        var calcurator = new DeterministicAddressesCalcurator("testicle party ", 4);
        String address = calcurator.call();
        System.out.println(address);
        System.out.println(address.equals("BM-2cX1vSLQ79NVZJqRd5oH6LGgh5E7Zu2Kx4"));
    }
}
