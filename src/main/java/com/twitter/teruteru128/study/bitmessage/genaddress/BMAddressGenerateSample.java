package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.Arrays;

import com.twitter.teruteru128.study.Base58;

import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.math.ec.ECPoint;

import jakarta.xml.bind.DatatypeConverter;

public class BMAddressGenerateSample {

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
        String address = "BM-NBJxKhQmidR2TBtD3H74yZhDHpzZ7TXM";
        String privSigningKeyWIF = "5KSKK9tJfuMrkUfwBqGS3ktfPix5zZBtgxAao2GtKeUgJNpEo6R";
        String privEncryptionKeyWIF = "5KUoQKDmcmAKpjaas3k9U6bGFN5Nz937zqLqDDo1sNUqeJCiMZn";

        // 鍵をデコード
        byte[] privSigningKey = Base58.decode(privSigningKeyWIF);
        byte[] privEncryptionKey = Base58.decode(privEncryptionKeyWIF);

        // 鍵のチェックサムを検証
        MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
        sha256.update(privSigningKey, 0, 33);
        byte[] checksum = sha256.digest(sha256.digest());
        System.out.println(Arrays.equals(privSigningKey, 33, 37, checksum, 0, 4));
        sha256.update(privEncryptionKey, 0, 33);
        checksum = sha256.digest(sha256.digest());
        System.out.println(Arrays.equals(privEncryptionKey, 33, 37, checksum, 0, 4));

        // 公開鍵を導出
        byte[] posPrivSigningKey = Arrays.copyOfRange(privSigningKey, 1, 33);
        byte[] posPrivEncryptionKey = Arrays.copyOfRange(privEncryptionKey, 1, 33);
        ECPoint g = CustomNamedCurves.getByName("secp256k1").getG();
        byte[] pubSigningKey = g.multiply(new BigInteger(1, posPrivSigningKey)).normalize().getEncoded(false);
        byte[] pubEncryptionKey = g.multiply(new BigInteger(1, posPrivEncryptionKey)).normalize().getEncoded(false);

        // アドレスと鍵が一致することを検証
        MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
        MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");
        sha512.update(pubSigningKey);
        sha512.update(pubEncryptionKey);
        byte[] ripe = ripemd160.digest(sha512.digest());
        System.out.println(DatatypeConverter.printHexBinary(ripe));
        BMAddress bmAddress = new BMAddress();
        String address4 = bmAddress.encodeAddress(4, 1, ripe);
        System.out.println(address4);
        System.out.println(address4.equals(address));
    }

}
