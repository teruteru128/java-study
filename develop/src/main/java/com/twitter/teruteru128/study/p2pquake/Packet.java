package com.twitter.teruteru128.study.p2pquake;

interface Packet {
  public int getCode();

  public void setCode(int code);

  public int getHop();

  public void setHop(int hop);

  public String[] getData();

  public void setData(String[] data);

  @Override
  String toString();

}
