package com.twitter.teruteru128.study.files;

import java.io.File;

/**
 * @author Teruteru
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Teruteru\\Documents\\teruteru128\\pixiv");

        if (f.isDirectory()) {
            for (File c : f.listFiles((d, n) -> !d.isHidden())) {
                System.out.println(c.getName());
            }
        }

    }

}
