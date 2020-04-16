package com.twitter.teruteru128.study.management.sample001;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.util.concurrent.CountDownLatch;
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
        final CountDownLatch latch = new CountDownLatch(5 * 60 * 1000 / 500);
        service.scheduleWithFixedDelay(() -> {
            OperatingSystemMXBean bean = ManagementFactory.getOperatingSystemMXBean();
            System.out.printf("%s, %s, %s, %s, %d, %f%n", bean.getObjectName(), bean.getName(), bean.getArch(),
                    bean.getVersion(), bean.getAvailableProcessors(), bean.getSystemLoadAverage());
            latch.countDown();
        }, 0, 500, TimeUnit.MILLISECONDS);
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            service.shutdown();
        }
    }

}
