package com.twitter.teruteru128.twitter_bot;

import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author Teruteru
 *
 */
public class ConsumerKey implements Serializable {
    private static final long serialVersionUID = 0;

    private String consumerKey = null;
    private String consumerSecret = null;

    /**
     * 
     */
    public ConsumerKey() {
    }

    public ConsumerKey(String consumerKey, String consumerSecret) {
        this.consumerKey = consumerKey;
        this.consumerSecret = consumerSecret;
    }

    public String getConsumerKey() {
        return consumerKey;
    }

    public void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
    }

    public String getConsumerSecret() {
        return consumerSecret;
    }

    public void setConsumerSecret(String consumerSecret) {
        this.consumerSecret = consumerSecret;
    }

    private void readObject(java.io.ObjectInputStream stream)
            throws IOException, ClassNotFoundException {
        System.out.println("ConsumerKey.readObject()");
    }

    private void writeObject(java.io.ObjectOutputStream stream)
            throws IOException {
        System.out.println("ConsumerKey.writeObject()");
    }

    @SuppressWarnings("unused")
    private void readObjectNoData() throws ObjectStreamException {
        System.out.println("ConsumerKey.readObjectNoData()");
    }
}
