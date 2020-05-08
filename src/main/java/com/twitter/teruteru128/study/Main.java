package com.twitter.teruteru128.study;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.util.Arrays;

import com.twitter.teruteru128.study.bitmessage.genaddress.BMAddress;

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
        SecureRandom random = SecureRandom.getInstance("Windows-PRNG");
        //int pow = 3 + random.nextInt(6) + random.nextInt(6) + random.nextInt(6);
        int pow = 10;
        System.out.printf("POW : %d%n", pow);
        System.out.printf("初期SAN : %d%n", pow * 5);
        //int dice = random.nextInt(100) + 1;
        int dice = 37;
        System.out.printf("dice : %d%n", dice);
        System.out.println(random.nextInt(20) + 1);
    }
}
