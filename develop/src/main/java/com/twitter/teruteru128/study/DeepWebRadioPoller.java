package com.twitter.teruteru128.study;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.SocketException;
import java.net.URL;
import java.time.LocalDateTime;

public class DeepWebRadioPoller implements Runnable {

  private URL url;
  private Proxy proxy;

  public DeepWebRadioPoller() {
    try {
      url = new URL("http://anonyradixhkgh5myfrkarggfnmdzzhhcgoy2v66uf7sml27to5n2tid.onion/");
      // url = new URL("http://jpchv3cnhonxxtzxiami4jojfnq3xvhccob5x3rchrmftrpbjjlh77qd.onion/");
      proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("localhost", 9050));
    } catch (MalformedURLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void run() {
    try {
      var connection = (HttpURLConnection) url.openConnection(proxy);
      connection.setRequestMethod("HEAD");
      System.out.printf("[%s]access start: ", LocalDateTime.now());
      connection.connect();
      System.out.printf("ok, %d%n", connection.getResponseCode());
    } catch (SocketException e) {
      System.err.printf("NG: %s%n", e.getMessage());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
