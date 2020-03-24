package com.twitter.teruteru128.study.random;

import java.security.SecureRandom;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Dice {

    /**
     * 115
229
358
52
189
263
129
292
121
263
294
245
120
211
234
98
223
50
110
124
46
268

     * @param args
     * @throws Exception
    */
    public static void main(final String[] args) throws Exception {
        final var random = SecureRandom.getInstance("nativeprngnonblocking");
        System.out.printf("%d%n", random.nextInt(360));
        random.ints(24, 0, 360).forEach(System.out::println);
        random.doubles(16).map(d->1/d).forEach(System.out::println);
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
