package com.github.teruteru128.study;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class TarMaker {

    private static final BigDecimal ROUND_UP_WIDTH = new BigDecimal("512");

    private static void createTar(Path in, Path out) throws IOException {
        var body = Files.readAllBytes(in);
        var fileSize = Files.size(in);
        var header = ByteBuffer.allocate(512);
        // mode
        header.position(100);
        header.put(getBytesUTF8("000000 "));
        // uid
        header.position(108);
        header.put(getBytesUTF8("000000 "));
        // gid
        header.position(116);
        header.put(getBytesUTF8("000000 "));
        // size
        header.position(124);
        header.put(getBytesUTF8(String.format("%011o ", fileSize)));
        // mtime
        header.position(136);
        header.put(getBytesUTF8(String.format("%011o ", 0)));
        // chksum
        header.position(148);
        // header.put(getbytesutf8(String.format("%06o\0 ", 0)));
        // チェックサムは空白文字で埋めた状態で計算される->埋めずに後で256を足してもいい
        // header.put(getbytesutf8(" "));
        header.position(156);
        // typeflag
        header.put((byte) '0');
        // linkname is empty
        // magic
        header.position(257);
        header.put(getBytesUTF8("ustar"));
        // version
        header.position(263);
        header.put(getBytesUTF8("00"));
        // uname, gname is empty
        header.position(329);
        header.put(getBytesUTF8("000000 "));
        header.position(337);
        header.put(getBytesUTF8("000000 "));
        // prefix is empty
        header.position(345);
        // move limit to tail
        header.position(512);
        header.flip();
        var paddingSize = BigDecimal.valueOf(fileSize).divide(TarMaker.ROUND_UP_WIDTH, RoundingMode.CEILING)
                .multiply(TarMaker.ROUND_UP_WIDTH).longValue() - fileSize;
        // Add 1024 bytes of null character as footer
        var filePad = new byte[(int) paddingSize];
        var checksumMask = new byte[8];
        try (var bos = new BufferedOutputStream(
                Files.newOutputStream(out, StandardOpenOption.WRITE, StandardOpenOption.CREATE),
                1024 * 1024 * 1024)) {
            for (int i = 0; i < 16; i++) {
                header.position(0);
                // name
                header.put(getBytesUTF8(String.format("%03x.tar.xz", i)));
                // clear checksum
                header.position(148);
                header.put(checksumMask);
                // calc checksum
                int chksum = 256;
                for (var b : header.array()) {
                    chksum += b & 0xff;
                }
                // set checksum
                header.position(148);
                header.put(getBytesUTF8(String.format("%06o\0 ", chksum)));
                header.rewind();
                // write header
                bos.write(header.array());
                // 多分rewind()かposition(0)のどちらかで十分
                header.rewind();
                // write file content
                bos.write(body);
                // write content block padding
                bos.write(filePad);
            }
            // archive footer
            bos.write(new byte[1024]);
        }
    }

    static byte[] getBytesUTF8(String a) {
        return a.getBytes(StandardCharsets.UTF_8);
    }

}
