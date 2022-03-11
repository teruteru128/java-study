package com.twitter.teruteru128.study.p2pquake;

import java.net.Socket;

public class Peer implements AutoCloseable {

  protected Socket socket;

  public Peer(Socket socket) {
    this.socket = socket;
  }

  @Override
  public synchronized void close() throws Exception {
    if (!socket.isClosed()) {
      socket.close();
    }
  }
}
