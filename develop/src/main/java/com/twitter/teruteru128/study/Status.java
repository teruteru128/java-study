package com.twitter.teruteru128.study;

import java.time.OffsetDateTime;
import java.util.concurrent.atomic.AtomicLong;

public class Status {

    private static Status INSTANCE = new Status();

    public static Status getInstance() {
        return INSTANCE;
    }

    private AtomicLong counter = new AtomicLong();
    private OffsetDateTime start = OffsetDateTime.now();

    private Status() {
        super();
    }

    public AtomicLong getCounter() {
        return counter;
    }

    public OffsetDateTime getStart() {
        return start;
    }

    public void setStart(OffsetDateTime start) {
        this.start = start;
    }
}
