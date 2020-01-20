package com.twitter.teruteru128;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

class Main{
  public static void main(String[] args) throws IOException{
    System.setOut(new PrintStream(System.out, true, "UTF-8"));
    File chan = new File("in.txt");
    File in = new File("out.txt");
    List<String> a=Files.lines(chan.toPath(), StandardCharsets.UTF_8).sorted().collect(Collectors.toList());
    List<String> b=Files.lines(in.toPath(), StandardCharsets.UTF_8).sorted().collect(Collectors.toList());
    for(String bb : b){
      if(!a.contains(bb)){
        System.out.println(bb);
      }
    }
  }
}
