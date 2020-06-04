package com.twitter.teruteru128.study;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.Security;
import java.util.Base64;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

// TODO 将来的にエントリポイントをこのクラス一つにする
// TODO コマンドライン引数の実装方法
// TODO 設定ファイルの実装方法 Propaties XML JSON YAML
/**
 * Main
 * 
 */
public class Main {

    private static final int PRIVATE_KEY_LENGTH = 32;
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
        File fin = new File("publicKeys4.bin");
        byte[] inbuf = new byte[65];
        byte[] cache64 = new byte[64];
        var sha512 = MessageDigest.getInstance("SHA-512");
        var ripemd160 = MessageDigest.getInstance("ripemd160");
        int len = 0;
        int nlz = 0;
        final int requireNlz = 4;
        try (FileInputStream in = new FileInputStream(fin)) {
            while ((len = in.read(inbuf, 0, 65)) != -1) {
                sha512.update(inbuf, 0, len);
                sha512.update(inbuf, 0, len);
                sha512.digest(cache64, 0, SHA512_DIGEST_LENGTH);
                ripemd160.update(cache64, 0, SHA512_DIGEST_LENGTH);
                ripemd160.digest(cache64, 0, RIPEMD160_DIGEST_LENGTH);
                for (nlz = 0; cache64[nlz] == 0 && nlz < RIPEMD160_DIGEST_LENGTH; nlz++) {
                }
                if(nlz >= requireNlz){
                    
                }
            }
        }
    }
}
