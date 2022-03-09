package com.twitter.teruteru128.study;

import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.UUID;

import com.twitter.teruteru128.library.Library;

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
    var loader = ServiceLoader.load(Library.class);
    for (Library library : loader) {
      System.out.printf("%s%n", library.someLibraryMethod());
      libraryMap.put(library.getServiceUUID(), library);
    }
  }
}
