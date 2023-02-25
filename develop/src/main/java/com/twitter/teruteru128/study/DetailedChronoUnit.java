package com.twitter.teruteru128.study;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;

public class DetailedChronoUnit implements TemporalUnit {
    private final String name;
    private final Duration duration;

    public static final DetailedChronoUnit FIVE_MINUTES = new DetailedChronoUnit("FiveMinutes", Duration.ofSeconds(300));
    public static final DetailedChronoUnit TEN_MINUTES = new DetailedChronoUnit("TenMinutes", Duration.ofSeconds(600));

    public DetailedChronoUnit(String name, Duration estimatedDuration) {
        this.name = name;
        this.duration = estimatedDuration;
    }

    @Override
    public Duration getDuration() {
        return duration;
    }

    @Override
    public boolean isDurationEstimated() {
        return this.duration.compareTo(ChronoUnit.DAYS.getDuration()) >= 0;
    }

    @Override
    public boolean isDateBased() {
        return this.duration.compareTo(ChronoUnit.DAYS.getDuration()) >= 0
                && !this.duration.equals(ChronoUnit.FOREVER.getDuration());
    }

    @Override
    public boolean isTimeBased() {
        return this.duration.compareTo(ChronoUnit.DAYS.getDuration()) < 0;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <R extends Temporal> R addTo(R temporal, long amount) {
        return (R) temporal.plus(amount, this);
    }

    @Override
    public long between(Temporal temporal1Inclusive, Temporal temporal2Exclusive) {
        return temporal1Inclusive.until(temporal2Exclusive, this);
    }

    @Override
    public String toString() {
        return name;
    }
}
