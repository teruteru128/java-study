package com.twitter.teruteru128.study.pipe.sample001;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Teruteru
 *
 */
public class Main implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Thread thread = new Thread(new Main());
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
		try {
			for (int i = 0; i < 50; i++) {
				pos.write(i);
				System.out.printf("Writing : %d%n", i);
				Thread.sleep(500);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			latch.countDown();
		}
	}

	/**
	 * 
	 */
	private void consumeData(PipedInputStream pis, CountDownLatch latch) {
		try(PipedInputStream p = pis) {
			int num = -1;
			while ((num = p.read()) != -1) {
				System.out.printf("Reading : %d%n", num);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			latch.countDown();
		}
	}
}
