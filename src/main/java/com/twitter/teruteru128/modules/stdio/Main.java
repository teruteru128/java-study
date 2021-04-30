package com.twitter.teruteru128.modules.stdio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            return;
        }
        File file = new File(args[0]);
        byte[] buf = new byte[2000];
        int read_length = -1;
        try {
            BufferedInputStream bin = new BufferedInputStream(new FileInputStream(file));
            BufferedOutputStream bout = new BufferedOutputStream(System.out);
            try {
                while ((read_length = bin.read(buf)) != -1) {
                    bout.write(buf, 0, read_length);
                }
            } finally {
                System.err.println(read_length);
                bout.close();
                bin.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("ファイルが見つかりません。");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("入出力例外");
        }
    }

}
