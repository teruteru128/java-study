package com.twitter.teruteru128.bitmessage.spec;

import java.nio.ByteBuffer;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import com.twitter.teruteru128.bitmessage.Structs;
import com.twitter.teruteru128.encode.Base58;

/**
 * @see https://github.com/Bitmessage/PyBitmessage/blob/6f35da4096770a668c4944c3024cd7ddb34be092/src/addresses.py
 */
public final class BMAddress {

    private BMAddress() {
    }

    public static String encode(byte[] encode) {
        return Base58.encode(encode);
    }

    public static byte[] decode(String decode) {
        return Base58.decode(decode);
    }

    public static final String encodeAddress(int version, int stream, byte[] ripe, int max) {
        max = Math.max(Math.min(max, 20), 1);
        if (version >= 2 && version < 4) {
            if (ripe.length != 20) {
                throw new IllegalArgumentException(
                        "Programming error in encodeAddress: The length of a given ripe hash was not 20.");
            }
            int i = 0;
            for (; ripe[i] == 0 && i < max; i++) {
                // COUNTING
            }
            ripe = Arrays.copyOfRange(ripe, i, 20);
        } else if (version == 4) {
            if (ripe.length != 20) {
                throw new IllegalArgumentException(
                        "Programming error in encodeAddress: The length of a given ripe hash was not 20.");
            }
            int i = 0;
            for (; ripe[i] == 0 && i < max; i++) {
                // COUNTING
            }
            ripe = Arrays.copyOfRange(ripe, i, 20);
        }
        byte[] variantVersion = Structs.encodeVarint(version);
        byte[] variantStream = Structs.encodeVarint(stream);
        var buffer = ByteBuffer.allocate(variantVersion.length + variantStream.length + ripe.length + 4)
                .put(variantVersion).put(variantStream).put(ripe);
        try {
            MessageDigest sha512 = MessageDigest.getInstance("sha-512");
            byte[] hash = new byte[64];
            sha512.update(buffer.array(), 0, buffer.capacity() - 4);
            sha512.digest(hash, 0, 64);
            sha512.update(hash, 0, 64);
            sha512.digest(hash, 0, 64);
            buffer.put(hash, 0, 4);
            return "BM-" + encode(buffer.array());
        } catch (NoSuchAlgorithmException | DigestException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @see https://github.com/Bitmessage/PyBitmessage/blob/6f35da4096770a668c4944c3024cd7ddb34be092/src/addresses.py#L143
     * @return
     */
    public static final String encodeAddress(int version, int stream, byte[] ripe) {
        return encodeAddress(version, stream, ripe, 20);
    }

    /**
     * @see https://github.com/Bitmessage/PyBitmessage/blob/6f35da4096770a668c4944c3024cd7ddb34be092/src/addresses.py#L143
     * @return
     */
    public static final String encodeAddress(byte[] ripe) {
        return encodeAddress(4, 1, ripe, 20);
    }
}
