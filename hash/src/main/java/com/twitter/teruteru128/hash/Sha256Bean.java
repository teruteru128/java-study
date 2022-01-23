package com.twitter.teruteru128.hash;

import java.io.Serializable;

/**
 * @author Teruteru
 *
 */
public class Sha256Bean implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private byte[] input = null;
    private byte[] hash = null;

    /**
     * 
     */
    public Sha256Bean() {
    }

    public Sha256Bean(byte[] input, byte[] hash) {
        this.hash = hash;
        this.input = input;
    }

    public byte[] getInput() {
        return input;
    }

    public void setInput(byte[] input) {
        this.input = input;
    }

    public byte[] getHash() {
        return hash;
    }

    public void setHash(byte[] hash) {
        this.hash = hash;
    }

}
