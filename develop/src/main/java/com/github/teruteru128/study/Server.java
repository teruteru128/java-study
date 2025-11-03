package com.github.teruteru128.study;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.concurrent.Callable;

public class Server implements Callable<Void> {

  private AsynchronousServerSocketChannel serverSocketChannel = AsynchronousServerSocketChannel.open()
      .bind(new InetSocketAddress(56732));

  public Server() throws IOException {
  }

  public Void call() throws IOException {
    serverSocketChannel.accept(null, new ServerAcceptHandler(serverSocketChannel));
    return null;
  }

}
