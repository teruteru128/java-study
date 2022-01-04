package com.twitter.teruteru128.study.crypto;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECPublicKeySpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

public class ECIESSample {
    public static void main(String[] args)
            throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException,
            NoSuchProviderException, InvalidAlgorithmParameterException {
        Security.addProvider(new BouncyCastleProvider());

        var factory = KeyFactory.getInstance("EC", BouncyCastleProvider.PROVIDER_NAME);
        String name = "secp256k1";
        var x9 = ECNamedCurveTable.getByName(name);
        ECCurve curve = x9.getCurve();
        final byte[] publicKeyData1 = Base64.getDecoder()
                .decode("BHaW7iAHcG2h49xLy8oBS25GwZUCIxUr84q/TwDbI0rMiG7XMFp49lGomisFKE2TA5s7O5mSbmR5yq+2EzE61pc=");
        final byte[] publicKeyData2 = Base64.getDecoder()
                .decode("BABfHBsh6Fo8BJpWgi6fWDtfoS4BkPODxUOOsUMhQk0MVo/Q2bNKsZ5GmKcbl6ncbJG9eAThWmOXzUoHDBptqOo=");
        ECNamedCurveParameterSpec dParams = new ECNamedCurveParameterSpec(name, curve, x9.getG(), x9.getN());
        ECPoint ecPoint1 = curve.decodePoint(publicKeyData1);
        ECPublicKeySpec pubkeySpec1 = new ECPublicKeySpec(ecPoint1, dParams);
        ECPublicKeySpec pubkeySpec2 = new ECPublicKeySpec(ecPoint1, dParams);

        var cipher1 = Cipher.getInstance("ECIESwithSHA512/NONE/NOPADDING");
        System.out.println(cipher1);

        var key1 = factory.generatePublic(pubkeySpec1);
        cipher1.init(Cipher.ENCRYPT_MODE, key1);
        System.out.println(cipher1);
        var key2 = factory.generatePublic(pubkeySpec2);
        cipher1.init(Cipher.ENCRYPT_MODE, key2);
        System.out.println(cipher1);
    }
}
