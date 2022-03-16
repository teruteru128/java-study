package com.twitter.teruteru128.nyanpass;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class NyanpassBean implements Cloneable, Serializable {
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

    public NyanpassBean clone() {
        NyanpassBean bean = null;
        try {
            bean = (NyanpassBean) super.clone();
            bean.time = time.plus(0, ChronoUnit.NANOS);
        } catch (CloneNotSupportedException e) {
        }
        return bean;
    }
}
