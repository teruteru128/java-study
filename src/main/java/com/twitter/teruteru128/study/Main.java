package com.twitter.teruteru128.study;

import java.util.Properties;
import java.security.SecureRandom;

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
        // litres par gallon
        double lpg = 3.785412;
        SecureRandom random = SecureRandom.getInstanceStrong();
        double sumOfGallons = 0D;
        for (int i = 0; i < 5; i++) {
            double gallons = 1d + random.nextDouble() * 2D;
            sumOfGallons += gallons;
            System.out.printf("%f gallons, %f litres%n", gallons, gallons * lpg);
        }
        double gallons = 3d + random.nextDouble() * 0.1D;
        sumOfGallons += gallons;
        System.out.printf("%f gallons, %f litres%n", gallons, gallons * lpg);
        System.out.printf("sum : %f gallons, %f litres%n", sumOfGallons, sumOfGallons * lpg);
    }
}
