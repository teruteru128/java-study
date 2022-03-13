package com.twitter.teruteru128.p2pquake;

import java.util.Arrays;

class PacketImpl implements Packet {
  private int code;
  private int hop;
  /** nullable */
  private String[] data;

  public PacketImpl() {
    this(-1, -1, null);
  }

  /**
   * 
   * @param code
   * @param hop
   * @param data nullable
   */
  public PacketImpl(int code, int hop, String[] data) {
    this.code = code;
    this.hop = hop;
    this.data = data;
  }

  @Override
  public int getCode() {
    return code;
  }

  @Override
  public void setCode(int code) {
    this.code = code;
  }

  @Override
  public int getHop() {
    return hop;
  }

  @Override
  public void setHop(int hop) {
    this.hop = hop;
  }

  /**
   * nullable
   */
  @Override
  public String[] getData() {
    return data;
  }

  @Override
  public void setData(String[] data) {
    this.data = data;
  }

  @Override
  public String toString() {
    var builder = new StringBuilder().append(code).append(' ').append(hop);
    if (data != null) {
      builder.append(' ').append(String.join(":", data));
    }
    return builder.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + code;
    result = prime * result + hop;
    result = prime * result + Arrays.hashCode(data);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    PacketImpl other = (PacketImpl) obj;
    if (code != other.code)
      return false;
    if (!Arrays.equals(data, other.data))
      return false;
    if (hop != other.hop)
      return false;
    return true;
  }

}