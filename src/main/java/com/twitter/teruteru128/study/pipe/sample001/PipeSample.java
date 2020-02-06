package com.twitter.teruteru128.study.pipe.sample001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Teruteru
 *
 */
public class PipeSample implements Runnable {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(new PipeSample());
        thread.start();
    }

    @Override
    public void run() {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        try {
            pos.connect(pis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        CountDownLatch latch = new CountDownLatch(2);
        Runnable producer = () -> produceData(pos, latch);
        Runnable consumer = () -> consumeData(pis, latch);
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(producer);
        service.execute(consumer);
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.shutdown();
    }

    /**
     * 
     */
    private void produceData(PipedOutputStream pos, CountDownLatch latch) {
        try (PrintStream p = new PrintStream(pos)) {
            for (int i = 0; i < 50; i++) {
                p.printf("%s%n", (i % 3) == 0 ? "アッー！" : i);
                //System.out.printf("Writing : %d%n", i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            latch.countDown();
        }
    }

    /**
     * 
     */
    private void consumeData(PipedInputStream pis, CountDownLatch latch) {
        try (BufferedReader p = new BufferedReader(new InputStreamReader(pis))) {
            String l = null;
            while ((l = p.readLine()) != null) {
                System.out.printf("Reading : %s%n", l);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            latch.countDown();
        }
    }
}
