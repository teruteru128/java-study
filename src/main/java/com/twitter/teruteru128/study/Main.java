package com.twitter.teruteru128.study;

import java.util.Properties;

// TODO 将来的にエントリポイントをこのクラス一つにする
// TODO コマンドライン引数の実装方法
// TODO 設定ファイルの実装方法 Propaties XML JSON YAML
/**
 * Main
 * 
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Thread poop = new Thread(new Poop());
        poop.start();
        Properties properties = new Properties();
        properties.setProperty("\uD83D\uDCA9", "やったぜ。");
        properties.store(System.out, null);
    }
}
