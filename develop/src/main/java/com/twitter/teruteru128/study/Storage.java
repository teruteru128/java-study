package com.twitter.teruteru128.study;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * Storage
 */
public class Storage implements Callable<List<Path>> {

    public List<Path> call() {
        List<Path> list = new ArrayList<>();
        var fileSystem = FileSystems.getDefault();
        for (Path path : fileSystem.getRootDirectories()) {
            list.add(path);
        }
        return list;
    }
}
