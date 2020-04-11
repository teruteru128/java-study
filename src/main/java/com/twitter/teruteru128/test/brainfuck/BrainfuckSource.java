package com.twitter.teruteru128.test.brainfuck;

public class BrainfuckSource {
    String source;

    public BrainfuckSource(String sorce) {
        this.source = sorce;
    }

    public String getSource() {
        return this.source;
    }

    protected void setSource(String source) {
        this.source = source;
    }

    public boolean check() {
        boolean result = true;
        char[] source_a = this.source.toCharArray();
        int indent = 0;
        for (char c : source_a) {
            switch (c) {
            case '[':
                indent++;
                break;
            case ']':
                indent--;
                break;
            default:
                break;
            }
            if (indent < 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}