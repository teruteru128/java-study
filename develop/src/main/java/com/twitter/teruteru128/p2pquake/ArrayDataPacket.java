package com.twitter.teruteru128.p2pquake;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class ArrayDataPacket extends Packet {
    private String[] dataArray;

    public ArrayDataPacket(int code, int hop, String[] dataArray) {
        super(code, hop);
        this.dataArray = Objects.requireNonNull(dataArray);
    }

    @Override
    public String toString() {
        if (dataArray.length == 0) {
            return new NoDataPacket(code, hop).toString();
        }
        if (dataArray.length == 1) {
            return new SingleDatumPacket(code, hop, dataArray[0]).toString();
        }
        return new StringBuilder().append(super.code).append(' ')
                .append(super.hop).append(' ')
                .append(Arrays.asList(dataArray).stream().collect(Collectors.joining(":"))).append("\r\n").toString();
    }

}
