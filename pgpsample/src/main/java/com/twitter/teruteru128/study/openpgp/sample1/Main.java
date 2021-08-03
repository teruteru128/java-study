package com.twitter.teruteru128.study.openpgp.sample1;

import java.io.FileInputStream;
import java.security.Security;

import org.bouncycastle.bcpg.PublicKeyAlgorithmTags;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.openpgp.PGPPublicKey;
import org.bouncycastle.openpgp.PGPPublicKeyRing;
import org.bouncycastle.openpgp.PGPPublicKeyRingCollection;
import org.bouncycastle.openpgp.PGPUtil;
import org.bouncycastle.openpgp.operator.jcajce.JcaKeyFingerprintCalculator;

import jakarta.xml.bind.DatatypeConverter;

/**
 * @author Teruteru
 * @see https://github.com/bcgit/bc-java/blob/0ddd7b28418d64af06a1ccee85a916e97a73e866/pg/src/main/java/org/bouncycastle/openpgp/examples/PubringDump.java
 */
public class Main {
    public static String getAlgorithm(int algId) {
        switch (algId) {
            case PublicKeyAlgorithmTags.RSA_GENERAL:
                return "RSA_GENERAL";
            case PublicKeyAlgorithmTags.RSA_ENCRYPT:
                return "RSA_ENCRYPT";
            case PublicKeyAlgorithmTags.RSA_SIGN:
                return "RSA_SIGN";
            case PublicKeyAlgorithmTags.ELGAMAL_ENCRYPT:
                return "ELGAMAL_ENCRYPT";
            case PublicKeyAlgorithmTags.DSA:
                return "DSA";
            case PublicKeyAlgorithmTags.ECDH:
                return "ECDH";
            case PublicKeyAlgorithmTags.ECDSA:
                return "ECDSA";
            case PublicKeyAlgorithmTags.ELGAMAL_GENERAL:
                return "ELGAMAL_GENERAL";
            case PublicKeyAlgorithmTags.DIFFIE_HELLMAN:
                return "DIFFIE_HELLMAN";
            default:
                return "unknown";
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        if (Security.getProvider("bc") == null) {
            Security.addProvider(new BouncyCastleProvider());
        }

        PGPPublicKeyRingCollection collection = new PGPPublicKeyRingCollection(
                PGPUtil.getDecoderStream(new FileInputStream(args[0])), new JcaKeyFingerprintCalculator());
        for (PGPPublicKeyRing ring : collection) {
            try {
                ring.getPublicKey();
            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }

            var first = true;
            for (PGPPublicKey pgpPublicKey : ring) {
                if (first) {
                    System.out.printf("Key ID: %s%n", Long.toHexString(pgpPublicKey.getKeyID()));
                    first = false;
                } else {
                    System.out.printf("Key ID: %s%n", Long.toHexString(pgpPublicKey.getKeyID()) + " (subkey)");
                }
                System.out.printf("            Algorithm: %s%n", getAlgorithm(pgpPublicKey.getAlgorithm()));
                System.out.printf("            Fingerprint: %s%n", DatatypeConverter.printHexBinary(pgpPublicKey.getFingerprint()));
            }
        }
    }

}
