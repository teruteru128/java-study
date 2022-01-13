package com.twitter.teruteru128.imagemanager.model;

import java.awt.image.BufferedImage;
import java.io.Serializable;

/**
 * @author Teruteru
 *
 */
public class ImageModel implements Serializable {
    private static final long serialVersionUID = 0;

    public ImageModel() {
    }

    public ImageModel(String id, String name) {
        this.id = id;
        this.name = name;
    }

    private String id = null;
    private String name = null;
    private BufferedImage image = null;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }
}
