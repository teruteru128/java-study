package com.twitter.teruteru128.study;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.Security;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

// TODO 将来的にエントリポイントをこのクラス一つにする
// TODO コマンドライン引数の実装方法
// TODO 設定ファイルの実装方法 Propaties XML JSON YAML
/**
 * Main
 * 
 */
public class Main {

    private static final int PUBLIC_KEY_LENGTH = 65;
    private static final int SHA512_DIGEST_LENGTH = 64;
    private static final int RIPEMD160_DIGEST_LENGTH = 20;

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        var provider = Security.getProvider("BC");
        if (provider == null) {
            Security.addProvider(provider = new BouncyCastleProvider());
        }
        final var inbuf = new byte[PUBLIC_KEY_LENGTH * 2400];
        final var cache64 = new byte[SHA512_DIGEST_LENGTH];
        final var sha512 = MessageDigest.getInstance("SHA-512");
        final var ripemd160 = MessageDigest.getInstance("ripemd160");
        final int requireNlz = 2;
        int len = 0;
        int nlz = 0;
        int j = 0;
        int num = 0;
        String inputFileName = null;
        File fin = null;
        for (int i = 1; i <= 4; i++) {
            inputFileName = String.format("publicKeys%d.bin", i);
            fin = new File(inputFileName);
            try (FileInputStream in = new FileInputStream(fin)) {
                for (; (len = in.read(inbuf, 0, PUBLIC_KEY_LENGTH * 2400)) != -1; num++) {
                    for (j = 0; j < len; j += PUBLIC_KEY_LENGTH) {
                        sha512.update(inbuf, j, PUBLIC_KEY_LENGTH);
                        sha512.update(inbuf, j, PUBLIC_KEY_LENGTH);
                        sha512.digest(cache64, 0, SHA512_DIGEST_LENGTH);
                        ripemd160.update(cache64, 0, SHA512_DIGEST_LENGTH);
                        ripemd160.digest(cache64, 0, RIPEMD160_DIGEST_LENGTH);
                        for (nlz = 0; cache64[nlz] == 0 && nlz < RIPEMD160_DIGEST_LENGTH; nlz++) {
                        }
                        if (nlz >= requireNlz) {
                            System.out.printf("filename : %s, index : %d, nlz : %d%n", inputFileName,
                                    num * PUBLIC_KEY_LENGTH * 2400 + j, nlz);
                        }
                    }
                }
                System.out.printf("%d%n", (num * PUBLIC_KEY_LENGTH * 2400 + j) / PUBLIC_KEY_LENGTH);
            }
            System.out.printf("%s fin!%n", inputFileName);
        }
    }
}
