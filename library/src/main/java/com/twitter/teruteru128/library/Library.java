package com.twitter.teruteru128.library;

import java.util.UUID;

/**
 * This Java source file was generated by the Gradle 'init' task.
 */
public interface Library {

    /**
     * ライブラリ識別用UUID
     * @return
     */
    public UUID getServiceUUID();

    /**
     * @return
     */
    public boolean someLibraryMethod();
}