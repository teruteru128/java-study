package com.twitter.teruteru128.study.sf;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * シャンフロ「2ヶ月以上更新されていません」の注意書きが出るまでの期間
 * 
 * @see https://twitter.com/nemnem4935/status/1498230943701606401
 */
public class Shangri_laFrontierCountDown implements Runnable {


  public Shangri_laFrontierCountDown() {
  }

  @Override
  public void run() {
    var lastUpdate = LocalDateTime.of(2022, 3, 10, 7, 4, 0);
    var dateAndTimeWhenTheWarningIsPosted = lastUpdate.plus(8, ChronoUnit.WEEKS);
    var now = LocalDateTime.now();
    var unit = ChronoUnit.DAYS;
    System.out.printf("%s%s%n", now.until(dateAndTimeWhenTheWarningIsPosted, unit), unit);
  }

}
