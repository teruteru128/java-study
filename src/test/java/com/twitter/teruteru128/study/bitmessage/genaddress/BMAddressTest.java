package com.twitter.teruteru128.study.bitmessage.genaddress;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.Arrays;

import com.twitter.teruteru128.study.Base58;

import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.rfc8032.Ed25519;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BMAddressTest {

    @BeforeEach
    public void initBeforeEach() {
        Ed25519.precompute();
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
        byte[] privSigningKey = new byte[32];
        byte[] privEncryptionKey = new byte[32];
        System.arraycopy(wrapedPrivEncryptionKey, 1, privEncryptionKey, 0, 32);
        System.arraycopy(wrapedPrivSigningKey, 1, privSigningKey, 0, 32);
        ECPoint g = CustomNamedCurves.getByName("secp256k1").getG();
        byte[] pubSigningKey = g.multiply(new BigInteger(1, privSigningKey)).normalize().getEncoded(false);
        byte[] pubEncryptionKey = g.multiply(new BigInteger(1, privEncryptionKey)).normalize().getEncoded(false);
        MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
        MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");
        sha512.update(pubSigningKey);
        sha512.update(pubEncryptionKey);
        byte[] ripe = ripemd160.digest(sha512.digest());
        byte[] nullbytes = new byte[]{0, 0};
        assertTrue(Arrays.equals(nullbytes, 0, 2, ripe, 0, 2));
        BMAddress bmAddress = new BMAddress();
        assertEquals(bmAddress.encodeAddress(4, 1, ripe), address);
    }

}
