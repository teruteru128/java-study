package com.twitter.teruteru128.test;


public class Test {

    public static void main(String[] args) {
        int i;
        for (i = 0; i<= 1000;i++){
            System.out.printf("%d%n",(long) Math.pow(10, (double)(3 * i) / 1000));
        }
    }
}
