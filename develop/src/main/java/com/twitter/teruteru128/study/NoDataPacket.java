package com.twitter.teruteru128.study;

public class NoDataPacket extends Packet {
    public NoDataPacket(int code, int hop) {
        super(code, hop);
    }

    @Override
    public String toString() {
        return new StringBuilder().append(super.code).append(' ')
                .append(super.hop).append("\r\n").toString();
    }

}