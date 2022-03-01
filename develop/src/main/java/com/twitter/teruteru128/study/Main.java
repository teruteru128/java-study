package com.twitter.teruteru128.study;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws Exception {
        /* Collatz5 c = new Collatz5(); */
        /* c.accept(BigInteger.valueOf(3)); */
        // シャンフロ「2ヶ月以上更新されていません」の注意書きが出るまでの期間
        var d2 = LocalDateTime.of(2022, 4, 4, 14, 4, 0);
        var now = LocalDateTime.now();
        for (var unit : ChronoUnit.values()) {
            if (now.isSupported(unit))
                System.out.printf("%s, %s%n", unit, now.until(d2, unit));
        }
    }
}
