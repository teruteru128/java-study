package com.github.teruteru128.bitmessage;

public class QueueManager {

  private QueueManager(){}
  private static final QueueManager INSTANCE = new QueueManager(){};

  public static QueueManager getInstance() {
    return INSTANCE;
  }

}
