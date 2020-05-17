package com.twitter.teruteru128.study.time.sample003;

import java.time.OffsetDateTime;
import java.util.Date;

public class DateStudy {

  public static void main(String[] args) {
    OffsetDateTime time1 = OffsetDateTime.parse("2038-01-19T03:14:07Z");
    OffsetDateTime time2 = OffsetDateTime.parse("2038-01-19T03:14:08Z");
    System.out.println(time1);
    System.out.println(time2);
    Date date2 = Date.from(time2.toInstant());
    System.out.println(date2);
  }
}
