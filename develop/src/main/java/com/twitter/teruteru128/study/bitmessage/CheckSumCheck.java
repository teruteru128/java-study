package com.twitter.teruteru128.study.bitmessage;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.LinkedList;

// WIFでチェックサムが全ビット0になる秘密鍵を探すよ
public class CheckSumCheck {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        var sha256 = MessageDigest.getInstance("SHA-256");
        var paths = new LinkedList<Path>();
        for (int i = 0; i < 4; i++) {
            paths.add(Paths.get(String.format("privateKeys%d.bin", i)));
        }
        var hash = new byte[32];
        var target = new byte[4];
        for (var path : paths) {
            try {
                var p = Files.readAllBytes(path);
                for (int i = 0; i < 536870912; i += 32) {
                    Arrays.copyOfRange(p, i, i + 32);
                    sha256.update(p, i, 32);
                    sha256.digest(hash, 0, 32);
                    sha256.update(hash, 0, 32);
                    sha256.digest(hash, 0, 32);
                    if (Arrays.equals(hash, 0, 3, target, 0, 3)) {
                        System.out.println(i >> 5);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("--");
        }
    }
}
