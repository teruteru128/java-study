package com.twitter.teruteru128.bitmessage;

import com.twitter.teruteru128.bitmessage.genaddress.BMAddressGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.file.Files;
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

    private static final Logger logger = LoggerFactory.getLogger(CheckSumCheck.class);
    private static final HexFormat format = HexFormat.of();

    public static void main(String[] args) throws NoSuchAlgorithmException, IOException, DigestException {
        IntStream.range(4, 256).parallel().boxed().<PrivateKeyInfo>mapMulti((p, j) -> {
            byte[] q;
            try {
                q = Files.readAllBytes(Const.privateKeyRootPath.resolve(String.format("privateKeys%d.bin", p)));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i < 536870912; i += 32) {
                j.accept(new PrivateKeyInfo(p, q, i));
            }
        }).map(b -> {
            var buffer = ByteBuffer.allocate(32);
            var hash = buffer.array();
            try {
                var sha256 = MessageDigest.getInstance("SHA-256");
                sha256.update((byte) 0x80);
                sha256.update(b.keyArray(), b.offset(), 32);
                sha256.digest(hash, 0, 32);
                sha256.update(hash, 0, 32);
                sha256.digest(hash, 0, 32);
                return new SearchResult(b, buffer);
            } catch (NoSuchAlgorithmException | DigestException e) {
                throw new RuntimeException(e);
            }
        }).filter(b -> b.hash().getInt(0) == 0x6675636b).forEach(b -> {
            var info = b.info();
            System.out.printf("%s, %s, %s, %d, %d%n", format.formatHex(b.hash().array()), format.formatHex(info.keyArray(), info.offset(), info.offset() + 32),
                    BMAddressGenerator.encodeWIF(Arrays.copyOfRange(info.keyArray(), info.offset(), info.offset() + 32)), info.fileNumber(), info.offset() / 32);
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
