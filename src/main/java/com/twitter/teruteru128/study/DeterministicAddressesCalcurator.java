package com.twitter.teruteru128.study;

import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.util.Arrays;
import java.util.concurrent.Callable;

import javax.crypto.KeyGenerator;

import com.twitter.teruteru128.study.bitmessage.Structs;

class DeterministicAddressesCalcurator implements Callable<String> {
    @Override
    public String call() throws Exception {
        String deterministicPassphrase = "";
        int nonceTrialsPerByte = 0;
        int payloadLengthExtraBytes = 0;
        int adderssVersionNumber = 3;
        int streamNumber = 1;
        int numberOfAddressToMake = 1;
        int numberOfNullBytesDemandedOnFrontOfRipeHash = 1;
        int signingKeyNonce = 0;
        int encryptionKeyNonce = 1;
        int numberOfAddressesWeHadToMakeBeforeWeFoundOneWithTheCorrectRipePrefix = 0;
        MessageDigest sha512 = MessageDigest.getInstance("sha-512");
        MessageDigest ripemd = MessageDigest.getInstance("RIPEMD-160");
        byte[] potentialPrivSigningKey = null;
        byte[] potentialPrivEncryptionKey = null;
        KeyFactory factory = KeyFactory.getInstance("EC");
        KeyGenerator generator =null;
        AlgorithmParameters parameters = AlgorithmParameters.getInstance("EC");
        parameters.init(new ECGenParameterSpec("secp256k1"));
        ECParameterSpec ecParameterSpec = parameters.getParameterSpec(ECParameterSpec.class);
        ECPrivateKeySpec ecPrivateKey = new ECPrivateKeySpec(BigInteger.ONE, ecParameterSpec);

        while (true) {
            numberOfAddressesWeHadToMakeBeforeWeFoundOneWithTheCorrectRipePrefix += 1;
            sha512.update(deterministicPassphrase.getBytes("UTF-8"));
            sha512.update(Structs.encodeVarint(signingKeyNonce));
            potentialPrivSigningKey=Arrays.copyOfRange(sha512.digest(), 0, 32);
            sha512.update(deterministicPassphrase.getBytes("UTF-8"));
            sha512.update(Structs.encodeVarint(encryptionKeyNonce));
            potentialPrivEncryptionKey = Arrays.copyOfRange(sha512.digest(), 0, 32);
            break;
        }
        return null;
    }
}