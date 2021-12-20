package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.math.BigInteger;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.Arrays;

import com.twitter.teruteru128.study.bitmessage.Const;
import com.twitter.teruteru128.study.encode.Base58;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import jakarta.xml.bind.DatatypeConverter;

public class BMAddressValidator {

    static {
        // RIPEMD160のためにプロバイダを追加
        if (Security.getProvider("BC") == null) {
            Security.addProvider(new BouncyCastleProvider());
        }
    }

    // validateメソッドの引数は何型にすべき？String？byte[]？
    public void validate(String address, String privSigningKeyWIF, String privEncryptionKeyWIF) {

        // 鍵をデコード
        final byte[] privSigningKey = Base58.decode(privSigningKeyWIF);
        final byte[] privEncryptionKey = Base58.decode(privEncryptionKeyWIF);

        // 鍵のチェックサムを検証
        // validate wif checksum
        System.out.printf("%41s : checksum ", "private Signing Key");
        System.out.println(validateWifChecksum(privSigningKey) ? "validated" : "not validated");

        System.out.printf("%41s : checksum ", "private Encryption Key");
        System.out.println(validateWifChecksum(privEncryptionKey) ? "validated" : "not validated");

        // 公開鍵を導出
        final byte[] pubSigningKey = generatePublicKey(Arrays.copyOfRange(privSigningKey, 1, 33));
        final byte[] pubEncryptionKey = generatePublicKey(Arrays.copyOfRange(privEncryptionKey, 1, 33));

        // アドレスと鍵が一致することを検証
        final byte[] ripe = generateRipe(pubSigningKey, pubEncryptionKey);

        final String address4 = BMAddress.encodeAddress(4, 1, ripe);
        final String address3 = BMAddress.encodeAddress(3, 1, ripe);
        final String address3_2 = BMAddress.encodeAddress(3, 1, ripe, 2);

        System.out.printf("%41s : %s%n", "ripe",DatatypeConverter.printHexBinary(ripe));

        System.out.printf("%41s : %s (%smatched)%n", "v4 address calculated", address4,
                address4.equals(address) ? "" : "not ");

        System.out.printf("%41s : %s (%smatched)%n", "unlimited v3 address calculated from ripe", address3,
                address3.equals(address) ? "" : "not ");

        System.out.printf("%41s : %s (%smatched)%n", "limited v3 address calculated from ripe", address3_2,
                address3_2.equals(address) ? "" : "not ");
    }

    public final boolean validateWifChecksum(byte[] privateKey) {
        if (privateKey == null | privateKey.length != 37) {
            return false;
        }
        final byte[] sha256hash = new byte[Const.SHA256_DIGEST_LENGTH];
        boolean result = false;
        try {
            final MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
            sha256.update(privateKey, 0, 33);
            sha256.digest(sha256hash, 0, Const.SHA256_DIGEST_LENGTH);
            sha256.update(sha256hash, 0, Const.SHA256_DIGEST_LENGTH);
            sha256.digest(sha256hash, 0, Const.SHA256_DIGEST_LENGTH);
            result = Arrays.equals(privateKey, 33, 37, sha256hash, 0, 4);
        } catch (NoSuchAlgorithmException | DigestException e) {
            e.printStackTrace();
        }
        return result;
    }

    protected byte[] generatePublicKey(byte[] privateKey) {
        return Const.G.multiply(new BigInteger(1, privateKey)).normalize().getEncoded(false);
    }

    protected byte[] generateRipe(byte[] pubSigningKey, byte[] pubEncryptionKey) {
        final byte[] sha512hash = new byte[64];
        final byte[] ripe = new byte[20];
        try {
            final MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
            final MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");

            sha512.update(pubSigningKey, 0, Const.PUBLIC_KEY_LENGTH);
            sha512.update(pubEncryptionKey, 0, Const.PUBLIC_KEY_LENGTH);
            sha512.digest(sha512hash, 0, Const.SHA512_DIGEST_LENGTH);
            ripemd160.update(sha512hash, 0, Const.SHA512_DIGEST_LENGTH);
            ripemd160.digest(ripe, 0, Const.RIPEMD160_DIGEST_LENGTH);
        } catch (NoSuchAlgorithmException | DigestException e) {
            e.printStackTrace();
        }
        return ripe;
    }

    /**
     * 
     * @see https://github.com/Bitmessage/PyBitmessage/blob/6f35da4096770a668c4944c3024cd7ddb34be092/src/class_addressGenerator.py#L131
     * @see https://en.bitcoin.it/wiki/Wallet_import_format
     * @param args
     */
    public static void main(String[] args) {
        // アドレスと鍵
        final String address = "BM-2cSriduZG4eQTe1FfppHMzcVoGrXdBWjBe";
        final String privSigningKeyWIF = "5J4aJNR1xrRgGAn1mEAnLF4vqLx7bg9SbRc9omK4JBPYcFfYi3W";
        final String privEncryptionKeyWIF = "5KHmbgwqv8qH9tZHoRKvswHeZkeXiDLj6m8cCxkUKGEtZcxiKoH";

        var validator = new BMAddressValidator();
        validator.validate(address, privSigningKeyWIF, privEncryptionKeyWIF);
    }

}
