package com.twitter.teruteru128.study;

import java.util.ServiceLoader;

import com.twitter.teruteru128.library.Library;

/**
 * ServiceCallSample
 * 
 * P2Pの基盤をライブラリとして作って、Bitmessage向け実装とかP2P地震情報向け実装をサービスで提供する……？
 */
public class ServiceCallSample implements Runnable {

    @Override
    public void run() {
      var loader = ServiceLoader.load(Library.class);
      for (Library library : loader) {
          System.out.printf("%s, %s%n", library, library.someLibraryMethod());
      }
    }
}
