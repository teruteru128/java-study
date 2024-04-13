package com.github.teruteru128.p2pquake;

import java.util.List;
import java.util.Objects;

public class ListedDataPacket extends Packet {

    private final List<String> dataList;

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
            return new SingleDatumPacket(code, hop, dataList.getFirst()).toString();
        }
        return String.valueOf(super.code) + ' ' + super.hop + ' ' + String.join(":", dataList) + "\r\n";
    }

}
