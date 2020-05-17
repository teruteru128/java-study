package com.twitter.teruteru128.study;

import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.twitter.teruteru128.study.tcp.Status;

import jakarta.xml.bind.DatatypeConverter;

public class HashMiningSample implements Callable<A> {

    public HashMiningSample() {
    }

    @Override
    public A call() throws NoSuchAlgorithmException, DigestException {
        System.out.println("スタートしました ${project.version}");
        SecureRandom random = new SecureRandom();
        byte[] input = new byte[64];
        byte[] buf = new byte[64];
        int bestnlz = 0;
        int nlz = 0;
        int nlzbytes = 0;
        int nlzbits = 0;
        MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
        A a = null;
        while (Status.shutdown == 0) {
            random.nextBytes(input);
            sha512.update(input, 0, 64);
            sha512.digest(buf, 0, 64);
            for (nlzbytes = 0; buf[nlzbytes] == 0 && nlzbytes < 64; nlzbytes++) {
            }
            nlzbits = Integer.numberOfLeadingZeros(buf[nlzbytes] & 0xff) - 24;
            nlz = nlzbytes * 8 + nlzbits;
            if (nlz > bestnlz) {
                bestnlz = nlz;
                System.out.printf("更新しました。現在のベストNLZ : %d%n", bestnlz);
                a = new A(input, buf);
            }
        }
        return a;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<A> future = service.submit(new HashMiningSample());
        Thread.sleep(10 * 60 * 1000);
        Status.shutdown = 1;
        A a = future.get();
        System.out.printf("input : %s%n", DatatypeConverter.printHexBinary(a.getInput()));
        System.out.printf("hash : %s%n", DatatypeConverter.printHexBinary(a.getHash()));
        service.shutdown();
    }
}
