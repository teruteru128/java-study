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
public class CatImplSample {

    /**
     * @param args
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            return;
        }
        var file = new File(args[0]);
        var buf = new byte[2000];
        int readLength = -1;
        try (var bin = new BufferedInputStream(new FileInputStream(file));
                var bout = new BufferedOutputStream(System.out)) {
            while ((readLength = bin.read(buf)) != -1) {
                bout.write(buf, 0, readLength);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("ファイルが見つかりません。");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("入出力例外");
        } finally {
            System.err.println(readLength);
        }
    }

}
