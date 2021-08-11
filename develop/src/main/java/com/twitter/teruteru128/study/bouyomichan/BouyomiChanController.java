package com.twitter.teruteru128.study.bouyomichan;

import java.net.Proxy;

interface BouyomiChanController {
    void setServerInfo();

    Proxy getProxy();

    void setProxy(Proxy proxy);

    void doTalk(String text);

    void doPause();

    void doResume();

    void doSkip();

    void doClear();

    byte getPause();

    byte getNowPlaying();

    int getTaskCount();
}
