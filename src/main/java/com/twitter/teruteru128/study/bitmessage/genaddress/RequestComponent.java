package com.twitter.teruteru128.study.bitmessage.genaddress;

// Number of Leading Zero
public class RequestComponent {

    private byte[] publicSigningKey;
    private int requireNlz;

    public RequestComponent(byte[] pubSigningKey, int nlzbytes) {
        super();
        this.publicSigningKey = pubSigningKey.clone();
        this.requireNlz = nlzbytes;
    }

    /**
     * @return the publicSigningKey
     */
    public byte[] getPublicSigningKey() {
        return publicSigningKey;
    }

    /**
     * @return the requireNlz
     */
    public int getRequireNlz() {
        return requireNlz;
    }
}
