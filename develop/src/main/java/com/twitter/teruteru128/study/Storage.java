package com.twitter.teruteru128.study;

import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 * { * Storage
 */
public class Storage {

    public static void main(String[] args) {
        var fileSystem = FileSystems.getDefault();
        for (Path path : fileSystem.getRootDirectories()) {
            System.out.println(path);
        }
    }
}
