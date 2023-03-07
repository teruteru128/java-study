package com.twitter.teruteru128.bitmessage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Queues {
    private Queues() {
        super();
    }

    private static final Queues INSTANCE = new Queues();

    public static Queues getInstance() {
        return INSTANCE;
    }

    private ConcurrentLinkedQueue<Object> workerQueue = new ConcurrentLinkedQueue<>();
    private ConcurrentLinkedQueue<Object> addressGeneratorQueue = new ConcurrentLinkedQueue<>();
    private LinkedBlockingQueue<BitmessageObject<?>> objectProcessorQueue = new LinkedBlockingQueue<>();
    private ConcurrentLinkedQueue<Inventory> invQueue = new ConcurrentLinkedQueue<>();
    private ConcurrentLinkedQueue<Object> addrQueue = new ConcurrentLinkedQueue<>();
    private ConcurrentLinkedQueue<Object> portCheckerQueue = new ConcurrentLinkedQueue<>();
    private ConcurrentLinkedQueue<Object> receiveDataQueue = new ConcurrentLinkedQueue<>();
    private ConcurrentLinkedQueue<Object> apiAddressGeneratorReturnQueue = new ConcurrentLinkedQueue<>();
    private ConcurrentLinkedQueue<Object> excQueue = new ConcurrentLinkedQueue<>();

    public ConcurrentLinkedQueue<Object> getWorkerQueue() {
        return workerQueue;
    }

    public ConcurrentLinkedQueue<Object> getAddressGeneratorQueue() {
        return addressGeneratorQueue;
    }

    public LinkedBlockingQueue<BitmessageObject<?>> getObjectProcessorQueue() {
        return objectProcessorQueue;
    }

    public ConcurrentLinkedQueue<Inventory> getInvQueue() {
        return invQueue;
    }

    public ConcurrentLinkedQueue<Object> getAddrQueue() {
        return addrQueue;
    }

    public ConcurrentLinkedQueue<Object> getPortCheckerQueue() {
        return portCheckerQueue;
    }

    public ConcurrentLinkedQueue<Object> getReceiveDataQueue() {
        return receiveDataQueue;
    }

    public ConcurrentLinkedQueue<Object> getApiAddressGeneratorReturnQueue() {
        return apiAddressGeneratorReturnQueue;
    }

    public ConcurrentLinkedQueue<Object> getExcQueue() {
        return excQueue;
    }
}
