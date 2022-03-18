package com.twitter.teruteru128.study.crypto;

import java.io.Serializable;

/** コンストラクタが外から見える状態でないとシリアライズできない */
class SerializableImplementation implements Serializable {
  @Override
  public String toString() {
    return "やぁ";
  }
}
