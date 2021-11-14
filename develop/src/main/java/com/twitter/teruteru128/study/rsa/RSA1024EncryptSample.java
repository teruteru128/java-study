package com.twitter.teruteru128.study.rsa;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

import javax.crypto.Cipher;

import com.twitter.teruteru128.study.crypto.DataPrinter;

public class RSA1024EncryptSample {

    public static void main(String[] args) throws Exception {
        var factory = KeyFactory.getInstance("RSA");

        System.out.println(Cipher.getMaxAllowedKeyLength("RSA"));
        var resource = ClassLoader.getSystemResource("rsa1024.der");
        var c = resource.openConnection();
        byte[] primeBytes = null;
        try (var in = c.getInputStream()) {
            primeBytes = in.readAllBytes();
        }
        final var spec = new X509EncodedKeySpec(primeBytes);

        final var key = (RSAPublicKey) factory.generatePublic(spec);
        System.out.println(key.getModulus());

        final var cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");

        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] ciphertext = cipher.doFinal("That's one small step for a man, one giant leap for mankind.".getBytes());

        var mod = key.getModulus();
        var pubexp = key.getPublicExponent();
        var ctext = new BigInteger(1, ciphertext);
        System.out.printf("%s$%s$%s%n", mod, pubexp, ctext);
        System.out.println(mod.toString(16));
        System.out.println(DataPrinter.printHexBinary(mod.toByteArray()));
        System.out.println(DataPrinter.printHexBinary(ciphertext));
        System.out.println(OffsetDateTime.now(ZoneId.of("UTC")).truncatedTo(ChronoUnit.SECONDS));
    }

}
