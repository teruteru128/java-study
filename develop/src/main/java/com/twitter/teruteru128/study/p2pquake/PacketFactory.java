package com.twitter.teruteru128.study.p2pquake;

import java.util.regex.Pattern;

class PacketFactory {

  protected Pattern replaceAllPattern = Pattern.compile("\r?\n");
  protected Pattern splitPattern = Pattern.compile(" ");

  public Packet getInstance(String packet) {
    // 改行は削除(CRLF/LFを区別しない)
    packet = replaceAllPattern.matcher(packet).replaceAll("");
    String[] packetArray = splitPattern.split(packet, 3);

    // default values
    var code = -1;
    var hop = -1;
    var data = (String[]) null;

    // packet length check
    if (packetArray.length <= 0 || packetArray.length >= 4) {
      throw new IllegalArgumentException();
    }
    try {
      code = Integer.parseInt(packetArray[0], 10);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException();
    }
    if (packetArray.length < 2) {
      throw new IllegalArgumentException();
    }
    try {
      hop = Integer.parseInt(packetArray[1], 10);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException();
    }
    if (packetArray.length == 3) {
      data = packetArray[2].split(":");
    }
    return new PacketImpl(code, hop, data);
  }
}
