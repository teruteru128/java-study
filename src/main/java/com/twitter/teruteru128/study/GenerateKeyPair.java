package com.twitter.teruteru128.study;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.math.ec.ECPoint;

import jakarta.xml.bind.DatatypeConverter;

class GenerateKeyPair implements Runnable {

    private byte[] privateKeys;
    private byte[] publicKeys;
    private int offset;
    private int length;

    public GenerateKeyPair(byte[] privateKeys, byte[] publicKeys, int offset, int length) {
        this.privateKeys = privateKeys;
        this.publicKeys = publicKeys;
        this.offset = offset;
        this.length = length;
    }

    @Override
    public void run() {
        byte[] privateKeys = this.privateKeys;
        byte[] publicKeys = this.publicKeys;
        byte[] potentialPublicEncryptionKey = null;
        for (int from = offset, to = offset + length; from < to; from++) {
            potentialPublicEncryptionKey = G
                    .multiply(new BigInteger(1, privateKeys, from * PRIVATE_KEY_LENGTH, PRIVATE_KEY_LENGTH)).normalize()
                    .getEncoded(false);
            System.arraycopy(potentialPublicEncryptionKey, 0, publicKeys, from * PUBLIC_KEY_LENGTH, PUBLIC_KEY_LENGTH);
        }
    }

    private static final ECPoint G = CustomNamedCurves.getByName("secp256k1").getG();
    private static final int PRIVATE_KEY_LENGTH = 32;
    private static final int PUBLIC_KEY_LENGTH = 65;
    private static final int KEY_NUM = 1 << 24;

    public static void gen() throws Exception {
        /*
        var encodedKeySpec = new X509EncodedKeySpec(DatatypeConverter.parseHexBinary(
                "302C300706032B656E05000321002CD3C20389E56A1D94238940D1B1F3FD19C72A23105F5167773225B35BC36244"));
        var factory = KeyFactory.getInstance("X25519");
        var publicKey = factory.generatePublic(encodedKeySpec);

        var generator = KeyPairGenerator.getInstance("X25519");
        var keyPair = generator.generateKeyPair();

        var agreement = KeyAgreement.getInstance("X25519");
        agreement.init(keyPair.getPrivate());
        agreement.doPhase(publicKey, true);
        var sha3_512 = MessageDigest.getInstance("sha3-512");
        sha3_512.update(agreement.generateSecret());
        var hashedSecret = sha3_512.digest();
        var secretKey = new SecretKeySpec(hashedSecret, 0, 32, "ChaCha20");
        var parameterSpec = new IvParameterSpec(hashedSecret, 32, 12);
        var cipher = Cipher.getInstance("ChaCha20-Poly1305/NONE/NoPadding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, parameterSpec);
        */
        var privateKeyPath = Paths.get("privateKeys.bin");
        var publicKeyPath = Paths.get("publicKeys.bin");

        final var privateKeys = new byte[KEY_NUM * 32];
        {
            var random = SecureRandom.getInstance("NativePRNGBlocking");
            random.nextBytes(privateKeys);
        }
        //Files.write(privateKeyPath, cipher.doFinal(privateKeys));
        Files.write(privateKeyPath, privateKeys);

        System.out.println("秘密鍵をファイルに書き込んだんご！");

        final var publicKeys = new byte[KEY_NUM * PUBLIC_KEY_LENGTH];

        var thread1 = new Thread(new GenerateKeyPair(privateKeys, publicKeys, 0, KEY_NUM / 2));
        var thread2 = new Thread(new GenerateKeyPair(privateKeys, publicKeys, KEY_NUM / 2, KEY_NUM / 2));
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("鍵の生成が終わったんご！これからファイルに書き込むんご！");

        try (var ch2 = FileChannel.open(publicKeyPath, StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
            ch2.write(ByteBuffer.wrap(publicKeys));
        }
        System.out.println("ファイルに書き込んだんご！");
        //System.out.printf("public key : %s%n", DatatypeConverter.printHexBinary(keyPair.getPublic().getEncoded()));
    }
}
