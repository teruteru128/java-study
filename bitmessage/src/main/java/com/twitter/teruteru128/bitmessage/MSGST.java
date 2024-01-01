package com.twitter.teruteru128.bitmessage;

import java.nio.ByteBuffer;

/**
 * Message structure
*/
public record MSGST(ByteBuffer header, ByteBuffer payload) {

}
