package com.twitter.teruteru128.study;

public class PacketFormatException extends IllegalArgumentException {

    public PacketFormatException() {
        super();
    }

    public PacketFormatException(String s) {
        super(s);
    }

    public PacketFormatException(String s, Throwable cause) {
        super(s, cause);
    }

    public PacketFormatException(Throwable cause) {
        super(cause);
    }

}
