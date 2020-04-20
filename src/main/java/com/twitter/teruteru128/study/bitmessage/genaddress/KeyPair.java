package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.io.Serializable;

public class KeyPair implements Cloneable, Serializable {

    private static final long serialVersionUID = 1;

    private byte[] privateKey;
    private byte[] publicKey;

    public KeyPair(byte[] privateKey, byte[] publicKey) {
        this.privateKey = privateKey.clone();
        this.publicKey = publicKey.clone();
    }

    /**
     * @return the privateKey
     */
    public byte[] getPrivateKey() {
        return privateKey;
    }

    /**
     * @return the publicKey
     */
    public byte[] getPublicKey() {
        return publicKey;
    }

    @Override
    protected KeyPair clone() {
        KeyPair pair = null;
        try {
            pair = (KeyPair) super.clone();
            pair.privateKey = this.privateKey.clone();
            pair.publicKey = this.publicKey.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return pair;
    }
}
