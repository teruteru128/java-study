package com.twitter.teruteru128.study;

class Poop {

    public static void main(String[] args) throws Exception {
        // U+1F4A9
        String p = "\uD83D\uDCA9";
        System.out.println(p);
        System.out.printf("%#08x%n", p.codePointAt(0));
    }
}
