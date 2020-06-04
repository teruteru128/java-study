package com.twitter.teruteru128.study;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
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
        final int requireNlz = 3;
        int len = 0;
        int nlz = 0;
        int j = 0;
        long num = 0;
        String inputFileName = null;
        File fin = null;
        byte[] b = DatatypeConverter.parseBase64Binary("BKD5p56rWZ5rmOL09pci/npDEI6iW2SQTu3R7M2mx6rrVHh+kcUll1sdzNfZfwtzkUlG3ZKLN/Je/E3syQnn+HU=");
        sha512.update(b);
        sha512.update(b);
        byte[] ripe = ripemd160.digest(sha512.digest());
        System.out.println(DatatypeConverter.printHexBinary(ripe));
        for (int i = 1; i <= 4; i++) {
            inputFileName = String.format("publicKeys%d.bin", i);
            fin = new File(inputFileName);
            try (FileInputStream in = new FileInputStream(fin)) {
                for (num = 0; (len = in.read(inbuf, 0, Const.PUBLIC_KEY_LENGTH * 2400)) != -1;) {
                    for (j = 0; j < len; j += Const.PUBLIC_KEY_LENGTH, num++) {
                        sha512.update(inbuf, j, Const.PUBLIC_KEY_LENGTH);
                        sha512.update(inbuf, j, Const.PUBLIC_KEY_LENGTH);
                        sha512.digest(cache64, 0, Const.SHA512_DIGEST_LENGTH);
                        ripemd160.update(cache64, 0, Const.SHA512_DIGEST_LENGTH);
                        ripemd160.digest(cache64, 0, Const.RIPEMD160_DIGEST_LENGTH);
                        for (nlz = 0; cache64[nlz] == 0 && nlz < Const.RIPEMD160_DIGEST_LENGTH; nlz++) {
                        }
                        if (nlz >= requireNlz) {
                            System.out.printf("filename : %s, index : %d, nlz : %d%n", inputFileName,
                                    num * Const.PUBLIC_KEY_LENGTH, nlz);
                            var k = Arrays.copyOfRange(inbuf, j, j + Const.PUBLIC_KEY_LENGTH);
                            System.out.println(DatatypeConverter.printBase64Binary(k));
                        }
                    }
                }
                System.out.printf("%d%n", num);
            }
            System.out.printf("%s fin!%n", inputFileName);
        }
    }
}
