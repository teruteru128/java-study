package com.twitter.teruteru128.study.rsa;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrimeSearch implements Runnable {

    private String name;
    private BigInteger candidate;

    public PrimeSearch(String name, BigInteger candidate) {
        super();
        this.name = name;
        this.candidate = candidate;
    }

    public static void main(String[] args) throws Exception {
        File primsFile = new File("primes.obj");
        ArrayList<?> list = new ArrayList<>();
        try(ObjectInputStream oos = new ObjectInputStream(new BufferedInputStream(new FileInputStream(primsFile)))){
            list = (ArrayList<?>) oos.readObject();
        }
        BigInteger prime1 = (BigInteger)list.get(0);
        BigInteger prime2 = (BigInteger)list.get(1);
        ExecutorService service = Executors.newCachedThreadPool();
        service.submit(new PrimeSearch("prime1", prime1));
        service.submit(new PrimeSearch("prime2", prime2));
        service.shutdown();
    }

    @Override
    public void run() {
        boolean isPrime = candidate.isProbablePrime(1);
        System.out.printf("%s is %s%n", name, isPrime ? "prime" : "not prime");
    }
}
