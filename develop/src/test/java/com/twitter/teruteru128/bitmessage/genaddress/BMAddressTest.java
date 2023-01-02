package com.twitter.teruteru128.bitmessage.genaddress;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.Arrays;

import com.twitter.teruteru128.bitmessage.Const;
import com.twitter.teruteru128.bitmessage.spec.BMAddress;
import com.twitter.teruteru128.encode.Base58;

import jakarta.xml.bind.DatatypeConverter;

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
    void encodeAddressTest() throws Exception {
        String address = "BM-NBJxKhQmidR2TBtD3H74yZhDHpzZ7TXM";
        String privSigningKeyWIF = "5KSKK9tJfuMrkUfwBqGS3ktfPix5zZBtgxAao2GtKeUgJNpEo6R";
        String privEncryptionKeyWIF = "5KUoQKDmcmAKpjaas3k9U6bGFN5Nz937zqLqDDo1sNUqeJCiMZn";
        byte[] wrapedPrivSigningKey = Base58.decode(privSigningKeyWIF);
        byte[] wrapedPrivEncryptionKey = Base58.decode(privEncryptionKeyWIF);
        byte[] pubSigningKey = Const.G.multiply(new BigInteger(1, wrapedPrivSigningKey, 1, Const.PRIVATE_KEY_LENGTH)).normalize().getEncoded(false);
        byte[] pubEncryptionKey = Const.G.multiply(new BigInteger(1, wrapedPrivEncryptionKey, 1, Const.PRIVATE_KEY_LENGTH)).normalize().getEncoded(false);
        MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
        MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");
        sha512.update(pubSigningKey);
        sha512.update(pubEncryptionKey);
        byte[] ripe = ripemd160.digest(sha512.digest());
        byte[] actualbytes = DatatypeConverter.parseHexBinary("00005757482ea4aa7c4e243da76ac4cc977f3204");
        assertArrayEquals(actualbytes, ripe);
        assertEquals(BMAddress.encodeAddress(4, 1, ripe), address);
    }

    @AfterAll
    public static void clearBCProvider() {
        Security.removeProvider("BC");
    }

}
