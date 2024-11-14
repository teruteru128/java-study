package com.github.teruteru128.study;

import org.bouncycastle.crypto.ec.CustomNamedCurves;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.HexFormat;
import java.util.Objects;
import picocli.CommandLine.Command;

import static java.lang.Math.min;

public class TeamSpeak {
    public static final int PK_PRIVATE = 1;
    public static final int PK_PUBLIC = 0;
    private static final byte[] TEAM_SPEAK_KEY = "b9dfaa7bee6ac57ac7b65f1094a1c155e747327bc2fe5d51c512023fe54a280201004e90ad1daaae1075d53b7d571c30e063b5a62a4a017bb394833aa0983e6e".getBytes();

    @Command(name = "ts3")
    static void ts3() throws NoSuchAlgorithmException, DigestException {
        var decoder = Base64.getDecoder();
        var privateKey = decoder.decode(System.getenv("KEY"));
        deObfuscateInPlace(privateKey);
        var decodedKey = decoder.decode(privateKey);
        var key = ecc_import(decodedKey);
        var ecc256 = CustomNamedCurves.getByName("secp256r1");
        var g = ecc256.getG();
        var point = g.multiply(new BigInteger(key.k()));
        var curve = ecc256.getCurve();
        var point1 = curve.createPoint(new BigInteger(key.point.x), new BigInteger(key.point.y));
        System.out.println("point.equals(point1) = " + point.equals(point1));
    }

    @Command(name="ts2")
    static void ts2() throws NoSuchAlgorithmException, DigestException {
        var decoder = Base64.getDecoder();
        var privateKey = decoder.decode(System.getenv("KEY"));
        var publicKey = Objects.requireNonNull(System.getenv("BM_PUBLIC_KEY")).getBytes();
        ts2(privateKey, publicKey);
    }

    @Command(name = "ts1")
    static void ts1() throws NoSuchAlgorithmException, DigestException {
        var decoder = Base64.getDecoder();
        var keys = decoder.decode(System.getenv("KEY"));
        var b = ts1(keys);
        // ここで秘密鍵を公開鍵に変換する
        System.out.println(Base64.getEncoder().encodeToString(b));
        System.out.println(HexFormat.of().formatHex(b));
    }

    private static void ts2(byte[] key, byte[] publicKey) throws NoSuchAlgorithmException, DigestException {
        deObfuscateInPlace(key);
        var decoder = Base64.getDecoder();
        var k = ecc_import(decoder.decode(key));
        var k2 = ecc_export(PK_PUBLIC, k);
        var x = new String(publicKey);
        System.out.println(x);
        System.out.println(getSecurityLevel(publicKey, 16689509343190L));
        var encoder = Base64.getEncoder();
        var k3 = encoder.encode(k2);
        System.out.printf("ts2 check: %b%n", Arrays.equals(k3, publicKey));
        System.out.println(HexFormat.of().formatHex(decoder.decode(publicKey)));
    }

    /**
     * @param privateKey a
     * @return a
     * @throws NoSuchAlgorithmException a
     * @throws DigestException          a
     */
    private static byte[] ts1(byte[] privateKey) throws NoSuchAlgorithmException, DigestException {
        deObfuscateInPlace(privateKey);
        System.out.println(new String(privateKey));
        var decoder = Base64.getDecoder();
        var decodedKey = decoder.decode(privateKey);
        var key = ecc_import(decodedKey);
        return ecc_export(PK_PRIVATE, key);
    }

    private static ECCKey ecc_import(byte[] in) {
        // decode asn.1
        var buffer = ByteBuffer.wrap(in);
        // struct
        var type = buffer.get();
        // length
        var length1 = buffer.get();
        // bit string
        var a = buffer.get();
        // length
        var b = buffer.get();
        var c = buffer.get();
        var d = buffer.get();
        // if flags == 1, private key
        byte flags = (byte) ((d & 0xff) >>> c);
        // integer
        var e = buffer.get();
        // length
        var f = buffer.get();
        //
        int key_size = buffer.get();
        // integer
        var h = buffer.get();
        var publicKeyXLength = buffer.get();
        byte[] publicKeyX = new byte[publicKeyXLength];
        buffer.get(publicKeyX);
        var j = buffer.get();
        var publicKeyYLength = buffer.get();
        byte[] publicKeyY = new byte[publicKeyYLength];
        buffer.get(publicKeyY);
        ECCKey key;
        if (flags == PK_PRIVATE) {
            var m = buffer.get();
            var privateKeyLength = buffer.get();
            // the private key
            byte[] k = new byte[privateKeyLength];
            buffer.get(k);
            var point = new ECCPoint(publicKeyX, publicKeyY, null);
            key = new ECCKey(1, point, k);
        } else {
            var point = new ECCPoint(publicKeyX, publicKeyY, null);
            key = new ECCKey(1, point, null);
        }
        return key;
    }

    private static byte[] ecc_export(int t, ECCKey key) {
        // encode asn.1
        int publicKeyLength;
        if (t == 1) {
            publicKeyLength = 2 + 4 + 3 + 2 + key.point.x.length + 2 + key.point.y.length + 2 + key.k.length;
        } else {
            publicKeyLength = 2 + 4 + 3 + 2 + key.point.x.length + 2 + key.point.y.length;
        }
        var publicKey = ByteBuffer.allocate(publicKeyLength).put((byte) 0x30).put((byte) (publicKeyLength - 2)).put((byte) 0x03).put((byte) 0x02).put((byte) 0x07).put((byte) 0x00).put((byte) 0x02).put((byte) 1).put((byte) 0x20).put((byte) 0x02).put((byte) key.point.x.length).put(key.point.x).put((byte) 0x02).put((byte) key.point.y.length).put(key.point.y);
        if (t == PK_PRIVATE) {
            publicKey.put((byte) 0x02).put((byte) key.k.length).put(key.k);
        }
        return publicKey.array();
    }

    private static int getSecurityLevel(byte[] key, long counter) throws NoSuchAlgorithmException {
        var sha1 = MessageDigest.getInstance("SHA-1");
        sha1.update(key);
        sha1.update(Long.toString(counter).getBytes());
        return Long.numberOfTrailingZeros(ByteBuffer.wrap(sha1.digest()).order(ByteOrder.LITTLE_ENDIAN).getLong(0));
    }

    private static void deObfuscateInPlace(byte[] data) throws NoSuchAlgorithmException, DigestException {
        var sha1 = MessageDigest.getInstance("SHA-1");
        int strlen = 0;
        // fixme
        while (data[strlen + 20] != 0) strlen++;
        sha1.update(data, 20, strlen);
        var hash = new byte[20];
        sha1.digest(hash, 0, 20);
        for (int i = 0; i < 20; i++) {
            data[i] ^= hash[i];
        }
        int dataSize = min(100, data.length);
        for (int i = 0; i < dataSize; i++) {
            data[i] ^= TEAM_SPEAK_KEY[i];
        }
    }

    private record ECCPoint(byte[] x, byte[] y, byte[] z) {
    }

    private record ECCKey(int type, ECCPoint point, byte[] k) {
    }
}
