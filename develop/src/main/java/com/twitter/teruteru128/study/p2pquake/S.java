package com.twitter.teruteru128.study.p2pquake;

import java.io.IOException;
import java.net.ServerSocket;

public class S implements AutoCloseable {

  protected ServerSocket server;

  public S() throws IOException {
    this(6911);
  }

  public S(int port) throws IOException {
    this(new ServerSocket(port));
  }

  public S(ServerSocket server) {
    this.server = server;
  }

  public ServerSocket getServer() {
    return server;
  }

  public Peer acceptPeer() throws IOException {
    return new Peer(server.accept());
  }

  @Override
  public synchronized void close() throws Exception {
    if (!server.isClosed()) {
      server.close();
    }
  }
}
