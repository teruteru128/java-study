package com.twitter.teruteru128.p2pquake;

import java.util.LinkedList;

/**
 * @see https://github.com/p2pquake/epsp-peer-cs/blob/a67f39c9fb8d28e62cb9cea504f1df0e8c04b6da/Client/Peer/Manager/DuplicateRemover.cs
 */
public class DuplicateRemover {
  private static final int DEFAULT_DUPLICATE_CAPACITY = 10000;
  private LinkedList<String> packetList = new LinkedList<>();
  private final int DUPLICATE_CAPACITY;

  public DuplicateRemover() {
    this(DEFAULT_DUPLICATE_CAPACITY);
  }

  public DuplicateRemover(int capacity) {
    DUPLICATE_CAPACITY = capacity;
  }

  public boolean isDuplicate(Packet packet) {
    var data = String.format("%d:%s", String.join(":", packet.getData()));
    synchronized (this) {
      if (packetList.contains(data)) {
        return true;
      } else {
        if (packetList.size() >= DUPLICATE_CAPACITY) {
          int diff = packetList.size() - (DUPLICATE_CAPACITY + 1);
          for (int i = 0; i < diff; i++) {
            packetList.pop();
          }
        } else {
          packetList.push(data);
        }
      }
    }
    return false;
  }

}
