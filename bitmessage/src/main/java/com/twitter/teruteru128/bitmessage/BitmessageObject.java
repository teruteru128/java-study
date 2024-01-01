package com.twitter.teruteru128.bitmessage;

public interface BitmessageObject<T> {

    T type();

    byte[] payload();

}
