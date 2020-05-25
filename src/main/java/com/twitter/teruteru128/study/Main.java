package com.twitter.teruteru128.study;

import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.Arrays;

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
        Provider provider = Security.getProvider("BC");
        if (provider == null) {
            Security.addProvider(provider = new BouncyCastleProvider());
        }
        MessageDigest sha512 = MessageDigest.getInstance("sha-512");
        byte[] cache64 = new byte[64];
        byte[] decodedAddress1 = Base58.decode("2cXNEKsFMtcN96qVLzeKqiozzfCHmDk1dR");
        System.out.println(DatatypeConverter.printHexBinary(decodedAddress1));
        sha512.update(decodedAddress1, 0, 21);
        sha512.digest(cache64, 0, 64);
        sha512.update(cache64, 0, 64);
        sha512.digest(cache64, 0, 64);
        System.out.println(Arrays.equals(decodedAddress1, 21, 25, cache64, 0, 4));
    }
}
