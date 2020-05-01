package com.twitter.teruteru128.study;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

// TODO 将来的にエントリポイントをこのクラス一つにする
// TODO コマンドライン引数の実装方法
// TODO 設定ファイルの実装方法 Propaties XML JSON YAML
/**
 * Main
 * 
 * @see https://www.nicovideo.jp/watch/sm36666595
 * @see https://youtu.be/UbwW7iNsluo
 */
public class Main {

    public static void main(String[] args) throws Exception {
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH-mm-ss");
        System.out.println(formatter1.format(LocalDateTime.now()));
        DateTimeFormatter formatter2 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(formatter2.format(OffsetDateTime.now()));
        LocalDateTime first_start_time = LocalDateTime.parse("2020-05-01T21:53:08");
        long first_start_num = 3254611;
        LocalDateTime first_end_time = LocalDateTime.parse("2020-05-01T22:19:35");
        long first_end_num = 3272960;

        long first_time_diff = first_start_time.until(first_end_time, ChronoUnit.SECONDS);
        long first_num_diff = first_end_num - first_start_num;
        double first = (double) first_num_diff / first_time_diff;
        System.out.println(first * 3600 / 3456);

        LocalDateTime second_start_time = LocalDateTime.parse("2020-05-01T21:53:06");
        long second_start_num = 924040;
        LocalDateTime second_end_time = LocalDateTime.parse("2020-05-01T22:19:32");
        long second_end_num = 929699;

        long second_time_diff = second_start_time.until(second_end_time, ChronoUnit.SECONDS);
        long second_num_diff = second_end_num - second_start_num;
        double second = (double) second_num_diff / second_time_diff;
        System.out.println(second * 3600 / 3456);

        System.out.println(first / second);
    }
}
