package com.twitter.teruteru128.study.md.sample001;

import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;

import com.twitter.teruteru128.holders.SecureRandomHolder;
import com.twitter.teruteru128.study.crypto.DataPrinter;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 * @author Teruteru
 *
 */
public class Main {

    /**
     * @param args
     * @throws NoSuchAlgorithmException
     * @throws DigestException
     */
    public static void main(String[] args) throws NoSuchAlgorithmException,
            DigestException {
        Provider provider = Security.getProvider("bc");
        if (provider == null) {
            Security.addProvider(provider = new BouncyCastleProvider());
        }

        SecureRandom random = SecureRandomHolder.getInstance();

        MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
        MessageDigest sha3_512 = MessageDigest.getInstance("SHA3-512");

        int md1Len = sha512.getDigestLength();
        int md2Len = sha3_512.getDigestLength();

        int mdSumLen = md1Len + md2Len;

        byte[] seed = new byte[mdSumLen];
        random.nextBytes(seed);
        System.out.printf("%s%n", DataPrinter.printHexBinary(seed));
        for (int i = 0; i < 1024; i++) {
            sha512.update(seed);
            sha3_512.update(seed);
            sha512.digest(seed, 0, md1Len);
            sha3_512.digest(seed, md1Len, md2Len);
        }
        System.out.printf("%s%n", DataPrinter.printHexBinary(seed));
    }

}
