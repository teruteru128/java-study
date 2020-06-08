package com.twitter.teruteru128.study;

import com.twitter.teruteru128.study.tcp.client.Client;
import java.util.concurrent.ForkJoinPool;

/**
 * Main
 * 
 */
public class Main {

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(new Client());
        thread.start();
        int order = 14;
        long x = 64000;
        long y = 32000;
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        System.out.printf("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>%n");
        System.out.printf("<svg xmlns=\"http://www.w3.org/2000/svg\" ");
        System.out.printf("version=\"1.1\" width=\"%d\" height=\"%d\">%n", x, y);
        System.out.printf("<path d=\"");
        forkJoinPool.invoke(new DragonAction(order, 1L<<7, 0, 1));
        System.out.printf("Z");
        System.out.printf("\" fill=\"none\" stroke=\"black\" />%n");
        System.out.printf("</svg>%n");
    }
}
