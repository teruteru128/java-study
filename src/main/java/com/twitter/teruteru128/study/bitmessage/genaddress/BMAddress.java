package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import com.twitter.teruteru128.study.Base58;
import com.twitter.teruteru128.study.bitmessage.Structs;

/**
 * @see https://github.com/Bitmessage/PyBitmessage/blob/6f35da4096770a668c4944c3024cd7ddb34be092/src/addresses.py
 */
public class BMAddress {
    public BMAddress() {
    }

    /**
     * @see https://github.com/Bitmessage/PyBitmessage/blob/6f35da4096770a668c4944c3024cd7ddb34be092/src/addresses.py#L143
     * @return
     */
    public String encodeAddress(int version, int stream, byte[] ripe) {
        if (version >= 2 && version < 4) {
            if (ripe.length != 20) {
                throw new IllegalArgumentException(
                        "Programming error in encodeAddress: The length of a given ripe hash was not 20.");
            }
            byte[] tmp = new byte[2];
            if (Arrays.equals(ripe, 0, 2, tmp, 0, 2)) {
                ripe = Arrays.copyOfRange(ripe, 2, 20);
            } else if (Arrays.equals(ripe, 0, 1, tmp, 0, 1)) {
                ripe = Arrays.copyOfRange(ripe, 1, 20);
            }
        } else if (version == 4) {
            if (ripe.length != 20) {
                throw new IllegalArgumentException(
                        "Programming error in encodeAddress: The length of a given ripe hash was not 20.");
            }
            int i = 0;
            for (; ripe[i] == 0 && i < 20; i++) {
                // COUNTING
            }
            ripe = Arrays.copyOfRange(ripe, i, 20);
        }
        byte[] variantVersion = Structs.encodeVarint(version);
        byte[] variantStream = Structs.encodeVarint(stream);
        byte[] storedBinaryData = new byte[variantVersion.length + variantStream.length + ripe.length];
        System.arraycopy(variantVersion, 0, storedBinaryData, 0, variantVersion.length);
        System.arraycopy(variantStream, 0, storedBinaryData, variantVersion.length, variantStream.length);
        System.arraycopy(ripe, 0, storedBinaryData, variantVersion.length + variantStream.length, ripe.length);
        try {
            MessageDigest sha512 = MessageDigest.getInstance("sha-512");
            byte[] checksum = Arrays.copyOfRange(sha512.digest(sha512.digest(storedBinaryData)), 0, 4);
            byte[] addressBytes = new byte[storedBinaryData.length + checksum.length];
            System.arraycopy(storedBinaryData, 0, addressBytes, 0, storedBinaryData.length);
            System.arraycopy(checksum, 0, addressBytes, storedBinaryData.length, checksum.length);
            return "BM-" + Base58.encode(addressBytes);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}
