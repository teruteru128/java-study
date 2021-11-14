package com.twitter.teruteru128.study.ansi;

public class EscapeCodeSample {

    public static void main(String[] args) {
        var logger = System.getLogger("Escape code sample");
        logger.log(System.Logger.Level.INFO, "ひぐらしの\u001b[31mな\u001b[0mく頃に");
    }
}
