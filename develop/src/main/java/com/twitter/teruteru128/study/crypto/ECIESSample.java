package com.twitter.teruteru128.study.crypto;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.jce.ECPointUtil;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECPublicKeySpec;

import jakarta.xml.bind.DatatypeConverter;

public class ECIESSample {
    public static void main(String[] args)
            throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException,
            NoSuchProviderException, InvalidAlgorithmParameterException {
        Security.addProvider(new BouncyCastleProvider());
        var cipher = Cipher.getInstance("ECIES/None/Nopadding");
        System.out.println(cipher);

        var factory = KeyFactory.getInstance("EC", BouncyCastleProvider.PROVIDER_NAME);
        var ecSpec = ECNamedCurveTable.getByName("secp256k1");
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("ECDH", BouncyCastleProvider.PROVIDER_NAME);
        String name = "secp256r1";
        kpg.initialize(new ECGenParameterSpec(name));
        var keyPair = kpg.generateKeyPair();
        cipher.init(Cipher.ENCRYPT_MODE, keyPair.getPublic());

        X509EncodedKeySpec keySpec1 = new X509EncodedKeySpec(DatatypeConverter.parseHexBinary(
                "047696EE2007706DA1E3DC4BCBCA014B6E46C1950223152BF38ABF4F00DB234ACC886ED7305A78F651A89A2B05284D93039B3B3B99926E6479CAAFB613313AD697"), "secp256k1");
        var key1 = factory.generatePublic(keySpec1);
        cipher.init(Cipher.ENCRYPT_MODE, key1);
        X509EncodedKeySpec keySpec2 = new X509EncodedKeySpec(DatatypeConverter.parseHexBinary(
                "04005F1C1B21E85A3C049A56822E9F583B5FA12E0190F383C5438EB14321424D0C568FD0D9B34AB19E4698A71B97A9DC6C91BD7804E15A6397CD4A070C1A6DA8EA"));
        var key2 = factory.generatePublic(keySpec2);
        cipher.init(Cipher.ENCRYPT_MODE, key2);
    }
}
