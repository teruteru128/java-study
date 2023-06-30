package com.twitter.teruteru128.study;

import java.nio.ByteBuffer;

public record AddressPublicKeySet(ByteBuffer signingPublicKey, ByteBuffer encryptionPublicKey) {
}
