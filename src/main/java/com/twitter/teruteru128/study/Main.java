package com.twitter.teruteru128.study;

import java.security.MessageDigest;

import jakarta.xml.bind.DatatypeConverter;

/**
 * Main
 * 
 * TODO 将来的にエントリポイントをこのクラス一つにする
 */
public class Main {

    public static void main(String[] args) throws Exception {
        MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
        byte[] input = new byte[32];
        byte[] checksum = new byte[32];
        sha256.update(input, 0, 32);
        // lenをダイジェスト長以外に出来ない
        sha256.digest(checksum, 0, 36);
        System.out.println(DatatypeConverter.printHexBinary(checksum));
    }
}
