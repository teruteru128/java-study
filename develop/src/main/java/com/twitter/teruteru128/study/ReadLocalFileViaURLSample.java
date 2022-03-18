package com.twitter.teruteru128.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.concurrent.Callable;

public class ReadLocalFileViaURLSample implements Callable<Void> {

  public Void call() throws Exception {
    URL url = ClassLoader.getSystemResource("keys.xml");
    var connection = url.openConnection();
    try (var reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
      reader.lines().forEach(System.out::println);
    }
    return null;
  }
}
