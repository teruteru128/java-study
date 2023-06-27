package com.twitter.teruteru128.bitmessage.p2p;

/**
 * Used for person-to-person messages
 * for client...?
 */
public record Message(String toAddress, String fromAddress, byte[] utf8EncodedSubject, byte[] utf8EncodedMessage,
        int ttl) {
}
