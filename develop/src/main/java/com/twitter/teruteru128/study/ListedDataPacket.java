package com.twitter.teruteru128.study;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ListedDataPacket extends Packet {

    private List<String> dataList;

    public ListedDataPacket(int code, int hop, List<String> data) {
        super(code, hop);
        this.dataList = Objects.requireNonNull(data);
    }

    @Override
    public String toString() {
        if (dataList.isEmpty()) {
            return new NoDataPacket(code, hop).toString();
        }
        if (dataList.size() == 1) {
            return new SingleDatumPacket(code, hop, dataList.get(0)).toString();
        }
        return new StringBuilder().append(super.code).append(' ')
                .append(super.hop).append(' ')
                .append(dataList.stream().collect(Collectors.joining(":"))).append("\r\n").toString();
    }

}
