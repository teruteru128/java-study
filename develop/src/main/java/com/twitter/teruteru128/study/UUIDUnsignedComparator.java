package com.twitter.teruteru128.study;

import java.io.Serializable;
import java.util.Comparator;
import java.util.UUID;

/**
 * 
*/
public class UUIDUnsignedComparator implements Comparator<UUID>, Serializable {

    @Override
    public int compare(UUID o1, UUID o2) {
        long most = o1.getMostSignificantBits();
        long least = o1.getLeastSignificantBits();
        long thatMost = o2.getMostSignificantBits();
        long thatLeast = o2.getLeastSignificantBits();
        return (Long.compareUnsigned(most, thatMost) < 0 ? -1
                : (Long.compareUnsigned(most, thatMost) > 0 ? 1
                        : (Long.compareUnsigned(least, thatLeast) < 0 ? -1
                                : (Long.compareUnsigned(least, thatLeast) > 0 ? 1 : 0))));
    }

}
