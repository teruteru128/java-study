package com.twitter.teruteru128.study.md;

import java.io.Serializable;

public class HashBean implements Serializable {
    private static final long serialVersionUID = 0;

    public HashBean(byte[] input, byte[] hash, int hashnlz) {
        this(input, hash, hashnlz, false);
    }

    private HashBean(byte[] input, byte[] hash, int hashnlz, boolean empty) {
        this.input = input;
        this.hash = hash;
        this.nlz = hashnlz;
    }

    private static final HashBean emptyInstance = new HashBean(null, null, -1, true);

    public static HashBean getEmpty() {
        return emptyInstance;
    }

    private byte[] input;
    private byte[] hash;
    private int nlz;
    private boolean empty;

    public boolean isEmpty() {
        return empty;
    }

    public byte[] getInput() {
        return input;
    }

    public byte[] getHash() {
        return hash;
    }

    public int getNlz() {
        return nlz;
    }
}
