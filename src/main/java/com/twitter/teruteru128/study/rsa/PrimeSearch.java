package com.twitter.teruteru128.study.rsa;

import java.io.IOException;
import java.math.BigInteger;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class PrimeSearch implements Runnable {
    public PrimeSearch() {
        super();
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new PrimeSearch());
        thread.start();
    }
    @Override
    public void run() {
        try {
            System.out.printf("%d", new BigInteger(1, Files.readAllBytes(Paths.get(ClassLoader.getSystemResource("probablePrime1024.bin").toURI()))));
            var primefileURL = ClassLoader.getSystemResource("prime1.bin");
            var primefileURI = primefileURL.toURI();
            var primefilePath = Paths.get(primefileURI);
            var primeBytes = Files.readAllBytes(primefilePath);
            BigInteger a = new BigInteger(1, primeBytes, 0, primeBytes.length);
            var probablePrime = a.nextProbablePrime();
            Files.write(Paths.get("probablePrime1.bin"), probablePrime.toByteArray(), StandardOpenOption.WRITE,
                    StandardOpenOption.CREATE);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
