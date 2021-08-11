package com.twitter.teruteru128.study.bitmessage.genaddress;

class ValidateArgs extends Args {
    public ValidateArgs() {
        super(Command.VALIDATE);
    }

    private String address;
    private String signingPrivateKeyWIF;
    private String encryptionPrivateKeyWIF;

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the signingPrivateKeyWIF
     */
    public String getSigningPrivateKeyWIF() {
        return signingPrivateKeyWIF;
    }

    /**
     * @param signingPrivateKeyWIF the signingPrivateKeyWIF to set
     */
    public void setSigningPrivateKeyWIF(String signingPrivateKeyWIF) {
        this.signingPrivateKeyWIF = signingPrivateKeyWIF;
    }

    /**
     * @return the encryptionPrivateKeyWIF
     */
    public String getEncryptionPrivateKeyWIF() {
        return encryptionPrivateKeyWIF;
    }

    /**
     * @param encryptionPrivateKeyWIF the encryptionPrivateKeyWIF to set
     */
    public void setEncryptionPrivateKeyWIF(String encryptionPrivateKeyWIF) {
        this.encryptionPrivateKeyWIF = encryptionPrivateKeyWIF;
    }
}
