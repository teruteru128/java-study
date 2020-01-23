package com.twitter.teruteru128;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

class Main {

  public static void main(String[] args) throws Exception {
    URL url = new URL("file:pom.xml");
    var connection = url.openConnection();
    try (var reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
      reader.lines().forEach(System.out::println);
    }
    System.out.println("/home/teruteru128/Documents/ある新婚夫婦の平凡な日常.txt");
  }
}
