package com.twitter.teruteru128.bitmessage.app;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.random.RandomGenerator;

import com.twitter.teruteru128.bitmessage.Message;
import com.twitter.teruteru128.bitmessage.Sender;
import com.twitter.teruteru128.bitmessage.spec.BMAddress;

public class Spammer {

    private static final SecureRandom RANDOM = (SecureRandom) RandomGenerator.of("SecureRandom");

    public Spammer() {
    }

    public static List<Message> createBody(int count) {
        var ripe = new byte[20];
        var shortripe = new byte[19];
        var uuid = UUID.randomUUID().toString().getBytes();
        var subject = "test".getBytes();
        var list = new ArrayList<Message>((int) count);
        for (int i = 1; i <= count; i++) {
            RANDOM.nextBytes(shortripe);
            System.arraycopy(shortripe, 0, ripe, 1, 19);
            list.add(new Message(BMAddress.encodeAddress(ripe), "BM-NBJxKhQmidR2TBtD3H74yZhDHpzZ7TXM", subject, uuid,
                    RANDOM.nextInt(3600, 3900)));
        }
        return list;
    }

    public static HttpResponse<String> doSpam(int count) throws InterruptedException, IOException {
        return Sender.send(createBody(count));
    }

}
