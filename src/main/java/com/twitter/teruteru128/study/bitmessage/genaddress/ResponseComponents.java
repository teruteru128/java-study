package com.twitter.teruteru128.study.bitmessage.genaddress;

class ResponseComponents {

    private byte[] privateEncryptionKey;
    private byte[] publicEncryptionKey;
    private byte[] ripe;

    public ResponseComponents(byte[] privEncryptionKey, byte[] pubEncryptionKey, byte[] ripe) {
        super();
        this.privateEncryptionKey = privEncryptionKey.clone();
        this.publicEncryptionKey = pubEncryptionKey.clone();
        this.ripe = ripe.clone();
    }

    /**
     * @return the privateEncryptionKey
     */
    public byte[] getPrivateEncryptionKey() {
        return privateEncryptionKey;
    }

    /**
     * @return the publicEncryptionKey
     */
    public byte[] getPublicEncryptionKey() {
        return publicEncryptionKey;
    }

    /**
     * @return the ripe
     */
    public byte[] getRipe() {
        return ripe;
    }
}
