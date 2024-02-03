package com.twitter.teruteru128.study;

public class P {
    private long hash = 0;
    private int sig;
    private int enc;
    public P(int sig, int enc){
        this.sig = 0;
                 this.enc = 0;
    }

    public long getHash() {
        return hash;
    }

    public void setHash(long hash) {
        this.hash = hash;
    }

    public int getSig() {
        return sig;
    }

    public int getEnc() {
        return enc;
    }
}
