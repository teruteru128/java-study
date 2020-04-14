package com.twitter.teruteru128.study.rsa;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrimeSearch implements Runnable {

    private String inputName;
    private String outputName;

    public PrimeSearch(String resourceName, String out) {
        super();
        this.inputName = resourceName;
        this.outputName = out;
    }

    public static void main(String[] args) throws Exception {
        File primsFile = new File("primes.obj");
        ArrayList<?> list = new ArrayList<>();
        try(ObjectInputStream oos = new ObjectInputStream(new BufferedInputStream(new FileInputStream(primsFile)))){
            list = (ArrayList<?>) oos.readObject();
        }
        BigInteger prime1 = (BigInteger)list.get(0);
        System.out.println(prime1);
        BigInteger prime2 = (BigInteger)list.get(1);
        System.out.println(prime2);
        /*
        ExecutorService service = Executors.newCachedThreadPool();
        service.submit(new PrimeSearch("prime1.bin", "probablePrime1.bin"));
        service.submit(new PrimeSearch("prime2.bin", "probablePrime2.bin"));
        service.shutdown();
        */
    }

    @Override
    public void run() {
        try {
            var primeFileURL = ClassLoader.getSystemResource(inputName);
            var o = primeFileURL.openConnection();
            var baos = new ByteArrayOutputStream(32768);
            try (var in = o.getInputStream()) {
                byte[] buf = new byte[8192];
                for (int len = 0; 0 <= (len = in.read(buf, 0, 8192));) {
                    baos.write(buf, 0, len);
                }
            }
            var primeBytes = baos.toByteArray();
            System.out.printf("読み込みました : %dbytes%n", primeBytes.length);
            BigInteger a = new BigInteger(1, primeBytes, 0, primeBytes.length);
            var probablePrime = a.nextProbablePrime();
            Files.write(Paths.get(outputName), probablePrime.toByteArray(), StandardOpenOption.WRITE,
                    StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
