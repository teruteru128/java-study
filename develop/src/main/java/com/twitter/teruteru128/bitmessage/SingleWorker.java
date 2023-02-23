package com.twitter.teruteru128.bitmessage;

import java.nio.ByteBuffer;
import java.time.Instant;
import java.util.concurrent.ThreadLocalRandom;

public class SingleWorker {

    public byte[] generateFullAckMessage(byte[] ackData, long toStreamNumber, int ttl) {
        if (ttl < 24 * 60 * 60) {
            ttl = 24 * 60 * 60;
        } else if (ttl < 7 * 24 * 60 * 60) {
            ttl = 7 * 24 * 60 * 60;
        } else {
            ttl = 28 * 24 * 60 * 60;
        }
        ttl = ttl + ThreadLocalRandom.current().nextInt(-300, 300);
        ByteBuffer.allocate(8 + ackData.length).putLong(Instant.now().getEpochSecond() + ttl).put(ackData).array();

        return Protocol.createPacket("object".getBytes(), ackData);
    }
}
