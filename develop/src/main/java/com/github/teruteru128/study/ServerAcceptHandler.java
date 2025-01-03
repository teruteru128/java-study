package com.github.teruteru128.study;

import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.function.Supplier;
import javax.net.ssl.SSLContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class ServerAcceptHandler implements CompletionHandler<AsynchronousSocketChannel, Object> {

  private static final Logger logger = LoggerFactory.getLogger(ServerAcceptHandler.class);
  private static final SSLContext context;

  static {
    try {
      var tmp = SSLContext.getDefault();
      var parameters = tmp.getSupportedSSLParameters();
      var cipherSuites = parameters.getCipherSuites();
      if (!Arrays.asList(cipherSuites).contains("TLS_ECDH_anon_WITH_AES_256_CBC_SHA")) {
        context = null;
        logger.warn("can not use anon tls. disabled.");
      } else {
        context = tmp;
      }
    } catch (NoSuchAlgorithmException e) {
      throw new ExceptionInInitializerError(e);
    }
  }

  private final AsynchronousServerSocketChannel serverSocketChannel;

  public ServerAcceptHandler(AsynchronousServerSocketChannel serverSocketChannel) {
    this.serverSocketChannel = serverSocketChannel;
  }

  @Override
  public void completed(AsynchronousSocketChannel result, Object attachment) {
    if (serverSocketChannel.isOpen()) {
      serverSocketChannel.accept(attachment, this);
    }

  }

  @Override
  public void failed(Throwable exc, Object attachment) {
    logger.error("error!", exc);
  }
}
