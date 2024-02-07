package com.twitter.teruteru128.bitmessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;

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
        var pk0 = new byte[65];
        reads(pk0, 0xC41A5F * 65, publicKeyRootPath.resolve(String.format("publicKeys%d.bin", 0x7E)).toFile());
        var pk1 = new byte[65];
        reads(pk1, 0xC220CD * 65, publicKeyRootPath.resolve(String.format("publicKeys%d.bin", 0x7d)).toFile());
        var pk2 = new byte[65];
        reads(pk2, 0x58CDF3 * 65, publicKeyRootPath.resolve(String.format("publicKeys%d.bin", 0x8B)).toFile());
        var checksum0 = getChecksum(pk0);
        System.out.println(checksum0);
        var checksum1 = getChecksum(pk1);
        System.out.println(checksum1);
        var checksum2 = getChecksum(pk2);
        System.out.println(checksum2);
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
