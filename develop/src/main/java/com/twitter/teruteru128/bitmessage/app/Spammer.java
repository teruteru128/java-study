package com.twitter.teruteru128.bitmessage.app;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
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

    public static byte[] generateMessage(int length) {
        // FIXME Should I use RandomGenerator.getDefault() ?
        return Spammer.generateMessage(length, RandomGenerator.of("SecureRandom"));
    }

    public static byte[] generateMessage(int length, RandomGenerator random) {
        // capacity = (length * 6) / 5;
        int capacity = length + (length / 5);
        byte[] msg = new byte[capacity];
        for (int i = 0; i < capacity; i++) {
            if ((i % 60) == 59) {
                msg[i] = '\n';
            } else if ((i % 6) == 5) {
                msg[i] = ' ';
            } else {
                msg[i] = (byte) random.nextInt('0', 0x3a);
            }
        }
        // trim
        while ((0 < capacity) && (msg[capacity - 1] & 0xff) <= ' ') {
            capacity--;
        }
        return Arrays.copyOf(msg, capacity);
    }

    public static long send(String toAddress, String fromAddress) throws InterruptedException, IOException {
        var uuid = UUID.randomUUID();
        String subject = uuid.toString();
        var message = generateMessage(ThreadLocalRandom.current().nextInt(200, 2200));
        int ttl = ThreadLocalRandom.current().nextInt(345300, 345900);
        Sender.send(toAddress, fromAddress, subject, message);
        return 1;
    }

}
