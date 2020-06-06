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
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
