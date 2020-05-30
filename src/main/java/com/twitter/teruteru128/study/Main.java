package com.twitter.teruteru128.study;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.Arrays;
import java.util.UUID;

import com.twitter.teruteru128.study.bitmessage.Structs;
import com.twitter.teruteru128.study.bitmessage.genaddress.BMAddressGenerator;
import com.twitter.teruteru128.study.bitmessage.genaddress.KeyPair;
import com.twitter.teruteru128.study.bitmessage.genaddress.Response;

import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

// TODO 将来的にエントリポイントをこのクラス一つにする
// TODO コマンドライン引数の実装方法
// TODO 設定ファイルの実装方法 Propaties XML JSON YAML
/**
 * Main
 * 
 */
public class Main {

    public static void main(String[] args) throws Exception {
        // [chan] 04f68cc6-6613-4b7d-8ad7-e7df34f22fba <BM-NAuhZrtEiLbzTvunGDM7PcR3i3sUB31m>
        // [chan] 72a887f4-c2dc-467c-8398-1b9f9c3c4f11 <BM-NBHwD7AR2wW6r2T9rBe9SuQLAaMCjNUe>
        // [chan] 99806868-0a84-4ab5-a41c-9231b126b150 <BM-NBF3q51VJinAuUbZgVQ6mQabtfLoTTur>
        Provider provider = Security.getProvider("BC");
        if(provider == null){
            Security.addProvider(provider = new BouncyCastleProvider());
        }
        MessageDigest blake2b512 = MessageDigest.getInstance("BLAKE2b-512");
        System.out.println(blake2b512);
        final MessageDigest sha512 = MessageDigest.getInstance("sha-512");
        final MessageDigest ripemd = MessageDigest.getInstance("RIPEMD160");
        final var g = CustomNamedCurves.getByName("secp256k1").getG();
        final int requireNLZ = 3;
        int nlz = 0;
        byte[] passphrase = null;
        int signingKeyNonce = 0;
        int encryptionKeyNonce = 1;
        final byte[] potentialPrivSigningKey = new byte[64];
        byte[] potentialPubSigningKey = null;
        final byte[] potentialPrivEncryptionKey = new byte[64];
        byte[] potentialPubEncryptionKey = null;
        final byte[] sha512hash = new byte[64];
        final byte[] ripe = new byte[20];
        for (UUID uuid = UUID.randomUUID(); ; uuid = UUID.randomUUID()) {
            passphrase = uuid.toString().getBytes();
            for (signingKeyNonce = 0, encryptionKeyNonce = 1; ; signingKeyNonce += 2, encryptionKeyNonce += 2) {
                sha512.update(passphrase);
                sha512.update(Structs.encodeVarint(signingKeyNonce));
                sha512.digest(potentialPrivSigningKey, 0, 64);
                sha512.update(passphrase);
                sha512.update(Structs.encodeVarint(encryptionKeyNonce));
                sha512.digest(potentialPrivEncryptionKey, 0, 64);
                potentialPubSigningKey = g.multiply(new BigInteger(1, potentialPrivSigningKey, 0, 32)).normalize().getEncoded(false);
                potentialPubEncryptionKey = g.multiply(new BigInteger(1, potentialPrivEncryptionKey, 0, 32)).normalize().getEncoded(false);
                sha512.update(potentialPubSigningKey);
                sha512.update(potentialPubEncryptionKey);
                sha512.digest(sha512hash, 0, 64);
                ripemd.update(sha512hash);
                ripemd.digest(ripe, 0, 20);
                for (nlz = 0; ripe[nlz] == 0 && nlz < 20; nlz++) {
                }
                if(ripe[0] == 0){
                    break;
                }
            }
            if(nlz >= requireNLZ){
                System.out.println(uuid);
                BMAddressGenerator.exportAddressToStdout(new Response(new KeyPair(Arrays.copyOf(potentialPrivSigningKey, 32), potentialPubSigningKey), new KeyPair(Arrays.copyOf(potentialPrivEncryptionKey, 32), potentialPubEncryptionKey), ripe));
            }
        }
    }
}
