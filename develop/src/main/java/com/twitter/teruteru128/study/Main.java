package com.twitter.teruteru128.study;

import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.time.Instant;
import java.util.Arrays;
import java.util.HexFormat;

/**
 * Main
 */
public class Main {

    private static final BigInteger F;

    static {
        byte[] array = new byte[157827];
        array[0] = (byte) '3';
        Arrays.fill(array, 1, 157827, (byte) '7');
        F = new BigInteger(new String(array), 10);
        try {
            Security.addProvider(Class.forName("org.bouncycastle.jce.provider.BouncyCastleProvider")
                    .asSubclass(Provider.class).getConstructor().newInstance());
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException
                | IllegalArgumentException | InvocationTargetException | SecurityException e) {
            throw new InternalError(e);
        }
    }

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.exit(1);
        }
        // indexは乱数で選ぶ
        var index = 0xB7D792B2;
        var keyNumber = index & 0xffffff;
        var fileNumber = (index >>> 24) & 0xff;
        var priKey = new byte[32];
        try (var file = new RandomAccessFile(String.format("D:\\keys\\private\\privateKeys%d.bin", fileNumber), "r")) {
            file.seek(keyNumber * 32);
            file.readFully(priKey, 0, 32);
        }
        var pubKey = new byte[65];
        try (var file = new RandomAccessFile(String.format("D:\\keys\\public\\publicKeys%d.bin", fileNumber), "r")) {
            file.seek(keyNumber * 65);
            file.readFully(pubKey, 0, 65);
        }
        var parameters = AlgorithmParameters.getInstance("EC");
        parameters.init(new ECGenParameterSpec("secp256k1"));
        var parameterSpec = parameters.getParameterSpec(ECParameterSpec.class);
        var privateKeySpec = new ECPrivateKeySpec(new BigInteger(1, priKey), parameterSpec);
        var publicKeySpec = new ECPublicKeySpec(new ECPoint(new BigInteger(1, pubKey, 1, 32), new BigInteger(1, pubKey, 33, 32)), parameterSpec);

        var factory = KeyFactory.getInstance("EC");
        var privateKey = factory.generatePrivate(privateKeySpec);
        var publicKey = factory.generatePublic(publicKeySpec);

        var epochSecond = Instant.now().getEpochSecond();
        var time = ByteBuffer.allocate(8).putLong(epochSecond).array();
        var signature = Signature.getInstance("ECDSA");
        signature.initSign(privateKey);
        signature.update(time);
        signature.update(pubKey);
        var sign = new byte[128];
        var len = signature.sign(sign, 0, 128);

        System.out.printf("%-9s: %d%n", "time", epochSecond);
        System.out.printf("%-9s: %d%n", "length", len);
        var format = HexFormat.of();
        System.out.printf("%-9s: %s%n", "signature", format.formatHex(sign, 0, len));
        signature.initVerify(publicKey);
        signature.update(time);
        signature.update(pubKey);
        var result = signature.verify(sign, 0, len);
        System.out.printf("%-9s: %b%n", "status", result);
    }
}
