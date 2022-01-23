package com.twitter.teruteru128.hash;

public class SHA256 extends Hash {

    /**
     * 
     */
    private static final long serialVersionUID = -5468007444275307803L;

    public static final int HASH_BYTE_LENGTH = 32;
    public static final int HASH_HEX_LENGTH = 64;

    public SHA256() {
        this(null, null);
    }

    public SHA256(String input) {
        this(input, null);
    }

    public SHA256(String input, String hash) {
        this.setInput(input);
        this.setHash(hash);
    }
}
