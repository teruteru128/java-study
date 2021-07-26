package com.twitter.teruteru128.study.hash;

public class HashBean {
    private byte[] input;
    private byte[] hash;

    public HashBean(byte[] input, byte[] hash) {
        this.input = input.clone();
        this.hash = hash.clone();
    }

    /**
     * @return the input
     */
    public byte[] getInput() {
        return input;
    }

    /**
     * @return the hash
     */
    public byte[] getHash() {
        return hash;
    }
}