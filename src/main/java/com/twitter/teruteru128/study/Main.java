package com.twitter.teruteru128.study;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.System.Logger;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(args[0])))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.getLogger("main").log(Logger.Level.INFO, line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
