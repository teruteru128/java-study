package com.twitter.teruteru128.study;

import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;

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

    public static void main(String[] args) throws Exception {
        byte[] a = "I LOVE KONATA(=ω=.)".getBytes();
        System.out.println(DatatypeConverter.printHexBinary(a));
        System.out.println(a.length);
        System.out.printf("%c%n", '\u03c9');
        Provider provider = Security.getProvider("BC");
        if(provider == null){
            Security.addProvider(new BouncyCastleProvider());
        }
        MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");
        ripemd160.update(a, 0, 20);
        System.out.println(DatatypeConverter.printHexBinary(ripemd160.digest()));
    }
}
