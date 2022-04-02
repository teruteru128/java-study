package com.twitter.teruteru128.study;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneOffset;
import java.util.concurrent.Callable;

/**
 * 初音ミク39周年のepochtimeは何秒ですか？
 */
public class MikkuMikuniShiteYanyo implements Callable<Long> {
    @Override
    public Long call() {
      // 初音ミクの発売日は2007年8月31日
      var date = LocalDateTime.of(2007, Month.AUGUST, 31, 0, 0, 0, 0);
      var d = date.plusYears(39);
      System.out.println(d);
      var i = d.toInstant(ZoneOffset.ofHours(9));
      return i.getEpochSecond();
    }
}
