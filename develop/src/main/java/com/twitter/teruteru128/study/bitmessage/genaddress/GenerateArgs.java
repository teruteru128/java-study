package com.twitter.teruteru128.study.bitmessage.genaddress;

class GenerateArgs extends Args {

    public GenerateArgs() {
        super(Command.GENERATE);
    }

    private int threadNum;
    private int NLZToRequest;
    private int keyCacheSize;
    // ファイルまたは標準出力
    private String output;
}
