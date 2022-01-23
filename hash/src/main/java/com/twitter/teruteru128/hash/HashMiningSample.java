package com.twitter.teruteru128.hash;

import java.io.IOException;
import java.lang.System.Logger.Level;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import jakarta.xml.bind.DatatypeConverter;

public class HashMiningSample implements Callable<HashBean> {

    private static volatile int shutdown = 0;
    private String version;
    private System.Logger logger = System.getLogger("HashMiningSample");

    HashMiningSample(String version)
    {

        this.version = Objects.requireNonNull(version);
    }

    @Override
    public HashBean call() throws NoSuchAlgorithmException, DigestException {
        logger.log(System.Logger.Level.INFO, "スタートしました %s", version);
        SecureRandom random = new SecureRandom();
        byte[] input = new byte[64];
        byte[] buf = new byte[64];
        int bestnlz = 0;
        int nlz = 0;
        int nlzbytes = 0;
        int nlzbits = 0;
        MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
        HashBean a = null;
        while (shutdown == 0) {
            random.nextBytes(input);
            sha512.update(input, 0, 64);
            sha512.digest(buf, 0, 64);
            for (nlzbytes = 0; buf[nlzbytes] == 0 && nlzbytes < 64; nlzbytes++) {
            }
            nlzbits = Integer.numberOfLeadingZeros(buf[nlzbytes] & 0xff) - 24;
            nlz = nlzbytes * 8 + nlzbits;
            if (nlz > bestnlz) {
                bestnlz = nlz;
                logger.log(Level.INFO, "更新しました。現在のベストNLZ : %d%n", bestnlz);
                a = new HashBean(input, buf);
            }
        }
        return a;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException, IOException {
        Properties properties = new Properties();
        try(var in = HashMiningSample.class.getClass().getResourceAsStream("config.properties"))
        {
            properties.load(in);
        }
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<HashBean> future = service.submit(new HashMiningSample(properties.getProperty("version")));
        Thread.sleep(600000);
        shutdown = 1;
        HashBean a = future.get();
        System.getLogger("HashMiningSample").log(Level.INFO, "input : %s%n", DatatypeConverter.printHexBinary(a.getInput()));
        System.getLogger("HashMiningSample").log(Level.INFO, "hash : %s%n", DatatypeConverter.printHexBinary(a.getHash()));
        service.shutdown();
    }
}
