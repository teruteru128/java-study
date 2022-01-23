package com.twitter.teruteru128.study.ts.sample003;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Teruteru
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String publicKey1 = "MEwDAgcAAgEgAiEA7Vo1+Orf2xuuu6hTPAPldSfrUZZ7WYAzpRcO5DoYFLoCIF1JKVBctOGvMOy495O/BWFuFEYH4i1f6vU0b9+a64RD";
        String publicKey2 = "MEsDAgcAAgEgAiAoQPNcS7L4k+q2qf3U7uyujtwRQNS3pLKN/zrRGERGagIgFjdV1JlqHF8BiIQne0/E3jVM7hWda/USrFI58per45s=";
        SecureRandom random;
        try {
            random = SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException e1) {
            throw new RuntimeException(e1);
        }
        int min1 = 41;
        int min2 = 38;
        ArrayList<Callable<Void>> list = new ArrayList<>();
        for (int i = 0; i < 0; i++) {
            list.add(Executors.callable(
                    new Searcher(publicKey1, random.nextLong(), min1),
                    null));
        }
        for (int i = 0; i < 4; i++) {
            list.add(Executors.callable(
                    new Searcher(publicKey2, random.nextLong(), min2),
                    null));
        }
        ExecutorService service = Executors.newWorkStealingPool();
        try {
            service.invokeAll(list);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}