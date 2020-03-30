package com.twitter.teruteru128.study.random;

import java.security.SecureRandom;

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
        System.out.println(random.doubles(10000000).max());
    }

}
