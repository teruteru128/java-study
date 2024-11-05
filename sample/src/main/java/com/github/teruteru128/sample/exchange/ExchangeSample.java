package com.github.teruteru128.sample.exchange;

import java.util.concurrent.Exchanger;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

public class ExchangeSample {
    public static void main(String[] args) throws InterruptedException {
        var executorService = Executors.newSingleThreadExecutor();
        var exchanger = new Exchanger<Container>();
        var container = new Container((long) ThreadLocalRandom.current().nextInt(10));
        System.out.printf("Main: %d%n", container.count);
        executorService.submit(new Task(exchanger));
        for (int i = 0; i < 3; i++) {
            container = exchanger.exchange(container);
            container.count = container.count * 10 + (long) ThreadLocalRandom.current().nextInt(10);
            System.out.printf("Main: %d%n", container.count);
        }
        executorService.shutdown();
    }
}
