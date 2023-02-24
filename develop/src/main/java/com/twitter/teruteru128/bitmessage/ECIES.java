package com.twitter.teruteru128.bitmessage;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.bouncycastle.jce.ECNamedCurveTable;
import org.bouncycastle.jce.interfaces.ECPrivateKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.spec.ECPublicKeySpec;

public class ECIES {
    public ECIES() {
    }

    public byte[] encrypt(byte[] message, ECPublicKey publicKey) {
        try {
            // generate ephemeral ec key
            var ephem = generateEcKeyPair();

            // generate shared keys
            var agreement = KeyAgreement.getInstance("EC", "BC");
            agreement.init(ephem.getPrivate());
            agreement.doPhase(publicKey, true);
            var sha512 = MessageDigest.getInstance("SHA-512");
            var key = sha512.digest(agreement.generateSecret());
            var key_e = Arrays.copyOfRange(key, 0, 32);
            var key_m = Arrays.copyOfRange(key, 32, 64);

            // init encrypto context
            var aes = Cipher.getInstance("AES/CBC/PKCS7Padding");
            var iv = new byte[aes.getBlockSize()];
            new SecureRandom().nextBytes(iv);
            aes.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key_e, "AES"), new IvParameterSpec(iv));

            // encode iv and pubkey
            var pubKey = getPubkey((ECPublicKey) ephem.getPublic());
            var ciphertext = new byte[iv.length + pubKey.length + aes.getOutputSize(message.length)];
            System.arraycopy(iv, 0, ciphertext, 0, iv.length);
            System.arraycopy(pubKey, 0, ciphertext, iv.length, pubKey.length);

            // encrypt
            aes.doFinal(message, 0, 0, ciphertext, iv.length + pubKey.length);

            // generate mac code
            var mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(key_m, "MAC"));
            mac.update(ciphertext);
            var ciphertextlength = ciphertext.length;
            var ciphertextwithmac = Arrays.copyOf(ciphertext, ciphertextlength + mac.getMacLength());
            mac.doFinal(ciphertextwithmac, ciphertextlength);
            return ciphertextwithmac;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | NoSuchProviderException | InvalidKeyException
                | InvalidAlgorithmParameterException | IllegalBlockSizeException | BadPaddingException
                | ShortBufferException e) {
        }
        return null;
    }

    private byte[] getPubkey(ECPublicKey key) {
        var q = key.getQ().normalize();
        var x = q.getXCoord().getEncoded();
        var y = q.getYCoord().getEncoded();
        return ByteBuffer.allocate(6 + x.length + y.length).putShort((short) 0x02CA).putShort((short) x.length).put(x)
                .putShort((short) y.length).put(y).array();
    }

    public static KeyPair generateEcKeyPair() {
        try {
            var generator = KeyPairGenerator.getInstance("EC");
            generator.initialize(new ECGenParameterSpec("secp256k1"));
            return generator.generateKeyPair();
        } catch (NoSuchAlgorithmException | InvalidAlgorithmParameterException e) {
            throw new RuntimeException(e);
        }
    }

    public static ECPublicKey generateEcPublicKey() {
        return (ECPublicKey) generateEcKeyPair().getPublic();
    }

    private static record DecodedPubKey(short curve, byte[] x, byte[] y, int usedLength) {
    }

    private DecodedPubKey decodePubKey(byte[] pubkey, int offset) {
        var buf = ByteBuffer.wrap(pubkey, offset, pubkey.length - offset);
        short curve = buf.getShort();
        short xLength = buf.getShort();
        byte[] x = new byte[xLength];
        buf.get(x);
        short yLength = buf.getShort();
        byte[] y = new byte[yLength];
        buf.get(y);
        return new DecodedPubKey(curve, x, y, buf.position());
    }

    public byte[] decrypt(byte[] message, ECPrivateKey privKey) {
        try {
            var aes = Cipher.getInstance("AES/CBC/PKCS7Padding");
            var blockSize = aes.getBlockSize();
            var iv = Arrays.copyOf(message, blockSize);
            var i = blockSize;
            var decoded = decodePubKey(message, iv.length);
            i += decoded.usedLength();
            var ciphertext = Arrays.copyOfRange(message, i, message.length - 32);
            i = ciphertext.length;
            var mac = Arrays.copyOfRange(message, i, message.length);

            var spec = ECNamedCurveTable.getParameterSpec("secp256k1");
            var curve = spec.getCurve();
            var keySpec = new ECPublicKeySpec(
                    curve.createPoint(new BigInteger(0, decoded.x()), new BigInteger(0, decoded.y())), spec);

            var factory = KeyFactory.getInstance("EC", "BC");
            var pubKey = factory.generatePublic(keySpec);

            var agreement = KeyAgreement.getInstance("EC", "BC");
            agreement.init(privKey);
            agreement.doPhase(pubKey, true);
            var sha512 = MessageDigest.getInstance("SHA-512");
            var key = sha512.digest(agreement.generateSecret());
            var key_e = Arrays.copyOfRange(key, 0, 32);
            var key_m = Arrays.copyOfRange(key, 32, 64);
            var hmacSHA256 = Mac.getInstance("HmacSHA256");
            hmacSHA256.init(new SecretKeySpec(key_m, "MAC"));
            hmacSHA256.update(message, 0, message.length - 32);
            if (!MessageDigest.isEqual(mac, hmacSHA256.doFinal())) {
                return null;
            }
            aes.init(Cipher.DECRYPT_MODE, new SecretKeySpec(key_e, "AES"), new IvParameterSpec(iv));
            return aes.doFinal(ciphertext);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | NoSuchProviderException
                | InvalidKeySpecException | InvalidKeyException | InvalidAlgorithmParameterException
                | IllegalBlockSizeException | BadPaddingException e) {
        }
        return null;
    }
}
