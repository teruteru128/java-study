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
        File prime1File = new File("prime1.obj");
        File prime2File = new File("prime2.obj");
        File primsFile = new File("primes.obj");
        BigInteger prime1 = null;
        BigInteger prime2 = null;
        ArrayList<BigInteger> list = new ArrayList<>();
        try(ObjectInputStream oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(prime1File)))){
            prime1 = (BigInteger) oin.readObject();
        }
        try(ObjectInputStream oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(prime2File)))){
            prime2 = (BigInteger) oin.readObject();
        }
        list.add(prime1);
        list.add(prime2);
        try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(primsFile)))){
            oos.writeObject(list);
        }
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
