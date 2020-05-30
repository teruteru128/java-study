package com.twitter.teruteru128.study;

import java.security.MessageDigest;
import java.security.Provider;
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

    public static void main(String[] args) throws Exception {
        Provider provider = Security.getProvider("BC");
        if(provider == null){
            Security.addProvider(provider = new BouncyCastleProvider());
        }
        MessageDigest blake2b512 = MessageDigest.getInstance("BLAKE2b-512");
        System.out.println(blake2b512);
    }
}
