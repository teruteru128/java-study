package com.twitter.teruteru128.p2pquake;

public interface PeerConfig {

  boolean isVerification();

  int getAreaCode();

  String getFormattedAreaCode();

  boolean isPortOpen();

  boolean isPortListening();

  int getPort();

  int getMaxConnections();
}
