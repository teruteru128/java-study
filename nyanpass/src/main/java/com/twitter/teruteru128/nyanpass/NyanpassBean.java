package com.twitter.teruteru128.nyanpass;

import java.io.Serializable;
import java.time.LocalDateTime;

public class NyanpassBean implements Serializable {
    private static final long serialVersionUID = 0;
    private LocalDateTime time;
    private long count;

    public NyanpassBean(LocalDateTime time, long count) {
        this.time = time;
        this.count = count;
    }

    public long getCount() {
        return count;
    }

    public LocalDateTime getTime() {
        return time;
    }
}