package com.twitter.teruteru128.study;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

public class M {
    byte[] prt;
    int fileNumber;
    int offset;
    MessageDigest sha512 = null;
    ByteBuffer buffer = ByteBuffer.allocate(64);

    public M(byte[] prt, int fileNumber, int offset, MessageDigest sha) {
        this.prt = prt;
        this.fileNumber = fileNumber;
        this.offset = offset;
        this.sha512 = sha;
    }

    M setSHA(MessageDigest sha) {
        this.sha512 = sha;
        return this;
    }
}
