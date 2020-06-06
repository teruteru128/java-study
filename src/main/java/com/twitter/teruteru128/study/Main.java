package com.twitter.teruteru128.study;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

// TODO 将来的にエントリポイントをこのクラス一つにする
// TODO コマンドライン引数の実装方法
// TODO 設定ファイルの実装方法 Propaties XML JSON YAML
/**
 * Main
 * 
 */
public class Main {

    /**
     * thread1->pubkeys0.bin thread2->pubkeys1.bin thread3->pubkeys2.bin
     * thread4->pubkeys3.bin
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        var path0 = Paths.get("publickeys0.bin");
        var path1 = Paths.get("publickeys1.bin");
        var path2 = Paths.get("publickeys2.bin");
        var path3 = Paths.get("publickeys3.bin");
        byte[] pubkeys0 = Files.readAllBytes(path0);
        byte[] pubkeys1 = Files.readAllBytes(path1);
        byte[] pubkeys2 = Files.readAllBytes(path2);
        byte[] pubkeys3 = Files.readAllBytes(path3);
    }
}
