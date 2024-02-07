package com.twitter.teruteru128.util;

import java.util.Comparator;
import java.util.UUID;

/**
 * 
*/
public class UUIDUnsignedComparator implements Comparator<UUID> {

    @Override
    public int compare(UUID o1, UUID o2) {
        int mostSigBits = Long.compareUnsigned(o1.getMostSignificantBits(), o2.getMostSignificantBits());
        return mostSigBits != 0 ? mostSigBits : Long.compareUnsigned(o1.getLeastSignificantBits(), o2.getLeastSignificantBits());
    }

}
