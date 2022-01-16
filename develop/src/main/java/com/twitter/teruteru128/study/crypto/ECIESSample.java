package com.twitter.teruteru128.study.crypto;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECPublicKeySpec;

public class ECIESSample {

    public static void main(String[] args)
            throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException,
            NoSuchProviderException, InvalidParameterSpecException,
            IllegalBlockSizeException, BadPaddingException {
        /** base64 decoder */
        Base64.Decoder decoder = Base64.getDecoder();
        // static keys
        var privateKeyData1 = decoder.decode("");
        var privateKeyData2 = decoder.decode("");
        var publicKeyData1 = decoder
                .decode("BHaW7iAHcG2h49xLy8oBS25GwZUCIxUr84q/TwDbI0rMiG7XMFp49lGomisFKE2TA5s7O5mSbmR5yq+2EzE61pc=");
        var publicKeyData2 = decoder
                .decode("BABfHBsh6Fo8BJpWgi6fWDtfoS4BkPODxUOOsUMhQk0MVo/Q2bNKsZ5GmKcbl6ncbJG9eAThWmOXzUoHDBptqOo=");

        var bcProvider = new BouncyCastleProvider();
        Security.addProvider(bcProvider);

        MessageDigest sha512 = MessageDigest.getInstance("sha512");
        MessageDigest ripemd160 = MessageDigest.getInstance("ripemd160");

        sha512.update(publicKeyData1);
        sha512.update(publicKeyData2);
        System.out.print("ripe : ");
        for (byte b : ripemd160.digest(sha512.digest())) {
            System.out.printf("%02x", b & 0xff);
        }
        System.out.println();

        // 曲線名
        String name = "secp256k1";

        String message = "イワシがつちからはえてくるんだ";

        // secp256k1 鍵パラメータ取得
        var parameters = AlgorithmParameters.getInstance("EC", "SunEC");
        parameters.init(new ECGenParameterSpec(name));
        var parameterSpec = parameters.getParameterSpec(ECParameterSpec.class);

        // 秘密鍵をインポート
        ECPrivateKeySpec privateKeySpec5 = new ECPrivateKeySpec(new BigInteger(1, privateKeyData1), parameterSpec);
        ECPrivateKeySpec privateKeySpec6 = new ECPrivateKeySpec(new BigInteger(1, privateKeyData2), parameterSpec);

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
        var privateKey5 = factory1.generatePrivate(privateKeySpec5);
        var privateKey6 = factory1.generatePrivate(privateKeySpec6);

        // 暗号化/復号テスト
        // 暗号化テスト
        var cipher2 = Cipher.getInstance("ECIES/None/NoPadding", bcProvider);

        cipher2.init(Cipher.ENCRYPT_MODE, publicKey3);
        var ciphertext1 = cipher2.doFinal(message.getBytes(StandardCharsets.UTF_8));

        Charset SJIS = Charset.forName("sjis");
        cipher2.init(Cipher.ENCRYPT_MODE, publicKey4);
        var ciphertext2 = cipher2.doFinal(message.getBytes(SJIS));

        // 復号テスト
        cipher2.init(Cipher.DECRYPT_MODE, privateKey5);
        var cleartext1 = new String(cipher2.doFinal(ciphertext1), StandardCharsets.UTF_8);
        System.out.printf("cleartext1 : %s%n", cleartext1);
        cipher2.init(Cipher.DECRYPT_MODE, privateKey6);
        var cleartext2 = new String(cipher2.doFinal(ciphertext2), SJIS);
        System.out.printf("cleartext2 : %s%n", cleartext2);

        // BC API を使って鍵インポート・暗号化/復号テスト
        var cipher1 = Cipher.getInstance("ECIESwithSHA512/NONE/NOPADDING", bcProvider);

        var factory2 = KeyFactory.getInstance("EC", bcProvider);

        // ドメイン設定
        var x9 = ECNamedCurveTable.getByName(name);
        var curve = x9.getCurve();
        var dParams = new ECNamedCurveParameterSpec(name, curve, x9.getG(), x9.getN());

        var ecPoint1 = curve.decodePoint(publicKeyData1);
        var pubkeySpec1 = new ECPublicKeySpec(ecPoint1, dParams);
        var publicKey1 = factory2.generatePublic(pubkeySpec1);

        var ecPoint2 = curve.decodePoint(publicKeyData2);
        var pubkeySpec2 = new ECPublicKeySpec(ecPoint2, dParams);
        var publicKey2 = factory2.generatePublic(pubkeySpec2);

        // 暗号化テスト
        cipher1.init(Cipher.ENCRYPT_MODE, publicKey1);
        cipher1.init(Cipher.ENCRYPT_MODE, publicKey2);

        // BC 暗号プロバイダ + SunEC 暗号鍵でも動く
        cipher1.init(Cipher.ENCRYPT_MODE, publicKey3);
        cipher1.init(Cipher.ENCRYPT_MODE, publicKey4);

        cipher1.init(Cipher.DECRYPT_MODE, privateKey5);
        cipher1.init(Cipher.DECRYPT_MODE, privateKey6);
    }
}
