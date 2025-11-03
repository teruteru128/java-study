package com.github.teruteru128.bitmessage.genaddress;

import java.io.Serial;
import java.io.Serializable;

import com.github.teruteru128.bitmessage.spec.KeyPair;

public record Response(KeyPair signingKeyPair, KeyPair encryptionKeyPair, byte[] ripe) implements
    Serializable {

    @Serial
    private static final long serialVersionUID = 1;

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
    @Override
    public KeyPair signingKeyPair() {
        return signingKeyPair;
    }

    /**
     * @return the encryptionKeyPair
     */
    @Override
    public KeyPair encryptionKeyPair() {
        return encryptionKeyPair;
    }

    /**
     * @return the ripe
     */
    @Override
    public byte[] ripe() {
        return ripe;
    }
}
