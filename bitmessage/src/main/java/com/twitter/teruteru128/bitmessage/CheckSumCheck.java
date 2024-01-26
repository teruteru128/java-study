package com.twitter.teruteru128.bitmessage;

import com.twitter.teruteru128.bitmessage.genaddress.BMAddressGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;
import java.util.LinkedList;

/**
 * WIFでチェックサムが全ビット0になる秘密鍵を探すよ
 */
public class CheckSumCheck {

    private static final Logger logger = LoggerFactory.getLogger(CheckSumCheck.class);

    public static void main(String[] args) throws NoSuchAlgorithmException {
        var sha256 = MessageDigest.getInstance("SHA-256");
        var paths = new LinkedList<Path>();
        for (int i = 0; i < 4; i++) {
            paths.add(Paths.get(String.format("privateKeys%d.bin", i)));
        }
        var rawKey = new byte[32];
        var buffer = ByteBuffer.allocate(32);
        var hash = buffer.array();
        var format = HexFormat.of();
        for (var path : paths) {
            try {
                var p = Files.readAllBytes(path);
                for (int i = 0; i < 536870912; i += 32) {
                    // Arrays.copyOfRange(p, i, i + 32);
                    System.arraycopy(p, i, rawKey, 0, 32);
                    sha256.update(rawKey, 0, 32);
                    sha256.digest(hash, 0, 32);
                    sha256.update(hash, 0, 32);
                    sha256.digest(hash, 0, 32);
                    if (buffer.getInt(0) == 0) {
                        System.out.printf("%d: %s, %s%n", i >> 5, format.formatHex(hash),
                                BMAddressGenerator.encodeWIF(rawKey));
                    }
                }
            } catch (Exception e) {
                logger.error("", e);
            }
            System.out.println("--");
        }
    }
}
