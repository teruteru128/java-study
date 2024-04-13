package com.github.teruteru128.bitmessage;

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
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.jce.spec.ECPublicKeySpec;
import org.bouncycastle.math.ec.ECCurve;

/**
 * 楕円曲線暗号統合暗号化スキーム
 * MAC付きじゃねえかお前んちぃ！
 *
 * @see <a href="https://w.wiki/6yVA">Integrated Encryption Scheme</a>
 */
public class EllipticCurveIntegratedEncryptionScheme {
    public EllipticCurveIntegratedEncryptionScheme() {
    }

    public static byte[] encrypt(byte[] message, ECPublicKey publicKey) {
        try {
            // generate ephemeral ec key
            var ephemeralKeyPair = generateEcKeyPair();

            var secret = generateSecret(publicKey, ephemeralKeyPair);
            var key = MessageDigest.getInstance("SHA-512").digest(secret);
            var key_e = Arrays.copyOfRange(key, 0, 32);
            var key_m = Arrays.copyOfRange(key, 32, 64);

            // init encrypt context
            var aes = Cipher.getInstance("AES/CBC/PKCS7Padding");
            var iv = new byte[aes.getBlockSize()];
            new SecureRandom().nextBytes(iv);
            aes.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key_e, "AES"), new IvParameterSpec(iv));

            // encode iv and pubkey
            var pubKey = getPubkey((ECPublicKey) ephemeralKeyPair.getPublic());
            var ciphertext = new byte[iv.length + pubKey.length + aes.getOutputSize(message.length)];
            System.arraycopy(iv, 0, ciphertext, 0, iv.length);
            System.arraycopy(pubKey, 0, ciphertext, iv.length, pubKey.length);
            int prefixLength = iv.length + pubKey.length;

            // encrypt
            int len = aes.doFinal(message, 0, message.length, ciphertext, prefixLength);

            // generate mac code
            var mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(key_m, "MAC"));
            mac.update(ciphertext);
            var cipherTextLength = len + prefixLength;
            var cipherTextWithMAC = Arrays.copyOf(ciphertext, cipherTextLength + mac.getMacLength());
            mac.doFinal(cipherTextWithMAC, cipherTextLength);
            return cipherTextWithMAC;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | NoSuchProviderException | InvalidKeyException
                | InvalidAlgorithmParameterException | IllegalBlockSizeException | BadPaddingException
                | ShortBufferException e) {
            throw new RuntimeException(e);
        }
    }

    /** generate shared keys */
    private static byte[] generateSecret(ECPublicKey publicKey, KeyPair ephem)
            throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException {
        var agreement = KeyAgreement.getInstance("ECDH", "BC");
        agreement.init(ephem.getPrivate());
        agreement.doPhase(publicKey, true);
        return agreement.generateSecret();
    }

    private static byte[] getPubkey(ECPublicKey key) {
        var q = key.getQ();
        var x = q.getXCoord().getEncoded();
        var y = q.getYCoord().getEncoded();
        return ByteBuffer.allocate(6 + x.length + y.length).putShort((short) 0x02CA).putShort((short) x.length).put(x)
                .putShort((short) y.length).put(y).array();
    }

    private static final KeyPairGenerator generator;

    static {
        try {
            generator = KeyPairGenerator.getInstance("EC", "BC");
            generator.initialize(new ECGenParameterSpec("secp256k1"));
        } catch (NoSuchAlgorithmException | NoSuchProviderException | InvalidAlgorithmParameterException e) {
            throw new InternalError(e);
        }
    }

    public static KeyPair generateEcKeyPair() {
        return generator.generateKeyPair();
    }

    public static ECPublicKey generateEcPublicKey() {
        return (ECPublicKey) generateEcKeyPair().getPublic();
    }

    private static record DecodedPubKey(short curve, byte[] x, byte[] y, int usedLength) {
    }

    private static DecodedPubKey decodePubKey(byte[] pubkey, int offset) {
        var buf = ByteBuffer.wrap(pubkey, offset, pubkey.length - offset);
        short curve = buf.getShort();
        short xLength = buf.getShort();
        byte[] x = new byte[xLength];
        buf.get(x);
        short yLength = buf.getShort();
        byte[] y = new byte[yLength];
        buf.get(y);
        return new DecodedPubKey(curve, x, y, buf.position() - offset);
    }

    private static final ECParameterSpec spec = ECNamedCurveTable.getParameterSpec("secp256k1");
    private static final ECCurve curve = spec.getCurve();

    private static final KeyFactory factory;

    static {
        try {
            factory = KeyFactory.getInstance("EC", "BC");
        } catch (NoSuchAlgorithmException | NoSuchProviderException e) {
            throw new InternalError(e);
        }
    }

    public static byte[] decrypt(byte[] message, ECPrivateKey privKey) {
        try {
            var aes = Cipher.getInstance("AES/CBC/PKCS7Padding");
            var blockSize = aes.getBlockSize();
            var iv = Arrays.copyOf(message, blockSize);
            var offset = blockSize;
            var decoded = decodePubKey(message, offset);
            offset += decoded.usedLength();
            var ciphertext = Arrays.copyOfRange(message, offset, message.length - 32);
            offset += ciphertext.length;
            var mac = Arrays.copyOfRange(message, offset, message.length);

            var x = new BigInteger(1, decoded.x());
            var y = new BigInteger(1, decoded.y());
            var keySpec = new ECPublicKeySpec(curve.createPoint(x, y), spec);

            var pubKey = factory.generatePublic(keySpec);

            var agreement = KeyAgreement.getInstance("ECDH", "BC");
            agreement.init(privKey);
            agreement.doPhase(pubKey, true);
            var key = MessageDigest.getInstance("SHA-512").digest(agreement.generateSecret());
            var key_e = Arrays.copyOfRange(key, 0, 32);
            var key_m = Arrays.copyOfRange(key, 32, 64);
            var hmacSHA256 = Mac.getInstance("HmacSHA256");
            hmacSHA256.init(new SecretKeySpec(key_m, "MAC"));
            hmacSHA256.update(message, 0, message.length - hmacSHA256.getMacLength());
            if (!MessageDigest.isEqual(mac, hmacSHA256.doFinal())) {
                return null;
            }
            aes.init(Cipher.DECRYPT_MODE, new SecretKeySpec(key_e, "AES"), new IvParameterSpec(iv));
            return aes.doFinal(ciphertext);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | NoSuchProviderException
                | InvalidKeySpecException | InvalidKeyException | InvalidAlgorithmParameterException
                | IllegalBlockSizeException | BadPaddingException e) {
            throw new RuntimeException(e);
        }
    }
}
