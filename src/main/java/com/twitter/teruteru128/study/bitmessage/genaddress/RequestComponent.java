package com.twitter.teruteru128.study.bitmessage.genaddress;

// Number of Leading Zero
public class RequestComponent {

    private int requireNlz;

    public RequestComponent(int nlzbytes) {
        this.requireNlz = nlzbytes;
    }

    /**
     * @return the requireNlz
     */
    public int getRequireNlz() {
        return requireNlz;
    }

}
