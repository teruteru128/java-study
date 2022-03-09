package com.twitter.teruteru128.study.bundle;

import java.util.ResourceBundle;

/**
 * translation_ja.properties ファイルをResourceBundleクラス経由で読んでみるテスト.
 * 
 * H2 DB のリソースファイルだったのねアレ
 */
public class ResourceBundleSample {
  public static void main(String[] args) {
    ResourceBundle bundle1 = ResourceBundle.getBundle("translation");
    var keys = bundle1.getKeys();
    while (keys.hasMoreElements()) {
      String key = keys.nextElement();
      System.out.printf("%s: %s%n", key, bundle1.getString(key));
    }
    ResourceBundle bundle2 = ResourceBundle.getBundle("com.twitter.teruteru128.study.bundle.sample");
    System.out.println(bundle2.getString("unchi"));
  }
}
