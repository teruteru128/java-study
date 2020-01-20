package com.twitter.teruteru128.study.management.sample001;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Teruteru
 *
 */
public class Main implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ScheduledExecutorService service = Executors
				.newSingleThreadScheduledExecutor();
		service.scheduleWithFixedDelay(new Main(), 0, 500,
				TimeUnit.MILLISECONDS);
		try {
			Thread.sleep(5L * 60 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		service.shutdown();
	}

	/**
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		OperatingSystemMXBean bean = ManagementFactory
				.getOperatingSystemMXBean();
		System.out.printf("%s, %d,%f%n", bean.getArch(),
				bean.getAvailableProcessors(), bean.getSystemLoadAverage());
	}

}
