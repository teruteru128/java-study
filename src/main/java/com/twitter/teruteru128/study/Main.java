package com.twitter.teruteru128.study;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.SecureRandom;

import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.math.ec.ECPoint;

// TODO 将来的にエントリポイントをこのクラス一つにする
// TODO コマンドライン引数の実装方法
// TODO 設定ファイルの実装方法 Propaties XML JSON YAML
/**
 * Main
 * 
 */
public class Main {

    private static final ECPoint G = CustomNamedCurves.getByName("secp256k1").getG();
    private static final int PRIVATE_KEY_LENGTH = 32;
    private static final int PUBLIC_KEY_LENGTH = 65;

    public static void main(String[] args) throws Exception {
        var privateKeyFile = Paths.get("privateKeys.bin");
        var publicKeyPath = Paths.get("publicKeys.bin");

        ByteBuffer privateKeyBuffer = ByteBuffer.allocateDirect((1 << 24) * 32);
        byte[] privateKeys = privateKeyBuffer.array();
        {
            var random = SecureRandom.getInstanceStrong();
            random.nextBytes(privateKeys);
        }
        byte[] potentialPublicEncryptionKey = null;
        var publicKeyBuffer = ByteBuffer.allocateDirect((1 << 24) * 65);
        for (int i = 0; i < 16777216; i++) {
            potentialPublicEncryptionKey = G
                    .multiply(new BigInteger(1, privateKeys, i * PRIVATE_KEY_LENGTH, PRIVATE_KEY_LENGTH)).normalize()
                    .getEncoded(false);
            publicKeyBuffer.put(potentialPublicEncryptionKey, 0, PUBLIC_KEY_LENGTH);
        }
        privateKeyBuffer.flip();
        publicKeyBuffer.flip();
        try (FileChannel ch1 = FileChannel.open(privateKeyFile); FileChannel ch2 = FileChannel.open(publicKeyPath)) {
            ch1.write(privateKeyBuffer);
            ch2.write(publicKeyBuffer);
        }
    }
}
