package com.twitter.teruteru128.bitmessage;

public record CommandBitmessageObject(String type, byte[] payload) implements BitmessageObject<String> {

}
