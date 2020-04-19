package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.util.List;

// Number of Leading Zero
public class RequestComponent {

    private List<KeyPair> list;
    private int requireNlz;

    public RequestComponent(byte[] priSigningKey, byte[] pubSigningKey, int nlzbytes) {
        this(List.of(new KeyPair(priSigningKey, pubSigningKey)), nlzbytes);
    }

    public RequestComponent(List<KeyPair> list, int nlzbytes) {
        this.list = list;
        this.requireNlz = nlzbytes;
    }

    /**
     * @return the requireNlz
     */
    public int getRequireNlz() {
        return requireNlz;
    }

    /**
     * @return the list
     */
    public List<KeyPair> getList() {
        return list;
    }
}
