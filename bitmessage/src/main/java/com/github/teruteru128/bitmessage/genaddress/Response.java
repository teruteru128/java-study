package com.github.teruteru128.bitmessage.genaddress;

import java.io.Serial;
import java.io.Serializable;

import com.github.teruteru128.bitmessage.spec.KeyPair;

public class Response implements Cloneable, Serializable {

    @Serial
    private static final long serialVersionUID = 1;

    private final KeyPair signingKeyPair;
    private final KeyPair encryptionKeyPair;
    private final byte[] ripe;

    public Response(KeyPair signingKeyPair, KeyPair encryptionKeyPair, byte[] ripe) {
        this.signingKeyPair = signingKeyPair;
        this.encryptionKeyPair = encryptionKeyPair;
        this.ripe = ripe;
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
        } catch (CloneNotSupportedException ignored) {
        }
        return response;
    }
}
