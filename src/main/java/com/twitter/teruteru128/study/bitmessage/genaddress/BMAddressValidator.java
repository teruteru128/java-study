package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.Arrays;

import com.twitter.teruteru128.study.Base58;
import com.twitter.teruteru128.study.bitmessage.Const;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.math.ec.ECPoint;

import jakarta.xml.bind.DatatypeConverter;

public class BMAddressValidator {

    /**
     * 
     * @see https://github.com/Bitmessage/PyBitmessage/blob/6f35da4096770a668c4944c3024cd7ddb34be092/src/class_addressGenerator.py#L131
     * @see https://en.bitcoin.it/wiki/Wallet_import_format
     * @param args
     */
    public static void main(String[] args) throws Exception {
        // RIPEMD160のためにプロバイダを追加
        Provider provider = Security.getProvider("BC");
        if (provider == null) {
            Security.addProvider(provider = new BouncyCastleProvider());
        }
        // アドレスと鍵
        final String address = "BM-NAxwJoagtHikgoyv2wsDpdFdwb867sKn";
        final String privSigningKeyWIF = "5JcDt46pwwECFekZRujVnZNDUhvVJ8yUDZYHStwSzViaoMeK9jp";
        final String privEncryptionKeyWIF = "5Jt5pvCh2Vk8ShMon6fXH9ocdg76wWyMuNnn4AFTGohaqkdWGpe";

        // 鍵をデコード
        final byte[] privSigningKey = Base58.decode(privSigningKeyWIF);
        final byte[] privEncryptionKey = Base58.decode(privEncryptionKeyWIF);

        // validateメソッドの引数は何型にすべき？String？byte[]？
        // 鍵のチェックサムを検証
        final MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
        final byte[] sha256hash = new byte[Const.SHA256_DIGEST_LENGTH];

        sha256.update(privSigningKey, 0, 33);
        sha256.digest(sha256hash, 0, Const.SHA256_DIGEST_LENGTH);
        sha256.update(sha256hash, 0, Const.SHA256_DIGEST_LENGTH);
        sha256.digest(sha256hash, 0, Const.SHA256_DIGEST_LENGTH);
        System.out.print("private Signing Key : checksum ");
        System.out.println(Arrays.equals(privSigningKey, 33, 37, sha256hash, 0, 4) ? "validated" : "not validated");

        sha256.update(privEncryptionKey, 0, 33);
        sha256.digest(sha256hash, 0, Const.SHA256_DIGEST_LENGTH);
        sha256.update(sha256hash, 0, Const.SHA256_DIGEST_LENGTH);
        sha256.digest(sha256hash, 0, Const.SHA256_DIGEST_LENGTH);
        System.out.print("private Encryption Key : checksum ");
        System.out.println(Arrays.equals(privEncryptionKey, 33, 37, sha256hash, 0, 4) ? "validated" : "not validated");

        // 公開鍵を導出
        final byte[] posPrivSigningKey = Arrays.copyOfRange(privSigningKey, 1, 33);
        final byte[] posPrivEncryptionKey = Arrays.copyOfRange(privEncryptionKey, 1, 33);

        final ECPoint pubSigningPoint = Const.G.multiply(new BigInteger(1, posPrivSigningKey)).normalize();
        final byte[] pubSigningKey = pubSigningPoint.getEncoded(false);
        final ECPoint pubEncryptionPoint = Const.G.multiply(new BigInteger(1, posPrivEncryptionKey)).normalize();
        final byte[] pubEncryptionKey = pubEncryptionPoint.getEncoded(false);

        // アドレスと鍵が一致することを検証
        final MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
        final MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");
        final byte[] sha512hash = new byte[64];
        final byte[] ripe = new byte[20];

        sha512.update(pubSigningKey, 0, Const.PUBLIC_KEY_LENGTH);
        sha512.update(pubEncryptionKey, 0, Const.PUBLIC_KEY_LENGTH);
        sha512.digest(sha512hash, 0, Const.SHA512_DIGEST_LENGTH);
        ripemd160.update(sha512hash, 0, Const.SHA512_DIGEST_LENGTH);
        ripemd160.digest(ripe, 0, Const.RIPEMD160_DIGEST_LENGTH);

        final String address4 = BMAddress.encodeAddress(4, 1, ripe);
        final String address3 = BMAddress.encodeAddress(3, 1, ripe);
        final String address3_2 = BMAddress.encodeAddress(3, 1, ripe, 2);

        System.out.print("ripe : ");
        System.out.println(DatatypeConverter.printHexBinary(ripe));

        System.out.print("          v4 address calculated from ripe : ");
        System.out.print(address4);
        System.out.print(" (");
        System.out.print(address4.equals(address) ? "" : "not ");
        System.out.println("matched)");

        System.out.print("unlimited v3 address calculated from ripe : ");
        System.out.print(address3);
        System.out.print(" (");
        System.out.print(address3.equals(address) ? "" : "not ");
        System.out.println("matched)");

        System.out.print("  limited v3 address calculated from ripe : ");
        System.out.print(address3_2);
        System.out.print(" (");
        System.out.print(address3_2.equals(address) ? "" : "not ");
        System.out.println("matched)");
    }

}
