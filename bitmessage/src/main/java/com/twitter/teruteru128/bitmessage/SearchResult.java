package com.twitter.teruteru128.bitmessage;

import java.nio.ByteBuffer;

public record SearchResult(PrivateKeyInfo info, ByteBuffer hash) {
}
