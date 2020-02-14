package com.twitter.teruteru128.study.rsa;

import java.io.IOException;
import java.math.BigInteger;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class PrimeSearch implements Runnable {

    private String inputName;
    private String outputName;

    public PrimeSearch(String resourceName, String out) {
        super();
        this.inputName = resourceName;
        this.outputName = out;
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new PrimeSearch("prime1.bin", "probablePrime1.bin"));
        thread1.start();
        Thread thread2 = new Thread(new PrimeSearch("prime2.bin", "probablePrime2.bin"));
        thread2.start();
    }

    @Override
    public void run() {
        try {
            var primefileURL = ClassLoader.getSystemResource(inputName);
            var primefileURI = primefileURL.toURI();
            var primefilePath = Paths.get(primefileURI);
            var primeBytes = Files.readAllBytes(primefilePath);
            BigInteger a = new BigInteger(1, primeBytes, 0, primeBytes.length);
            var probablePrime = a.nextProbablePrime();
            Files.write(Paths.get(outputName), probablePrime.toByteArray(), StandardOpenOption.WRITE,
                    StandardOpenOption.CREATE);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
