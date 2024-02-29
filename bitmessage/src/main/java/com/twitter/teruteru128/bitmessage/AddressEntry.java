package com.twitter.teruteru128.bitmessage;

/**
 *
 * @param label raw string, not base64 encoded
 * @param address
 */
public record AddressEntry(String label, String address) {
}
