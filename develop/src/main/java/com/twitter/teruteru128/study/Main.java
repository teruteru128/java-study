package com.twitter.teruteru128.study;

import java.io.BufferedOutputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.HexFormat;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/**
 * Main
 */
public class Main {

    private static final BigDecimal Round_Up_Width = new BigDecimal("512");
    static final char[] HEAD_SUFFIX = "^o^)┐".toCharArray();
    static final char[] TAIL_PREFIX = "┌(".toCharArray();
    private static final HexFormat HEX_FORMATTER = HexFormat.of();

    static {
        try {
            Class.forName("com.twitter.teruteru128.study.BCProviderLoader");
        } catch (ClassNotFoundException e) {
            throw new InternalError(e);
        }
    }

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // var password = args[0].toCharArray();
        // var salt = HEX_FORMATTER.parseHex("bde8d63e2c47380556a9f1b71d7a5388");
        // getFormatName(password, salt);

        var p = Paths.get(args[0]);
        var body = Files.readAllBytes(p);
        var filesize = Files.size(p);
        var header = ByteBuffer.allocate(512);
        // mode
        header.position(100);
        header.put("000000 ".getBytes(StandardCharsets.UTF_8));
        // uid
        header.position(108);
        header.put("000000 ".getBytes(StandardCharsets.UTF_8));
        // gid
        header.position(116);
        header.put("000000 ".getBytes(StandardCharsets.UTF_8));
        // size
        header.position(124);
        header.put(String.format("%011o ", filesize).getBytes(StandardCharsets.UTF_8));
        // mtime
        header.position(136);
        header.put(String.format("%011o ", 0).getBytes(StandardCharsets.UTF_8));
        // chksum
        header.position(148);
        // header.put(String.format("%06o\0 ", 0).getBytes(StandardCharsets.UTF_8));
        // チェックサムは空白文字で埋めた状態で計算される->埋めずに後で256を足してもいい
        // header.put(getbytesutf8(" "));
        header.position(156);
        // typeflag
        header.put((byte) '0');
        // linkname is empty
        header.position(257);
        // magic
        header.put("ustar\0".getBytes(StandardCharsets.UTF_8));
        // version
        header.put(getbytesutf8("00"));
        // uname, gname is empty
        header.position(329);
        header.put(getbytesutf8("000000 "));
        header.position(337);
        header.put(getbytesutf8("000000 "));
        // prefix is empty
        header.position(345);
        // move limit to tail
        header.position(512);
        header.flip();
        var paddingsize = BigDecimal.valueOf(filesize).divide(Round_Up_Width, RoundingMode.CEILING)
                .multiply(Round_Up_Width).longValue() - filesize;
        // Add 1024 bytes of null character as footer
        var filepad = new byte[(int) paddingsize];
        var chksummask = new byte[8];
        try (var bos = new BufferedOutputStream(
                Files.newOutputStream(Paths.get(args[1]), StandardOpenOption.WRITE, StandardOpenOption.CREATE),
                1024 * 1024 * 1024)) {
            for (int i = 0; i < 16; i++) {
                header.position(0);
                // name
                header.put(getbytesutf8(String.format("%03x.tar.xz", i)));
                // clear chksum
                header.position(148);
                header.put(chksummask);
                // calc chksum
                int chksum = 256;
                for (var b : header.array()) {
                    chksum += b & 0xff;
                }
                // set chksum
                header.position(148);
                header.put(getbytesutf8(String.format("%06o\0 ", chksum)));
                header.rewind();
                // write header
                bos.write(header.array());
                // 多分rewind()かposition(0)のどちらかで十分
                header.rewind();
                // write file content
                bos.write(body);
                // write content block padding
                bos.write(filepad);
            }
            // archive footer
            bos.write(new byte[1024]);
        }
    }

    private static byte[] getbytesutf8(String a) {
        return a.getBytes(StandardCharsets.UTF_8);
    }

    private static void getFormatName(char[] password, byte[] salt)
            throws NoSuchAlgorithmException, InvalidKeySpecException {
        // PBKDF2で署名秘密鍵を生成とかでいいのかね……？生成結果が生バイナリで使いやすいし
        var factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
        var spec = new PBEKeySpec(password, salt, 10000, 512);
        var secret = factory.generateSecret(spec);
        var algorithm = secret.getAlgorithm();
        var encoded = secret.getEncoded();
        var formatName = secret.getFormat();
        System.out.printf("Algorithm: %s%n", algorithm);
        System.out.printf("Encoded: %s%n", HEX_FORMATTER.formatHex(encoded));
        System.out.printf("Format: %s%n", formatName);
        System.out.printf("Salt: %s%n", HEX_FORMATTER.formatHex(salt));
    }
}
