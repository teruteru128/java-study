package com.github.teruteru128.sample.exchange;

import java.util.concurrent.Callable;
import java.util.concurrent.Exchanger;
import java.util.concurrent.ThreadLocalRandom;

public class Task implements Callable<Void> {
    private Exchanger<Container> exchanger;
    private int count;

    public Task(Exchanger<Container> exchanger, int count) {
        this.exchanger = exchanger;
        this.count = count;
    }

    public Task(Exchanger<Container> exchanger) {
        this(exchanger, 3);
    }

    @Override
    public Void call() throws Exception {
        var container = new Container((long) ThreadLocalRandom.current().nextInt(10));
        System.out.printf("Task: %d%n", container.count);
        for (int i = 0; i < count; i++) {
            container = exchanger.exchange(container);
            container.count = container.count * 10 + (long) ThreadLocalRandom.current().nextInt(10);
            System.out.printf("Task: %d%n", container.count);
        }
        return null;
    }
}
