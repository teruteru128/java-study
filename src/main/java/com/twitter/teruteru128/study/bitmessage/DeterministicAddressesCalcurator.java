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

import org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 * @see https://github.com/Bitmessage/PyBitmessage/blob/6f35da4096770a668c4944c3024cd7ddb34be092/src/class_addressGenerator.py
 */
public class DeterministicAddressesCalcurator implements Callable<String> {

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
        MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");
        final byte[] potentialPrivSigningKey = new byte[64];
        byte[] potentialPubSigningKey = null;
        final byte[] potentialPrivEncryptionKey = new byte[64];
        byte[] potentialPubEncryptionKey = null;

        int nlz = 0;
        final byte[] cache64 = new byte[Const.SHA512_DIGEST_LENGTH];
        final byte[] passphraseBytes = deterministicPassphrase.getBytes("UTF-8");
        for(;nlz < numberOfNullBytesDemandedOnFrontOfRipeHash;signingKeyNonce += 2, encryptionKeyNonce += 2) {
            numberOfAddressesWeHadToMakeBeforeWeFoundOneWithTheCorrectRipePrefix += 1;
            sha512.update(passphraseBytes);
            sha512.update(Structs.encodeVarint(signingKeyNonce));
            sha512.digest(potentialPrivSigningKey, 0, Const.SHA512_DIGEST_LENGTH);
            sha512.update(passphraseBytes);
            sha512.update(Structs.encodeVarint(encryptionKeyNonce));
            sha512.digest(potentialPrivEncryptionKey, 0, Const.SHA512_DIGEST_LENGTH);
            potentialPubSigningKey = Const.G.multiply(new BigInteger(1, potentialPrivSigningKey, 0, Const.PRIVATE_KEY_LENGTH)).normalize().getEncoded(false);
            potentialPubEncryptionKey = Const.G.multiply(new BigInteger(1, potentialPrivEncryptionKey, 0, Const.PRIVATE_KEY_LENGTH)).normalize().getEncoded(false);
            sha512.update(potentialPubSigningKey);
            sha512.update(potentialPubEncryptionKey);
            sha512.digest(cache64, 0, Const.SHA512_DIGEST_LENGTH);
            ripemd160.update(cache64);
            ripemd160.digest(cache64, 0, Const.RIPEMD160_DIGEST_LENGTH);
            for (nlz = 0; cache64[nlz] == 0 && nlz < Const.RIPEMD160_DIGEST_LENGTH; nlz++) {
            }
        }
        String address = BMAddress.encodeAddress(adderssVersionNumber, streamNumber, Arrays.copyOf(cache64, Const.RIPEMD160_DIGEST_LENGTH));
        //AddressGenerator.exportAddressToStdout(new Response(new KeyPair(Arrays.copyOf(potentialPrivSigningKey, Const.PRIVATE_KEY_LENGTH), potentialPubSigningKey), new KeyPair(Arrays.copyOf(potentialPrivEncryptionKey, Const.PRIVATE_KEY_LENGTH), potentialPubEncryptionKey), ripe));
        return address;
    }

    public static void main(String[] args) throws Exception {
        Provider provider = Security.getProvider("BC");
        if (provider == null) {
            Security.addProvider(provider = new BouncyCastleProvider());
        }
        var calcurator = new DeterministicAddressesCalcurator("Twitter", 3);
        String address = calcurator.call();
        System.out.println(address);
    }
}
