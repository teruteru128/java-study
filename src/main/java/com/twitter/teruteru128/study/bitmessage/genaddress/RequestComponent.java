package com.twitter.teruteru128.study.bitmessage.genaddress;

// Number of Leading Zero
public class RequestComponent {

    private byte[] privateSigningKey;
    private byte[] publicSigningKey;
    private int requireNlz;

    public RequestComponent(byte[] priSigningKey, byte[] pubSigningKey, int nlzbytes) {
        super();
        this.privateSigningKey = priSigningKey.clone();
        this.publicSigningKey = pubSigningKey.clone();
        this.requireNlz = nlzbytes;
    }

    /**
     * @return the privateSigningKey
     */
    public byte[] getPrivateSigningKey() {
        return privateSigningKey;
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
