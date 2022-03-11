package com.twitter.teruteru128.study.p2pquake;

import java.util.Optional;

class PacketFactory {
  public Optional<Packet> getInstance(String packet) {
    packet = packet.replaceAll("\r?\n", "");
    String[] packetArray = packet.split(" ", 3);

    // default values
    var code = -1;
    var hop = -1;
    var data = (String[]) null;

    // packet length check
    if (packetArray.length <= 0 || packetArray.length >= 4) {
      return Optional.empty();
    }
    try {
      code = Integer.parseInt(packetArray[0], 10);
    } catch (NumberFormatException e) {
      return Optional.empty();
    }
    if (packetArray.length < 2) {
      return Optional.empty();
    }
    try {
      hop = Integer.parseInt(packetArray[1], 10);
    } catch (NumberFormatException e) {
      return Optional.empty();
    }
    if (packetArray.length == 3) {
      data = packetArray[2].split(":");
    }
    return Optional.of(new PacketImpl(code, hop, data));
  }
}
