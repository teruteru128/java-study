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
        String pe = "( ﾟдﾟ)､ﾍﾟｯ";
        int len = pe.length();
        for(int i = 0; i < len; i++){
            System.out.printf("U+%04x\n", pe.codePointAt(i));
        }
    }
}
