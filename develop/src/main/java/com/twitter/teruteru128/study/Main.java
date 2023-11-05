package com.twitter.teruteru128.study;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.HexFormat;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

import org.bouncycastle.math.ec.ECPoint;

import com.twitter.teruteru128.bitmessage.Const;
// redhat-developer/vscode-java#1327
import com.twitter.teruteru128.util.Base58;

/**
 * Main
 */
public class Main {

    private static final BigDecimal Round_Up_Width = new BigDecimal("512");
    private static final HexFormat format = HexFormat.of();

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
        // 00000000cf12c86a, 4178976631
        var p1 = System.getenv("PK");
        if (p1 == null || p1.isEmpty()) {
            return;
        }
        var b1 = Base58.decode(p1);
        var encoded1 = ByteBuffer.wrap(Const.G.multiply(new BigInteger(1, b1, 1, 32)).getEncoded(false));
        var sha512 = MessageDigest.getInstance("SHA512");
        var ripemd160 = MessageDigest.getInstance("ripemd160");
        sha512.update(encoded1);
        encoded1.rewind();
        var hashBuffer = ByteBuffer.allocate(64);
        var hash = hashBuffer.array();
        sha512.digest(hash, 0, 64);
        ripemd160.update(hash, 0, 64);
        ripemd160.digest(hash, 0, 20);
        var rootBuffer = ByteBuffer.allocateDirect(16777216 * 65);
        var buffers = new ByteBuffer[16777216];
        for (int i = 0; i < 16777216; i++) {
            buffers[i] = rootBuffer.slice((i << 6) + i, 65);
        }
        long min = 0x00000000cf12c86aL;
        long hashhead = 0;
        long minindex = 4178976631L;

        for (long i = 0; i < 256; i++) {
            var path = Paths.get(String.format("D:\\keys\\public\\publicKeys%d.bin", i));
            try (var channel = FileChannel.open(path)) {
                channel.read(rootBuffer);
                rootBuffer.flip();
            }
            for (int j = 0; j < 16777216; j++) {
                sha512.update(encoded1);
                encoded1.rewind();
                sha512.update(buffers[j]);
                buffers[j].rewind();
                sha512.digest(hash, 0, 64);
                ripemd160.update(hash, 0, 64);
                ripemd160.digest(hash, 0, 20);
                hashhead = hashBuffer.getLong(0);
                if (Long.compareUnsigned(min, hashhead) > 0) {
                    min = hashhead;
                    minindex = (i << 24) | j;
                    System.out.printf("%016x, %d%n", min, minindex);
                }
            }
            rootBuffer.clear();
        }
    }

    private static void createTar(Path in, Path out) throws IOException {
        var body = Files.readAllBytes(in);
        var filesize = Files.size(in);
        var header = ByteBuffer.allocate(512);
        // mode
        header.position(100);
        header.put(getbytesutf8("000000 "));
        // uid
        header.position(108);
        header.put(getbytesutf8("000000 "));
        // gid
        header.position(116);
        header.put(getbytesutf8("000000 "));
        // size
        header.position(124);
        header.put(getbytesutf8(String.format("%011o ", filesize)));
        // mtime
        header.position(136);
        header.put(getbytesutf8(String.format("%011o ", 0)));
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
        header.put(getbytesutf8("ustar"));
        // version
        header.position(263);
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
                Files.newOutputStream(out, StandardOpenOption.WRITE, StandardOpenOption.CREATE),
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
        System.out.printf("Encoded: %s%n", format.formatHex(encoded));
        System.out.printf("Format: %s%n", formatName);
        System.out.printf("Salt: %s%n", format.formatHex(salt));
    }
}
