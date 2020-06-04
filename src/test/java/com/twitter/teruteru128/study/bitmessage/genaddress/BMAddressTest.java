package com.twitter.teruteru128.study.bitmessage.genaddress;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.Arrays;

import com.twitter.teruteru128.study.Base58;
import com.twitter.teruteru128.study.bitmessage.Const;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BMAddressTest {

    /**
     * @see https://qiita.com/tsukakei/items/7e48c84b96e3ebf34498 {@code @BeforeAll}についてはこのリンクを参照
     */
    @BeforeAll
    public static void initBeforeEach() {
        Provider provider = Security.getProvider("BC");
        if (provider == null) {
            Security.addProvider(provider = new BouncyCastleProvider());
        }
    }

    @Test
    public void encodeAddressTest() throws Exception {
        String address = "BM-NBJxKhQmidR2TBtD3H74yZhDHpzZ7TXM";
        String privSigningKeyWIF = "5KSKK9tJfuMrkUfwBqGS3ktfPix5zZBtgxAao2GtKeUgJNpEo6R";
        String privEncryptionKeyWIF = "5KUoQKDmcmAKpjaas3k9U6bGFN5Nz937zqLqDDo1sNUqeJCiMZn";
        byte[] wrapedPrivSigningKey = Base58.decode(privSigningKeyWIF);
        byte[] wrapedPrivEncryptionKey = Base58.decode(privEncryptionKeyWIF);
        byte[] privSigningKey = new byte[Const.PRIVATE_KEY_LENGTH];
        byte[] privEncryptionKey = new byte[Const.PRIVATE_KEY_LENGTH];
        System.arraycopy(wrapedPrivEncryptionKey, 1, privEncryptionKey, 0, Const.PRIVATE_KEY_LENGTH);
        System.arraycopy(wrapedPrivSigningKey, 1, privSigningKey, 0, Const.PRIVATE_KEY_LENGTH);
        byte[] pubSigningKey = Const.G.multiply(new BigInteger(1, privSigningKey)).normalize().getEncoded(false);
        byte[] pubEncryptionKey = Const.G.multiply(new BigInteger(1, privEncryptionKey)).normalize().getEncoded(false);
        MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
        MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");
        sha512.update(pubSigningKey);
        sha512.update(pubEncryptionKey);
        byte[] ripe = ripemd160.digest(sha512.digest());
        byte[] nullbytes = new byte[]{0, 0};
        assertTrue(Arrays.equals(nullbytes, 0, 2, ripe, 0, 2));
        assertEquals(BMAddress.encodeAddress(4, 1, ripe), address);
    }

    @AfterAll
    public static void clearBCProvider() {
        Security.removeProvider("BC");
    }

}
