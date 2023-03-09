package com.twitter.teruteru128.bitmessage;

import java.net.Socket;

public class TCPConnection implements GeneralConnection {

    private Socket socket;

    public TCPConnection(Socket socket) {
        super();
        this.socket = socket;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

}
