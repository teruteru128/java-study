package com.twitter.teruteru128.bitmessage.genaddress;

public class GenerateArgs extends Args {

    public GenerateArgs() {
        super(Command.GENERATE);
    }

    private int threadNum;

    public int getNumberOfThreads() {
        return threadNum;
    }

    private int NLZToRequest;

    public int getRequestedNumberOfLeadingZeros() {
        return NLZToRequest;
    }

    private int keyCacheSize;

    public int getKeyCacheSize() {
        return keyCacheSize;
    }

    // ファイルまたは標準出力
    private String output;

    public String getOutput() {
        return output;
    }
}
