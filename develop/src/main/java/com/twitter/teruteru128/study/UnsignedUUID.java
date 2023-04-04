package com.twitter.teruteru128.study;

import java.io.Serializable;
import java.util.UUID;

public class UnsignedUUID implements Serializable, Comparable<UnsignedUUID> {

    private UUID uuid;

    public UnsignedUUID(UUID uuid) {
        super();
        this.uuid = uuid;
    }

    public UnsignedUUID(long most, long least) {
        super();
        this.uuid = new UUID(most, least);
    }

    public long most() {
        return uuid.getMostSignificantBits();
    }

    public long least() {
        return uuid.getLeastSignificantBits();
    }

    @Override
    public int compareTo(UnsignedUUID o) {
        long most = uuid.getMostSignificantBits();
        long least = uuid.getLeastSignificantBits();
        long thatMost = o.uuid.getMostSignificantBits();
        long thatLeast = o.uuid.getLeastSignificantBits();
        return (Long.compareUnsigned(most, thatMost) < 0 ? -1
                : (Long.compareUnsigned(most, thatMost) > 0 ? 1
                        : (Long.compareUnsigned(least, thatLeast) < 0 ? -1
                                : (Long.compareUnsigned(least, thatLeast) > 0 ? 1 : 0))));
    }

}
