package com.github.teruteru128.study;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousServerSocketChannel;

public class Server {

  private AsynchronousServerSocketChannel serverSocketChannel = AsynchronousServerSocketChannel.open()
      .bind(new InetSocketAddress("localhost", 8000));

  public Server() throws IOException {
  }

  public void start() throws IOException {
    serverSocketChannel.accept(null,
        new ServerAcceptHandler(serverSocketChannel));
  }

}
