package com.twitter.teruteru128.study;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.concurrent.Callable;

/**
 * 月曜日探索機
 */
public class MonDaySearcher implements Callable<Void> {

  @Override
  public Void call() throws Exception {
    int year = 2022;
    int month = 1;
    // y年m月1日が月曜日？
    LocalDate localDate = null;
    // 1月から12月において2022年以降の毎月1日で最初の月曜日を探す
    for (month = 1; month <= 12; month++) {
      for (year = 2022;; year++) {
        localDate = LocalDate.of(year, month, 1);
        if (localDate.getDayOfWeek() == DayOfWeek.MONDAY) {
          break;
        }
      }
      System.out.printf("%s : %s%n", DayOfWeek.MONDAY, localDate);
    }
    // 2022年以降の11月20日で最初の月曜日を探す
    for (year = 2022;; year++) {
      localDate = LocalDate.of(year, 11, 20);
      if (localDate.getDayOfWeek() == DayOfWeek.MONDAY) {
        System.out.printf("%s : %s%n", DayOfWeek.MONDAY, localDate);
        break;
      }
    }
    return null;
  }
}