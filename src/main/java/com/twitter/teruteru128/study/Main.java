package com.twitter.teruteru128.study;

// TODO 将来的にエントリポイントをこのクラス一つにする
// TODO コマンドライン引数の実装方法
// TODO 設定ファイルの実装方法 Propaties XML JSON YAML
/**
 * Main
 * 
 */
public class Main {

    public static void main(String[] args) throws Exception {
        byte[] buf = new byte[8192];
        int len = 0;
        byte[] b = "0123456789ABCDEF".getBytes();
        int writeNum = 0;
        while ((len = System.in.read(buf, 0, 8192)) >= 0) {
            for (int i = 0; i < len; i++, writeNum++) {
                System.out.write(b[(buf[i] >>> 4) & 0x0f]);
                System.out.write(b[(buf[i] >>> 0) & 0x0f]);
                if ((writeNum % 16) == 15) {
                    System.out.println();
                }
            }
        }
        // 後始末
        System.out.flush();
    }
}
