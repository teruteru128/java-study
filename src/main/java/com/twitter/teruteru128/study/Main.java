package com.twitter.teruteru128.study;

/**
 * Main
 * 
 * TODO 将来的にエントリポイントをこのクラス一つにする
 */
public class Main {

    public static void main(String[] args) throws Exception {
        double a = (1099511627775D / 1099511627776D);
        double b = 5e-1;
        double c = 2D / 3D;
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
        System.out.printf("%.25g%n", Math.pow(a, 1207936985807D));
        System.out.printf("%.25g%n", Math.pow(a, 1207936985808D));
    }
}
