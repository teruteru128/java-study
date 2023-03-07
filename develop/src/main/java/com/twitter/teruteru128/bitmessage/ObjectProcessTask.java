package com.twitter.teruteru128.bitmessage;

import java.util.concurrent.ExecutorService;

public class ObjectProcessTask implements Runnable {

    private ExecutorService service;

    public ObjectProcessTask(ExecutorService service) {
        super();
        this.service = service;
    }

    private static void processgetpubkey(byte[] payload) {

    }

    private void processpubkey(byte[] payload) {

    }

    private void processmsg(byte[] payload) {

    }

    private void processbroadcast(byte[] payload) {

    }

    private static void processonion(byte[] payload) {

    }

    @Override
    public void run() {
        try {
            var object = Queues.getInstance().getObjectProcessorQueue().take();
            var objecttype = object.type();
            var payload = object.payload();

            checkackdata(payload);
            if (objecttype instanceof Integer type) {
                switch (type) {
                    case Protocol.OBJECT_GETPUBKEY:
                        processgetpubkey(payload);
                        break;
                    case Protocol.OBJECT_PUBKEY:
                        processpubkey(payload);
                        break;
                    case Protocol.OBJECT_MSG:
                        processmsg(payload);
                        break;
                    case Protocol.OBJECT_BROADCAST:
                        processbroadcast(payload);
                        break;
                    case Protocol.OBJECT_ONIONPEER:
                        processonion(payload);
                        break;

                    default:
                        // Don\'t know how to handle object type 0x%08X
                        break;
                }
            } else if (objecttype instanceof String command) {
                if (command.equals("checkShutdownVariable")) {
                    // none
                } else {
                    // Don\'t know how to handle object type %s
                }
            } else {
                // Don\'t know how to handle object type
            }
        } catch (InterruptedException e) {
        }
        // TODO if shutdown...
        // save enqueued objects
        // FIXME? この方式の無限ループがどれくらい遅いのかわからない
        service.submit(this);
    }

    private static void checkackdata(byte[] payload) {
        if (payload.length < 32) {
            return;
        }
    }
}
