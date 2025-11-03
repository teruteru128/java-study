package com.github.teruteru128.study;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
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
  public void completed(AsynchronousSocketChannel socket, Object attachment) {
    if (serverSocketChannel.isOpen()) {
      serverSocketChannel.accept(attachment, this);
    }

    var buffer = ByteBuffer.allocate(8192);
    socket.read(buffer, buffer, new CompletionHandler<Integer, ByteBuffer>() {
      @Override
      public void completed(Integer result, ByteBuffer attachment) {
        if (result < 0) {
          return;
        }

        if (buffer.hasRemaining()) {
          socket.read(attachment, attachment, this);
          return;
        }

        buffer.flip();

        socket.write(buffer, buffer, new CompletionHandler<Integer, ByteBuffer>() {
          @Override
          public void completed(Integer result, ByteBuffer attachment) {
            System.out.println("SERVER: Write " + result);
            if (result == 0) {
              logger.error("", new IOException("Write Error"));
              return;
            }

            if (buffer.hasRemaining()) {
              socket.write(buffer, buffer, this);
              return;
            }

            System.out.println("SERVER: Done " + Arrays.toString(buffer.array()));

            try {
              socket.close();
            } catch (IOException _) {
            }
          }

          @Override
          public void failed(Throwable exc, ByteBuffer attachment) {
            logger.error("", exc);
          }
        });
      }

      @Override
      public void failed(Throwable exc, ByteBuffer attachment) {
        logger.error("", exc);
      }
    });
  }

  @Override
  public void failed(Throwable exc, Object attachment) {
    logger.error("error!", exc);
  }
}
