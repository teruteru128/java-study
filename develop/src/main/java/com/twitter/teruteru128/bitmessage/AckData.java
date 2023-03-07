package com.twitter.teruteru128.bitmessage;

import java.util.Arrays;

public record AckData(byte[] ackdata) {

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(ackdata);
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
        AckData other = (AckData) obj;
        if (!Arrays.equals(ackdata, other.ackdata))
            return false;
        return true;
    }

}
