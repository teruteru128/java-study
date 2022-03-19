package com.twitter.teruteru128.study.onion;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.concurrent.Callable;

public class DeepWebRadioPoller implements Callable<Void> {

  private URL url;
  private Proxy proxy;

  public DeepWebRadioPoller() {
    try {
      url = new URL("http://anonyradixhkgh5myfrkarggfnmdzzhhcgoy2v66uf7sml27to5n2tid.onion/");
      // url = new URL("http://jpchv3cnhonxxtzxiami4jojfnq3xvhccob5x3rchrmftrpbjjlh77qd.onion/");
      proxy = new Proxy(Proxy.Type.SOCKS, InetSocketAddress.createUnresolved("localhost", 9050));
    } catch (MalformedURLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public Void call() throws IOException {
      var connection = (HttpURLConnection) url.openConnection(proxy);
      connection.setRequestMethod("HEAD");
      System.out.printf("[%s]access start: ", LocalDateTime.now());
      connection.connect();
      System.out.printf("ok, %d%n", connection.getResponseCode());
    return null;
  }
}
