package com.twitter.teruteru128.bitmessage.spec;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import com.twitter.teruteru128.bitmessage.Structs;
import com.twitter.teruteru128.encode.Base58;

/**
 * @see <a href="https://github.com/Bitmessage/PyBitmessage/blob/6f35da4096770a668c4944c3024cd7ddb34be092/src/addresses.py">addresses.py</a>
 */
public final class BMAddress {

    private BMAddress() {
    }

    public static <A extends Appendable> A encodeAddress(A out, int version, int stream, byte[] ripe, int max) {
        max = Math.max(Math.min(max, 20), 1);
        if (version >= 2 && version < 4) {
            if (ripe.length != 20) {
                throw new IllegalArgumentException(
                        "Programming error in encodeAddress: The length of a given ripe hash was not 20.");
            }
            int i = 0;
            while (ripe[i] == 0 && i < max) {
                i++;
            }
            ripe = Arrays.copyOfRange(ripe, i, 20);
        } else if (version == 4) {
            if (ripe.length != 20) {
                throw new IllegalArgumentException(
                        "Programming error in encodeAddress: The length of a given ripe hash was not 20.");
            }
            int i = 0;
            while (ripe[i] == 0 && i < max) {
                i++;
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
            out.append('B');
            out.append('M');
            out.append('-');
            return Base58.encode(out, buffer.array());
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        } catch (NoSuchAlgorithmException | DigestException e) {
            throw new RuntimeException(e);
        }
    }

    public static String encodeAddress(int version, int stream, byte[] ripe, int max) {
        return encodeAddress(new StringBuilder(38), version, stream, ripe, max).toString();
    }

    /**
     * @see <a href="https://github.com/Bitmessage/PyBitmessage/blob/6f35da4096770a668c4944c3024cd7ddb34be092/src/addresses.py#L143">addresses.py</a>
     * @return
     */
    public static <A extends Appendable> A encodeAddress(A out, int version, int stream, byte[] ripe) {
        return encodeAddress(out, version, stream, ripe, 20);
    }

    /**
     * @see <a href="https://github.com/Bitmessage/PyBitmessage/blob/6f35da4096770a668c4944c3024cd7ddb34be092/src/addresses.py#L143">addresses.py</a>
     * @return
     */
    public static String encodeAddress(int version, int stream, byte[] ripe) {
        return encodeAddress(version, stream, ripe, 20);
    }

    /**
     * @see <a href="https://github.com/Bitmessage/PyBitmessage/blob/6f35da4096770a668c4944c3024cd7ddb34be092/src/addresses.py#L143">addresses.py</a>
     * @return
     */
    public static <A extends Appendable> A encodeAddress(A out, byte[] ripe) {
        return encodeAddress(out, 4, 1, ripe, 20);
    }

    /**
     * @see <a href="https://github.com/Bitmessage/PyBitmessage/blob/6f35da4096770a668c4944c3024cd7ddb34be092/src/addresses.py#L143">addresses.py</a>
     * @return
     */
    public static String encodeAddress(byte[] ripe) {
        return encodeAddress(4, 1, ripe, 20);
    }
}
