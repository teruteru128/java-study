package com.twitter.teruteru128.study;

import java.util.HexFormat;
import java.util.UUID;

import com.twitter.teruteru128.encode.UUIDEncode;

/**
 * UuidEncodeSample
 */
public class UuidEncodeSample {

    public static void uuidEncodeSample() {
        var uuid = UUID.fromString("c61c9854-2913-4024-bde6-f141745d1712");
        System.out.println(uuid);
        System.out.println(HexFormat.of().withUpperCase().formatHex(UUIDEncode.toBytes(uuid)));
    }

    
}