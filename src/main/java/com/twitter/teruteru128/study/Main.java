package com.twitter.teruteru128.study;

import java.io.InputStream;
import java.util.Properties;

// TODO 将来的にエントリポイントをこのクラス一つにする
// TODO コマンドライン引数の実装方法
// TODO 設定ファイルの実装方法 Propaties XML JSON YAML
/**
 * Main
 * 
 */
public class Main {

    public Main() {
    }

    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        try(InputStream in = Main.class.getResourceAsStream("config.properties")){
            properties.load(in);
        }
        System.out.printf("%s%n", properties.getProperty("version"));
        System.out.println("この始末☆");
    }
}
