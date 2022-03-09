package com.twitter.teruteru128.study;

import java.util.ServiceLoader;

import com.twitter.teruteru128.library.Library;

/**
 * InnerMain
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
