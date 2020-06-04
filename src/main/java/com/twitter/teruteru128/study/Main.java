package com.twitter.teruteru128.study;

import java.io.File;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.Security;
import java.util.Arrays;

import com.twitter.teruteru128.study.bitmessage.Const;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import jakarta.xml.bind.DatatypeConverter;

// TODO 将来的にエントリポイントをこのクラス一つにする
// TODO コマンドライン引数の実装方法
// TODO 設定ファイルの実装方法 Propaties XML JSON YAML
/**
 * Main
 * 
 */
public class Main {

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
        final var inbuf = new byte[Const.PUBLIC_KEY_LENGTH * 2400];
        final var cache64 = new byte[Const.SHA512_DIGEST_LENGTH];
        final var sha512 = MessageDigest.getInstance("SHA-512");
        final var ripemd160 = MessageDigest.getInstance("ripemd160");
        final int requireNlz = 2;
        final var pubkey1 = new byte[Const.PUBLIC_KEY_LENGTH * 65536];
        final var pubkey2 = new byte[Const.PUBLIC_KEY_LENGTH * 65536];
        int len = 0;
        int nlz = 0;
        int i = 0;
        int j = 0;
        long num = 0;
        SecureRandom rnd = SecureRandom.getInstance("SHA1PRNG");
        while (true) {
            int i1 = rnd.nextInt(67108864);
            int i2 = rnd.nextInt(67108864);
            int fileindex1 = i1 / 16777216;
            int fileindex2 = i2 / 16777216;
            long fileoffset1 = (i1 % 16777216L) * Const.PUBLIC_KEY_LENGTH;
            long fileoffset2 = (i2 % 16777216L) * Const.PUBLIC_KEY_LENGTH;
            String inputFileName1 = String.format("publicKeys%d.bin", fileindex1);
            File fin1 = new File(inputFileName1);
            String inputFileName2 = String.format("publicKeys%d.bin", fileindex2);
            File fin2 = new File(inputFileName2);
            try (RandomAccessFile raf1 = new RandomAccessFile(fin1, "r");
                    RandomAccessFile raf2 = new RandomAccessFile(fin2, "r")) {
                raf1.seek(fileoffset1);
                int rb1 = raf1.read(pubkey1, 0, Const.PUBLIC_KEY_LENGTH * 65536);
                int rk1 = rb1 / Const.PUBLIC_KEY_LENGTH;
                raf2.seek(fileoffset2);
                int rb2 = raf2.read(pubkey2, 0, Const.PUBLIC_KEY_LENGTH * 65536);
                int rk2 = rb2 / Const.PUBLIC_KEY_LENGTH;
                for (i = 0; i < rk1; i++) {
                    for (j = 0; j < rk2; j++) {
                        sha512.update(pubkey1, Const.PUBLIC_KEY_LENGTH * i, Const.PUBLIC_KEY_LENGTH);
                        sha512.update(pubkey2, Const.PUBLIC_KEY_LENGTH * j, Const.PUBLIC_KEY_LENGTH);
                        sha512.digest(cache64, 0, Const.SHA512_DIGEST_LENGTH);
                        ripemd160.update(cache64, 0, Const.SHA512_DIGEST_LENGTH);
                        ripemd160.digest(cache64, 0, Const.RIPEMD160_DIGEST_LENGTH);
                        for (nlz = 0; cache64[nlz] == 0 && nlz < Const.RIPEMD160_DIGEST_LENGTH; nlz++) {
                        }
                        if (nlz >= requireNlz) {
                            System.out.printf("filename1 : %s, index : %d, filename2 : %s, index2 : %d, nlz : %d%n",
                                    inputFileName1, fileoffset1 + Const.PUBLIC_KEY_LENGTH * i, inputFileName2,
                                    fileoffset2 + Const.PUBLIC_KEY_LENGTH * j, nlz);
                            System.out.println(DatatypeConverter
                                    .printHexBinary(Arrays.copyOf(cache64, Const.RIPEMD160_DIGEST_LENGTH)));
                            System.out.println(DatatypeConverter.printBase64Binary(Arrays.copyOfRange(pubkey1,
                                    Const.PUBLIC_KEY_LENGTH * i, Const.PUBLIC_KEY_LENGTH * (i + 1))));
                            System.out.println(DatatypeConverter.printBase64Binary(Arrays.copyOfRange(pubkey2,
                                    Const.PUBLIC_KEY_LENGTH * j, Const.PUBLIC_KEY_LENGTH * (j + 1))));
                        }
                        sha512.update(pubkey2, Const.PUBLIC_KEY_LENGTH * j, Const.PUBLIC_KEY_LENGTH);
                        sha512.update(pubkey1, Const.PUBLIC_KEY_LENGTH * i, Const.PUBLIC_KEY_LENGTH);
                        sha512.digest(cache64, 0, Const.SHA512_DIGEST_LENGTH);
                        ripemd160.update(cache64, 0, Const.SHA512_DIGEST_LENGTH);
                        ripemd160.digest(cache64, 0, Const.RIPEMD160_DIGEST_LENGTH);
                        for (nlz = 0; cache64[nlz] == 0 && nlz < Const.RIPEMD160_DIGEST_LENGTH; nlz++) {
                        }
                        if (nlz >= requireNlz) {
                            System.out.printf("filename1 : %s, index : %d, filename2 : %s, index2 : %d, nlz : %d%n",
                                    inputFileName2, fileoffset2 + Const.PUBLIC_KEY_LENGTH * j, inputFileName1,
                                    fileoffset1 + Const.PUBLIC_KEY_LENGTH * i, nlz);
                            System.out.println(DatatypeConverter
                                    .printHexBinary(Arrays.copyOf(cache64, Const.RIPEMD160_DIGEST_LENGTH)));
                            System.out.println(DatatypeConverter.printBase64Binary(Arrays.copyOfRange(pubkey2,
                                    Const.PUBLIC_KEY_LENGTH * j, Const.PUBLIC_KEY_LENGTH * (j + 1))));
                            System.out.println(DatatypeConverter.printBase64Binary(Arrays.copyOfRange(pubkey1,
                                    Const.PUBLIC_KEY_LENGTH * i, Const.PUBLIC_KEY_LENGTH * (i + 1))));
                        }
                    }
                }
            }
        }
    }
}
