package com.twitter.teruteru128.study;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneOffset;
import java.util.concurrent.Callable;

public class MikkuMikuniShiteYanyo implements Callable<Long> {
    @Override
    public Long call() throws Exception {
      var date = LocalDateTime.of(2007, Month.AUGUST, 31, 0, 0, 0, 0);
      var d = date.plusYears(39);
      System.out.println(d);
      var i = d.toInstant(ZoneOffset.ofHours(9));
      return i.getEpochSecond();
    }
}
