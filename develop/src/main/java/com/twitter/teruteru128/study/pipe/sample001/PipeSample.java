package com.twitter.teruteru128.study.pipe.sample001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/**
 * {@link java.io.PipedInputStream}と{@link java.io.PipedOutputStream}を使って見るサンプル。
 * @author Teruteru
 * @see java.io.PipedInputStream
 * @see java.io.PipedOutputStream
 */
public class PipeSample implements Runnable {

    ExecutorService service;

    public PipeSample(ExecutorService service) {
        this.service = service;
    }

    @Override
    public void run() {
        try (PipedInputStream pis = new PipedInputStream(1024 * 1024);
                PipedOutputStream pos = new PipedOutputStream(pis)) {
            CountDownLatch latch = new CountDownLatch(2);
            service.execute(() -> produceData(pos, latch));
            service.execute(() -> consumeData(pis, latch));
            latch.await();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 
     */
    private void produceData(PipedOutputStream pos, CountDownLatch latch) {
        try (PrintStream p = new PrintStream(pos)) {
            for (int i = 29999; i < 40001; i++) {
                p.printf("%s%n", ((i % 3) == 0 || Integer.toString(i).contains("3")) ? "アッー！" : i);
                p.flush();
                // System.out.printf("Writing : %d%n", i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        } finally {
            latch.countDown();
        }
    }

    /**
     * 
     */
    private void consumeData(PipedInputStream pis, CountDownLatch latch) {
        try (BufferedReader p = new BufferedReader(new InputStreamReader(pis), 8192)) {
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
