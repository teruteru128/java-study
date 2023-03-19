package com.twitter.teruteru128.bitmessage;

/**
 * 
 */
public record Message(String toAddress, String fromAddress, byte[] utf8EncodedSubject, byte[] utf8EncodedMessage,
        int ttl) {
}
