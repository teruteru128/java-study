package com.twitter.teruteru128.bitmessage.app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import com.twitter.teruteru128.bitmessage.Sender;

public class ScheduledPostTask implements Runnable {

    public ScheduledPostTask(ArrayList<String> toAddressList, ArrayList<String> fromAddressList) {
        super();
        this.toAddressList = toAddressList;
        this.fromAddressList = fromAddressList;
    }

    private ArrayList<String> toAddressList;
    private ArrayList<String> fromAddressList;

    @Override
    public void run() {
        int toAddressListSize = toAddressList.size();
        int fromAddressListSize = fromAddressList.size();
        if (toAddressListSize == 0) {
            System.err.println("toAddress list is empty");
            return;
        }
        if (fromAddressListSize == 0) {
            System.err.println("fromAddress list is empty");
            return;
        }
        var toAddress = toAddressList.get(ThreadLocalRandom.current().nextInt(toAddressListSize));
        var fromAddress = fromAddressList.get(ThreadLocalRandom.current().nextInt(fromAddressListSize));
        var subject = UUID.randomUUID().toString();
        var message = Spammer.generateMessage(ThreadLocalRandom.current().nextInt(200, 2200));
        try {
            Sender.send(toAddress, fromAddress, subject, message);
        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }
        System.err.printf("%s, %s%n", toAddress, fromAddress);
    }
}
