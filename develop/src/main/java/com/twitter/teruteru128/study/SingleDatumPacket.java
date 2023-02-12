package com.twitter.teruteru128.study;

import java.util.Objects;

public class SingleDatumPacket extends Packet {

    private String datum;

    public SingleDatumPacket(int code, int hop, String datum) {
        super(code, hop);
        this.datum = Objects.requireNonNull(datum);
    }

    @Override
    public String toString() {
        if (datum.isEmpty()) {
            return new NoDataPacket(code, hop).toString();
        }
        return new StringBuilder().append(code).append(' ').append(hop).append(' ').append(datum).append("\r\n").toString();
    }

}
