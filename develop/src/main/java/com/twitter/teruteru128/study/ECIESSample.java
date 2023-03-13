package com.twitter.teruteru128.study;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HexFormat;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

import org.bouncycastle.jce.interfaces.ECPrivateKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;

import com.twitter.teruteru128.bitmessage.ECIES;

public class ECIESSample {

    public static void eciesSample() {
        Random random = (Random) RandomGenerator.of("SecureRandom");
        var pair = ECIES.generateEcKeyPair();
        var prefix = "ｳｧｧ!!ｵﾚﾓｲｯﾁｬｳｩｩｩ!!!ｳｳｳｳｳｳｳｳｳｩｩｩｩｩｩｩｩｳｳｳｳｳｳｳｳ!ｲｨｨｲｨｨｨｲｲｲｨｲｲｲｲｲｲｲｲｲｲｲｲ!!"
                .getBytes(StandardCharsets.UTF_8);
        var length = ThreadLocalRandom.current().nextInt(234, 801);
        var suffixlength = length - prefix.length;
        var suffix = new byte[suffixlength];
        random.nextBytes(suffix);
        var message = new byte[length];
        System.arraycopy(prefix, 0, message, 0, prefix.length);
        System.arraycopy(suffix, 0, message, prefix.length, suffix.length);
        var ciphertext = ECIES.encrypt(message, (ECPublicKey) pair.getPublic());
        var cleartext = ECIES.decrypt(ciphertext, (ECPrivateKey) pair.getPrivate());
        if (Arrays.equals(message, cleartext)) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
            var format = HexFormat.of();
            System.out.println(format.formatHex(message));
            System.out.println(cleartext == null ? "null" : format.formatHex(cleartext));
        }
    }
    
}
