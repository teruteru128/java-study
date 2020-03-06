package com.twitter.teruteru128.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class ReadLocalFileViaURLSample {

  public static void main(String[] args) throws Exception {
    URL url = new URL("file:pom.xml");
    var connection = url.openConnection();
    try (var reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
      reader.lines().forEach(System.out::println);
    }
  }
}
