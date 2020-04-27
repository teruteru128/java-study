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
        // 1回引いて外れる確率
        System.out.println((double) (1L << 62) - 1);
        double a = (double) ((1L << 48) - 1) / (1L << 48);
        double b = 5e-1;
        double c = 1D / 2D;
        double min = 0;
        double max = 1e308;
        double middle = (min + max) / 2;
        for (int i = 0; i < 114514; i++) {
            b = 1 - Math.pow(a, middle);
            if (b < c) {
                min = middle;
            } else if (b > c) {
                max = middle;
            }
            middle = (min + max) / 2;
        }
        System.out.printf("%.25g%n", middle);
        System.out.printf("%.25g%n", Math.pow(a, middle));
        System.out.printf("%.25g%n", Math.pow(a, middle + 1));
    }
}
