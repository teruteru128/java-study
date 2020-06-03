package com.twitter.teruteru128.study;

// TODO 将来的にエントリポイントをこのクラス一つにする
// TODO コマンドライン引数の実装方法
// TODO 設定ファイルの実装方法 Propaties XML JSON YAML
/**
 * Main
 * 
 */
public class Main {

    /**
     * U+0028
     * U+0020
     * U+ff9f
     * U+0434
     * U+ff9f
     * U+0029
     * U+ff64
     * U+ff8d
     * U+ff9f
     * U+ff6f
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        String pe = "( ﾟдﾟ)､ﾍﾟｯ";
        int len = pe.length();
        for(int i = 0; i < len; i++){
            System.out.printf("U+%04x\n", pe.codePointAt(i));
        }
    }
}
