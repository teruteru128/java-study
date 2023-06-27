package com.twitter.teruteru128.bitmessage.protocol.payload;

/**
 * (inventory) object
*/
public record InventoryObject(long nonce, long expiresTime, int objectType, long version, long streamNumber, byte[] payloadObject) {

}
