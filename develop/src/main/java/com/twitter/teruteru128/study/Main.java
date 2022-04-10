package com.twitter.teruteru128.study;

import java.security.Security;
import java.util.Comparator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

import com.twitter.teruteru128.study.sf.Shangri_laFrontierCountDown;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import jakarta.xml.bind.DatatypeConverter;

/**
 * Main
 */
public class Main {

    static {
        if (Security.getProvider("BC") == null) {
            Security.addProvider(new BouncyCastleProvider());
        }
    }

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        var service = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(12);
        var future = service.schedule(new Shangri_laFrontierCountDown(), 0,
                TimeUnit.NANOSECONDS);
        var future2 = service.schedule(() -> {
            var factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");

            var salt = DatatypeConverter.parseHexBinary("A009C1A485912C6AE630D3E744240B04");

            var keySpec1 = new PBEKeySpec(
                    "plnlrtfpijpuhqylxbgqiiyipieyxvfsavzgxbbcfusqkozwpngsyejqlmjsytrmd".toCharArray(), salt, 1000, 128);
            var key1 = factory.generateSecret(keySpec1);

            var keySpec2 = new PBEKeySpec("eBkXQTfuBqp'cTcar&g*".toCharArray(), salt, 1000, 128);
            var key2 = factory.generateSecret(keySpec2);

            System.out.println(DatatypeConverter.printHexBinary(key1.getEncoded()));
            System.out.println(DatatypeConverter.printHexBinary(key2.getEncoded()));
            var factory2 = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
            System.out.println(factory2.getAlgorithm());
            var factory3 = SecretKeyFactory.getInstance("SCrypt");
            System.out.println(factory3.getAlgorithm());
            return null;
        }, 0, TimeUnit.NANOSECONDS);
        var future3 = service.schedule(() -> {
            RandomGeneratorFactory.all().forEach(f -> System.out.printf("%s%n", f.name()));
            return null;
        }, 0, TimeUnit.NANOSECONDS);
        var shutdownFuture = service.schedule(() -> {
            System.out.println("シャットダウンします……");
            service.shutdown();
        }, 500, TimeUnit.MILLISECONDS);
        future.get();
        future2.get();
        future3.get();
        shutdownFuture.get();
    }
}
