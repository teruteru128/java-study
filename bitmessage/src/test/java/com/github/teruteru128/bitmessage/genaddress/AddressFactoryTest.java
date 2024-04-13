package com.github.teruteru128.bitmessage.genaddress;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.HexFormat;

import com.github.teruteru128.bitmessage.spec.AddressFactory;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.github.teruteru128.bitmessage.Const;
import com.github.teruteru128.encode.Base58;

public class AddressFactoryTest {

    /**
     * @see <a href="https://udzuki.jp/public/junit5-user-guide-ja/#writing-tests">JUnit 5 ユーザガイド 第3章 テストを書く - qiita</a>
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
        byte[] wrappedPrivSigningKey = Base58.decode(privSigningKeyWIF);
        byte[] wrappedPrivEncryptionKey = Base58.decode(privEncryptionKeyWIF);
        byte[] pubSigningKey = Const.SEC_P256_K1_G.multiply(new BigInteger(1, wrappedPrivSigningKey, 1, Const.PRIVATE_KEY_LENGTH)).normalize().getEncoded(false);
        byte[] pubEncryptionKey = Const.SEC_P256_K1_G.multiply(new BigInteger(1, wrappedPrivEncryptionKey, 1, Const.PRIVATE_KEY_LENGTH)).normalize().getEncoded(false);
        MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
        MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");
        sha512.update(pubSigningKey);
        sha512.update(pubEncryptionKey);
        byte[] ripe = ripemd160.digest(sha512.digest());
        assertArrayEquals(HexFormat.of().parseHex("00005757482ea4aa7c4e243da76ac4cc977f3204"), ripe);
        Assertions.assertEquals(AddressFactory.encodeAddress(4, 1, ripe), address);
    }

    @AfterAll
    public static void clearBCProvider() {
        Security.removeProvider("BC");
    }

}
