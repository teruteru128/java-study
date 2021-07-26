package com.twitter.teruteru128.study.bitmessage.spec;

import java.security.spec.EncodedKeySpec;

public class WalletImportFormatEncodedKeySpec extends EncodedKeySpec {

    public WalletImportFormatEncodedKeySpec(byte[] encodedKey) {
        super(encodedKey);
    }

    public WalletImportFormatEncodedKeySpec(byte[] encodedKey, String algorithm) {
        super(encodedKey, algorithm);
    }

    @Override
    public String getFormat() {
        return "WIF";
    }

}
