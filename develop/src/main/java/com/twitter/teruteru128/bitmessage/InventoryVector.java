package com.twitter.teruteru128.bitmessage;

import java.util.Arrays;

public record InventoryVector(byte[] hash) implements Comparable<InventoryVector> {

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(hash);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        InventoryVector other = (InventoryVector) obj;
        if (!Arrays.equals(hash, other.hash))
            return false;
        return true;
    }

    @Override
    public int compareTo(InventoryVector o) {
        return Arrays.compare(hash, o.hash);
    }

}
