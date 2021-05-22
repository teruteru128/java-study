package com.twitter.teruteru128.study;

import java.io.IOException;
import java.util.Properties;

public class Poop implements Runnable {

    @Override
    public void run() {
        // U+1F4A9
        var p = "\uD83D\uDCA9";
        System.out.println(p);
        System.out.printf("U+%04X%n", p.codePointAt(0));
        System.out.printf("\\u%04X\\u%04X%n", (int) p.charAt(0), (int) p.charAt(1));
    }

    public static void main(String[] args) throws IOException {
        var poop = new Thread(new Poop());
        poop.start();
        var properties = new Properties(System.getProperties());
        properties.setProperty("\uD83D\uDCA9", "やったぜ。");
        properties.store(System.out, null);
    }
}
