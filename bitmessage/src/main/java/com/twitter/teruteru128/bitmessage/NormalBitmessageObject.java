package com.twitter.teruteru128.bitmessage;

public record NormalBitmessageObject(Integer type, byte[] payload) implements BitmessageObject<Integer> {

}
