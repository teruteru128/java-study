package com.twitter.teruteru128.study.sf;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * シャンフロ「2ヶ月以上更新されていません」の注意書きが出るまでの期間
 * 
 * @see https://twitter.com/nemnem4935/status/1498230943701606401
 */
public class Shangri_laFrontierCountDown implements Runnable {

  @Override
  public void run() {
    var lastUpdate = OffsetDateTime.parse("2022-03-11T06:32:58+09:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    var dateAndTimeWhenTheWarningIsPosted = lastUpdate.plus(8, ChronoUnit.WEEKS);
    var now = OffsetDateTime.now();
    var unit = ChronoUnit.DAYS;
    System.out.printf("%s%s%n", now.until(dateAndTimeWhenTheWarningIsPosted, unit), unit);
  }

}
