package com.twitter.teruteru128.bitmessage.spec;

import java.io.Serializable;
import java.util.Arrays;

public class KeyPair implements Cloneable, Serializable {

    private static final long serialVersionUID = 1;

    private byte[] privateKey;
    private byte[] publicKey;

    public KeyPair(byte[] privateKey, byte[] publicKey) {
        this.privateKey = privateKey.clone();
        this.publicKey = publicKey.clone();
    }

    public KeyPair(byte[] privateKey, int privatekeyoffset, int privatekeylength, byte[] publicKey, int publickeyoffset, int publickeylength) {
        this.privateKey = Arrays.copyOfRange(privateKey, privatekeyoffset, privatekeyoffset + privatekeylength);
        this.publicKey = Arrays.copyOfRange(publicKey, publickeyoffset, publickeyoffset + publickeylength);
    }

    /**
     * @return the privateKey
     */
    public byte[] getPrivateKey() {
        return privateKey.clone();
    }

    /**
     * @return the publicKey
     */
    public byte[] getPublicKey() {
        return publicKey.clone();
    }

    @Override
    public KeyPair clone() {
        KeyPair pair = null;
        try {
            pair = (KeyPair) super.clone();
            pair.privateKey = privateKey.clone();
            pair.publicKey = publicKey.clone();
        } catch (CloneNotSupportedException e) {
        }
        return pair;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(privateKey);
        result = prime * result + Arrays.hashCode(publicKey);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        KeyPair other = (KeyPair) obj;
        if (!Arrays.equals(privateKey, other.privateKey))
            return false;
        if (!Arrays.equals(publicKey, other.publicKey))
            return false;
        return true;
    }

}
