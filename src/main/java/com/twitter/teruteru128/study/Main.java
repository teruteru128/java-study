package com.twitter.teruteru128.study;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Main
 * 
 * TODO 将来的にエントリポイントをこのクラス一つにする
 */
public class Main {

    public static void main(String[] args) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH-mm-ss");
        System.out.println(formatter.format(LocalDateTime.now()));
    }
}
