package com.twitter.teruteru128.study.rmi;

import java.io.Serializable;

/**
 * @author Teruteru
 *
 */
public class MessageObject implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 2957192620227812688L;
    private int count=0;
    /**
     * 
     */
    public MessageObject() {
        this(0);
    }
    /**
     * 
     */
    public MessageObject(int count) {
        this.count=count;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
}
