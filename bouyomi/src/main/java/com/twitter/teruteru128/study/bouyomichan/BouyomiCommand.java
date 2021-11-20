package com.twitter.teruteru128.study.bouyomichan;

import java.io.Serializable;

public interface BouyomiCommand extends Serializable
{
    byte[] getEncoded();
    String getName();
    short getCommand();
}
