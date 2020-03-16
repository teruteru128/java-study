package com.twitter.teruteru128.study.random;

import java.security.SecureRandom;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Dice {

    public static void main(final String[] args) throws Exception {
        final var random = SecureRandom.getInstance("nativeprngnonblocking");
        ZoneId jst = ZoneId.of("Asia/Tokyo");
        ZoneId utc = ZoneId.of("UTC");
        int seconds = random.nextInt(86400);
        var time = ZonedDateTime.of(2020, 04, random.nextInt(30) + 1, seconds / 3600, (seconds % 3600) / 60,
                seconds % 60, 0, jst);
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        System.out.print(time.withZoneSameInstant(utc).format(formatter));
        System.out.println();
    }

}
