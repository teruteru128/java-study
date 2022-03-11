package com.twitter.teruteru128.study.p2pquake;

class PeerInfo {
  private String address;
  private int port;
  private int peerID;

  public PeerInfo(String a, int port, int peerID) {
    this.address = a;
    this.port = port;
    this.peerID = peerID;
  }

  public String getAddress() {
    return address;
  }

  public int getPort() {
    return port;
  }

  public int getPeerID() {
    return peerID;
  }
}
