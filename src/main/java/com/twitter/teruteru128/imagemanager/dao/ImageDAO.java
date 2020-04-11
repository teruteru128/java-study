package com.twitter.teruteru128.imagemanager.dao;

import java.awt.image.BufferedImage;
import java.util.Optional;

/**
 * @author Teruteru
 *
 */
public interface ImageDAO {

    Optional<BufferedImage> getNextImage();

    Optional<BufferedImage> getRandomImage();
}
