package com.twitter.teruteru128.bitmessage;

import java.nio.file.Path;
import java.util.concurrent.ConcurrentHashMap;

public class State {
    
    public static int shutdown = 0;

    public static Path appData = Path.of("");

    /**
     * key: String or byte[]
     * value: integer or record(tuple)
    */
    public static final ConcurrentHashMap<Object, Object> neededPubkeys = new ConcurrentHashMap<>();

    /**
     * use as hashset
    */
    public static final ConcurrentHashMap<AckData, Integer> ackdataForWhichImWatching = new ConcurrentHashMap<>();
}
