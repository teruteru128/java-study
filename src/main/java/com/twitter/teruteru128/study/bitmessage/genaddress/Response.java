package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.io.Serializable;

public class Response implements Cloneable, Serializable {

    private static final long serialVersionUID = 1;

    private KeyPair signingKeyPair;
    private KeyPair encryptionKeyPair;
    private byte[] ripe;

    public Response(KeyPair signingKeyPair, KeyPair encryptionKeyPair, byte[] ripe) {
        this.signingKeyPair = signingKeyPair.clone();
        this.encryptionKeyPair = encryptionKeyPair.clone();
        this.ripe = ripe.clone();
    }

    /**
     * @return the privateEncryptionKey
     */
    public byte[] getPrivateEncryptionKey() {
        return encryptionKeyPair.getPrivateKey();
    }

    /**
     * @return the publicEncryptionKey
     */
    public byte[] getPublicSigningKey() {
        return encryptionKeyPair.getPublicKey();
    }

    /**
     * @return the privateEncryptionKey
     */
    public byte[] getPrivateSigningKey() {
        return signingKeyPair.getPrivateKey();
    }

    /**
     * @return the publicEncryptionKey
     */
    public byte[] getPublicEncryptionKey() {
        return signingKeyPair.getPublicKey();
    }

    /**
     * @return the signingKeyPair
     */
    public KeyPair getSigningKeyPair() {
        return signingKeyPair;
    }

    /**
     * @return the encryptionKeyPair
     */
    public KeyPair getEncryptionKeyPair() {
        return encryptionKeyPair;
    }

    /**
     * @return the ripe
     */
    public byte[] getRipe() {
        return ripe;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response clone() {
        Response response = null;
        try {
            response = (Response) super.clone();
        } catch (CloneNotSupportedException e) {
        }
        return response;
    }
}
