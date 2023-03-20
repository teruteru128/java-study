package com.twitter.teruteru128.bitmessage.app;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

import com.twitter.teruteru128.bitmessage.Message;
import com.twitter.teruteru128.bitmessage.Sender;

public class NewPostTask implements Runnable {

    private ArrayList<String> toAddresses;
    private ArrayList<String> fromAddresses;
    private int num = 10000;

    public NewPostTask(ArrayList<String> toAddresses, ArrayList<String> fromAddresses) {
        super();
        this.toAddresses = toAddresses;
        this.fromAddresses = fromAddresses;
    }

    public NewPostTask(ArrayList<String> toAddresses, ArrayList<String> fromAddresses, int num) {
        super();
        this.toAddresses = toAddresses;
        this.fromAddresses = fromAddresses;
        this.num = num;
    }

    @Override
    public void run() {
        var random = (Random) RandomGenerator.of("SecureRandom");
        Collections.shuffle(toAddresses, random);
        int toAddressesSize = toAddresses.size();
        int fromAddressesSize = fromAddresses.size();
        String toAddress;
        String fromAddress;
        byte[] subject;
        byte[] message;
        int ttl = 86400 * 28;
        int num = this.num;
        var messages = new ArrayList<Message>(num);
        // toAddressが衝突すると面倒なことになるので回避策
        int toAddressStartIndex = ThreadLocalRandom.current().nextInt(toAddressesSize - num);
        for (int i = 0; i < num; i++) {
            toAddress = toAddresses.get(toAddressStartIndex + i);
            fromAddress = fromAddresses.get(ThreadLocalRandom.current().nextInt(fromAddressesSize));
            subject = UUID.randomUUID().toString().getBytes(StandardCharsets.UTF_8);
            message = Spammer.generateMessage(ThreadLocalRandom.current().nextInt(200, 2200));
            messages.add(new Message(toAddress, fromAddress, subject, message, ttl));
        }
        System.err.println("request build done, sending...");
        try {
            Sender.send(messages);
        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
