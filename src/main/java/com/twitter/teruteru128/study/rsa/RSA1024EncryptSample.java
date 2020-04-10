package com.twitter.teruteru128.study.rsa;

import java.io.ByteArrayOutputStream;
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
        KeyFactory factory = KeyFactory.getInstance("RSA");

        System.out.println(Cipher.getMaxAllowedKeyLength("RSA"));
        var resource = ClassLoader.getSystemResource("rsa1024.der");
        var c = resource.openConnection();
        var baos = new ByteArrayOutputStream(1024);
        try (var in = c.getInputStream()) {
            byte[] buf = new byte[8192];
            for (int len = 0; 0 <= (len = in.read(buf, 0, 8192));) {
                baos.write(buf, 0, len);
            }
        }
        var primeBytes = baos.toByteArray();
        X509EncodedKeySpec spec = new X509EncodedKeySpec(primeBytes);

        RSAPublicKey key = (RSAPublicKey) factory.generatePublic(spec);
        System.out.println(key.getModulus());

        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");

        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] ciphertext = cipher.doFinal("That's one small step for a man, one giant leap for mankind.".getBytes());

        RSAPublicKey rsaKey = (RSAPublicKey) key;
        BigInteger mod = rsaKey.getModulus();
        BigInteger pubexp = rsaKey.getPublicExponent();
        BigInteger ctext = new BigInteger(1, ciphertext);
        System.out.printf("%s$%s$%s\n", mod, pubexp, ctext);
        System.out.println(mod.toString(16));
        System.out.println(DataPrinter.printHexBinary(mod.toByteArray()));
        System.out.println(DataPrinter.printHexBinary(ciphertext));
        System.out.println(OffsetDateTime.now(ZoneId.of("UTC")).truncatedTo(ChronoUnit.SECONDS));
    }

}
