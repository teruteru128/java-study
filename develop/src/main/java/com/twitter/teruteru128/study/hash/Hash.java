package com.twitter.teruteru128.study.hash;

import java.io.Serializable;

public abstract class Hash implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 4591049479540994532L;
    private String input;
    private String hash;

    public Hash() {
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
