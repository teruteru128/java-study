package com.github.teruteru128.p2pquake;

import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

/**
 * {@link Packet}を作成するファクトリクラス
 * NOTE: 一応状態を持てるように各種{@code create}メソッドはインスタンスメソッドにしておく
 */
public class PacketFactory {

    private static final Pattern CRLF = Pattern.compile("\r\n");
    private static final Pattern PACKET_DELIMITER = Pattern.compile(" ");
    private static final Pattern DATA_DELIMITER = Pattern.compile(":");

    public Packet create(int code, int hop, String[] dataList) {
        dataList = Objects.requireNonNull(dataList);
        if (dataList.length == 0) {
            return create(code, hop);
        }
        return new ArrayDataPacket(code, hop, dataList);
    }

    public Packet create(int code, int hop, List<String> dataList) {
        dataList = Objects.requireNonNull(dataList);
        if (dataList.isEmpty()) {
            return create(code, hop);
        }
        return new ListedDataPacket(code, hop, dataList);
    }

    public Packet create(int code, int hop, String datum) {
        datum = Objects.requireNonNull(datum);
        if (datum.isEmpty()) {
            return create(code, hop);
        }
        return new SingleDatumPacket(code, hop, datum);
    }

    public Packet create(int code, int hop) {
        return new NoDataPacket(code, hop);
    }

    public Packet parse(String line) {
        var p = PACKET_DELIMITER.split(CRLF.matcher(line).replaceAll(""));
        if (p.length < 2 || 3 < p.length) {
            throw new PacketFormatException();
        }
        if (p.length == 2) {
            return new NoDataPacket(Integer.parseInt(p[0], 10), Integer.parseInt(p[0], 10));
        }
        return create(Integer.parseInt(p[0], 10), Integer.parseInt(p[0], 10), DATA_DELIMITER.split(p[2]));
    }
}
