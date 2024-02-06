package com.twitter.teruteru128.study;

import java.util.Spliterator;
import java.util.function.Consumer;

public class FileChannelFixedLengthSpliterator implements AutoCloseable, Spliterator<byte[]> {

    @Override
    public boolean tryAdvance(Consumer<? super byte[]> action) {
        return false;
    }

    @Override
    public Spliterator<byte[]> trySplit() {
        return null;
    }

    @Override
    public long estimateSize() {
        return 0;
    }

    @Override
    public int characteristics() {
        return 0;
    }

    public void close() {
        
    }

}
