package com.twitter.teruteru128.study;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.math.BigInteger;

import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.math.ec.ECPoint;

// TODO 将来的にエントリポイントをこのクラス一つにする
// TODO コマンドライン引数の実装方法
// TODO 設定ファイルの実装方法 Propaties XML JSON YAML
/**
 * Main
 * 
 */
public class Main {

    private static final ECPoint G = CustomNamedCurves.getByName("secp256k1").getG();

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        File fin = new File("privateKeys4.bin");
        File fout = new File("publicKeys4.bin");
        byte[] inbuf = new byte[32];
        byte[] outbuf = null;
        int len = 0;
        try (FileInputStream in = new FileInputStream(fin); FileOutputStream out = new FileOutputStream(fout)) {
            while ((len = in.read(inbuf, 0, 32)) != -1) {
                outbuf = G.multiply(new BigInteger(1, inbuf, 0, len)).normalize().getEncoded(false);
                out.write(outbuf, 0, 65);
            }
        }
    }
}
