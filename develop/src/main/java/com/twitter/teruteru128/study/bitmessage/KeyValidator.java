package com.twitter.teruteru128.study.bitmessage;

import java.math.BigInteger;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.Arrays;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import com.twitter.teruteru128.study.bitmessage.spec.BMAddress;

import jakarta.xml.bind.DatatypeConverter;

public class KeyValidator {

    static {
        // RIPEMD160のためにプロバイダを追加
        if (Security.getProvider("BC") == null) {
            Security.addProvider(new BouncyCastleProvider());
        }
    }

    // validateメソッドの引数は何型にすべき？String？byte[]？
    /**
     * 
     * @param address
     * @param privSigningKeyWIF
     * @param privEncryptionKeyWIF
     */
    public boolean validate(String address, String privSigningKeyWIF, String privEncryptionKeyWIF) {

        // 鍵をデコード
        final byte[] privSigningKey = BMAddress.decode(privSigningKeyWIF);
        final byte[] privEncryptionKey = BMAddress.decode(privEncryptionKeyWIF);

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

        System.out.printf("%41s : %s%n", "ripe", DatatypeConverter.printHexBinary(ripe));

        System.out.printf("%41s : %s (%smatched)%n", "v4 address calculated", address4,
                address4.equals(address) ? "" : "not ");

        System.out.printf("%41s : %s (%smatched)%n", "unlimited v3 address calculated from ripe", address3,
                address3.equals(address) ? "" : "not ");

        System.out.printf("%41s : %s (%smatched)%n", "limited v3 address calculated from ripe", address3_2,
                address3_2.equals(address) ? "" : "not ");
        return address4.equals(address) || address3.equals(address) || address3_2.equals(address);
    }

    public final boolean validateWifChecksum(byte[] privateKey) {
        if (privateKey == null || privateKey.length != 37) {
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

    // この秘密鍵を公開鍵に変換する処理、別のクラスにくくりだしたほうがいい気がするんだよな……
    /**
     * 
     * @param privateKey
     * @return
     */
    protected byte[] generatePublicKey(byte[] privateKey) {
        return Const.G.multiply(new BigInteger(1, privateKey)).normalize().getEncoded(false);
    }

    /**
     * 
     * @param pubSigningKey
     * @param pubEncryptionKey
     * @return
     */
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
        final String address = "BM-2cTHbtQErfVNPCtbzrBNnJ2ofy8698dNAB";
        final String privSigningKeyWIF = "5JZxCfJ9kbmphTeWuXxbju3U14tNWwdjhj9wMrBZcfMYWU7PNZ4";
        final String privEncryptionKeyWIF = "5KFrkub7w2zPMsXhRUp2ozKVdTSaheri8zutq5XP5ysRbidodSv";

        var validator = new KeyValidator();
        validator.validate(address, privSigningKeyWIF, privEncryptionKeyWIF);
    }

}