package com.twitter.teruteru128.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author Teruteru
 *
 */
public abstract class AbstractFileDAO extends AbstractDAO {
    protected FileInputStream openFileInputStream(File f) throws FileNotFoundException {
        return new FileInputStream(f);
    }
}
