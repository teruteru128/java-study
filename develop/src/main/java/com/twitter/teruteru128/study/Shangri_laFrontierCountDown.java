package com.twitter.teruteru128.study;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * シャンフロ「2ヶ月以上更新されていません」の注意書きが出るまでの期間
 * @see https://twitter.com/nemnem4935/status/1498230943701606401
 */
public class Shangri_laFrontierCountDown implements Runnable {

  @Override
  public void run() {
    var d2 = LocalDateTime.of(2022, 4, 4, 14, 4, 0);
    var now = LocalDateTime.now();
    for (var unit : ChronoUnit.values()) {
      if (now.isSupported(unit))
        System.out.printf("%s, %s%n", unit, now.until(d2, unit));
    }
  }

}
