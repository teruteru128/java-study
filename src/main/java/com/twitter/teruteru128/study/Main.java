package com.twitter.teruteru128.study;

import com.twitter.teruteru128.study.bitmessage.client.BitMessageHelloWorld;

// TODO 将来的にエントリポイントをこのクラス一つにする
// TODO コマンドライン引数の実装方法
// TODO 設定ファイルの実装方法 Propaties XML JSON YAML
/**
 * Main
 * 
 */
public class Main {

    public static void main(String[] args) throws Exception {
        var helloWorld = new BitMessageHelloWorld();
        helloWorld.call();
    }
}
