package com.twitter.teruteru128.study.rsa;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
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

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        service.submit(new PrimeSearch("prime1.bin", "probablePrime1.bin"));
        service.submit(new PrimeSearch("prime2.bin", "probablePrime2.bin"));
        service.shutdown();
    }

    @Override
    public void run() {
        try {
            var primefileURL = ClassLoader.getSystemResource(inputName);
            var o = primefileURL.openConnection();
            var baos = new ByteArrayOutputStream(32768);
            try (var in = o.getInputStream()) {
                byte[] buf = new byte[8192];
                int len = 0;
                while (true) {
                    len = in.read(buf, 0, 8192);
                    if (len < 0) {
                        break;
                    }
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
