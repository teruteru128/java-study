package com.twitter.teruteru128.study;

class Poop implements Runnable {

    public Poop() {
    }

    @Override
    public void run() {
        // U+1F4A9
        String p = "\uD83D\uDCA9";
        System.out.println(p);
        System.out.printf("U+%04X%n", p.codePointAt(0));
        System.out.printf("\\u%04X\\u%04X%n", (int) p.charAt(0), (int) p.charAt(1));
    }

}
