package com.twitter.teruteru128.bitmessage;

import com.twitter.teruteru128.bitmessage.genaddress.BMAddressGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HexFormat;
import java.util.stream.IntStream;

/**
 * WIFでチェックサムが全ビット0になる秘密鍵を探すよ
 */
public class CheckSumCheck {

    private static final Path keysRootPath = Paths.get("D:\\keys");
    static final Path privateKeyRootPath = keysRootPath.resolve("private");
    static final Path publicKeyRootPath = keysRootPath.resolve("public");
    private static final Logger logger = LoggerFactory.getLogger(CheckSumCheck.class);
    private static final HexFormat format = HexFormat.of();

    public static void main(String[] args) throws NoSuchAlgorithmException, IOException, DigestException {
        IntStream.range(4, 256).parallel().mapToObj(i -> privateKeyRootPath.resolve(String.format("privateKeys%d.bin", i))).<byte[]>mapMulti((p, j) -> {
            byte[] q;
            try {
                q = Files.readAllBytes(p);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i < 536870912; i += 32) {
                j.accept(Arrays.copyOfRange(q, i, i + 32));
            }
        }).filter(b -> {
            var buffer = ByteBuffer.allocate(32);
            var hash = buffer.array();
            try {
                var sha256 = MessageDigest.getInstance("SHA-256");
                sha256.update((byte) 0x80);
                sha256.update(b);
                sha256.digest(hash, 0, 32);
                sha256.update(hash, 0, 32);
                sha256.digest(hash, 0, 32);
                return buffer.getInt(0) == 0;
            } catch (NoSuchAlgorithmException | DigestException e) {
                throw new RuntimeException(e);
            }
        }).forEach(b -> {
            var buffer = ByteBuffer.allocate(32);
            var hash = buffer.array();
            try {
                var sha256 = MessageDigest.getInstance("SHA-256");
                sha256.update((byte) 0x80);
                sha256.update(b, 0, 32);
                sha256.digest(hash, 0, 32);
                sha256.update(hash, 0, 32);
                sha256.digest(hash, 0, 32);
                System.out.printf("%s, %s, %s%n", format.formatHex(hash), format.formatHex(b),
                        BMAddressGenerator.encodeWIF(b));
            } catch (NoSuchAlgorithmException | DigestException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private static int getChecksum(byte[] pk) throws NoSuchAlgorithmException, DigestException {
        var sha256 = MessageDigest.getInstance("SHA-256");
        var buffer = ByteBuffer.allocate(32);
        var hash = buffer.array();
        sha256.update((byte) 0x80);
        sha256.update(pk);
        sha256.digest(hash, 0, 32);
        sha256.update(hash, 0, 32);
        sha256.digest(hash, 0, 32);
        return buffer.getInt(0);
    }

    private static void reads(byte[] pk1, int offset, File file1) throws IOException {
        try (var file = new RandomAccessFile(file1, "r")) {
            file.seek(offset);
            file.read(pk1);
        }
    }
}
