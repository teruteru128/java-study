package com.twitter.teruteru128.bitmessage.inventory;

import java.util.Arrays;

/**
 * Hash of inventory objects to use in inv/getdata messages.
 */
public record InventoryVector(byte[] hash) implements Comparable<InventoryVector> {

    public InventoryVector(byte[] hash) {
        this.hash = hash.clone();
    }

    @Override
    public byte[] hash() {
        return hash.clone();
    }

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
