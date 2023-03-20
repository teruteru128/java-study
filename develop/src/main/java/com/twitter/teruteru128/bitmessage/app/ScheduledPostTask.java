package com.twitter.teruteru128.bitmessage.app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import com.twitter.teruteru128.bitmessage.Sender;

public class ScheduledPostTask implements Runnable {

    public ScheduledPostTask(LinkedList<String> addressList) {
        super();
        this.addressList = addressList;
    }

    private LinkedList<String> addressList = null;

    @Override
    public void run() {
        if (addressList.size() == 0) {
            System.err.println("toAddress list is empty");
            return;
        }
        var toAddress = addressList.poll();
        var fromAddress = "BM-5oGHd345R1y5zaHCQFwLXQ36NzjT1XG";
        var subject = UUID.randomUUID().toString();
        var message = Spammer.generateMessage(ThreadLocalRandom.current().nextInt(200, 2200));
        try {
            Sender.send(toAddress, fromAddress, subject, message);
        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }
        System.err.println(toAddress);
    }
}
