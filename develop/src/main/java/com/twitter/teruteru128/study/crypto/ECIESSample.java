package com.twitter.teruteru128.study.crypto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.Callable;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECPublicKeySpec;

public class ECIESSample implements Callable<Void> {

    private void encTest(String message, Charset charset, byte[] privateKeyData, byte[] publicKeyData,
            ECParameterSpec parameterSpec, Provider provider)
            throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException,
            NoSuchProviderException, InvalidParameterSpecException,
            IllegalBlockSizeException, BadPaddingException {
        // 秘密鍵を鍵スペックに変換
        var privateKeySpec = new ECPrivateKeySpec(new BigInteger(1, privateKeyData), parameterSpec);
        // 非圧縮鍵表現鍵から公開鍵を鍵スペックに変換
        var x = new BigInteger(1, Arrays.copyOfRange(publicKeyData, 1, 33));
        var y = new BigInteger(1, Arrays.copyOfRange(publicKeyData, 33, 65));
        var w = new java.security.spec.ECPoint(x, y);
        var publicKeySpec = new java.security.spec.ECPublicKeySpec(w, parameterSpec);

        //
        var factory1 = KeyFactory.getInstance("EC");

        // 鍵スペックから鍵に変換する
        var publicKey = factory1.generatePublic(publicKeySpec);
        var privateKey = factory1.generatePrivate(privateKeySpec);

        /**
         * 暗号化/復号テスト
         * デフォルトの ECIES は ECIESwithSHA1 と等価
         */
        var cipher = Cipher.getInstance("ECIES/None/NoPadding", provider);

        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        var ciphertext = cipher.doFinal(message.getBytes(charset));
        System.out.printf("length : %d bytes(charset:%s)%n", ciphertext.length, charset);
        for (int i = 0; i < ciphertext.length; i++) {
            System.out.printf("%02x", ciphertext[i]);
            if (i % 16 == 15) {
                System.out.println();
            }
        }
        System.out.println();
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        var cleartext = new String(cipher.doFinal(ciphertext), charset);
        System.out.printf("cleartext : %s(charset:%s)%n", cleartext, charset.displayName());
    }

    private void anotherProviderTest(String message, Charset charset, PrivateKey privateKey, PublicKey publicKey,
            ECParameterSpec parameterSpec, Provider provider)
            throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException,
            NoSuchProviderException, InvalidParameterSpecException,
            IllegalBlockSizeException, BadPaddingException {
        var cipher = Cipher.getInstance("ECIESwithSHA512/NONE/NOPADDING", provider);
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        var ciphertext = cipher.doFinal(message.getBytes(charset));
        System.out.printf("length : %d bytes(charset:%s)%n", ciphertext.length, charset);
        for (int i = 0; i < ciphertext.length; i++) {
            System.out.printf("%02x", ciphertext[i]);
            if (i % 16 == 15) {
                System.out.println();
            }
        }
        System.out.println();
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        var cleartext = new String(cipher.doFinal(ciphertext), charset);
        System.out.printf("cleartext : %s(charset:%s)%n", cleartext, charset.displayName());
    }

    /* package */ static final String STATIC_PUBLIC_KEY1 = "BHaW7iAHcG2h49xLy8oBS25GwZUCIxUr84q/TwDbI0rMiG7XMFp49lGomisFKE2TA5s7O5mSbmR5yq+2EzE61pc=";
    private static final String STATIC_PUBLIC_KEY2 = "BABfHBsh6Fo8BJpWgi6fWDtfoS4BkPODxUOOsUMhQk0MVo/Q2bNKsZ5GmKcbl6ncbJG9eAThWmOXzUoHDBptqOo=";

    // 曲線名
    /* package */ static final String CURVE_NAME = "secp256k1";

    @Override
    public Void call()
            throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException,
            NoSuchProviderException, InvalidParameterSpecException,
            IllegalBlockSizeException, BadPaddingException, IOException {
        /** base64 decoder */
        Base64.Decoder decoder = Base64.getDecoder();

        // 秘密鍵をリソースから読み込み
        String stringPrivateKeyData1 = null;
        String stringPrivateKeyData2 = null;
        try (var stream = new BufferedReader(
                new InputStreamReader(this.getClass().getResourceAsStream("privatekey.txt")))) {
            stringPrivateKeyData1 = stream.readLine();
            stringPrivateKeyData2 = stream.readLine();
        }

        // static keys
        var privateKeyData1 = decoder.decode(stringPrivateKeyData1);
        var privateKeyData2 = decoder.decode(stringPrivateKeyData2);
        var publicKeyData1 = decoder.decode(STATIC_PUBLIC_KEY1);
        var publicKeyData2 = decoder.decode(STATIC_PUBLIC_KEY2);

        var bcProvider = new BouncyCastleProvider();
        // Security.addProvider(bcProvider);

        MessageDigest sha512 = MessageDigest.getInstance("sha512");
        MessageDigest ripemd160 = MessageDigest.getInstance("ripemd160", bcProvider);

        sha512.update(publicKeyData1);
        sha512.update(publicKeyData2);
        System.out.print("ripe : ");
        var ripe = ripemd160.digest(sha512.digest());
        for (int i = 0; i < ripe.length; i++) {
            System.out.printf("%02x", ripe[i] & 0xff);
            if (i % 2 == 1)
                System.out.print(" ");
        }
        System.out.println();

        String message = "イワシがつちからはえてくるんだ";
        System.out.printf("original message UTF-8 : %dbytes%n", message.getBytes(StandardCharsets.UTF_8).length);
        System.out.printf("original message Shift-JIS : %dbytes%n", message.getBytes(Charset.forName("sjis")).length);

        // secp256k1 鍵パラメータ取得
        var parameters = AlgorithmParameters.getInstance("EC", "SunEC");
        parameters.init(new ECGenParameterSpec(CURVE_NAME));
        var parameterSpec = parameters.getParameterSpec(ECParameterSpec.class);

        encTest(message, StandardCharsets.UTF_8, privateKeyData1, publicKeyData1, parameterSpec, bcProvider);
        encTest(message, Charset.forName("sjis"), privateKeyData2, publicKeyData2, parameterSpec, bcProvider);
        System.out.println("-".repeat(32));

        // 秘密鍵をインポート
        ECPrivateKeySpec privateKeySpec3 = new ECPrivateKeySpec(new BigInteger(1, privateKeyData1), parameterSpec);
        ECPrivateKeySpec privateKeySpec4 = new ECPrivateKeySpec(new BigInteger(1, privateKeyData2), parameterSpec);

        // 非圧縮鍵表現鍵から鍵をインポートする
        var x3 = new BigInteger(1, Arrays.copyOfRange(publicKeyData1, 1, 33));
        var y3 = new BigInteger(1, Arrays.copyOfRange(publicKeyData1, 33, 65));
        var w3 = new java.security.spec.ECPoint(x3, y3);
        var publicKeySpec3 = new java.security.spec.ECPublicKeySpec(w3, parameterSpec);

        var x4 = new BigInteger(1, Arrays.copyOfRange(publicKeyData2, 1, 33));
        var y4 = new BigInteger(1, Arrays.copyOfRange(publicKeyData2, 33, 65));
        var w4 = new java.security.spec.ECPoint(x4, y4);
        var publicKeySpec4 = new java.security.spec.ECPublicKeySpec(w4, parameterSpec);

        var sunECProvider = Security.getProvider("SunEC");
        var factory1 = KeyFactory.getInstance("EC", sunECProvider);

        // 鍵スペックから鍵に変換する
        var publicKey3 = factory1.generatePublic(publicKeySpec3);
        var publicKey4 = factory1.generatePublic(publicKeySpec4);
        var privateKey3 = factory1.generatePrivate(privateKeySpec3);
        var privateKey4 = factory1.generatePrivate(privateKeySpec4);

        // BC API を使って鍵インポート・暗号化/復号テスト
        var factory2 = KeyFactory.getInstance("EC", bcProvider);

        // ドメイン設定
        var x9 = ECNamedCurveTable.getByName(CURVE_NAME);
        var curve = x9.getCurve();
        var dParams = new ECNamedCurveParameterSpec(CURVE_NAME, curve, x9.getG(), x9.getN());

        var ecPoint1 = curve.decodePoint(publicKeyData1);
        var pubkeySpec1 = new ECPublicKeySpec(ecPoint1, dParams);
        var publicKey1 = factory2.generatePublic(pubkeySpec1);

        var ecPoint2 = curve.decodePoint(publicKeyData2);
        var pubkeySpec2 = new ECPublicKeySpec(ecPoint2, dParams);
        var publicKey2 = factory2.generatePublic(pubkeySpec2);

        // publicKey1とprivateKey3、publicKey3とprivateKey3の組み合わせのいずれでも動くはず
        anotherProviderTest(message, StandardCharsets.UTF_8, privateKey3, publicKey1, parameterSpec, bcProvider);
        anotherProviderTest(message, StandardCharsets.UTF_8, privateKey3, publicKey3, parameterSpec, bcProvider);
        anotherProviderTest(message, StandardCharsets.UTF_8, privateKey4, publicKey2, parameterSpec, bcProvider);
        anotherProviderTest(message, StandardCharsets.UTF_8, privateKey4, publicKey4, parameterSpec, bcProvider);
        return null;
    }

    public static void main(String[] args)
            throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException,
            NoSuchProviderException, InvalidParameterSpecException,
            IllegalBlockSizeException, BadPaddingException, IOException {
        new ECIESSample().call();
    }
}
