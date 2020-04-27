package com.twitter.teruteru128.study.p2pquake;

class ClientTask implements Runnable {

    public ClientTask() {
        this(-1);
    }

    public ClientTask(int serverPort) {
        this.port = serverPort;
    }

    private int port;

    @Override
    public void run() {

    }

}
