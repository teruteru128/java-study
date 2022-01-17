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
        // 秘密鍵をインポート
        ECPrivateKeySpec privateKeySpec = new ECPrivateKeySpec(new BigInteger(1, privateKeyData), parameterSpec);
        // 非圧縮鍵表現鍵から鍵をインポートする
        var x = new BigInteger(1, Arrays.copyOfRange(publicKeyData, 1, 33));
        var y = new BigInteger(1, Arrays.copyOfRange(publicKeyData, 33, 65));
        var w = new java.security.spec.ECPoint(x, y);
        var publicKeySpec = new java.security.spec.ECPublicKeySpec(w, parameterSpec);
        var factory1 = KeyFactory.getInstance("EC");

        // 鍵スペックから鍵に変換する
        var publicKey = factory1.generatePublic(publicKeySpec);
        var privateKey = factory1.generatePrivate(privateKeySpec);

        // 暗号化/復号テスト
        var cipher = Cipher.getInstance("ECIES/None/NoPadding", provider);

        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        var ciphertext = cipher.doFinal(message.getBytes(charset));
        System.out.printf("length : %d bytes%n", ciphertext.length);
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
        System.out.printf("length : %d bytes%n", ciphertext.length);
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

    @Override
    public Void call()
            throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException,
            NoSuchProviderException, InvalidParameterSpecException,
            IllegalBlockSizeException, BadPaddingException, IOException {
        /** base64 decoder */
        Base64.Decoder decoder = Base64.getDecoder();

        String stringkeydata1 = null;
        String stringkeydata2 = null;
        try (var stream = new BufferedReader(
                new InputStreamReader(this.getClass().getResourceAsStream("privatekey.txt")))) {
            stringkeydata1 = stream.readLine();
            stringkeydata2 = stream.readLine();
        }

        // static keys
        var privateKeyData1 = decoder.decode(stringkeydata1);
        var privateKeyData2 = decoder.decode(stringkeydata2);
        var publicKeyData1 = decoder
                .decode("BHaW7iAHcG2h49xLy8oBS25GwZUCIxUr84q/TwDbI0rMiG7XMFp49lGomisFKE2TA5s7O5mSbmR5yq+2EzE61pc=");
        var publicKeyData2 = decoder
                .decode("BABfHBsh6Fo8BJpWgi6fWDtfoS4BkPODxUOOsUMhQk0MVo/Q2bNKsZ5GmKcbl6ncbJG9eAThWmOXzUoHDBptqOo=");

        var bcProvider = new BouncyCastleProvider();
        // Security.addProvider(bcProvider);

        MessageDigest sha512 = MessageDigest.getInstance("sha512");
        MessageDigest ripemd160 = MessageDigest.getInstance("ripemd160", bcProvider);

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

        encTest(message, StandardCharsets.UTF_8, privateKeyData1, publicKeyData1, parameterSpec, bcProvider);
        encTest(message, Charset.forName("sjis"), privateKeyData2, publicKeyData2, parameterSpec, bcProvider);

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
        var x9 = ECNamedCurveTable.getByName(name);
        var curve = x9.getCurve();
        var dParams = new ECNamedCurveParameterSpec(name, curve, x9.getG(), x9.getN());

        var ecPoint1 = curve.decodePoint(publicKeyData1);
        var pubkeySpec1 = new ECPublicKeySpec(ecPoint1, dParams);
        var publicKey1 = factory2.generatePublic(pubkeySpec1);

        var ecPoint2 = curve.decodePoint(publicKeyData2);
        var pubkeySpec2 = new ECPublicKeySpec(ecPoint2, dParams);
        var publicKey2 = factory2.generatePublic(pubkeySpec2);

        for (int i = 0; i < 32; i++) {
            System.out.print("-");
        }
        System.out.println();

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
