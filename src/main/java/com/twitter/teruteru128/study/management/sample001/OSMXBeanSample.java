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
public class OSMXBeanSample implements Runnable {
	protected String[] args;

	public OSMXBeanSample(String[] args) {
		super();
		this.args = args;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t = new Thread(new OSMXBeanSample(args));
		t.start();
	}

	/**
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.scheduleWithFixedDelay(() -> {
			OperatingSystemMXBean bean = ManagementFactory.getOperatingSystemMXBean();
			System.out.printf("%s, %d, %f%n", bean.getArch(), bean.getAvailableProcessors(),
					bean.getSystemLoadAverage());
		}, 0, 500, TimeUnit.MILLISECONDS);
		try {
			Thread.sleep(5L * 60 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		service.shutdown();
	}

}
