package com.twitter.teruteru128.study.bouyomichan;

import java.io.Serializable;

public class BouyomiSpeechConfig implements Serializable {
    private static final long serialVersionUID = 114514;
    short speed;
    short tone;
    short volume;
    short voice = 0;
    byte encode = 0;

    public BouyomiSpeechConfig() {
        super();
    }
}
