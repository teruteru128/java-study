package com.twitter.teruteru128.study.stream;

import java.security.SecureRandom;
import java.util.concurrent.Callable;
import java.util.stream.IntStream;

/**
 * @author Teruteru
 *
 */
public class StreamSample implements Callable<Integer> {

    /**
     * @param args
     */
    public Integer call() {
        var r = new SecureRandom();
        return Integer.valueOf(IntStream.range('A', 'Z' + 1).mapToObj(i -> Character.toString(i).repeat(r.nextInt(200)))
                .mapToInt(e -> e.length()).sum());
    }

}
