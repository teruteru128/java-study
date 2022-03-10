package com.twitter.teruteru128.study;

import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.UUID;

import com.twitter.teruteru128.library.Library;
import com.twitter.teruteru128.library.LibraryFactory;

/**
 * ServiceCallSample
 * 
 * P2Pの基盤をライブラリとして作って、Bitmessage向け実装とかP2P地震情報向け実装をサービスで提供する……？
 * あとはファクトリークラスをローダーで読み込んで本番のインスタンスを生成するとか
 */
public class ServiceCallSample implements Runnable {

  protected Map<UUID, Library> libraryMap = new HashMap<>();

  @Override
  public void run() {
    try {
      var loader = ServiceLoader.load(LibraryFactory.class);
      for (LibraryFactory factory : loader) {
        var instance = factory.getInstance();
        System.out.printf("Hi! %s%n", instance.someLibraryMethod());
        libraryMap.put(instance.getServiceUUID(), instance);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
