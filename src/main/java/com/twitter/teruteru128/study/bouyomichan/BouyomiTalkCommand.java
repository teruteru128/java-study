package com.twitter.teruteru128.study.bouyomichan;

public class BouyomiTalkCommand implements BouyomiCommand
{
    private static final short COMMAND = 0x0001;

    @Override
    public short getCommand() {
        return COMMAND;
    }

    @Override
    public String getName() {
        return "talk";
    }

    @Override
    public byte[] getEncoded() {
        return new byte[0];
    }
}