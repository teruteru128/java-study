package com.twitter.teruteru128.bitmessage.app;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import com.twitter.teruteru128.bitmessage.Sender;
import com.twitter.teruteru128.bitmessage.p2p.Message;

public class NewPostTask implements Runnable {

    private final ArrayList<String> toAddresses;
    private final ArrayList<String> fromAddresses;
    private final int num;
    private final int min;
    private final int max;
    private int nextToAddressIndex = 0;
    private int nextFromAddressIndex = 0;

    public NewPostTask(ArrayList<String> toAddresses, ArrayList<String> fromAddresses) {
        this(toAddresses, fromAddresses, 10000);
    }

    public NewPostTask(ArrayList<String> toAddresses, ArrayList<String> fromAddresses, int num) {
        this(toAddresses, fromAddresses, num, -1, -1);
    }

    public NewPostTask(ArrayList<String> toAddresses, ArrayList<String> fromAddresses, int min, int max) {
        this(toAddresses, fromAddresses, -1, min, max);
    }

    protected NewPostTask(ArrayList<String> toAddresses, ArrayList<String> fromAddresses, int num, int min, int max) {
        super();
        this.toAddresses = toAddresses;
        this.fromAddresses = fromAddresses;
        this.num = num;
        this.min = min;
        this.max = max;
    }

    @Override
    public void run() {
        System.err.printf("[%s] task start%n", LocalDateTime.now());
        int toAddressesSize = toAddresses.size();
        int fromAddressesSize = fromAddresses.size();
        String toAddress;
        String fromAddress;
        byte[] empty = new byte[0];
        int ttl = 86400 * 4;
        int num;
        if (this.num != -1) num = this.num;
        else num = ThreadLocalRandom.current().nextInt(this.min, this.max);
        var messages = new ArrayList<Message>(num);
        // toAddressが衝突すると面倒なことになるので回避策
        for (int i = 0; i < num; i++) {
            toAddress = toAddresses.get(nextToAddressIndex++);
            fromAddress = fromAddresses.get(nextFromAddressIndex++);
            // subject = UUID.randomUUID().toString().getBytes(StandardCharsets.UTF_8);
            // message = Spammer.generateMessage(ThreadLocalRandom.current().nextInt(200, 2201));
            // ttl = ThreadLocalRandom.current().nextInt(3600, 86400 * 28 + 1);
            messages.add(new Message(toAddress, fromAddress, empty, empty, ttl));
            if (nextToAddressIndex >= toAddressesSize) {
                nextToAddressIndex = 0;
            }
            if (nextFromAddressIndex >= fromAddressesSize) {
                nextFromAddressIndex = 0;
            }
        }
        // System.err.printf("[%s] request build done, sending...%n", LocalDateTime.now());
        try {
            Sender.send(messages);
        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.err.printf("[%s] task finish%n", LocalDateTime.now());
        }
    }
}
