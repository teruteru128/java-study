package com.twitter.teruteru128.bitmessage;

import java.nio.ByteBuffer;

public record AddressPublicKeySet(ByteBuffer signingPublicKey, ByteBuffer encryptionPublicKey) {
}
